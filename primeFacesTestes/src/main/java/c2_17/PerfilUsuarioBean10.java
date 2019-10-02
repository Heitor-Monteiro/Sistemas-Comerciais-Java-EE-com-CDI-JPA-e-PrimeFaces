package c2_17;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBpub10")
@ViewScoped
public class PerfilUsuarioBean10 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome, telefone, telefoneComercial, matricula;

	public void atualizar() {
		System.out.println("Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nTelefone comercial: "
				+ this.telefoneComercial + "\nMatrícula: " + this.matricula);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
