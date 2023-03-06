package com.javacode.springbootlibrary.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
public class Book {

  public Book() {
  }

  public Book(Long id, String title, String author, String description, int copies,
      int copiesAvailable, String category, String img) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.description = description;
    this.copies = copies;
    this.copiesAvailable = copiesAvailable;
    this.category = category;
    this.img = img;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "title")
  private String title;

  @Column(name = "author")
  private String author;

  @Column(name = "description")
  private String description;

  @Column(name = "copies")
  private int copies;

  @Column(name = "copies_available")
  private int copiesAvailable;

  @Column(name = "category")
  private String category;

  @Column(name = "img")
  private String img;
}
