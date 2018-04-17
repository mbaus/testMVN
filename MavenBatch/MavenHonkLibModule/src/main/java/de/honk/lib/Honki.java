==========++++++++++==========
./MavenBatch/MavenHonkLibModule/src/main/java/de/honk/lib/Honki.java
package de.honk.lib;

public class Honki {
	private int id;
	private String text;
	private String other;
	public synchronized final int getId() {
		return id;
	}
	public synchronized final void setId(int id) {
		this.id = id;
	}
	public synchronized final String getText() {
		return text;
	}
	public synchronized final void setText(String text) {
		this.text = text;
	}
	public synchronized final String getOther() {
		return other;
	}
	public synchronized final void setOther(String other) {
		this.other = other;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((other == null) ? 0 : other.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Honki)) {
			return false;
		}
		Honki other = (Honki) obj;
		if (id != other.id) {
			return false;
		}
		if (this.other == null) {
			if (other.other != null) {
				return false;
			}
		} else if (!this.other.equals(other.other)) {
			return false;
		}
		if (text == null) {
			if (other.text != null) {
				return false;
			}
		} else if (!text.equals(other.text)) {
			return false;
		}
		return true;
	}
	public Honki(int id, String text, String other) {
		super();
		this.id = id;
		this.text = text;
		this.other = other;
	}
	
	
}

