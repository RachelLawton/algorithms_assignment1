package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.AutoComplete;
import models.Term;
import models.WordReader;

public class BruteAutoComplete implements AutoComplete {

	public List<String> filtered;//new arraylist filtered
	WordReader words;

	public BruteAutoComplete() throws IOException {
		words = new WordReader();
	}

	@Override
	public double weightOf(String term) {

		for (int i = 0; i < WordReader.terms.size(); i++) {//getting the weights of the terms
			if (term.equals(WordReader.terms.get(i).getName())) {//if the the term equals i then get name
				return WordReader.terms.get(i).getWeight();//return name and weight
			}
		}
		return 0;
	}

	@Override
	public String bestMatch(String prefix) {
		for (Term t : WordReader.terms)

		{
			if (t.getName().startsWith(prefix)) {//if name starts with prefix added 
				return t.getName();//return name
			}
		}
		return null;

	}

	@Override
	public Iterable<String> matches(String prefix, int k) {
		filtered = new ArrayList<String>();
		for (Term t : WordReader.terms) {
			if (t.getName().startsWith(prefix) && filtered.size() < k) {//if name starts with prefix added and is lower or equal to k(options available)
				filtered.add(t.getName());//its added to arraylost filtered

			}
		}

		return filtered;//return the arrylist
	}

}
