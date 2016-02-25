package _fourthWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import _fourthGiven.Document;
import _fourthGiven.FileReader;

public class MainController {

	/*
	 * LoremIpsumCollectionDirectoryPath - Name des Verzeichnisses das die
	 * Dokumente enthaelt
	 */
	private static final String LOREM_IPSUM_COLLECTION_DIRECTORY_PATH = "collections/lorem";

	public static void main(String[] args) throws IOException {

		// collection - Liste aller Document-Objekte
		ArrayList<Document> collection = FileReader.readCollection(LOREM_IPSUM_COLLECTION_DIRECTORY_PATH);

		// index - Repraesentation des index
		Index index = new Index(collection);

		// breakdown the query into two terms
		String query = getQueryTerms();
		
		// search for best results
		ArrayList<Integer> resultUni = index.searchUnigramm(query, 10);
		
		postResults(resultUni);
	}

	// Bearbeiten sie Aufgabe 3 hier.
	public static String getQueryTerms() {
		// let's get a query from the user via the command line
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
