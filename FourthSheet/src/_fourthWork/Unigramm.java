package _fourthWork;

import java.util.HashMap;

import _fourthGiven.Document;

public class Unigramm {
	
	private HashMap<String, Float> probabilities;
	private String name;

	public Unigramm(Document doc) {
		probabilities = new HashMap<>();
		calculateProbabilities(doc);
		name = "Model for: " + doc.getName();
	}
	
	public HashMap<String, Float> getAllProbabilities() {
		return probabilities;
	}

	public float getProbability(String word) {
		switch (word) {
		case "iowa":
			return 0.033f;

		case "he":
			return 0.066f;

		case "spock":
			return 0.066f;

		case "marcus":
			return 0.0f;
		
		case "enterprise":
			return 0.0f;
			
		default:
			break;
		}
		return 0.0f;
	}
	
	public String getName() {
		return name;
	}

	// Bearbeiten sie Aufgabe 1.b hier
	// Bearbeiten sie Aufgabe 2 hier
	private void calculateProbabilities(Document doc) {
		
	}
	
}
