package ar.edu.unlp.oo1.ejercicio1.impl;

import static ar.edu.unlp.oo1.ejercicio1.app.Ejercicio1Application.logger;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;

	public WallPostImpl() {
		this.text = "Undefined post";

	}

	public WallPostImpl(String text, int likes, boolean isFeatured) {
		this.text = text;
		this.likes = likes;
		this.isFeatured = isFeatured;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		logger.info(" -> Escribiendo nombre de post");
		this.text = text;

	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		logger.info(" -> Se ha dado like");
		this.likes = this.likes + 1;
		if (this.likes == 10)
			logger.warning(" -- Llegando a " + this.likes + " likes -- ");

	}

	@Override
	public void dislike() {
		logger.info(" -> Se ha dado dislike");
		if (likes > 0) {
			this.likes = this.likes - 1;
		}
		if (likes == 0)
			logger.warning(" -- Llegando a " + this.likes + " likes -- ");
	}

	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;

	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
