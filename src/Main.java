import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        Stack stack_temp = new Stack();

        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Escolha o tamanho da pilha: ");
        int stack_length = scanner.nextInt();
        stack1.insertAllStack(stack_length);

        PrintStack.printStack(stack1, stack2, stack3);
        int countJogadas = 0;
        boolean isGameFinished = false;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Organizar pilha em ordem decrescente ou crescente?");
        System.out.println("1. Crescente");
        System.out.println("2. Decrescente");
        int ordenacao;
        while (true) {
            ordenacao = scanner.nextInt();
            if (ordenacao == 1 || ordenacao == 2) {break;}
            System.out.println("Opcao invalida");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Cada pilha tem seu numero para manipulacao:");
        System.out.println("1. Stack 1");
        System.out.println("2. Stack 2");
        System.out.println("3. Stack 3");

        while (!isGameFinished) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("0. Sair do jogo.");
            System.out.println("1. Movimentar.");
            System.out.println("2. Solucao automatica.");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0 -> {
                    System.out.println("Jogo encerrado.");
                    isGameFinished = true;
                }
                case 1 -> {
                    while (true) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Qual pilha para remover o topo: ");
                        int pilhaRemovida = scanner.nextInt();

                        if ((pilhaRemovida == 1) && (!stack1.isEmpty())) {
                            stack_temp.insert(stack1.remove());
                            break;
                        } else if ((pilhaRemovida == 2) && (!stack2.isEmpty())) {
                            stack_temp.insert(stack2.remove());
                            break;
                        } else if ((pilhaRemovida == 3) && (!stack3.isEmpty())) {
                            stack_temp.insert(stack3.remove());
                            break;
                        } else {
                            System.out.println("Opcao invalida");
                        }
                    }

                    if (ordenacao == 1) {
                        boolean escolhaCrescente = false;
                        while (!escolhaCrescente) {
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("Qual pilha para adicionar ao topo: ");
                            int pilhaAdicionada = scanner.nextInt();

                            switch (pilhaAdicionada) {
                                case 1 -> {
                                    Integer addedDisc = stack_temp.getTop().getInformation();

                                    if (stack1.isEmpty() || addedDisc >= stack1.getTop().getInformation()) {
                                        stack1.insert(stack_temp.remove());
                                        countJogadas++;
                                        PrintStack.printStack(stack1, stack2, stack3);
                                        escolhaCrescente = true;
                                    } else {
                                        System.out.println("Movimento inválido. O disco é menor que o topo da Stack 1");
                                    }
                                }
                                case 2 -> {
                                    Integer addedDisc = stack_temp.getTop().getInformation();

                                    if (stack2.isEmpty() || addedDisc >= stack2.getTop().getInformation()) {
                                        stack2.insert(stack_temp.remove());
                                        countJogadas++;
                                        PrintStack.printStack(stack1, stack2, stack3);
                                        escolhaCrescente = true;
                                    } else {
                                        System.out.println("Movimento inválido. O disco é menor que o topo da Stack 2");
                                    }
                                }
                                case 3 -> {
                                    Integer addedDisc = stack_temp.getTop().getInformation();

                                    if (stack3.isEmpty() || addedDisc >= stack3.getTop().getInformation()) {
                                        stack3.insert(stack_temp.remove());
                                        countJogadas++;
                                        PrintStack.printStack(stack1, stack2, stack3);
                                        escolhaCrescente = true;
                                    } else {
                                        System.out.println("Movimento inválido. O disco é menor que o topo da Stack 3");
                                    }
                                }
                                default -> System.out.println("Opcao invalida");
                            }

                            if (stack1.isEmpty() && stack2.isEmpty()) {
                                if (stack3.isCrescent(stack_temp)) {
                                    System.out.println("Jogo finalizado em " + countJogadas + " jogadas.");
                                    isGameFinished = true;
                                }
                            } else if (stack1.isEmpty() && stack3.isEmpty()) {
                                if (stack2.isCrescent(stack_temp)) {
                                    System.out.println("Jogo finalizado em " + countJogadas + " jogadas.");
                                    isGameFinished = true;
                                }
                            } else if (stack2.isEmpty() && stack3.isEmpty()) {
                                if (stack1.isCrescent(stack_temp)) {
                                    System.out.println("Jogo finalizado em " + countJogadas + " jogadas.");
                                    isGameFinished = true;
                                }
                            }
                        }
                    } else {
                        boolean escolhaDecrescente = false;
                        while (!escolhaDecrescente) {
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("Qual pilha para adicionar ao topo: ");
                            int pilhaAdicionada = scanner.nextInt();

                            switch (pilhaAdicionada) {
                                case 1 -> {
                                    Integer addedDisc = stack_temp.remove();
                                    if (stack1.isEmpty() || addedDisc <= stack1.getTop().getInformation()) {
                                        stack1.insert(addedDisc);
                                        countJogadas++;
                                        PrintStack.printStack(stack1, stack2, stack3);
                                        escolhaDecrescente = true;
                                    } else {
                                        System.out.println("Movimento inválido. O disco é maior que o topo da Stack 1");
                                    }
                                }
                                case 2 -> {
                                    Integer addedDisc = stack_temp.remove();
                                    if (stack2.isEmpty() || addedDisc <= stack2.getTop().getInformation()) {
                                        stack2.insert(addedDisc);
                                        countJogadas++;
                                        PrintStack.printStack(stack1, stack2, stack3);
                                        escolhaDecrescente = true;
                                    } else {
                                        System.out.println("Movimento inválido. O disco é maior que o topo da Stack 2");
                                    }
                                }
                                case 3 -> {
                                    Integer addedDisc = stack_temp.remove();
                                    if (stack3.isEmpty() || addedDisc <= stack3.getTop().getInformation()) {
                                        stack3.insert(addedDisc);
                                        countJogadas++;
                                        PrintStack.printStack(stack1, stack2, stack3);
                                        escolhaDecrescente = true;
                                    } else {
                                        System.out.println("Movimento inválido. O disco é maior que o topo da Stack 3");
                                    }
                                }
                                default -> System.out.println("Opcao invalida");
                            }
                        }

                        if (stack1.isEmpty() && stack2.isEmpty()) {
                            if (stack3.isDescending(stack_temp)) {
                                System.out.println("Jogo finalizado em " + countJogadas + " jogadas.");
                                isGameFinished = true;
                            }
                        } else if (stack1.isEmpty() && stack3.isEmpty()) {
                            if (stack2.isDescending(stack_temp)) {
                                System.out.println("Jogo finalizado em " + countJogadas + " jogadas.");
                                isGameFinished = true;
                            }
                        } else if (stack2.isEmpty() && stack3.isEmpty()) {
                            if (stack1.isDescending(stack_temp)) {
                                System.out.println("Jogo finalizado em " + countJogadas + " jogadas.");
                                isGameFinished = true;
                            }
                        }
                    }
                }
                case 2 -> {
                    boolean crescente = ordenacao == 1;
                    SolveGame.solve(stack_length, stack1, stack3, stack2, crescente);
                    PrintStack.printStack(stack1, stack2, stack3);
                    System.out.println("Jogo resolvido em: " + SolveGame.countMoves);
                    isGameFinished = true;
                }
                default -> System.out.println("Opcao invalida");
            }
        }
    }
}
