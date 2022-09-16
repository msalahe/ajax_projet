package org.mql.biblio.web;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mql.biblio.actions.BiblioAction;
import org.mql.biblio.models.Author;

public class AjaxController extends HttpServlet {
	private List<String> authors;
	private BiblioAction action;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		action = new BiblioAction();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = req.getParameter("name").toLowerCase();
		List<Author> author = action.searchAuthorsByName(name);
		resp.getWriter().println(JSONMapper.getAuthors(author));

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
