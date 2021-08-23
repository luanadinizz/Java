import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Teste{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		List<Filho> filhos = new ArrayList<Filho>(); 
        List<Pai> pais=new ArrayList<Pai>();
        List<Mae> maes=new ArrayList<Mae>();


		do{
			System.out.print("Digite 1 para cadastrar um filho, 2 para cadastrar um pai,3 para cadastrar uma mae e 4 para sair:): ");
			opcao = Integer.parseInt(entrada.nextLine());
			switch(opcao){
				case 1:
					System.out.print("Digite o nome do Filho: ");
					String nome= entrada.nextLine();
					System.out.print("Digite o nome do pai: ");
					String Pai = entrada.nextLine();
					System.out.print("Digite o nome da mae: ");
					String Mae =  entrada.nextLine();
					System.out.print("Digite a idade do Filho: ");
					Int idade = entrada.nextLine();

					filhos.add(new Filho(nome,Pai,Mae,idade));

					break;

				case 2:
                    System.out.print("Digite o nome do pai: ");
					String nome= entrada.nextLine();
					System.out.print("Digite o nome do Avô: ");
					String Pai = entrada.nextLine();
					System.out.print("Digite o nome da avó: ");
					String Mae =  entrada.nextLine();
					System.out.print("Digite a idade do pai: ");
					Int idade = entrada.nextLine();

					pais.add(new Filho(nome,Pai,Mae,idade));
				

					break;

                case 3:
                    System.out.print("Digite o nome da mae: ");
					String nome= entrada.nextLine();
					System.out.print("Digite o nome do Avô: ");
					String Pai = entrada.nextLine();
					System.out.print("Digite o nome da avó: ");
					String Mae =  entrada.nextLine();
					System.out.print("Digite a idade da mae: ");
					Int idade = entrada.nextLine();

					maes.add(new Filho(nome,Pai,Mae,idade));
				

					break;

				case 4:
					System.out.print("Saindo...");
					break;
				default: System.out.println("Opção inválida.");
			}
		}while(opcao!=4);
	}
}
