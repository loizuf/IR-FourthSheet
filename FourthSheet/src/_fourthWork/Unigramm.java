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
	
	// Method needed for Testing. DO NOT DELETE
	public HashMap<String, Float> getAllProbabilities() {
		return probabilities;
	}
	
	// Method needed for Testing. DO NOT DELETE
	public float getProbability(String word) {
		return probabilities.get(word);
	}
	
	// Method needed for Testing. DO NOT DELETE
	public String getName() {
		return name;
	}

	// Bearbeiten sie Aufgabe 1.b hier
	// Bearbeiten sie Aufgabe 2 hier
	// Berechnet die Warscheinlichkeiten des Unigramms für alle Wörter dieses Dokuments
	private void calculateProbabilities(Document doc) {
		
	}
	
}
