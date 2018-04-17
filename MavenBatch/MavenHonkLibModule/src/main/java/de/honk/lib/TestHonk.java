==========++++++++++==========
./MavenBatch/MavenHonkLibModule/src/main/java/de/honk/lib/TestHonk.java
package de.honk.lib;

public class TestHonk {

	private Honki honki;

	public TestHonk(Honki honki) {
		super();
		this.honki = honki;
	}

	public synchronized final Honki getHonki() {
		return honki;
	}

	public synchronized final void setHonki(Honki honki) {
		this.honki = honki;
	}
	
	
}

