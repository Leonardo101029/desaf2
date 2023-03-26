import java.util.Scanner;

public class desaf22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite seu gênero: (M) Masculino (F) Feminino (N) Não informar: ");
        char genero = scanner.next().charAt(0);

        double imc = peso / (altura * altura);

        System.out.println(nome + " seu IMC é: " + imc);

        scanner.close();

        if (genero == 'm') {
            if (imc >= 40) {
                System.out.println("Obesidade Mórbida");
            } else if (imc >= 30) {
                System.out.println("Obesidade Moderada");
            } else if (imc >= 25) {
                System.out.println("Obesidade Leve");
            } else if (imc >= 20) {
                System.out.println("Normal");
            } else {
                System.out.println("Abaixo do Normal");
            }

        } else if (genero == 'f') {
            if (imc >= 39) {
                System.out.println("Obesidade Mórbida");
            } else if (imc >= 29) {
                System.out.println("Obesidade Moderada");
            } else if (imc >= 24) {
                System.out.println("Obesidade Leve");
            } else if (imc >= 19) {
                System.out.println("Normal");
            } else {
                System.out.println("Abaixo do Normal");
            }

        } else if (genero == 'n') {
            if (imc >= 39) {
                System.out.println("Obesidade Mórbida");
            } else if (imc >= 29) {
                System.out.println("Obesidade Moderada");
            } else if (imc >= 24) {
                System.out.println("Obesidade Leve");
            } else if (imc >= 19) {
                System.out.println("Normal");
            } else {
                System.out.println("Abaixo do Normal");
            }

        } else {
            System.out.println("Genero Invalido");
        }
    }

}
