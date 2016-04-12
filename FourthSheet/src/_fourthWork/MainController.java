package _fourthWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import _fourthGiven.Document;
import _fourthGiven.FileReader;

public class MainController {

	// directory der Collection
	static final String COLLECTION_3_DIRECTORY_PATH = "collections/testCollections/third";
	public static void main(String[] args) throws IOException {

		// collection - Liste aller Document-Objekte
		ArrayList<Document> collection = FileReader.readCollection(COLLECTION_3_DIRECTORY_PATH);

		// index - Repraesentation des index
		Index index = new Index(collection);

		// Query einlesen
		String query = getQueryTerms();
		
		// search for best results
		ArrayList<Integer> resultUni = index.searchUnigramm(query, 10);
		
		postResults(resultUni);
	}
	
	// Diese Methode liest die Query Terme vom User ein (KEINE BEREINIGUNG oder SPALTUNG der Terme)
	public static String getQueryTerms() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a query:");
		String query = scanner.nextLine();
		scanner.close();
		
		return query;
	}

	/*
	 * Diese Methode gibt ausschlieslich die Ergebnisse an den User aus
	 */
	private static void postResults(ArrayList<Integer> result) {
		System.out.println("\n+++++++\n");
		System.out.println("The results are:");
		for (int currentResult : result) {
			System.out.println(currentResult);
		}
	}
}
