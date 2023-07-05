import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome, horario, numero;
        opcoes op = new opcoes();
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        boolean continuarMenu = true;
        boolean fiado;
        while (continuarMenu) {
            System.out.println("\n\n\n");
            System.out.println("==== Menu ====");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Cancelar agendamento");
            System.out.println("3- Adiciona cliente vip");
            System.out.println("4 - Mostrar agenda do dia");
            System.out.println("5 - Trocar horário de agendamento");
            System.out.println("6 - Calcular receita do dia");
            System.out.println("7 - mostrar tabela de preços");
            System.out.println("8 - alterar preços da barbearia");
            System.out.println("9 - aplicar uma promoção");
            System.out.println("10 - retirar promoção");
            System.out.println("11 - resetar agenda"); 
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("\n\n\n");
                    System.out.print("Digite o nome do cliente: ");
                    nome = scanner.nextLine();
                    System.out.print("Digite o horário de agendamento: ");
                    horario = scanner.nextLine();
                    while(agenda.verificaChoqueHorario(horario)){
                        System.out.println("Esse horário, não esta disponivel! Digite um válido: ");
                        horario = scanner.nextLine();
                    }
                    System.out.print("Digite o número de contato: ");
                    numero = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, horario, numero);
                    agenda.adicionarCliente(cliente);
                    break;

                case 2:
                    System.out.println("\n\n\n");
                    System.out.print("Digite o nome do cliente a ser cancelado: ");
                    String nomeCancelar = scanner.nextLine();
                    agenda.cancelarAgendamento(nomeCancelar);
                    System.out.println("Agendamento cancelado com sucesso!");
                    break;

                
                case 3:
                    System.out.println("\n\n\n");
                    
                    System.out.print("Digite o nome do cliente: ");
                    nome = scanner.nextLine();
                    System.out.print("Digite o horário de agendamento: ");
                    horario = scanner.nextLine();
                    while(agenda.verificaChoqueHorario(horario)){
                    System.out.println("Esse horário, não esta disponivel! Digite um válido: ");
                    horario = scanner.nextLine();
                    }
                    System.out.print("Digite o número de contato: ");
                    numero = scanner.nextLine();    
                    System.out.print("O cliente irá pagar hoje?: ");
                    fiado = scanner.nextInt() == 0? false:true;
                    agenda.adicionarCliente(new ClienteVIP(nome, horario, numero, fiado));
                case 4:
                    System.out.println("\n\n\n");
                    System.out.println("Agenda do dia:");
                    agenda.getAgendaDoDia();
                    break;
                case 5:
                    System.out.println("\n\n\n");
                    System.out.print("Digite o nome do cliente: ");
                    String nomeTrocarHorario = scanner.nextLine();
                    System.out.print("Digite o novo horário de agendamento: ");
                    String novoHorario = scanner.nextLine();
                    agenda.trocarHorario(nomeTrocarHorario, novoHorario);
                    break;

                case 6:
                    System.out.println("\n\n\n");
                    int receitaDoDia = agenda.calcularReceitaDoDia();
                    System.out.println("Receita do dia: " + receitaDoDia);
                    break;
                
                case 7:
                    System.out.println("\n\n\n");
                    op.mostrarPrecos();
                    break;

                case 8:
                    System.out.println("\n\n\n");
                    op.alterarPrecos();
                    break;

                case 9:
                    System.out.println("\n\n\n");
                    if(op.verificapromo()){
                        System.out.println("ja existe uma promoção em uma opção, retire-a para adicionar uma nova.");
                        break;
                    }
                    else{ 
                        op.promocao();
                        break;
                    }

                case 10:
                    System.out.println("\n\n\n");
                    if(!op.verificapromo()){
                        System.out.println("Nao existe uma promoção a ser removida.");
                        break;
                    }
                    else{
                        op.tirapromo();
                        break;
                    }
                
                case 11:

                    agenda.resetAgenda();
                    break;

                case 0:
                    continuarMenu = false;
                    System.out.println("Saindo do programa...");
                    break;
                
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println();

        }

        scanner.close();
    }
}