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

	public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

	public void setEditora(String editora) {
		this.editora=editora;
	}
        public void setAnoPublicacao(int anoPublicacao) {
            this.anoPublicacao= anoPublicacao;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }
	
	public int getQuantidadeDisponivel(int quantidadeDisponivel) {
		return quantidadeDisponivel;
	}
	
	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
                this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public void emprestimo() {
		if(quantidadeDisponivel > 0){
			this.quantidadeDisponivel = quantidadeDisponivel - 1;
		}
		else{
			System.out.println("Não é possível fazer o empréstimo, livro fora de estoque");
		}
	}
	
	public void devolucao() {
			this.quantidadeDisponivel = quantidadeDisponivel + 1;
		}

        
	public void getLivro() {
		System.out.println(this.titulo+"\nAutor(es): "+this.autor+
					"\nAno de publicação: "+this.anoPublicacao+"\nEditora: "+this.editora+
					"\nISBN: "+this.ISBN+"\nExemplares Disponíveis: "+this.quantidadeDisponivel+
					"\n- - - - - - - - - - - - - - - - -");
	}
    
}