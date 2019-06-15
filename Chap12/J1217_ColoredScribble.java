import java.util.*;								// For Observer
import java.awt.*;								// For Graphics
import java.awt.geom.*;
import java.awt.event.*;							// For Event
import java.io.*;

interface J1217_Constants
{
	int LINE	= 101;
	int RECTANGLE 	= 102;
	int CIRCLE 	= 103;
	int CURVE 	= 104;
	int DEFAULT_ELEMENT_TYPE = LINE;
	Color DEFAULT_ELEMENT_COLOR = Color.blue;
	File DEFAULT_DIRECTORY = new File("C:/Scribble");
	String DEFAULT_FILENAME = "Scribble.scb";
}

class J1217_ScribbleFrame extends Frame implements J1217_Constants, ActionListener, Observer
{
	MenuBar menuBar = new MenuBar();
	private J1217_ColoredScribble theApp;
	private int elementType = DEFAULT_ELEMENT_TYPE;				// Current element type
	private Color elementColor = DEFAULT_ELEMENT_COLOR;			// Current element color
	private String frameTitle;						// Frame title
	private String filename = DEFAULT_FILENAME;				// Current model file name
	private File modelFile;							// File for the current drawing
	private boolean scribbleChanged = false;				// Model changed flag
	private FileChooser files;						// File dialogs

	// File actions
	private FileAction newAction, openAction, exitAction, saveAction, saveAsAction, printAction;
	// Element type actions
	private TypeAction lineAction, rectangleAction, circleAction, curveAction;
	// Element color actions
	private ColorAction redAction, yellowAction, greenAction, blueAction;

	public J1217_ScribbleFrame(String title, J1217_ColoredScribble theApp) 
	{
		this.theApp = theApp;
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		setMenuBar(menuBar);
		Menu fileMenu = new Menu("File");
		Menu elementMenu = new Menu("Elements");
		menuBar.add(fileMenu); 						// Add the file menu
		menuBar.add(elementMenu); 					// Add the element menu
		fileMenu.setMnemonic('F');					// Create shortcut
		elementMenu.setMnemonic('E');					// Create shortcut
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);			// Enable window events

		frameTitle = title + ": ";
		setTitle(frameTitle + filename);
		if(!DEFAULT_DIRECTORY.exists())
			if(!DEFAULT_DIRECTORY.mkdirs())
				JOptionPane.showMessageDialog(this,
							      "Error creating default directory",
							      "Directory Creation Error",
							      JOptionPane.ERROR_MESSAGE);

		files = new JFileChooser(DEFAULT_DIRECTORY);

		// Construct file pull down menu
		fileMenu.add(newAction = new FileAction("New"));
		fileMenu.add(openAction = new FileAction("Open"));
		fileMenu.add(exitAction = new FileAction("Exit"));
		fileMenu.addSeparator();
		fileMenu.add(saveAction = new FileAction("Save"));
		fileMenu.add(saveAsAction = new FileAction("Save As..."));
		fileMenu.addSeparator();
		fileMenu.add(printAction = new FileAction("Print"));
		newAction.setEnabled(false);
		openAction.setEnabled(true);
		exitAction.setEnabled(true);
		saveAction.setEnabled(true);
		saveAsAction.setEnabled(false);
		printAction.setEnabled(false);

		// Construct element pull down menu
		elementMenu.add(lineAction = new TypeAction("Line", LINE));
		elementMenu.add(rectangleAction = new TypeAction("Rectangle", RECTANGLE));
		elementMenu.add(circleAction = new TypeAction("Circle", CIRCLE));
		elementMenu.add(curveAction = new TypeAction("Curve", CURVE));

		elementMenu.addSeparator();

