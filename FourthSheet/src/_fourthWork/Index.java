package _fourthWork;

import java.util.ArrayList;

import _fourthGiven.Document;

public class Index {
	
	ArrayList<Document> collection;
	ArrayList<Unigramm> unigramms;
	ArrayList<Bigramm> bigramms;

	// TASK 1 start
	// indexes all the terms so we can use them
	public Index(ArrayList<Document> collection) {
		this.collection = collection;
	}
	
	public ArrayList<Integer> searchUnigramm(String query) {
		ArrayList<Integer> result = new ArrayList<>();
		return result;
	}
	
	public ArrayList<Integer> searchBigramm(String query) {
		ArrayList<Integer> result = new ArrayList<>();
		return result;
	}
}
