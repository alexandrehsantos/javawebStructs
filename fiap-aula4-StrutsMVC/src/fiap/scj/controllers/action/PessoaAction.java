package fiap.scj.controllers.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import fiap.scj.bean.PessoaMBean;

@Namespace("/pessoa")
public class PessoaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private static List<PessoaMBean> pessoaList = new ArrayList<PessoaMBean>();;
	private PessoaMBean pessoa;
	private String mensagem;
	
	public PessoaAction(){
		pessoa = new PessoaMBean();
	}
	
	@Action(value = "/cadastrar", results = {
			@Result(name = "success", location = "/cadastro.jsp"),
			@Result(name = "error", location = "/erro.jsp"),
	})
	public String cadastrar(){
		
		pessoaList.add(pessoa);
		
		System.out.println(this.pessoaList.get(0));
		
		this.mensagem = "Cadastrado";
		return SUCCESS;
	}


	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public List<PessoaMBean> getPessoaList() {
		return pessoaList;
	}

	public void setPessoaList(List<PessoaMBean> pessoaList) {
		this.pessoaList = pessoaList;
	}

	public PessoaMBean getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaMBean pessoa) {
		this.pessoa = pessoa;
	}

}