		// Create the color submenu
		Menu colorMenu = new Menu("Color");				// Color sub-menu
		elementMenu.add(colorMenu);					// Add the sub-menu
		colorMenu.add(redAction = new ColorAction("Red", Color.red));
		colorMenu.add(yellowAction = new ColorAction("Yellow", Color.yellow));
		colorMenu.add(greenAction = new ColorAction("Green", Color.green));
		colorMenu.add(blueAction = new ColorAction("Blue", Color.blue));

	} // end of J1217_ColoredScribble constructor

	public void actionPerformed(ActionEvent e)
	{
		MenuItem menuBar = (MenuItem)e.getSource();
	} // end of actionPerformed
	
	public Color getElementColor()
	{
		return elementColor;
	}

	public int getElementType()
	{
		return elementType;
	}

	// Method called by ScribbleModel Object when it changes
	public void update(Observable o, Object obj)
	{
		scribbleChanged = true;
	}

	//
	class FileAction extends AbstractAction
	{
		// Constructor
		FileAction(String name)
		{
			super(name);
		}
		public void actionPerformed(ActionEvent e)
		{
			String name = (String)getValue(NAME);
			if(name.equals(saveAction.getValue(NAME)))
			{
				saveOperation();
			}
			else if(name.equals(saveAsAction.getValue(NAME)))
			{
			}
			else if(name.equals(openAction.getValue(NAME)))
			{
				checkForSave();
				// Now open a scribble file
				File file = showDialog("Open Scribble File",		// Dialog window title
							"Open",				// button label
							"Read a scribble from file",	// button tooltip text
							'o',				// Shortcut character
							null);				// No file selected
				if(file != null)					// If a file was selected
					openScribble(file);				// then read it
			}
			else if(name.equals(newAction.getValue(NAME)))
			{
			}
			else if(name.equals(exitAction.getValue(NAME)))
			{
				System.exit(0);
			}
			else if(name.equals(printAction.getValue(NAME)))
			{
			}

		}
	} // end FileAction class

	// Handles element type menu items 
	class TypeAction extends AbstractAction
	{
		private int typeID;
		// Constructor
		TypeAction(String name, int typeID)
		{
			super(name);
			this.typeID = typeID;
		}
		public void actionPerformed(ActionEvent e)
		{
			elementType = typeID;
		}
	} // end of TypeAction class

	// Handles element color menu items 
	class ColorAction extends AbstractAction
	{
		private Color color;
		// Constructor
		ColorAction(String name, Color color)
		{
			super(name);
			this.color = color;
		}
		public void actionPerformed(ActionEvent e)
		{
			elementColor = color;
		}
	} // end of ColorAction class

	// Display a custom file save dialog
	private File showDialog(String dialogTitle, String approveButtonText,
				String approveButtonTooltip, char approveButtonMnemonic,
				File file)					// Current file - if any
	{
		files.setDialogTitle(dialogTitle);
		files.setApproveButtonText(approveButtonText);
		files.setApproveButtonToolTipText(approveButtonTooltip);
		files.setApproveButtonMnemonic(approveButtonMnemonic);
		files.setFileSelectionMode(files.FILES_ONLY);
		files.rescanCurrentDirectory();
		files.setSelectedFile(file);

		int result = files.showDialog(J1217_ScribbleFrame.this, null);	// Show the dialog
		return (result == files.APPROVE_OPTION) ? files.getSelectedFile() : null;
	}

	// Save the Script if it is necessary
	private void saveOperation()
	{
		if(!scribbleChanged)
			return;
		if(modelFile != null)
			saveDrawing(modelFile);
		else
		{
			File file = showDialog("Save Drawing", "Save", "Save the drawing", 's', 
						new File(files.getCurrentDirectory(), filename));
			if(file == null)
				return;
			else
				if(file.exists())				// Check for existence
					if(JOptionPane.NO_OPTION == 		// Overwrite warning
						JOptionPane.showConfirmDialog(J1217_ScribbleFrame.this, 
							file.getName() + " exists. Overwrite?",
							"Confirm Save As",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.WARNING_MESSAGE))
						return;				// No selected file
			saveDrawing(file);
		}
	}

	// Write a drawing to outFile
	private void saveDrawing(File outFile)
	{
		try {
			ObjectOutputStream out = new ObjectOutputStream(
						 new BufferedOutputStream(
						 new FileOutputStream(outFile)));
			out.writeObject(theApp.getModel());			// Write the drawing to the stream
			out.flush();						// Flush the stream
			out.close();
		} catch(IOException e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(J1217_ScribbleFrame.this,
						      "Error writing a drawing file.",
						      "File Output Error",
						      JOptionPane.ERROR_MESSAGE);
			return;							// Serious error - return
		}
		if(outFile != modelFile)					// If we are saving to new file
		{								// we must update the window
			modelFile = outFile;					// Save file reference
			filename = modelFile.getName();				// Update the file name
			setTitle(frameTitle + modelFile.getPath());		// Change the window title
		}
		scribbleChanged = false;					// Set as unchanged
	}

	//Prompt for save operation when necessary
	public void checkForSave()
	{
		if(scribbleChanged)
			if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(
						J1217_ScribbleFrame.this,
						"Current file has changed. Save current file?",
						"confirm Save Current File",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE))
		saveOperation();
	}

	// Method for opening file
	public void openScribble(File inFile)
	{
		try {
			ObjectInputStream in = new ObjectInputStream(
					       new BufferedInputStream(
					       new FileInputStream(inFile)));
			theApp.insertModel((J1217_ScribbleModel)in.readObject());
			in.close();
			modelFile = inFile;
			filename = modelFile.getName();
			setTitle(frameTitle+modelFile.getPath());
			scribbleChanged = false;
		} catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(J1217_ScribbleFrame.this,
						      "Error reading a drawing file.",
						      "File Input Error",
						      JOptionPane.ERROR_MESSAGE);
		}
	}
} // end of J1217_ScribbleFrame

