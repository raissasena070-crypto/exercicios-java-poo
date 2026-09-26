public class Exercicio1 {
    public static void main(String[] args) {

        Casa casa = new Casa();

        casa.preco = 250000.00;
        casa.area = 100.0;

        double valorMetroQuadrado = casa.preco / casa.area;

        System.out.println("Preço da casa: R$ " + casa.preco);
        System.out.println("Área da casa: " + casa.area + " m²");
        System.out.println("Valor do metro quadrado: R$ " + valorMetroQuadrado);
    }
}

class Casa {
    public double preco;
    public double area;
}
