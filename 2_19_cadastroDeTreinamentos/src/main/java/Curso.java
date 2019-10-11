import java.io.Serializable;

public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer codCurso;
	private String nomeCurso;
	private double valorCurso;
	private boolean desabilitar;

	@SuppressWarnings("unused")
	private Curso() {
	}

	public Curso(Integer codCurso, String nomeCurso, double valorCurso) {
		this.codCurso = codCurso;
		this.nomeCurso = nomeCurso;
		this.valorCurso = valorCurso;
	}

	public Integer getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(Integer codCurso) {
		this.codCurso = codCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}

	public boolean isDesabilitar() {
		return desabilitar;
	}

	public void setDesabilitar(boolean desabilitar) {
		this.desabilitar = desabilitar;
	}
}
