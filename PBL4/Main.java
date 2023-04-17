import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        while (true){
            int menu;
            System.out.println("+===========================================+");
            System.out.println("+ [1]Cadastrar Pessoas\n+ [2]Listar Pessoas\n+ [3]Buscar por Tipo\n+ [0]Sair");
            System.out.println("+===========================================+");
            System.out.print("Digite sua opção: ");
            int opcao = scn.nextInt();
            switch (opcao){
                case 1:
                    menu = 1;
                    System.out.println("+===========================================+");
                    System.out.print("Digite o nome: ");
                    String nome = scn.next();
                    System.out.print("Digite o Cpf: ");
                    String cpf = scn.next();
                    System.out.print("Digite o email: ");
                    String email = scn.next();

                    //System.out.println(nome+cpf+email);
                    //System.exit(0);
                    while (menu == 1){
                        System.out.println("\n+===========================================+");
                        System.out.println("[1]Cliente\n[2]Funcionário\n[3]Gerente");
                        System.out.println("+===========================================+");
                        System.out.print("Escolha o tipo da pessoa: ");
                        int tipo = scn.nextInt();
                        switch (tipo){
                            case 1:
                                System.out.println("+===========================================+");
                                System.out.print("Digite a idade: ");
                                int idade = scn.nextInt();
                                System.out.print("Digite o telefone: ");
                                String telefone = scn.next();
                                System.out.println("+===========================================+");

                                pessoas.add(new Cliente(nome,cpf,email,idade,telefone));
                                System.out.println("Cliente "+nome+" Adcionado com sucesso");
                                menu = 0;
                                break;
                            case 2:
                                System.out.println("+===========================================+");
                                System.out.print("Digite o Salário: ");
                                int salario = scn.nextInt();
                                System.out.print("Digite o endereco: ");
                                String endereco = scn.next();

                                System.out.println("+===========================================+");

                                pessoas.add(new Funcionario(nome,cpf,email,endereco,salario));
                                System.out.println("Funcionário "+nome+" Adcionado com sucesso");
                                menu = 0;
                                break;
                            case 3:
                                System.out.println("+===========================================+");
                                System.out.print("Digite o id do gerente: ");
                                int id = scn.nextInt();
                                System.out.println("+===========================================+");

                                pessoas.add(new Gerente(nome,cpf,email,id));
                                System.out.println("Gerente "+nome+" Adcionado com sucesso");
                                menu = 0;
                                break;
                            default:
                                System.out.println("Digite um tipo válido");
                                break;
                        }
                    }


                    break;
                case 2:
                    System.out.println("+===========================================+");
                    if (pessoas.size()==0){
                        System.out.println("Não há pessoas cadastradas");

                    }else {
                        for (Pessoa psa:pessoas){
                            if (psa instanceof Cliente){
                                ((Cliente) psa).imprimeCliente();

                            } else if (psa instanceof Funcionario) {
                                ((Funcionario) psa).imprimeFunc();

                            } else if (psa instanceof Gerente) {
                                ((Gerente) psa).imprimeGerente();
                            }
                            System.out.println("------------------------------");
                        }
                    }

                    break;
                case 3:
                    menu = 1;
                    while (menu == 1){
                        int i = 0;
                        System.out.println("\n+===========================================+");
                        System.out.println("[1]Cliente\n[2]Funcionário\n[3]Gerente");
                        System.out.println("+===========================================+");
                        System.out.print("Escolha o tipo da pessoa: ");
                        int tipo = scn.nextInt();
                        System.out.println("+===========================================+");
                        switch (tipo){
                            case 1:
                                System.out.println("Clientes:");
                                for (Pessoa cli:pessoas){
                                    if(cli instanceof Cliente){
                                        ((Cliente) cli).imprimeCliente();
                                        i++;
                                    }
                                }
                                if (i == 0) {
                                    System.out.println("Não há Clientes cadastrados");
                                }
                                menu = 0;
                                break;
                            case 2:
                                System.out.println("Funcionarios:");
                                for (Pessoa func:pessoas){
                                    if(func instanceof Funcionario){
                                        ((Funcionario) func).imprimeFunc();
                                        i++;
                                    }
                                }
                                if (i == 0) {
                                    System.out.println("Não há Funcionários cadastrados");
                                }
                                menu = 0;
                                break;
                            case 3:
                                System.out.println("Gerente:");
                                for (Pessoa ger:pessoas){
                                    if (ger instanceof Gerente){
                                        ((Gerente) ger).imprimeGerente();
                                        i++;
                                    }
                                }
                                if (i == 0) {
                                    System.out.println("Não há Gerentes cadastrados");
                                }
                                menu = 0;
                                break;
                            default:
                                System.out.println("Digite um tipo válido");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Saindo......");
                    System.exit(0);
                    break;

            }


        }
    }
}