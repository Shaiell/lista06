package lista06;

import java.util.ArrayList;

/**
 * Classe criada para execução do sistema.
 * 
 * @author jclri
 *
 */
public class Principal {

	/**
	 * Metodo principal de execução.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		boolean continua = true;
		String[] opcoes = { "Lista de Contatos" };

		do {
			int opcao = Console.mostrarMenu(opcoes, "lista06", null);
			switch (opcao) {

			case 1:
				criarListaDeContatos();
				break;

			case -1:
				System.out.println("Saindo...");
				continua = false;
				break;
			}
		} while (continua == true);

	}

	/**
	 * Metodo cria uma lista de contatos.
	 * 
	 */
	private static void criarListaDeContatos() {

		ArrayList<Contato> contatos = new ArrayList<Contato>();

		boolean continua = true;
		String[] opcoes = { "Criar Contatos", "Listar contrato" };

		do {
			int opcao = Console.mostrarMenu(opcoes, "lista06", null);
			switch (opcao) {

			case 1:
				Contato novo = criarContato();
				contatos.add(novo);
				System.out.println("Contato adicionado.\n");
				break;

			case 2:
				System.out.println();
				for (Contato contato : contatos) {
					System.out.println(contato + "\n");
				}
				break;

			case -1:
				System.out.println("Saindo...");
				continua = false;
				break;
			}
		} while (continua == true);

	}

	/**
	 * Cria um contato pelo teclado.
	 * 
	 * @return retorna o contato criado
	 */
	private static Contato criarContato() {

		Integer codigo = Console.recuperaInteiro("Informe o codigo: ");
		String nome = Console.recuperaTexto("Informe o nome: ");
		String telefone = Console.recuperaTexto("Informe  o telefone: ");
		String tipo = Console.recuperaTexto("Digite P para pessoal, C para comercial e F para Familiar");

		tipo = tipo.toUpperCase();

		Contato contato = null;

		switch (tipo) {
		case "P":
			String celular = Console.recuperaTexto("Informe o Celular: ");
			contato = new Pessoal(codigo, nome, telefone, celular);
			break;

		case "C":
			String empresa = Console.recuperaTexto("Informe o nome da empressa: ");
			contato = new Comercial(codigo, nome, telefone, empresa);
			break;

		default:
			String parentesco = Console.recuperaTexto("Informe o Grau de Parentesco: ");
			contato = new Familiar(codigo, nome, telefone, parentesco);
			break;
		}

		return contato;
	}

}
