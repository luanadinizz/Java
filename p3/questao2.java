import java.util.Scanner;
public class raiz{
    private static Scanner teclado = new Scanner (System.in);
    public static void main (String[]args){
        double a,b,c,delta,x1,x2,np,nn,raiz;
        System.out.println("Programa para o cálculo das raízes da equação do tipo ax2+bx+c=0");
        System.out.print("Informe o valor do coeficiente a:");
        a = teclado.nextInt();
        System.out.print("Informe o valor do coeficiente b:");
        b = teclado.nextInt();
        System.out.print("Informe o valor de c:");
        c = teclado.nextInt();
        if (a!=0){
            delta=b*b-(4*a*c);
            if (delta>=0){
                raiz=Math.sqrt(delta);
                np=b+raiz;
                x1= np/(2*a);
                nn=(-b)-raiz;
                x2= nn/(2*a);
                System.out.print("as raízes da equação são:  ");
                System.out.print(x1);
                System.out.print("  e  ");
                System.out.print(x2);
            }
            else{
                System.out.println("o resultado dessa conta gera um número complexo!Que não é calculado por esse programa!");
            }
        }
        else if(a==0){
            x1=(-c)/b;
            System.out.println("Os valores informados geram uma equação do primeiro grau e sua resposta é:  ");
            System.out.print(x1);
        }
        else if(b==0){
            delta=-(4*a*c);
            if (delta>=0){
                raiz=Math.sqrt(delta);
                x1= raiz/(2*a);
                x2= (-raiz)/(2*a);
                System.out.print("as raízes da equação são:  ");
                System.out.print(x1);
                System.out.print("  e  ");
                System.out.print(x2);
            }
            else{
                System.out.println("o resultado dessa conta gera um número complexo!Que não é calculado por esse programa!");
            }
        }
        else if(c==0){
            delta=b*b;
            if (delta>=0){
                x1=(2*b)/(2*a);
                x2=0;
                System.out.print("as raízes da equação são:  ");
                System.out.print(x1);
                System.out.print("  e  ");
                System.out.print(x2);
            }
            else{
                System.out.println("o resultado dessa conta gera um número complexo!Que não é calculado por esse programa!");
            }
        }
    }
}
