==========++++++++++==========
./MavenBatch/MavenHonkJarModule/src/main/java/de/honk/BatchProzessorHonk.java
package de.honk;

import java.util.Properties;

import com.ibm.websphere.batch.devframework.steps.technologyadapters.BatchRecordProcessor;

import de.honk.lib.Honki;
import de.honk.lib.TestHonk;

public class BatchProzessorHonk implements BatchRecordProcessor {

	@Override
	public void initialize(Properties props) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object processRecord(Object record) throws Exception {
		TestHonk testRecord = (TestHonk)record; 
		testRecord.getHonki().setOther("SUFFIX");
		return testRecord;
	}

	@Override
	public int completeProcessing() {
		// TODO Auto-generated method stub
		return 0;
	}

}

