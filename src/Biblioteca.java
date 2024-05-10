import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
        
class Biblioteca {
	
	Scanner sc = new Scanner(System.in); 
	
    private List<Livro> acervo = new ArrayList<Livro>(); 
    private List<Emprestimo> historico_emprestimo = new ArrayList<Emprestimo>(); ;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro livro){
        acervo.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }
    
    public void exibirAcervo() {	
    	for (Livro livro : acervo) {
    		livro.getLivro();
    	}
    }
    
    public void buscarLivro(String palavraChave){
        //Estudo Format String
    }      
    
    public void atualizarLivro(String isbn, String item, String alteracao){
    	
    	Livro livroSelecionado = null;
    	
    	for (Livro livro : acervo) {
    		if (livro.getISBN()==isbn) {
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
    
    public void emprestimo(){
        
        
    }
    
    public void devolucao(){
        
    }
}
