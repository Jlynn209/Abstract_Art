package com.jeremy.art;

public abstract class Art {
	private String title;
	private String author;
	private String description;
	
	public Art(String title, String author, String description) {
		setTitle(title);
		setAuthor(author);
		setDescription(description);
	}
	
	public abstract void viewArt();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
