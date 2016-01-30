package _fourthWork;

import _fourthGiven.Document;
import _fourthGiven.NGramm;

public class Unigramm extends NGramm {

	public Unigramm(Document doc) {
		super(doc);
	}

	@Override
	protected float calculateProbabilities(Document doc) {
		return 0.0f;
	}

}
