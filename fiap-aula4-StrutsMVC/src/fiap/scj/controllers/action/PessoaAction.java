package fiap.scj.controllers.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import fiap.scj.bean.PessoaMBean;

@Namespace("/pessoa")
public class PessoaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private PessoaMBean pessoa;
	private String mensagem;
	
	public PessoaAction(){
		pessoa = new PessoaMBean();
	}
	
	@Action(value = "/cadastrar", results = {
			@Result(name = "success", location = "/sucesso.jsp"),
			@Result(name = "error", location = "/erro.jsp"),
	})
	public String cadastrar(){
		System.out.println(this.pessoa);
		this.mensagem = "Everthing ok whith you registry";
		return SUCCESS;
	}
	

	public PessoaMBean getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaMBean pessoa) {
		this.pessoa = pessoa;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
