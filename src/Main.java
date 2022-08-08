import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Grafo<String> caravanas = new Grafo<String>();
		Scanner scanner = new Scanner(System.in);
		caravanas.addBorda("RiodeJaneiro", "SaoPaulo", true);
		caravanas.addBorda("RiodeJaneiro", "Alemanha", true);
		caravanas.addBorda("SaoPaulo", "Helsinki", true);
		caravanas.addVertice("Kyoto");
		
		
		
		int escolha;
		do {
			System.out.println("Escolha a opcao desejada: \n1-listar ligacoes\n2-verificar ligacao entre duas cidades\n3-adicionar cidades\n0-sair");
			escolha = scanner.nextInt();
			switch(escolha)
			{
			case 1:
				System.out.println("Grafo:\n" + caravanas.toString());
				break;
			case 2:
				System.out.println("Cidade 1: ");
				String c1 = scanner.next();
				System.out.println("Cidade 2: ");
				String c2 = scanner.next();
				caravanas.temLigacao(c1, c2);
				break;
			case 3:
				int vF = -1;
				System.out.println("Nome da cidade: ");
				String cidadeAdd = scanner.next();
				System.out.println("Tem conexao? (1-SIM 0-NAO)");
				vF = scanner.nextInt();
				if(vF == 1)
				{
					System.out.println("Cidade conectada: ");
					String cidadeConect = scanner.next();
					caravanas.addBorda(cidadeAdd, cidadeConect, true);
					break;
				}
				else if(vF == 0) {	
					caravanas.addVertice(cidadeAdd);
				}
				break;
			case 0:
				break;
			}
			
		}while(escolha != 0);
		
		scanner.close();
	}

}
