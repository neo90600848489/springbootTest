package com.bookstore.entity;

import com.bookstore.controller.BookStoreController;
import com.bookstore.controller.Constants;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "author")
	private String author;

	@Column(name = "publication")
	private String publication;

	@Column(name = "category")
	private String category;

	@Column(name = "pages")
	private int pages;

	@Column(name = "price")
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book(int id,String name, String author, String publication, String category, int pages, int price) {
		this.id=id;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", author='" + author + '\'' +
				", publication='" + publication + '\'' +
				", category='" + category + '\'' +
				", pages=" + pages +
				", price=" + price +
				'}';
	}

	public Book() {
	}

	public List<Book> createlistofBooks() {

		List<Book> books = new ArrayList<>();

		for (int i =0; i < 100; i++) {
			Book book = new Book(i,Constants.name[getrandom()],Constants.author[getrandom()],Constants.publication[getrandom()],
					Constants.category[getrandom()], Constants.pages[getrandom()], Constants.prices[getrandom()]) ;
			books.add(book);
			System.out.println(book);

		}
		return books;
	}

	public int getrandom() {
		int max = 4;
		int min = 1;
		int range = max - min + 1;
		return 	(int) (Math.random() * range) + min;


	}
}
