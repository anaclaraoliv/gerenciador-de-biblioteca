public class TesteBiblioteca {
    
	public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Java: Como Programar", "Deitel & Deitel", "Pearson", 2020, "978-8576059029", 5);
        Livro livro2 = new Livro("Clean Code", "Robert C. Martin", "Prentice Hall", 2008, "978-0132350884", 3);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        
        biblioteca.exibirAcervo();

        livro2.emprestimo();
        livro2.emprestimo();
       

        biblioteca.buscarLivro("Martin");
        livro2.devolucao();
        livro2.devolucao();
        
        biblioteca.exibirAcervo();

        biblioteca.atualizarLivro("978-0132350884","Titulo","Alterado");
        biblioteca.atualizarLivro("978-0132350884","Editora","Alterado");
        biblioteca.atualizarLivro("978-0132350884","Ano de Publicacao","0000");
        biblioteca.atualizarLivro("978-0132350884","ISBN","Alterado");       
        biblioteca.atualizarLivro("Alterado","Quantidade Disponivel","100");
        biblioteca.atualizarLivro("Alterado","Autor","Alterado");
        
        biblioteca.excluirLivro(livro1.getISBN());

        
        //biblioteca.exibirAcervo();
	}
}