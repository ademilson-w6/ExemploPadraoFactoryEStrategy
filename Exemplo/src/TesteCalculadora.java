import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o tipo de imposto quer calcular? (1) ICMS, (2) IPI:");
        int opcaoImposto = entrada.nextInt();

        System.out.println("Qual o valor para calcular:");
        double valor = entrada.nextDouble();

        TipoImposto ti = TipoImposto.values()[opcaoImposto - 1];

        Imposto imposto = ti.obterImposto();
        System.out.println(imposto.calcular(valor));

    }
}
