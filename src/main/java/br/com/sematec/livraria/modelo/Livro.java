package br.com.sematec.livraria.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Livro extends BaseEntity {
	private Long id;
	private String titulo;
	private String isbn;
	private double preco;
	private Calendar dataLancamento = Calendar.getInstance();
	private List<Autor> autores = new ArrayList<Autor>();

	public Livro() {
		super();
	}

	public Livro(String isbn, String titulo, Calendar dataLancamento, double preco, List<Autor> autores) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.preco = preco;
		this.dataLancamento = dataLancamento;
		this.autores = autores;
	}

	public void adicionaAutor(Autor autor) {
		this.autores.add(autor);
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	@Override
	public Long getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public double getPreco() {
		return preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}