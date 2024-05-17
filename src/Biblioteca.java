import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
        
class Biblioteca {
	
    private List<Livro> acervo = new ArrayList<Livro>(); 
    //List<List<String>> emprestimos - new ArrayList<>();
 
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
    
    public void buscarLivro(String palavrachave){
        Pattern pattern = Pattern.compile(palavrachave.toLowerCase());
        Matcher matcher;
        String resumo;
        
        for (Livro livro:acervo){
           resumo = (livro.getAutor()+livro.getEditora()+livro.getTitulo()+livro.getISBN()+livro.getAnoPublicacao()).toLowerCase();
           matcher = pattern.matcher(resumo);
           if (matcher.find()){
               livro.getLivro();
           }
        }
    }      
    
    public void atualizarLivro(String ISBN, String item, String alteracao){
    	
    	Livro livroSelecionado = null;
    	
    	for (Livro livro : acervo) {
    		if (livro.getISBN().equals(ISBN)) {
    			livroSelecionado = livro;
		    	
		    	switch (item) {
		    	  case "Titulo":
		    		livroSelecionado.setTitulo(alteracao);
                                System.out.println("Alteracao concluida!.");   

		    	    break;
		    	  case "Autor":
		    		livroSelecionado.setAutor(alteracao);
                                System.out.println("Alteracao concluida!.");   

		    	    break;
		    	  case "Editora":
				livroSelecionado.setEditora(alteracao);
                                System.out.println("Alteracao concluida!.");   

		    	    break;
		    	  case "Ano de Publicacao":
                              try{
		    		  livroSelecionado.setAnoPublicacao(Integer.parseInt(alteracao));
                                  System.out.println("Alteracao concluida!.");   

                              } catch (NumberFormatException e) {
                                  System.out.println("Alteracao invalida.");   
                              }
		    	    break;
		    	  case "ISBN":
			    	livroSelecionado.setISBN(alteracao);
                                System.out.println("Alteracao concluida!.");   

		    	    break;
		    	  case "Quantidade Disponivel":
                               try{
		    		  livroSelecionado.setQuantidadeDisponivel(Integer.parseInt(alteracao));
                                   System.out.println("Alteracao concluida!.");   

                              } catch (NumberFormatException e) {
                                  System.out.println("Alteracao invalida.");   
                              }
		    	    break;
		    	}   			
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
    
    /*public void emprestimo(String locatario,int tempoDeEmprestimo,Livro livro,Date dataEmprestimo,Date dataPrevisaoDeDevolucao, Date dataDevolucao,
    						int limiteLacacao){
        
        
    }
    
    public void devolucao(){
        
    }*/
}