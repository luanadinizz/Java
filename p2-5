import teste.java.Circulo;
import teste.java.Quadrado;
import teste.java.Retangulo;
import teste.java.Triangulo;
public class teste{
   public static void main (String[]args){
       Quadrado quadrado=new Quadrado(2,2);
       Triangulo triangulo=new Triangulo(2,5);
       Circulo circulo=new Circulo(3);
       Retangulo retangulo = new Retangulo(4,3);
       quadrado.setLado1(5);
       System.out.print("a área do quadrado é:");
       System.out.println(quadrado);
       System.out.print("a área do triangulo é:");
       System.out.println(triangulo);
       System.out.print("a área do circulo é:");
       System.out.println(circulo);
       System.out.print("a área do retangulo é:");
       System.out.println(retangulo);
   }
}


package teste.java;
public class Circulo extends Figura{
   private double raio;
   public Circulo(double raio){
       this.raio = raio;
   }
   public double getRaio(){
       return raio;
   }
   public void setRaio(double raio){
       this.raio=raio;
   }
   public double area(){
       return raio*raio*314;
   }
}


package teste.java;
public class Quadrado extends Retangulo{
   public Quadrado(double lado1, double lado2){
       super(lado1,lado2);
   }
   public double area(){
       return this.getLado1()*this.getLado1();
   }
}
package teste.java;
public class Triangulo extends Figura{
   private double base;
   private double altura;
   public Triangulo(double base, double altura) {
       this.base = base;
       this.altura = altura;
   }
   public double getBase(){
       return base;
   }
   public void setBase( double base){
       this.base=base;
   }
   public double getAltura(){
       return altura;
   }
   public void setAltura(double altura){
       this.altura=altura;
   }
   public double area(){
       return base*altura;
   }
}


package teste.java;
public class Retangulo extends Figura{
   private double lado1;
   private double lado2;
   public double area(){
       return this.lado1*this.lado2;
   }
   public Retangulo(double lado1, double lado2) {
       this.lado1 = lado1;
       this.lado2 = lado2;
   }
   public double getLado1(){
       return lado1;
   }
   public void setLado1(double lado1){
       this.lado1= lado1;
   }
   public double getLado2(){
       return lado2;
   }
   public void setLado2(double lado2){
       this.lado2=lado2;
   }
}


package teste.java;
public abstract class Figura{
   public Figura(){
      
   }
   public abstract double area();
}
