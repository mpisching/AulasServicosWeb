package br.edu.ifsc.livros;

public class Livro {
	private int id;
	private int isbn;
	private String titulo;
	private String autor;
	private String editora;
	private double preco;
	public Livro(int id, int isbn, String titulo, String autor, String editora, double preco) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.preco = preco;
	}
	public Livro() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void reajustarPreco(double taxa) {
		this.preco = this.preco + (this.preco * taxa / 100);
	}
}
