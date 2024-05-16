import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
        
class Biblioteca {
	
	Scanner sc = new Scanner(System.in); 
	
    private List<Livro> acervo = new ArrayList<Livro>(); 
    private List<Emprestimo> historico_emprestimo = new ArrayList<Emprestimo>();

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }
    
    public String adicionarLivro(Livro livro){
        acervo.add(livro);
        return ("Livro adicionado com sucesso!");
    }
    
    public void exibirAcervo() {	
    	for (Livro livro : acervo) {
    		livro.getLivro();
    	}
    }
    
    public String buscarLivro(String palavraChave){
        return palavraChave;
    }      
    
    public void atualizarLivro(String ISBN, String item, String alteracao, int anoPublicacao, int quantidadeDisponivel){
    	
    	Livro livroSelecionado = null;
    	
    	for (Livro livro : acervo) {
    		if (livro.getISBN()==ISBN) {
    			livro.getLivro();
    			livroSelecionado = livro;
		    	
		    	switch (item) {
		    	  case "Titulo":
		    		  	livroSelecionado.setTitulo(alteracao);
		    	    break;
		    	  case "Autor":
		    		  	livroSelecionado.setAutor(alteracao);
		    	    break;
		    	  case "Editora":
				    	livroSelecionado.setEditora(alteracao);
		    	    break;
		    	  case "AnoPublicacao":
		    		  livroSelecionado.setAnoPublicacao(Integer.parseInt(alteracao));
		    	    break;
		    	  case "ISBN":
			    		livroSelecionado.setISBN(alteracao);
		    	    break;
		    	  case "QuantidadeDisponivel":
		    		  	livroSelecionado.setQuantidadeDisponivel(Integer.parseInt(alteracao));
		    	    break;
		    	}
    			
    		} else {
    			System.out.println("Esse livro não existe.");
    			break;
    		}
    	}
    }
    
    public void excluirLivro(String isbn){
    	for (Livro livro : acervo) {
    		if (livro.getISBN()==isbn) {
    		 	acervo.remove(livro);
    			System.out.println("Livro removido com sucesso!");

    		} else {
    			System.out.println("Livro não encontrado.");
    		}
    	}
    }
    
    public void emprestimo(String locatario,int tempoDeEmprestimo,Livro livro,Date dataEmprestimo,Date dataPrevisaoDeDevolucao, Date dataDevolucao,
    						int limiteLacacao){
        
        
    }
    
    public void devolucao(){
        
    }
}
