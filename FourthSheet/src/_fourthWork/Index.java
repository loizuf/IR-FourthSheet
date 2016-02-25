package _fourthWork;

import java.util.ArrayList;

import _fourthGiven.Document;

public class Index {
	
	ArrayList<Document> collection;
	ArrayList<Unigramm> unigramms;

	// TASK 1 start
	// indexes all the terms so we can use them
	public Index(ArrayList<Document> collection) {
		this.collection = collection;
	}
	
	public ArrayList<Integer> searchUnigramm(String query, int i) {
		ArrayList<Integer> result = new ArrayList<>();
		return result;
	}
}
