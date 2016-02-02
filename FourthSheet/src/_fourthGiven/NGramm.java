package _fourthGiven;

import java.util.HashMap;

public abstract class NGramm {
	
	private HashMap<String, Float> probabilities;
	private String name;

	public NGramm(Document doc) {
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

	protected abstract void calculateProbabilities(Document doc);
	
}
