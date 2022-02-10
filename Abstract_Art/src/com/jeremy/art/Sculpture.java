package com.jeremy.art;

public class Sculpture extends Art {

	private String material;
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.setMaterial(material);
	}
	
	@Override
	public void viewArt() {
		System.out.println("This is a sculpture");
		System.out.println("Type: " + this.getMaterial());
		System.out.println("Title: " + this.getTitle());
		System.out.println("Author: " + this.getAuthor());
		System.out.println("description: " + this.getDescription()+ "\n");

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	

}
