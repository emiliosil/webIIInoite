package br.com.emiliosilva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="onePieces")
public class OnePiece {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 11,nullable = false,unique = true)
	private String ISBN;
	@Column(length = 50,nullable = false)
	private String title;
	@Column(length = 70,nullable = false)
	private String author;
	@Column(length = 100,nullable = false)
	private String publishingCompany;
	
	public OnePiece(int id, String iSBN, String title, String author, String publishingCompany) {
		this.id = id;
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.publishingCompany = publishingCompany;
	}
	
	public OnePiece() {
	}

	public int getId() {
		return id;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
}