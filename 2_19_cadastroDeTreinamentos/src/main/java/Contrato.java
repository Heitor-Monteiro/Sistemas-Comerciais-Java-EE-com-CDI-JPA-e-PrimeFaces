import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer codContrato;
	private Date dataDoContrato;
	private List<Curso> cursosSelecionados = new ArrayList<>();
	private String modalidade;
	private int metodoDePagamento;
	private String formaDePagamentoSelecionado;
	private Cidade cidadeDoContrato;

	public double getValorDoContrato() {
		double valor = 0;
		if (!this.cursosSelecionados.isEmpty()) {
			for (Curso curso : this.cursosSelecionados) {
				valor += curso.getValorCurso();
			}
		}
		return valor;
	}

	public Integer getCodContrato() {
		return codContrato;
	}

	public void setCodContrato(Integer codContrato) {
		this.codContrato = codContrato;
	}

	public Date getDataDoContrato() {
		return dataDoContrato;
	}

	public void setDataDoContrato(Date dataDoContrato) {
		this.dataDoContrato = dataDoContrato;
	}

	public int getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(int metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}

	public String getNomeMetodoPagamento() {
		String var = "";
		switch (this.metodoDePagamento) {
		case 1:
			var = "Cartão de credito";
			break;
		case 2:
			var = "Cheque";
			break;
		case 3:
			var = "Boleto";
			break;
		}
		return var;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getFormaDePagamentoSelecionado() {
		return formaDePagamentoSelecionado;
	}

	public void setFormaDePagamentoSelecionado(String formaDePagamentoSelecionado) {
		this.formaDePagamentoSelecionado = formaDePagamentoSelecionado;
	}

	public Cidade getCidadeDoContrato() {
		return cidadeDoContrato;
	}

	public void setCidadeDoContrato(Cidade cidadeDoContrato) {
		this.cidadeDoContrato = cidadeDoContrato;
	}

	public List<Curso> getCursosSelecionados() {
		return cursosSelecionados;
	}

	public void setCursosSelecionados(List<Curso> cursosSelecionados) {
		this.cursosSelecionados = cursosSelecionados;
	}
}
