import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBcdt")
@ViewScoped
public class MBcadastroDeTreinamentos implements Serializable {

	private static final long serialVersionUID = 1L;
	protected static List<Cidade> CIDADES = new ArrayList<>();
	protected static List<Curso> CURSOS = new ArrayList<>();
	private List<String> formasDePagamento = new ArrayList<>();
	private Treinamento treinamento;

	@PostConstruct
	public void init() {
		this.treinamento = new Treinamento();
	}

	static {
		CIDADES.add(new Cidade(0, "Belém"));
		CIDADES.add(new Cidade(1, "Castanhal"));
		CIDADES.add(new Cidade(2, "Stº Antônio do Tauá"));
		CIDADES.add(new Cidade(3, "Stª Izabel do Pará"));
		CIDADES.add(new Cidade(4, "Capanema"));
		CURSOS.add(new Curso(1, "Fundamentos Java e Orientação a Objetos", 920));
		CURSOS.add(new Curso(2, "Desenvolvimento Web com JSF 2", 810.87));
		CURSOS.add(new Curso(3, "Persistência de Dados com JPA 2 e Hibernate", 900.50));
		CURSOS.add(new Curso(4, "Gerenciamento Ágil de Projetos com Scrum", 1020.73));
	}

	public void registrarDados() {
		BDTreinamentos.TREINAMENTOS.add(this.treinamento);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registrado com sucesso!"));
		init();
	}

	public List<Cidade> sugerirCidades(String consulta) {
		List<Cidade> cidadesSugeridas = new ArrayList<>();
		for (Cidade cidade : CIDADES) {
			if (cidade.getNomeCidade().toLowerCase().startsWith(consulta.toLowerCase())) {
				cidadesSugeridas.add(cidade);
			}
		}
		return cidadesSugeridas;
	}

	public void carregarFormaDePagamento() {
		formasDePagamento.clear();
		switch (this.treinamento.getContrato().getMetodoDePagamento()) {
		case 1:
			formasDePagamento.add("À vista");
			formasDePagamento.add("1x");
			formasDePagamento.add("2x");
			formasDePagamento.add("3x");
			formasDePagamento.add("4x");
			formasDePagamento.add("5x");
			formasDePagamento.add("6x");
			break;
		case 2:
			formasDePagamento.add("À vista");
			formasDePagamento.add("Entrada + 30 dias");
			break;
		case 3:
			formasDePagamento.add("À vista");
			break;
		}
	}

	public List<Treinamento> getTreinamentos() {
		return BDTreinamentos.TREINAMENTOS;
	}

	public List<String> getFormasDePagamento() {
		return formasDePagamento;
	}

	public List<Cidade> getCIDADES() {
		return CIDADES;
	}

	public List<Curso> getCURSOS() {
		return CURSOS;
	}

	public Treinamento getTreinamento() {
		return treinamento;
	}
}
