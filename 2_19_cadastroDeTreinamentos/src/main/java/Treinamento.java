import java.io.Serializable;

public class Treinamento implements Serializable {

	private static final long serialVersionUID = 1L;
	private Cliente cliente = new Cliente();
	private Contrato contrato = new Contrato();

	public Cliente getCliente() {
		return cliente;
	}

	public Contrato getContrato() {
		return contrato;
	}

}
