package _fourthTest;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import _fourthGiven.Document;
import _fourthGiven.FileReader;
import _fourthWork.Unigramm;

public class TestSingleProbabilities {

	// Location of test collection
	private static final String TEST_PATH_3 = "collections/testCollections/third";
	
	// ArrayList containing unigrams for all documents
	private static ArrayList<Unigramm> unis;
	
	// calculation help variable
	float precision = 0.0005f;

	public TestSingleProbabilities() throws FileNotFoundException {
		ArrayList<Document> collection = FileReader.readCollection(TEST_PATH_3);
		
		for (Iterator<Document> iterator = collection.iterator(); iterator.hasNext();) {
			Document document = (Document) iterator.next();
			unis.add(new Unigramm(document));
		}		

		assertTrue("Term one time in document", checkRange(unis.get(0).getProbability("iowa"), 0.033f));
		assertTrue("Term two times in document", checkRange(unis.get(0).getProbability("he"), 0.066f));
	    assertTrue("Term in multiple documents", checkRange(unis.get(1).getProbability("spock"), 0.027f));
	    assertEquals("Term not in document", unis.get(4).getProbability("kaktus"), 0.0f);
	    assertEquals("Term in ohter documents", unis.get(4).getProbability("enterprise"), 0.0f);
	}

	// We cant know how the students calculate the probability but we can check
	// if they are in a certain range (and we can do that as precise as we want)
	private boolean checkRange(float value, float bound) {
		
		if(value>=bound - precision && value<=bound + precision){
			return true;
		}
		return false;
	}
}