class J1217_ScribbleView extends JComponent implements Observer, J1217_Constants
{
	private J1217_ColoredScribble theApp;					// The application object
	public J1217_ScribbleView(J1217_ColoredScribble theApp)
	{
		this.theApp = theApp;
		MouseHandler handler = new MouseHandler();			// Create the mouse Listener
		addMouseListener(handler);					// Listen for button events
		addMouseMotionListener(handler);				// Listen for motion events
	}
	public void update(Observable o, Object rectangle)
	{
		if(rectangle == null) {
			repaint();
		} else {
			repaint((Rectangle)rectangle);
		}
	}
	public void paint(Graphics g)
	{
		Graphics2D g2D = (Graphics2D)g;					// Get a Java 2D device context
		Iterator elements = theApp.getModel().getIterator();
		J1217_Element element;						// Stores an element

		while(elements.hasNext())
		{
			element = (J1217_Element)elements.next();			// Get the next element
			g2D.setPaint(element.getColor());			// Set the element color
			g2D.draw(element.getShape());				// Draw its shape
		}
	}
	class MouseHandler extends MouseInputAdapter
	{
		private Point start;						// Stores cursor position on press
		private Point last;						// Stores cursor position on drag
		private J1217_Element tempElement;				// Stores a temporary element
		private Graphics2D g2D;
		public void mousePressed(MouseEvent e)
		{
			start = e.getPoint();					// save cursor position
			int modifier = e.getModifiers();			// Get modifiers
			if((modifier & e.BUTTON1_MASK) != 0 )
			{
				g2D = (Graphics2D)getGraphics();		// Get graphics context
				g2D.setXORMode(getBackground());		// Set XOR mode
				g2D.setPaint(theApp.getWindow().getElementColor());	// Set color
			}
		}
		public void mouseDragged(MouseEvent e)
		{
			last = e.getPoint();					// Save cursor position
			int modifier = e.getModifiers();			// Get modifiers
			if((modifier & e.BUTTON1_MASK) != 0 )
			{
				if(tempElement == null)				// Is there an element?
				{
					tempElement = createElement(start, last);	// No, so create one
				}
				else
				{
					g2D.draw(tempElement.getShape());	// Yes, draw to erase it
					tempElement.modify(start, last);	// Now modify it
				}
				g2D.draw(tempElement.getShape());		// and draw it
			}
		}
		public void mouseReleased(MouseEvent e)
		{
			int modifier = e.getModifiers();			// Get modifiers
			if((modifier & e.BUTTON1_MASK) != 0 )
			{
				if(tempElement != null)				// Is there an element?
				{
					theApp.getModel().add(tempElement);	// Add element to the model
				}
				if(g2D != null)
				{
					g2D.dispose();				// Release graphic context resource
					g2D = null;				// Set it to null
				}
				start = last = null;				// Remove the points
				tempElement = null;				// No temporary stored
			}
		}
		private J1217_Element createElement(Point start, Point end)
		{
			switch(theApp.getWindow().getElementType())
			{
				case LINE:
					return new J1217_Element.Line(start, end, theApp.getWindow().getElementColor());
				case RECTANGLE:
					return new J1217_Element.Rectangle(start, end, theApp.getWindow().getElementColor());
				case CIRCLE:
					return new J1217_Element.Circle(start, end, theApp.getWindow().getElementColor());
				case CURVE:
					return new J1217_Element.Curve(start, end, theApp.getWindow().getElementColor());
			}
			return null;
		}
	} // end of MouseHandler class
} // end of J1217_ScribbleView class

