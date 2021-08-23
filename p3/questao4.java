import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.println("Qual será o tamanho dos vetores?");
		n = entrada.nextInt();
		
		int[] vetorX = new int[n];
		int[] vetorY = new int[n];
		
		for(int x=0;x<n;x++){
			System.out.print("Digite o "+(x+1)+"° número do vetor X: ");
			vetorX[x]= entrada.nextInt();
		}
		for(int y=0;y<n;y++){
			System.out.print("Digite o "+(y+1)+"° número do vetor Y: ");
			vetorY[y]= entrada.nextInt();
		}
		
		System.out.print("A multiplicação dos vetores é:\n");
		for(int w=0;w<n;w++){
			System.out.println(vetorX[w]+" * "+vetorY[w]+" = "+(vetorY[w]*vetorX[w]));
		}

	}
}
