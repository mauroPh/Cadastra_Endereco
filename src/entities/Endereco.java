package entities;

import java.util.Scanner;

public class Endereco {
	public static void main(String[] args) {
		System.out.println("----------------Cadastro de Usuários----------------");
		//Entrada de dados do usuario
		Scanner scanner = new Scanner(System.in);
		//Solicitar nome completo do usuario
		System.out.println("Digite seu nome completo : ");
		String nome = scanner.nextLine();
		//Solicitar o nome da rua
		System.out.println("Qual a rua em que você mora ?");
		String rua = scanner.nextLine();
		//Solicitar o número
		System.out.println("Insira o número da residência :");
		String numero = scanner.nextLine();
		//Solicitar o bairro
		System.out.println("Agora , informe o bairro : ");
		String bairro = scanner.nextLine();
		//Solicitar a cidade 
		System.out.println("Cidade: ");
		String cidade = scanner.nextLine();
		//Solicitar o estado
		System.out.println("Estado :");
		String estado = scanner.nextLine();
		//Solicitar o CEP
		System.out.println("Para finalizar digite o CEP");
		String cep = scanner.nextLine();
		
		//Exibir as informações formatadas 
		//Endereço : logradouro, numero,bairro, cidade , estado, cep
		System.out.println("Nome completo :" + nome);
		System.out.println("Endereço: "+rua+","+bairro+","+cidade+"-"+estado );
		System.out.println("CEP = "+ cep);
	
	
	
	}
}
