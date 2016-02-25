package _fourthWork;

import java.util.HashMap;

import _fourthGiven.Document;

public class Unigramm {
	
	private HashMap<String, Float> probabilities;
	private String name;

	public Unigramm(Document doc) {
		probabilities = new HashMap<>();
		calculateProbabilities(doc);
	}
	
	public HashMap<String, Float> getAllProbabilities() {
		return probabilities;
	}

	protected float getProbability(String word) {
		return probabilities.get(word);
	}
	
	protected String getName() {
		return name;
	}

	protected  void calculateProbabilities(Document doc) {
		
	}
	
}
