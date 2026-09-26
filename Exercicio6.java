public class Exercicio6 {

    public static void main(String[] args) {

        CalculadoraFinanceira calculadora =
            new CalculadoraFinanceira();

        calculadora.calcularDesconto(1000, 10);

        System.out.println();

        calculadora.calcularDesconto(1000, 10, 5);
    }
}

class CalculadoraFinanceira {

    public void calcularDesconto(double valor, double desconto) {

        double valorFinal =
            valor - (valor * desconto / 100);

        System.out.println(
            "Valor final: R$ " + valorFinal
        );
    }

    public void calcularDesconto(
        double valor,
        double desconto,
        int parcelas
    ) {

        double valorFinal =
            valor - (valor * desconto / 100);

        double valorParcela =
            valorFinal / parcelas;

        System.out.println(
            "Valor final com desconto: R$ " + valorFinal
        );

        System.out.println(
            "Valor de cada parcela: R$ " + valorParcela
        );
    }
}
