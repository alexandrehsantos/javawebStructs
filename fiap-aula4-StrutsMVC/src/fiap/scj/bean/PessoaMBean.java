package fiap.scj.bean;

import java.util.Date;

public class PessoaMBean {

	private String nome;
	private String rg;
	private Date dataNasc;
	private String email;
	
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
