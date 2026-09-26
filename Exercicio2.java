import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite a idade: ");
        pessoa.setIdade(scanner.nextInt());

        if (pessoa.getIdade() >= 18) {
            System.out.println("A pessoa está apta a tirar a carteira de motorista.");
        } else {
            System.out.println("A pessoa não está apta a tirar a carteira de motorista.");
        }

        scanner.close();
    }
}

class Pessoa {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
