package br.edu.ifsc.livros;

import java.util.ArrayList;
import java.util.List;

public class LivroDataSource {
	private static List<Livro> livros = new ArrayList<>();

	public static void criarLista() {
		livros.add(new Livro(1, 123456, "Titulo 1", "Autor 1", "Editora 1", 25.00));
		livros.add(new Livro(2, 124456, "Titulo 2", "Autor 1", "Editora 2", 45.00));
		livros.add(new Livro(3, 123340, "Titulo 3", "Autor 3", "Editora 3", 125.00));
		livros.add(new Livro(4, 123000, "Titulo 4", "Autor 4", "Editora 4", 28.00));
		livros.add(new Livro(5, 123999, "Titulo 5", "Autor 5", "Editora 5", 95.00));
	}
	
	public static Livro adicionar(Livro livro) {
		livros.add(livro);
		return livro;
	}
	
	public static Livro getPorIsbn(int isbn) {
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getIsbn() == isbn) {
					return livro;
				}
			}
		}
		return null;
	}
	
	public static List<Livro> getPorAutor(String autor) {
		List<Livro> resultado = new ArrayList<>();
		
		for (Livro livro: livros) {
			if (livro.getAutor().equalsIgnoreCase(autor)) {
				resultado.add(livro);
			}
		}
		
		return resultado;
	}
	
	public static Livro getPorTitulo(String titulo) {
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					return livro;
				}
			}
		}
		return null;		
	}
	
	public static LivroDTO getPorIsbnDTO(int isbn) {
		LivroDTO livroDTO = null;
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getIsbn() == isbn) {
					livroDTO = 
						new LivroDTO(livro.getTitulo(),livro.getAutor(),livro.getEditora(),livro.getPreco());
					return livroDTO;
				}
			}
		}
		return livroDTO;
	}
	
	public static List<LivroDTO> getAllDTO() {
		List<LivroDTO> listaLivrosDTO = new ArrayList<>();
		if (livros != null) {
			for (Livro livro: livros) {
				LivroDTO livroDTO = 
						new LivroDTO(livro.getTitulo(),livro.getAutor(),livro.getEditora(),livro.getPreco());
				listaLivrosDTO.add(livroDTO);
			}
		}
		return listaLivrosDTO;
	}	
	
	public static void reajustarPrecoPorId(int id, double taxa) {
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getId() == id) {
					livro.reajustarPreco(taxa);
				}
			}
		}
	}
	
	public static void reajustarPreco(double taxa) {
		if (livros != null) {
			for (Livro livro: livros) {
				livro.reajustarPreco(taxa);
			}
		}		
	}
	
	public static List<Livro> getAll() {
		return livros;
	}

	public static void setLivros(List<Livro> livros) {
		LivroDataSource.livros = livros;
	}
	
}
