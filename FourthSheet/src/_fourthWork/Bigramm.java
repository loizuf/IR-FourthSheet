package _fourthWork;

import _fourthGiven.Document;
import _fourthGiven.NGramm;

public class Bigramm extends NGramm{

	public Bigramm(Document doc) {
		super(doc);
	}

	@Override
	protected float calculateProbabilities(Document doc) {
		return 0.0f;
	}

}
