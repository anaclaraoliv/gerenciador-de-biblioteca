public class Livro {
	
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private String ISBN;
    private int quantidadeDisponivel;

    public Livro(String titulo, String autor, String editora, int anoPublicacao, String ISBN, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.ISBN = ISBN;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getISBN() {
		return ISBN;
	}

	public String setTitulo(String titulo) {
		return titulo;
	}

	public String setAutor(String Autor) {
		return autor;
	}

	public String setEditora(String editora) {
		this.editora=editora;
		return editora;
	}

	public String setAnoPublicacao(String anoPublicacao) {
		return anoPublicacao;
	}

	public String setISBN(String ISBN) {
		return ISBN;
	}
	
	public int getQuantidadeDisponivel(int quantidadeDisponivel) {
		return quantidadeDisponivel;
	}

	public void emprestimo(int quantidadeDisponivel) {
		if(quantidadeDisponivel > 0){
			this.quantidadeDisponivel = quantidadeDisponivel - 1;
		}
		else{
			System.out.println("Não é possível fazer o empréstimo, livro fora de estoque");
		}
	}
	
	public void devolucao(int quantidadeDisponivel) {
			this.quantidadeDisponivel = quantidadeDisponivel + 1;
		}

	public void getLivro() {
		System.out.println(this.titulo+"\nAutor(es): "+this.autor+
					"\nAno de publicação: "+this.anoPublicacao+"\nEditora: "+this.editora+
					"\nISBN: "+this.ISBN+"\nExemplares Disponíveis: "+this.quantidadeDisponivel+
					"\n- - - - - - - - - - - - - - - - -");
	}
    
}
