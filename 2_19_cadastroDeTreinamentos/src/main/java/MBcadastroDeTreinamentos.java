import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBcdt")
@ViewScoped
public class MBcadastroDeTreinamentos implements Serializable {

	private static final long serialVersionUID = 1L;
	private String razaoSocial, cnpj;
	private Cidade cidadeDoContrato;
	protected static List<Cidade> CIDADES = new ArrayList<>();
	private Boolean modalidade;
	private Date dataDoContrato;
	private double valorDoContrato;
	private int metodoDePagamento;
	private List<String> formasDePagamento = new ArrayList<>();
	private String formaDePagamentoSelecionado;
	protected static List<String> CURSOS = new ArrayList<>();
	public List<String> cursosSelecionados = new ArrayList<>();

	static {
		CIDADES.add(new Cidade(0, "Belém"));
		CIDADES.add(new Cidade(1, "Castanhal"));
		CIDADES.add(new Cidade(2, "Stº Antônio do Tauá"));
		CIDADES.add(new Cidade(3, "Stª Izabel do Pará"));
		CIDADES.add(new Cidade(4, "Capanema"));
		CURSOS.add("Fundamentos Java e Orientação a Objetos");
		CURSOS.add("Desenvolvimento Web com JSF 2");
		CURSOS.add("Persistência de Dados com JPA 2 e Hibernate");
		CURSOS.add("Gerenciamento Ágil de Projetos com Scrum");
	}

	public void registrarDados() {
		System.out.println("Razão social: " + this.razaoSocial);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Cidade do contrato: " + this.cidadeDoContrato.getNomeCidade());
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Data do contrato: " + this.dataDoContrato);
		System.out.println("Valor do contrato:" + this.valorDoContrato);
		System.out.println("Método de pagamento: " + this.metodoDePagamento);
		System.out.println("Forma de pagamento: " + this.formaDePagamentoSelecionado);
		System.out.println("Cursos contratados: ");
		for (String curso : cursosSelecionados) {
			System.out.println(curso);
		}

		this.razaoSocial = "";
		this.cnpj = "";
		this.cidadeDoContrato = null;
		this.dataDoContrato = null;
		this.valorDoContrato = 0;
		this.metodoDePagamento = 0;
		this.formaDePagamentoSelecionado = "";
		this.formasDePagamento.clear();
		this.cursosSelecionados.clear();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registrado com sucesso!"));
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
		switch (metodoDePagamento) {
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

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Boolean getModalidade() {
		return modalidade;
	}

	public void setModalidade(Boolean modalidade) {
		this.modalidade = modalidade;
	}

	public Date getDataDoContrato() {
		return dataDoContrato;
	}

	public void setDataDoContrato(Date dataDoContrato) {
		this.dataDoContrato = dataDoContrato;
	}

	public double getValorDoContrato() {
		return valorDoContrato;
	}

	public void setValorDoContrato(double valorDoContrato) {
		this.valorDoContrato = valorDoContrato;
	}

	public int getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(int metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}

	public String getFormaDePagamentoSelecionado() {
		return formaDePagamentoSelecionado;
	}

	public void setFormaDePagamentoSelecionado(String formaDePagamentoSelecionado) {
		this.formaDePagamentoSelecionado = formaDePagamentoSelecionado;
	}

	public List<String> getFormasDePagamento() {
		return formasDePagamento;
	}

	public List<Cidade> getCIDADES() {
		return CIDADES;
	}

	public Cidade getCidadeDoContrato() {
		return cidadeDoContrato;
	}

	public void setCidadeDoContrato(Cidade cidadeDoContrato) {
		this.cidadeDoContrato = cidadeDoContrato;
	}

	public List<String> getCursosSelecionados() {
		return cursosSelecionados;
	}

	public void setCursosSelecionados(List<String> cursosSelecionados) {
		this.cursosSelecionados = cursosSelecionados;
	}

	public List<String> getCURSOS() {
		return CURSOS;
	}
}
