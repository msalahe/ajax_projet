package org.mql.biblio.web;

import java.util.List;

import org.mql.biblio.models.Author;

public class JSONMapper {

	public JSONMapper() {
		// TODO Auto-generated constructor stub
	}
	public static String getAuthors(Author  a) {
		return a.toString();
	}
	public static String getAuthors(List<Author>  a) {
		String json = "[";
		if(a.size() >0) {
			json += a.get(0).toJson();
			for (int i = 1; i < a.size(); i++) {
				json += ","+a.get(i).toJson();
			}
		}
		json +="]";
		return json;
	   
	}
}
