package c2_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBperfUse")
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobre;

	@PostConstruct
	public void init() {
		System.out.println("-----------------------------");
		System.out.println("////// MBpub initiated //////");
		System.out.println("-----------------------------");
	}

	public void atualizar() {
		System.out.println("Sobre:" + this.sobre);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public List<String> completarTexto(String consulta) {
		// Aqui ocorreria uma busca no banco de dados.
		List<String> resultados = new ArrayList<String>();
		if (consulta.startsWith("Hei")) {
			resultados.add("Heitor");
			resultados.add("Heitor Monteiro");
			resultados.add("Heitor Monteiro da Silva");
			resultados.add("Heitor Monteiro da Silva Sobral");
		}
		return resultados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
}
