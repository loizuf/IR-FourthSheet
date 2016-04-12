package test;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import _fourthGiven.Document;
import _fourthGiven.FileReader;
import _fourthWork.Unigramm;

// This tests if the calculated Probabilities for terms in the created unigramms are correct

public class Test_1b {

	// Location of test collection
	private static final String TEST_PATH_3 = "collections/testCollections/third";
	
	// ArrayList containing unigrams for all documents
	private static ArrayList<Unigramm> unis;
	
	// precision of the tests
	private static final float ERROR_MARGIN = 0.01f;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ArrayList<Document> collection = FileReader.readCollection(TEST_PATH_3);
		
		unis = new ArrayList<>();
		
		for (Iterator<Document> iterator = collection.iterator(); iterator.hasNext();) {
			Document document = (Document) iterator.next();
			unis.add(new Unigramm(document));
		}
	}
	
	// assertEquals has 3 arguments: value1, value2, delta. delta is used for a margin of error
	
	@Test
	public void TestSingleTerm() throws FileNotFoundException {
		assertEquals(unis.get(0).getProbability("iowa"), 0.033f, ERROR_MARGIN);
	}

	@Test
	public void TestDoubleTerm() throws FileNotFoundException {
		assertEquals(unis.get(0).getProbability("he"), 0.066f, ERROR_MARGIN);
	}

	@Test
	public void TestMultipleDocuments() throws FileNotFoundException {
		assertEquals(unis.get(1).getProbability("spock"), 0.066f, ERROR_MARGIN);
	}

	@Test
	public void TestAbsentTerm() throws FileNotFoundException {
		assertEquals(unis.get(4).getProbability("marcus"), 0.0f, ERROR_MARGIN);
	}

	@Test
	public void TestTermInOtherDocument() throws FileNotFoundException {
		assertEquals(unis.get(4).getProbability("enterprise"), 0.0f, ERROR_MARGIN);
	}
}
