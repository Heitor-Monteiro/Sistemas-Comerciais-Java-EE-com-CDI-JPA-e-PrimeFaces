package c2_06;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBpub")
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String login;
	private String senha;

	@PostConstruct
	public void init() {
		System.out.println("-----------------------------");
		System.out.println("////// MBpub initiated //////");
		System.out.println("-----------------------------");
	}

	public void atualizar() {
		System.out.println("Senha:" + this.senha);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
