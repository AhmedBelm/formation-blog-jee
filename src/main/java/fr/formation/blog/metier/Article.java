package fr.formation.blog.metier;

import java.util.Objects;

/**
 * Définition d'un POJO (Plain Old Java Object), une classe qui respecte les
 * contraintes suivantes :
 * <ul>
 * <li>Des attributs (fields) uniquement <b>privés</b></li>
 * <li>Un constructeur par défaut (sans arguments)</li>
 * <li>Des accesseurs pour chaque attribut</li>
 * <li style="color:red;">Surtout pas de méthodes de traitement !</li>
 * </ul>
 */
public class Article {

	private Integer id;

	private String title;

	private String content;

	public Article() {
	}

	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public Article(Integer id, String title, String content) {
		this(title, content);
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Article other = (Article) obj;
		return Objects.equals(id, other.id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
