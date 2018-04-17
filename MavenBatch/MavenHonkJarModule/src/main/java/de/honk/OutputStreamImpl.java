==========++++++++++==========
./MavenBatch/MavenHonkJarModule/src/main/java/de/honk/OutputStreamImpl.java
package de.honk;

import de.honk.lib.TestHonk;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Properties;

import com.ibm.websphere.batch.devframework.datastreams.patternadapter.FileWriterPattern;

public class OutputStreamImpl implements FileWriterPattern {

	@Override
	public void initialize(Properties props) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeRecord(BufferedWriter out, Object record)
			throws IOException {
		System.out.println(((TestHonk)record).getHonki().getId());
		out.write(((TestHonk)record).getHonki().getText());
		out.write(((TestHonk)record).getHonki().getOther());
		out.newLine();
		out.write("nov1");
		out.newLine();
	}

	@Override
	public void writeHeader(BufferedWriter out) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeHeader(BufferedWriter out, Object header)
			throws IOException {
		// TODO Auto-generated method stub

	}

}

