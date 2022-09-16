package org.mql.biblio.models;

public class Author {
	private int id;
	private String name;
	private int yearBorn;
	
	
	public Author() {
	}

	public Author(int id, String name, int yearBorn) {
		super();
		this.id = id;
		this.name = name;
		this.yearBorn = yearBorn;
	}
	
	// Constructeue de Mapping
	public Author(String ...row) {
		super();
		try {
			this.id = Integer.parseInt(row[0]);
		}
		catch(Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		this.name = row[1];
		try {
			this.yearBorn = Integer.parseInt(row[2]);;
		}
		catch(Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
	}
	
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getYearBorn() {
		return yearBorn;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", yearBorn=" + yearBorn + "]";
	}
	public String toJson() {
		return "{ \"id\" : "+ id +"}";
	}
	
}
