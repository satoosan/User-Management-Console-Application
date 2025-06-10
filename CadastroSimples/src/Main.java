import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.User;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int op;

        do {
            System.out.print("\nDigite a opção desejada: \n1 - Cadastrar usuario\n2 - Listar usuario\n3 - Sair\nOpção: ");
            op = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            switch (op) {
                case 1:
                    System.out.print("Digite o nome do usuario: ");
                    String name = sc.nextLine();

                    String dateUser;
                    int idadeInformada;
                    int idadeCalculada;
                    LocalDate dataNascimento = null;
                    boolean dadosValidos;

                    do {
                        dadosValidos = true;

                        System.out.print("Digite a idade do usuario: ");
                        idadeInformada = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
                        dateUser = sc.nextLine();

                        try {
                            dataNascimento = LocalDate.parse(dateUser, formatter);
                            LocalDate hoje = LocalDate.now();
                            idadeCalculada = Period.between(dataNascimento, hoje).getYears();

                            if (idadeInformada != idadeCalculada) {
                                System.out.println("\nA idade informada não bate com a data de nascimento.");
                                System.out.println("Idade calculada: " + idadeCalculada + ", Idade digitada: " + idadeInformada);
                                System.out.println("Digite novamente os dados.\n");
                                dadosValidos = false;
                            }

                        } catch (DateTimeParseException e) {
                            System.out.println("Formato de data inválido. Use dd/MM/yyyy.\n");
                            dadosValidos = false;
                        }

                    } while (!dadosValidos);

                    users.add(new User(name, idadeInformada, java.sql.Date.valueOf(dataNascimento)));
                    break;

                case 2:
                    if (!users.isEmpty()) {
                        DateTimeFormatter outFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        for (User user : users) {
                            System.out.println("Nome: " + user.getName());
                            System.out.println("Idade: " + user.getIdade());
                            LocalDate data = ((java.sql.Date) user.getDataDeNascimento()).toLocalDate();
                            System.out.println("Data de nascimento: " + outFormatter.format(data));
                        }
                    } else {
                        System.out.println("Lista vazia");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa.....");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (op != 3);

        sc.close();
    }
}
