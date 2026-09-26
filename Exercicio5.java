public class Exercicio5 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João";
        funcionario.idade = 16;
        funcionario.email = "joao@email.com";
        funcionario.salario = 1500;
        funcionario.cargo = "Auxiliar";
        funcionario.departamento = "Administrativo";

        if (funcionario.idade <= 16) {
            funcionario.aprendiz = true;
        } else {
            funcionario.aprendiz = false;
        }

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Aprendiz: " + funcionario.aprendiz);
    }
}

class Pessoa {

    String nome;
    int idade;
    String email;
}

class Funcionario extends Pessoa {

    double salario;
    String cargo;
    String departamento;
    boolean aprendiz;
}
