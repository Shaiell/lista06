package lista06;

/**
 * Representa um contato.
 * 
 * @author jclri
 *
 */
public class Contato {

	private Integer codigo;
	private String nome;
	private String telefone;

	public Contato(Integer codigo, String nome, String telefone) {

		this.setCodigo(codigo);
		this.setNome(nome);
		this.setTelefone(telefone);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {

		return "Codigo:" + this.codigo + "\nNome: " + this.nome + "\nTelefone: " + this.telefone;
	}

}
