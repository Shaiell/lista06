package lista06;

/**
 * Representa um contato pessoal
 * 
 * @author jclri
 *
 */
public class Pessoal extends Contato {

	private String celular;

	public Pessoal(Integer codigo, String nome, String telefone, String celular) {
		super(codigo, nome, telefone);
		this.celular = celular;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

@Override
	public String toString() {

		return super.toString() + "\nCelular: " + this.celular;
	}

}
