package c2_15;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBpub8")
@ViewScoped
public class PerfilUsuarioBean8 implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> paises = new ArrayList<>();
	private String nome, pais;

	public PerfilUsuarioBean8() {
		paises.add("Alemanha");
		paises.add("Argélia");
		paises.add("Argentina");
		paises.add("Bélgica");
		paises.add("Bolívia");
		paises.add("Brasil");
		paises.add("Bulgaria");
		paises.add("Espanha");
		paises.add("Estados Unidos");
	}

	public List<String> sugerirPaises(String consulta) {
		List<String> paisesSugeridos = new ArrayList<>();

		for (String pais : this.paises) {
			if (pais.toLowerCase().startsWith(consulta.toLowerCase())) {
				paisesSugeridos.add(pais);
			}
		}

		return paisesSugeridos;
	}

	public void atualizar() {
		System.out.println("Nome: " + this.nome + "\nPaís: " + this.pais);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
