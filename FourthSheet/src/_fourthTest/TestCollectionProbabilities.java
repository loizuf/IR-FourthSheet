package _fourthTest;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import _fourthGiven.Document;
import _fourthGiven.FileReader;
import _fourthWork.Index;

public class TestCollectionProbabilities {

	// Location of test collection
	private static final String TEST_PATH_3 = "collections/testCollections/third";
	
	// instance of the Index
	private static Index index;

	public TestCollectionProbabilities() throws FileNotFoundException {
		ArrayList<Document> collection = FileReader.readCollection(TEST_PATH_3);
		index = new Index(collection);
		
		assertTrue("Term in one document", checkRange(index.getCollectionProbability("chekov"), 0.0081f));
		assertTrue("Term in multiple documents", checkRange(index.getCollectionProbability("spock"), 0.0243f));
		assertTrue("Term multiple times in one document", checkRange(index.getCollectionProbability("helmsman"), 0.0162f));
	    assertTrue("Term multiple times in multiple documents", checkRange(index.getCollectionProbability("enterprise"), 0.0406f));
		assertTrue("Term in no document", checkRange(index.getCollectionProbability("kaktus"), 0.0f));
	}

	// We cant know how the students calcukate the probability but we can check
	// if they are in a certain range (and we can do that as precise as we want)
	private boolean checkRange(float value, float bound) {
		
		if(value>=bound-0.0005 && value<=bound+0.0005){
			return true;
		}
		return false;
	}
}
