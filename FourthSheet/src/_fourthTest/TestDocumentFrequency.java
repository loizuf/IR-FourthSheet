package _fourthTest;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

import _fourthGiven.Document;
import _fourthGiven.FileReader;
import _fourthWork.Unigramm;

public class TestDocumentFrequency {

	// Location of test collection
	private static final String TEST_PATH_2 = "collections/testCollections/second";
	
	// Variable containing an instance of PositionalIndex
	private static ArrayList<Unigramm> unis;

	public TestDocumentFrequency() throws FileNotFoundException {
		ArrayList<Document> collection = FileReader.readCollection(TEST_PATH_2);
		
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			Document document = (Document) iterator.next();
			unis.add(new Unigramm(document));
		}
		
		HashMap<String, Float> first = new HashMap<>();
		first.put("There", 0.1f);
		first.put("is", 0.1f);
		first.put("no", 0.1f);
		first.put("green", 0.1f);
		first.put("yellow", 0.1f);
		first.put("purple", 0.1f);
		first.put("corn", 0.1f);
		first.put("on", 0.1f);
		first.put("the", 0.1f);
		first.put("moon", 0.1f);
		
		HashMap<String, Float> third = new HashMap<>();
		first.put("There", 0.1f);
		first.put("is", 0.1f);
		first.put("no", 0.1f);
		first.put("green", 0.1f);
		first.put("yellow", 0.1f);
		first.put("purple", 0.1f);
		first.put("corn", 0.1f);
		first.put("on", 0.1f);
		first.put("the", 0.1f);
		first.put("moon", 0.1f);
		
		HashMap<String, Float> last = new HashMap<>();
		last.put("green", 0.125f);
		last.put("four", 0.125f);
		last.put("camels", 0.125f);
		last.put("should", 0.125f);
		last.put("is", 0.125f);
		last.put("tree", 0.125f);
		last.put("space", 0.125f);
		last.put("station", 0.125f);
		
		assertEquals("First document", first, unis.get(0).getAllProbabilities());
	    assertEquals("Last document", last, unis.get(7).getAllProbabilities());
	    assertEquals("double terms", last, unis.get(7).getAllProbabilities());
	    assertEquals("Number of probabilities = Number of terms", , tester.multiply(0, 0));
	}
	
	
}
