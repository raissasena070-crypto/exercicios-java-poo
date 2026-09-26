import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();

                    if (idade >= 16 && idade <= 99) {

                        System.out.print(
                            "Digite a renda familiar: "
                        );
                        double renda = scanner.nextDouble();

                        System.out.print(
                            "Participa de projeto de extensão? (true/false): "
                        );
                        boolean projeto =
                            scanner.nextBoolean();

                        if (renda < 1500 || projeto) {

                            System.out.println(
                                "Aluno cadastrado."
                            );

                            System.out.println(
                                "Tem direito ao auxílio estudantil."
                            );

                        } else {

                            System.out.println(
                                "Aluno cadastrado."
                            );

                            System.out.println(
                                "Não tem direito ao auxílio estudantil."
                            );
                        }

                    } else {

                        System.out.println(
                            "Idade inválida para ingresso no ensino superior."
                        );
                    }

                    break;

                case 2:

                    System.out.print(
                        "Anos de experiência: "
                    );
                    int anosExperiencia =
                        scanner.nextInt();

                    System.out.print(
                        "Possui pós-graduação? (true/false): "
                    );
                    boolean temPosGraduacao =
                        scanner.nextBoolean();

                    System.out.print(
                        "É bacharel? (true/false): "
                    );
                    boolean ehBacharel =
                        scanner.nextBoolean();

                    if (
                        anosExperiencia > 2 &&
                        (temPosGraduacao || ehBacharel)
                    ) {

                        System.out.println(
                            "Professor classificado como: Efetivo"
                        );

                    } else {

                        System.out.println(
                            "Professor classificado como: Temporário"
                        );
                    }

                    break;

                case 3:

                    System.out.println(
                        "Saindo do sistema..."
                    );

                    break;

                default:

                    System.out.println(
                        "Opção inválida."
                    );
            }

        } while (opcao != 3);

        scanner.close();
    }
}
