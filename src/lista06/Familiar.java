package lista06;


/**Representa um contato familiar
 * 
 * @author jclri
 *
 */
public class Familiar extends Contato{
	
	private String parentesco;

	
	
	public Familiar(Integer codigo, String nome, String telefone, String parentesco) {
		super(codigo, nome, telefone);
		this.parentesco = parentesco;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	@Override
		public String toString() {

			return super.toString()+"\nParentesco: "+this.parentesco;
		}
}
