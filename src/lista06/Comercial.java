package lista06;


/**
 * Representa um contato comercial.
 * 
 * @author jclri
 *
 */
public class Comercial extends Contato{
	
	private String empresa;

	public Comercial(Integer codigo, String nome, String telefone, String empresa) {
		super(codigo, nome, telefone);
		this.empresa =empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
		public String toString() {

			return super.toString() + "\nEmpresa: "+this.empresa;
		}
}
