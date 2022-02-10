package com.jeremy.art;

public class Painting extends Art {

	private String paintType;
	
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.setPaintType(paintType);
	}
	
	
	
	@Override
	public void viewArt() {
		System.out.println("This is a painting");
		System.out.println("Type: " + this.getPaintType());
		System.out.println("Title: " + this.getTitle());
		System.out.println("Author: " + this.getAuthor());
		System.out.println("description: " + this.getDescription() + "\n");		
	}

	public String getPaintType() {
		return paintType;
	}


	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
		
}
