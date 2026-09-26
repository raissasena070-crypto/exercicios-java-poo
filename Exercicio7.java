public class Exercicio7 {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(5);

        Triangulo triangulo =
            new Triangulo(3, 4, 5, 4, 3);

        Circulo circulo = new Circulo(5);

        System.out.println("QUADRADO");
        System.out.println(
            "Perímetro: " + quadrado.calcularPerimetro()
        );
        System.out.println(
            "Área: " + quadrado.calcularArea()
        );

        System.out.println("\nTRIÂNGULO");
        System.out.println(
            "Perímetro: " + triangulo.calcularPerimetro()
        );
        System.out.println(
            "Área: " + triangulo.calcularArea()
        );

        System.out.println("\nCÍRCULO");
        System.out.println(
            "Perímetro: " + circulo.calcularPerimetro()
        );
        System.out.println(
            "Área: " + circulo.calcularArea()
        );
    }
}

class FormaGeometrica {

    public double calcularPerimetro() {
        return 0;
    }

    public double calcularArea() {
        return 0;
    }
}

class Quadrado extends FormaGeometrica {

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Triangulo extends FormaGeometrica {

    double lado1;
    double lado2;
    double lado3;
    double base;
    double altura;

    public Triangulo(
        double lado1,
        double lado2,
        double lado3,
        double base,
        double altura
    ) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Circulo extends FormaGeometrica {

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
