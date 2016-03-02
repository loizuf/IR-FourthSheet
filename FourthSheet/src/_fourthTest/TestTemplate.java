package _fourthTest;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import _fourthGiven.FileReader;
import _fourthWork.Index;

@RunWith(Parameterized.class)
public class TestTemplate {

	// Location of test collection
	private static final String TEST_PATH_2 = "collections/testCollections/second";
	
	// Variable containing an instance of PositionalIndex
	private Index index;
		
	// parameterized variables

	public TestTemplate(String inputTerm, int expectedResult) throws FileNotFoundException {
		index = new Index(FileReader.readCollection(TEST_PATH_2));
		
	}

	@Test
	public void testPerformANDMerge() {
		
	}
	
	// This method sets up the data for the tests
	// the third variable is used to display a description to the students
	@Parameters (name = "{2}")
	public static List<Object[]> data() {
		return Arrays
				.asList(new Object[][] { 
					{"Baum", 0, "term not present"},
					{"soylent", 1, "term at the start of document"},
					{"sea", 1, "term at the end of document"},
					{"purple", 1, "term only in the first document"},
					{"camels", 1, "term only in the last document"},
					{"people", 3, "term in multiple documents"},
					{"no", 3, "term multiple times in document"}
				});
	}
}
