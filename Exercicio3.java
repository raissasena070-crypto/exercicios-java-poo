public class Exercicio3 {

    public static void main(String[] args) {

        Casa casa1 = new Casa();

        Casa casa2 = new Casa(
            "Rua das Flores, 100",
            350000,
            "Casa residencial",
            120
        );

        System.out.println("Casa 1:");
        casa1.mostrarDados();

        System.out.println("Casa 2:");
        casa2.mostrarDados();
    }
}

class Casa {

    String endereco;
    double preco;
    String tipo;
    double area;

    public Casa() {
    }

    public Casa(String endereco, double preco, String tipo, double area) {
        this.endereco = endereco;
        this.preco = preco;
        this.tipo = tipo;
        this.area = area;
    }

    public void mostrarDados() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Tipo: " + tipo);
        System.out.println("Área: " + area + " m²");
        System.out.println();
    }
}
