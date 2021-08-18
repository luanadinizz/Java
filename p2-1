import javax.swing.JOptionPane;
public class questao1 {
 
   public static void main(String[] args) {
      
       int num;       
       String U[];        
       String d[];    
       String c[];
       String conv;   
       U = new String[20];
       d = new String[10];
       c = new String[10];
       U[1] = "Um";
       U[2] = "Dois";
       U[3] = "Tres";
       U[4] = "Quatro";
       U[5] = "Cinco";
       U[6] = "Seis";
       U[7] = "Sete";
       U[8] = "Oito";
       U[9] = "Nove";
       U[10] = "Dez";
       U[11] = "Onze";
       U[12] = "Doze";
       U[13] = "Treze";
       U[14] = "Quatorze";
       U[15] = "Quinze";
       U[16] = "Dezesseis";
       U[17] = "Dezessete";
       U[18] = "Dezoito";
       U[19] = "Dezenove";
       d[2] = "Vinte";
       d[3] = "Trinta";
       d[4] = "Quarenta";
       d[5] = "Cinquenta";
       d[6] = "Sessenta";
       d[7] = "Setenta";
       d[8] = "Oitenta";
       d[9] = "Noventa";
       c[1] = "Cento";
       c[2] = "Duzentos";
       c[3] = "Trezentos";
       c[4] = "Quatrocentos";
       c[5] = "Quinhentos";
       c[6] = "Seiscentos";
       c[7] = "Setecentos";
       c[8] = "Oitocentos";
       c[9] = "Novecentos";
       conv = JOptionPane.showInputDialog("Digite um numero: ");
       num = Integer.parseInt(conv); 
       if (num ==1000000000){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n" + c[10]);
       }             
       if (num > 1000000000){
           JOptionPane.showMessageDialog(null,"O numero digitado nao eh valido");
       }
       if (num<=19){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + U[num]);
       }
   if (num > 19 && num < 100){
       int dez = Integer.parseInt(conv.substring(0,1));
       int uni = Integer.parseInt(conv.substring(1,2));
       if (uni == 0){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + d[dez]);
       }
       else {
       JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + d[dez] + " e " + U[uni]);
   }
   }  
   else if (num >99 && num < 1000){
       int cen = Integer.parseInt(conv.substring(0,1));
       int dez = Integer.parseInt(conv.substring(1,2));
       int uni = Integer.parseInt(conv.substring(2,3));
       if (cen ==1 && dez == 0 && uni == 0){
           c[1]= "Cem";
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen]);
       }
       else if (dez == 0 && uni ==0){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen]);
       }
       else if (dez ==0){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + U[uni]);
       }
       else if (uni == 0){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + d[dez]);
       }
       else if (dez ==1){
           int dezeuni = Integer.parseInt(conv.substring(1,3));
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + U[dezeuni]);     
       }
       else {
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + d[dez]+ " e " + U[uni]);     
       }
 }
   else if (num >999 && num < 100000){
       int cen = Integer.parseInt(conv.substring(0,1));
       int dez = Integer.parseInt(conv.substring(1,2));
       int uni = Integer.parseInt(conv.substring(2,3));
       if (cen ==1 && dez == 0 && uni == 0){
           c[1]= "Cem";
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen]+ "mil");
       }
       else if (dez == 0 && uni ==0){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen]+ "mil");
       }
       else if (dez ==0){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + U[uni]+ "mil");
       }
       else if (uni == 0){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + d[dez]+ "mil");
       }
       else if (dez ==1){
           int dezeuni = Integer.parseInt(conv.substring(1,3));
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + U[dezeuni]+"mil");       
       }
       else {
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + d[dez]+ " e " + U[uni]+"mil");       
       }
   }
   else if (num >99999 && num < 100000000){
       int cen = Integer.parseInt(conv.substring(0,1));
       int dez = Integer.parseInt(conv.substring(1,2));
       int uni = Integer.parseInt(conv.substring(2,3));
       if (cen ==1 && dez == 0 && uni == 0){
           c[1]= "Cem";
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen]+ "milhoes");
       }
       else if (dez == 0 && uni ==0){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen]+ "milhoes");
       }
       else if (dez ==0){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + U[uni]+ "milhoes");
       }
       else if (uni == 0){
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + d[dez]+ "milhoes");
       }
       else if (dez ==1){
   int dezeuni = Integer.parseInt(conv.substring(1,3));
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + U[dezeuni]+"milhoes");       
       }
       else {
           JOptionPane.showMessageDialog(null,"O numero digitado foi:\n " + c[cen] + " e " + d[dez]+ " e " + U[uni]+"milhoes");       
       }
   }
      
   }
}
