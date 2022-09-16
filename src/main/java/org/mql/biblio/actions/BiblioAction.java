package org.mql.biblio.actions;

import java.util.List;
import java.util.Vector;

import org.mql.biblio.models.Author;

public class BiblioAction {
	List<Author> authors = new Vector<Author>();

	public BiblioAction() {
		authors.add(new Author(101, "James Gosling", 1955));
		authors.add(new Author(102, "Erich Gamma", 1961));
		authors.add(new Author(101, "Brendan Eich", 1961));
		authors.add(new Author(101, "Tim Berners Lee ", 1955));
	}

	public List<Author> searchAuthorsByName(String name) {
		name = name.toLowerCase();
		List<Author> res = new Vector<>();
		for (Author author : authors) {
			if(author.getName().toLowerCase().contains(name)) {
				res.add(author);
			}
		}
		return res;

	}

}
