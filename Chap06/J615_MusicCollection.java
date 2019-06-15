// 儲存檔名：d:\Chap06\J615_MusicCollection.java

public class J615_MusicCollection
{
	public static final int MAX_ARTISTS = 100;
	public static final int MAX_RECORDS = 100;
	public static final int MAX_TRACKS = 30;
	private int installedArtists = 0;
	private int installedRecords = 0;
	private Artist[] artistObj = new Artist[MAX_ARTISTS];
	private Recording[] recordObj = new Recording[MAX_RECORDS];

	public static void main(String[] args) throws java.io.IOException
	{
		J615_MusicCollection music = new J615_MusicCollection();
		Recording record1 = music.new Recording("NSYNC", "1");
		Recording record2 = music.new Recording("Britney Spears", "2");
		Recording.Track pop11 = record1.new Track("Bye Bye Bye");
		Recording.Track pop12 = record1.new Track("Are You Gonna Be There");
		Recording.Track pop13 = record1.new Track("If I'm Not The One");
		Recording.Track pop14 = record1.new Track("I Thought She Knew");
		Recording.Track pop21 = record2.new Track("Oops! I Did It Again");
		Recording.Track pop22 = record2.new Track("One Kiss From You");
		Recording.Track pop23 = record2.new Track("Girl In The Mirror");
		Recording.Track pop24 = record2.new Track("Heart");
		System.out.println(music);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<installedArtists; i++) {
			sb.append(recordObj[i].toString());
		}
		return sb.toString();
	}

	private class Artist	//內部成員類別
	{	//定義歌手名字
		private String artistStr;
		public Artist(String str)
		{
			this.artistStr = str;
			if(installedArtists < MAX_ARTISTS) {
				artistObj[installedArtists++] = this;
			}
		}
		public String toString() {
			return artistStr;
		}
		
	} // end of Artist class

	private class Recording	//內部成員類別
	{	//定義唱片編號
		private String artistStr;
		private String recordStr;
		private Artist artistObj = new Artist(artistStr);
		private Track[] trackObj = new Track[MAX_TRACKS];
		private int installedTracks = 0;

		public Recording(String str1, String str2)
		{
			this.artistStr = str1;
			this.recordStr = str2;
			J615_MusicCollection.this.recordObj[installedRecords++] = this;
		}

		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append("\n歌手: " + this.artistStr);
			sb.append("\n唱片: " + this.recordStr);
			for(int i=0; i<installedTracks; i++) {
				sb.append("\n第 " + i + " 首: " + trackObj[i].toString());
			}
			sb.append("\n");
			return sb.toString();
		}

		private class Track	//內部成員子類別
		{	//定義歌名
			private String trackStr;
			public Track(String str) {
				this.trackStr = str;
				Recording.this.trackObj[installedTracks++] = this;
			}
			public String toString() {
				return this.trackStr;
			}
		} // end of Track class
	} // end of Recording class
} // end of J615_MusicCollection