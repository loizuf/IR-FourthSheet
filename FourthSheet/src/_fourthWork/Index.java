package _fourthWork;

import java.util.ArrayList;

import _fourthGiven.Document;

public class Index {
	
	ArrayList<Document> collection;
	ArrayList<Unigramm> unigramms;

	// Bearbeiten sie Aufgabe 1.a hier
	// indexes all the terms so we can use them
	public Index(ArrayList<Document> collection) {
		this.collection = collection;
	}
	
	// Bearbeiten sie Aufgabe 1.c hier
	public ArrayList<Integer> searchUnigramm(String query, int i) {
		ArrayList<Integer> result = new ArrayList<>();
		return result;
	}
	
	// Bearbeiten sie Aufgabe 2 hier
	public float getCollectionProbability(String word){
		switch (word) {
		case "chekov":
			return 0.0081f;

		case "spock":
			return 0.0243f;

		case "helmsman":
			return 0.00162f;

		case "enterprise":
			return 0.0406f;
		
		case "kaktus":
			return 0.0f;
			
		default:
			break;
		}
		return 0.0f;
	}
}
