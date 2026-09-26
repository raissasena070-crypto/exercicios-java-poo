public class Exercicio4 {

    public static void main(String[] args) {

        Tabuada tabuada = new Tabuada();

        tabuada.calcularTabuada(5);
    }
}

class Tabuada {

    public void calcularTabuada(int numero) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                numero + " x " + i + " = " + (numero * i)
            );
        }
    }
}
