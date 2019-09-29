package c2_12;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBpub5")
@ViewScoped
public class PerfilUsuarioBean5 implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> estados = new ArrayList<>();
	private List<String> cidades = new ArrayList<>();
	private String nome, estado, cidade;

	@PostConstruct
	public void init() {
		System.out.println("------------------------------");
		System.out.println("////// MBpub5 initiated //////");
		System.out.println("------------------------------");
	}

	public PerfilUsuarioBean5() {
		System.out.println("+++++++ builder method +++++++");
		estados.add("PA");
		estados.add("MG");
		estados.add("RJ");
	}

	public void carregarCidades() {
		cidades.clear();
		switch (estado) {
		case "PA":
			cidades.add("Belém");
			cidades.add("Castanhal");
			cidades.add("Stº Antônio do Tauá");
			break;
		case "MG":
			cidades.add("Uberlândia");
			cidades.add("Uberaba");
			cidades.add("Belo Horizonte");
			break;
		case "RJ":
			cidades.add("Rio de Janeiro");
			cidades.add("Niteroi");
			break;
		}
	}

	public void atualizar() {
		System.out.println("Estado: " + this.estado);
		System.out.println("Cidade: " + this.cidade);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<String> getEstados() {
		return estados;
	}

	public List<String> getCidades() {
		return cidades;
	}
}
