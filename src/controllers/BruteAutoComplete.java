package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.AutoComplete;
import models.Term;
import models.WordReader;

public class BruteAutoComplete implements AutoComplete {

	public List<String> filtered;
	WordReader words;

	public BruteAutoComplete() throws IOException {
		words = new WordReader();
	}

	@Override
	public double weightOf(String term) {

		for (int i = 0; i < WordReader.terms.size(); i++) {
			if (term.equals(WordReader.terms.get(i).getName())) {
				return WordReader.terms.get(i).getWeight();
			}
		}
		return 0;
	}

	@Override
	public String bestMatch(String prefix) {
		for (Term t : WordReader.terms)

		{
			if (t.getName().startsWith(prefix)) {
				return t.getName();
			}
		}
		return null;

	}

	@Override
	public Iterable<String> matches(String prefix, int k) {
		filtered = new ArrayList<String>();
		for (Term t : WordReader.terms) {
			if (t.getName().startsWith(prefix) && filtered.size() < k) {
				filtered.add(t.getName());

			}
		}

		return filtered;
	}

}
