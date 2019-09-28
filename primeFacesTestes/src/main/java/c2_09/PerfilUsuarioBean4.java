package c2_09;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBpub4")
@ViewScoped
public class PerfilUsuarioBean4 implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final List<Interesse> INTERESSES = new ArrayList<>();
	private String nome;
	private String profissao;
	private Interesse interesse;

	static {
		System.out.println("+++++++ static method +++++++");
		INTERESSES.add(new Interesse("Esportes", "esportes"));
		INTERESSES.add(new Interesse("Computação", "computacao"));
		INTERESSES.add(new Interesse("Cinema", "cinema"));
		INTERESSES.add(new Interesse("Leitura", "leitura"));
	}

	@PostConstruct
	public void init() {
		System.out.println("------------------------------");
		System.out.println("////// MBpub4 initiated //////");
		System.out.println("------------------------------");
	}

	public void atualizar() {
		if (this.profissao != null) {
			System.out.println("Profissão:" + this.profissao);
		}
		if (this.interesse != null) {
			System.out.println("Interesse:" + this.interesse.getDescricao());
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public List<Interesse> getInteresses() {
		return INTERESSES;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Interesse getInteresse() {
		return interesse;
	}

	public void setInteresse(Interesse interesse) {
		this.interesse = interesse;
	}
}
