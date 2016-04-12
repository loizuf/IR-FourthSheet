package test;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import _fourthGiven.Document;
import _fourthGiven.FileReader;
import _fourthWork.Index;

// This tests if the probabilities of the unigramm of the collection are correct

public class Test_2b {

	// Location of test collection
	private static final String TEST_PATH_3 = "collections/testCollections/third";
	
	// Precision of the tests
	private static final float ERROR_MARGIN = 0.0001f;
	
	// instance of the Index
	private static Index index;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ArrayList<Document> collection = FileReader.readCollection(TEST_PATH_3);
		index = new Index(collection);
	}
	
	// assertEquals has 3 arguments: value1, value2, delta. delta is used for a margin of error
	
	@Test
	public void TestSingleDocument() throws FileNotFoundException {
		assertEquals(index.getCollectionProbability("chekov"), 0.0081f, ERROR_MARGIN);
	}

	@Test
	public void TestMultipleDocuments() throws FileNotFoundException {
		assertEquals(index.getCollectionProbability("spock"), 0.0243f, ERROR_MARGIN);
	}

	@Test
	public void TestMultipleTerm() throws FileNotFoundException {
		assertEquals(index.getCollectionProbability("helmsman"), 0.00162f, ERROR_MARGIN);
	}

	@Test
	public void TestMultipleDocumentTerm() throws FileNotFoundException {
		assertEquals(index.getCollectionProbability("enterprise"), 0.0406f, ERROR_MARGIN);
	}

	@Test
	public void TestAbsentTerm() throws FileNotFoundException {
		assertEquals(index.getCollectionProbability("kaktus"), 0.0f, ERROR_MARGIN);
	}
}
