package com.jeremy.art;

import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
			
		
		ArrayList<Art> museum = new ArrayList<Art> ();
		
		Painting paint1 = new Painting("paint1", "Jeremy", "this is a painting", "Watercolor");
		Painting paint2 = new Painting("paint2", "Jeremy", "this is a painting", "Acrylic");
		Painting paint3 = new Painting("paint3", "Jeremy", "this is a painting", "etc");
		Sculpture sculpture1 = new Sculpture("sculpture1", "Jeremy", "This is a sculpture", "Marble");
		Sculpture sculpture2 = new Sculpture("sculpture2", "Jeremy", "This is a sculpture", "Bronze");
	
		museum.add(paint1);
		museum.add(paint2);
		museum.add(paint3);
		museum.add(sculpture1);
		museum.add(sculpture2);
		
		for(int i = 0; i < museum.size(); i++) {
			museum.get(i).viewArt();
		}
		
	}

}
