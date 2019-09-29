package c2_14;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBpub7")
@ViewScoped
public class PerfilUsuarioBean7 implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private List<String> interesses;

	@PostConstruct
	public void init() {
		System.out.println("------------------------------");
		System.out.println("////// MBpub7 initiated //////");
		System.out.println("------------------------------");
	}

	public void atualizar() {
		System.out.println("Nome: " + this.nome);
		for (String interesse : interesses) {
			System.out.println("Interesse: " + interesse);
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getInteresses() {
		return interesses;
	}

	public void setInteresses(List<String> interesses) {
		this.interesses = interesses;
	}
}