class J1217_ScribbleModel extends Observable implements Serializable
{
	protected LinkedList elementList = new LinkedList();
	public boolean remove(J1217_Element element)
	{
		boolean removed = elementList.remove(element);
		if(removed)
		{
			setChanged();
			notifyObservers(element.getBounds());
		}
		return removed;
	}
	public void add(J1217_Element element)
	{
		elementList.add(element);
		setChanged();
		notifyObservers(element.getBounds());
	}
	public Iterator getIterator()
	{
		return elementList.listIterator();
	}
} // end of J1217_ScribbleModel class

abstract class J1217_Element implements Serializable
{
	protected Color color;
	public abstract Shape getShape();
	public abstract java.awt.Rectangle getBounds();
	public abstract void modify(Point start, Point last);

	public J1217_Element(Color color)
	{
		this.color = color;
	}
	public Color getColor()
	{
		return color;
	}
	static class Line extends J1217_Element
	{
		private Line2D.Double line;
		private void writeObject(ObjectOutputStream out) 
					throws IOException
		{
			out.writeDouble(line.x1);
			out.writeDouble(line.y1);
			out.writeDouble(line.x2);
			out.writeDouble(line.y2);
		}
		private void readObject(java.io.ObjectInputStream in) 
					throws IOException, ClassNotFoundException
		{
			double x1 = in.readDouble();
			double y1 = in.readDouble();
			double x2 = in.readDouble();
			double y2 = in.readDouble();
			line = new Line2D.Double(x1, y1, x2, y2);
		}
		public Line(Point start, Point end, Color color)
		{
			super(color);
			line = new Line2D.Double(start, end);
		}
		public Shape getShape()
		{
			return line;
		}
		public java.awt.Rectangle getBounds()
		{
			return line.getBounds();
		}
		public void modify(Point start, Point last)
		{
			line.x1 = start.x;
			line.y1 = start.y;
			line.x2 = last.x;
			line.y2 = last.y;
		}
	}
	static class Rectangle extends J1217_Element
	{
		private Rectangle2D.Double rectangle;
		private void writeObject(ObjectOutputStream out) 
					throws IOException
		{
			out.writeDouble(rectangle.x);
			out.writeDouble(rectangle.y);
			out.writeDouble(rectangle.width);
			out.writeDouble(rectangle.height);
		}
		private void readObject(java.io.ObjectInputStream in) 
					throws IOException, ClassNotFoundException
		{
			double x = in.readDouble();
			double y = in.readDouble();
			double width = in.readDouble();
			double height = in.readDouble();
			rectangle = new Rectangle2D.Double(x, y, width, height);
		}
		public Rectangle(Point start, Point end, Color color)
		{
			super(color);
			rectangle = new Rectangle2D.Double(
					Math.min(start.x, end.x), Math.min(start.y, end.y),	// Top-Left corner
					Math.abs(start.x - end.x), Math.abs(start.y - end.y));	// width & height
		}
		public Shape getShape()
		{
			return rectangle;
		}
		public java.awt.Rectangle getBounds()
		{
			return rectangle.getBounds();
		}
		public void modify(Point start, Point last)
		{
			rectangle.x = Math.min(start.x, last.x);
			rectangle.y = Math.min(start.y, last.y);
			rectangle.width = Math.abs(start.x - last.x);
			rectangle.height = Math.abs(start.y - last.y);
		}
	}
	static class Circle extends J1217_Element
	{
		private Ellipse2D.Double circle;
		private void writeObject(ObjectOutputStream out) 
					throws IOException
		{
			out.writeDouble(circle.x);
			out.writeDouble(circle.y);
			out.writeDouble(circle.width);
		}
		private void readObject(java.io.ObjectInputStream in) 
					throws IOException, ClassNotFoundException
		{
			double x = in.readDouble();
			double y = in.readDouble();
			double width = in.readDouble();
			circle = new Ellipse2D.Double(x, y, width, width);
		}
		public Circle(Point center, Point circum, Color color)
		{
			super(color);
			double radius = center.distance(circum);
			circle = new Ellipse2D.Double(center.x - radius, center.y - radius,
					2.*radius, 2.*radius);
		}
		public Shape getShape()
		{
			return circle;
		}
		public java.awt.Rectangle getBounds()
		{
			return circle.getBounds();
		}
		public void modify(Point center, Point circum)
		{
			double radius = center.distance(circum);
			circle.x = center.x - (int)radius;
			circle.y = center.y - (int)radius;
			circle.width = circle.height = 2*radius;
		}
	}
	static class Curve extends J1217_Element
	{
		private GeneralPath curve;
		private void writeObject(ObjectOutputStream out) 
					throws IOException
		{
			PathIterator iterator = curve.getPathIterator(new AffineTransform());
			Vector coords = new Vector();				// Stores coordinate objects
			int maxCoordCount = 6;					// Maximum coordinates for a segment
			float[] temp = new float[maxCoordCount];		// Stores segment data

			int result = iterator.currentSegment(temp);		// Get first segment
			if(!(result == iterator.SEG_MOVETO))			// ... should be moveTo
			{
				System.out.println("No starting moveTo");
				return;
			}
			iterator.next();					// Next segment
			while(!iterator.isDone())				// while we have segments
			{
				result = iterator.currentSegment(temp);		// Get the segment data
				if(!(result == iterator.SEG_LINETO))		// Should all be lines
				{
					System.out.println("Invalid segment type");	// If not we are
					return;						// in trouble so end it
				}
				coords.add(new Float(temp[0]));			// Add x coordinate to Vector
				coords.add(new Float(temp[1]));			// Add y coordinate to Vector
				iterator.next();
			}
			out.writeObject(coords);				// Save the Vector
		}
		private void readObject(java.io.ObjectInputStream in) 
					throws IOException, ClassNotFoundException
		{
			Vector coords = (Vector)in.readObject();		// Read the coordinates Vector
			curve = new GeneralPath();				// Create a path
			float x, y;						// Stores coordinates
			x = ((Float)coords.get(0)).floatValue();		// Get 1st x value
			y = ((Float)coords.get(1)).floatValue();		// Get 1st y value
			curve.moveTo(x, y);					// Move to the origin

			for(int i=2; i<coords.size(); i+=2)
			{
				x = ((Float)coords.get(i)).floatValue();	// Get x value
				y = ((Float)coords.get(i+1)).floatValue();	// Get y value
				curve.lineTo(x, y);				// Create a line segment
			}
		}
		public Curve(Point start, Point next, Color color)
		{
			super(color);
			curve = new GeneralPath();
			curve.moveTo(start.x, start.y);
			curve.lineTo(next.x, next.y);
		}
		// Add another segment
		public void modify(Point start, Point next)
		{
			curve.lineTo(next.x, next.y);
		}
		public Shape getShape()
		{
			return curve;
		}
		public java.awt.Rectangle getBounds()
		{
			return curve.getBounds();
		}
	}
} // end of J1217_Element class

