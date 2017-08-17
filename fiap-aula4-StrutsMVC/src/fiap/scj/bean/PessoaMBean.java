package fiap.scj.bean;

import java.util.Date;

public class PessoaMBean {

	private String nome;
	private Date dataNasc;	
	
	@Override
	public String toString() {
		return "PessoaMBean [nome=" + nome + ", dataNasc=" + dataNasc + "]";
	}
	public PessoaMBean() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}	
}
