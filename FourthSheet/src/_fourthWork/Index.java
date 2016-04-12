package _fourthWork;

import java.util.ArrayList;

import _fourthGiven.Document;

public class Index {
	
	ArrayList<Document> collection;
	ArrayList<Unigramm> unigramms;

	// Bearbeiten sie Aufgabe 1.a hier
	// Indexiert alle Terme damit wir sie benutzen können
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
		return 0.0f;
	}
}
