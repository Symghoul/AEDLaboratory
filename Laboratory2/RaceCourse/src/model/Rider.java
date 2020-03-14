package model;

public class Rider {

	private String name;
	private int track;
	private String horse;
	
	public Rider(String name, int track, String horse) {
		
		this.name = name;
		this.track = track;
		this.horse = horse;;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public String getHorse() {
		return horse;
	}

	public void setHorse(String horse) {
		this.horse = horse;
	}
	
}
