package c2_13;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBpub6")
@ViewScoped
public class PerfilUsuarioBean6 implements Serializable {

	private static final long serialVersionUID = 1L;

	public String nome, sexo, estadoCivil;

	@PostConstruct
	public void init() {
		System.out.println("------------------------------");
		System.out.println("////// MBpub6 initiated //////");
		System.out.println("------------------------------");
	}

	public void atualizar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Estado civil: " + this.estadoCivil);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
