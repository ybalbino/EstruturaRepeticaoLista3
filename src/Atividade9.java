import java.util.Scanner;

public class Atividade9 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite número para mostrar o seu fatorial!");

            int numDig = entrada.nextInt();
            int contador = numDig;
            int fatorial = numDig;
            String fatorialDisplay = "";

            while (contador > 1){
                fatorial = fatorial * (contador - 1);
                fatorialDisplay = fatorialDisplay + String.valueOf(contador) + " x ";
                contador--;

            }
            if(numDig == 0){
                fatorial = 1;
                fatorialDisplay = "1";
            }else if(numDig == 1){
                fatorialDisplay = "1";
            }else{fatorialDisplay = fatorialDisplay + "1";}

            System.out.println("\n" + numDig + "! = " + fatorialDisplay);
            System.out.println("Seu fatorial é: " + fatorial);

        }
}
