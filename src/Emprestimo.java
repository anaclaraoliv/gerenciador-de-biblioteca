import java.util.Date;

public class Emprestimo {
	
	// estudar datas
	Date data = new Date();
	
    private String locatario;
    private int tempoDeEmprestimo;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataPrevisaoDeDevolucao;
    private Date dataDevolucao;
    private int limiteLacacao;
    
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getLocatario() {
        return locatario;
    }
    public void setLocatario(String locatario) {
        this.locatario = locatario;
    }
    public int getTempoDeEmprestimo() {
        return tempoDeEmprestimo;
    }
    public void setTempoDeEmprestimo(int tempoDeEmprestimo) {
        this.tempoDeEmprestimo = tempoDeEmprestimo;
    }
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public Date getDataPrevisaoDeDevolucao() {
        return dataPrevisaoDeDevolucao;
    }
    public void setDataPrevisaoDeDevolucao(Date dataPrevisaoDeDevolucao) {
        this.dataPrevisaoDeDevolucao = dataPrevisaoDeDevolucao;
    }
    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public int getLimiteLacacao() {
        return limiteLacacao;
    }
    public void setLimiteLacacao(int limiteLacacao) {
        this.limiteLacacao = limiteLacacao;
    }
    @Override
    public String toString() {
        return "Emprestimo [data=" + data + ", locatario=" + locatario + ", tempoDeEmprestimo=" + tempoDeEmprestimo
                + ", livro=" + livro + ", dataEmprestimo=" + dataEmprestimo + ", dataPrevisaoDeDevolucao="
                + dataPrevisaoDeDevolucao + ", dataDevolucao=" + dataDevolucao + ", limiteLacacao=" + limiteLacacao
                + "]";
    }

    public Emprestimo(Date data, String locatario, int tempoDeEmprestimo, Livro livro, Date dataEmprestimo,
            Date dataPrevisaoDeDevolucao, Date dataDevolucao, int limiteLacacao) {
        this.data = data;
        this.locatario = locatario;
        this.tempoDeEmprestimo = tempoDeEmprestimo;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevisaoDeDevolucao = dataPrevisaoDeDevolucao;
        this.dataDevolucao = dataDevolucao;
        this.limiteLacacao = limiteLacacao;
    }
    
    
}