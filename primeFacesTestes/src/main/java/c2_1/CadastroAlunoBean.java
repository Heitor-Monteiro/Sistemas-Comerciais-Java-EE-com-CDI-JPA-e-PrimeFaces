package c2_1;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "MBcab")
@ViewScoped
public class CadastroAlunoBean implements Serializable {
	public static final long serialVersionUID = 1L;

	private String nome;
	private String email;
	
	@PostConstruct
	public void init() {
		System.out.println("-----------------------------");
		System.out.println("////// MBcab initiated //////");
		System.out.println("-----------------------------");
	}
	

	public void Cadastrar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail:" + this.email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
