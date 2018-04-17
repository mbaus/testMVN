==========++++++++++==========
./MavenBatch/MavenHonkJarModule/src/main/java/de/honk/InputStreamImpl.java
package de.honk;

import de.honk.lib.TestHonk;
import de.honk.lib.Honki;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Properties;

import com.ibm.websphere.batch.devframework.datastreams.patternadapter.FileReaderPattern;

import de.honk.lib.TestHonk;

public class InputStreamImpl implements FileReaderPattern {
	
	private int localId;
	
	@Override
	public void initialize(Properties props) {
		localId = 0;

	}

	@Override
	public void processHeader(BufferedReader reader) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Object fetchRecord(BufferedReader reader) throws IOException {
		String read = reader.readLine();
		if (read != null && !read.isEmpty()){
		localId = localId+1; 
		Honki myHonk = new Honki(localId, read+":"+localId, "Hallo Welt:");
		TestHonk testRecord = new TestHonk(myHonk);
		return testRecord;
		} else{
			return null;
		}
	}

	@Override
	public Object fetchHeader() {
		// TODO Auto-generated method stub
		return null;
	}

}