public class J1217_ColoredScribble
{
	private static J1217_ScribbleFrame window;				// The application window
	private static J1217_ColoredScribble theApp;				// The application object
	private J1217_ScribbleModel scribble;					// The data model for the scribble
	private J1217_ScribbleView view;						// The view of the scribble

	public void windowOpened(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}

	public static void main(String[] args) 
	{
		theApp = new J1217_ColoredScribble();				// Create the application object
		theApp.init();
	}
	public void init()
	{
		window = new J1217_ScribbleFrame("Peter Paint", this);		// Create the app window
		Toolkit theKit = window.getToolkit();				// Get the window toolkit
		Dimension wndSize = theKit.getScreenSize();			// Get screen size
		window.setBounds(wndSize.width/4, wndSize.height/4, 		// Set screen position
				wndSize.width/2, wndSize.height/2);		// Set screen size
		window.addWindowListener(new J1217_WidnowHandler());		// Add window listener

		scribble = new J1217_ScribbleModel();				// Create the model
		view = new J1217_ScribbleView(this);				// Create the view
		scribble.addObserver((Observer)view);				// Register the view with the model
		window.getContentPane().add(view, BorderLayout.CENTER);
		window.setVisible(true);					// Display the window
		scribble.addObserver((Observer)window);				// Register wingow as observer
	}
	// Return a reference to the application window
	public J1217_ScribbleFrame getWindow()
	{
		return window;
	}
	// Return a reference to the model
	public J1217_ScribbleModel getModel()
	{
		return scribble;
	}
	// Return a reference to the view
	public J1217_ScribbleView getView()
	{
		return view;
	}
	public void insertModel(J1217_ScribbleModel newScribble)
	{
		scribble = newScribble;						// Store the new scribble
		scribble.addObserver((Observer)view);				// Add the view as Observer
		scribble.addObserver((Observer)window);				// Add the app window as observer
		view.repaint();							// Repaint the view
	}
	class J1217_WidnowHandler extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			window.dispose();					// Release the window resources
			System.exit(0);						// End the application
		}
	} // end of J1217_WidnowHandler class
} // end of J1217_ColoredScribble class