public class Atividade8 {
    public static void main(String[] args) {

        int soma = 0;

        System.out.println("Os 50 primeiros números ímpares são: ");

        for (int numero = 1; numero <= 100 ; numero += 2){
            System.out.println(numero);
            soma = soma + numero;
        }

        System.out.println("A soma desses números é: " + soma);
        System.out.println("------------------------------------------");

        int quantnumeros = 50;
        int som = 0;
        int numero = 1;
        int numImparesCont = 0;

        while (numImparesCont < quantnumeros) {
            if (numero % 2 != 0) {
                som += numero;
                numImparesCont++;
            }
            numero++;
        }
        System.out.println("A soma dos 50 primeiro numeros impares é de: ");
    }
}
