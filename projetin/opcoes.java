import java.util.Scanner;

public  class opcoes implements promotions{
    static private int corte = 20;
    static private int barba = 15;
    static private int navalhado = 25;
    static private int nevado = 30;
    static private int lavar = 20;
    static private int hidratar = 25;
    static private int sobrancelha = 15;
    static private boolean promotion = false;
    static private int oppromo = 0;
    static private int ant;

    public void mostrarPrecos() {
    System.out.println("==== Preços das Opções ====");
    System.out.println("1 - Corte: R$" + corte);
    System.out.println("2 - Barba: R$" + barba);
    System.out.println("3 - Navalhado: R$" + navalhado);
    System.out.println("4 - Nevado: R$" + nevado);
    System.out.println("5 - Lavar: R$" + lavar);
    System.out.println("6 - Hidratar: R$" + hidratar);
    System.out.println("7 - Sobrancelha: R$" + sobrancelha);
}

public void alterarPrecos() {
    Scanner sc = new Scanner(System.in);
    System.out.println("==== Alterar Preços das Opções ====");
    System.out.print("Digite o novo preço para a opção Corte: ");
    corte = sc.nextInt();
    System.out.print("Digite o novo preço para a opção Barba: ");
    barba = sc.nextInt();
    System.out.print("Digite o novo preço para a opção Navalhado: ");
    navalhado = sc.nextInt();
    System.out.print("Digite o novo preço para a opção Nevado: ");
    nevado = sc.nextInt();
    System.out.print("Digite o novo preço para a opção Lavar: ");
    lavar = sc.nextInt();
    System.out.print("Digite o novo preço para a opção Hidratar: ");
    hidratar = sc.nextInt();
    System.out.print("Digite o novo preço para a opção Sobrancelha: ");
    sobrancelha = sc.nextInt();
}

    public static int calculartotal(){
        int x = 0;
        int []vet = {0,0,0,0,0,0,0};
        String []ops = {"1 - corte","2 - barba","3 - navalhado","4 - nevado","5 - lavar","6 - hidratar","7 - sobrancelha"};
        Scanner sc1 = new Scanner(System.in);
        int opcao = 0; 
            do{
                System.out.print("qual opção o cliente deseja:\n\n");
                for(int i = 0;i<7;i++){
                    if(vet[i]==0){
                        System.out.println(ops[i]);
                    }
                }
                System.out.print("0 - concluido\n");
                opcao = sc1.nextInt();
                if(opcao == 1){
                 x+=corte;
                 vet[opcao-1]=1;
                }
                if(opcao == 2){ 
                x+=barba;
                vet[opcao-1]=2;
            }
                if(opcao == 3){
                x+=navalhado;
                vet[opcao-1]=3;
            }
                if(opcao == 4){ 
                x+=nevado;
                vet[opcao-1]=4;
            }
                if(opcao == 5){
                x+=lavar;
                vet[opcao-1]=5;
            }
                if(opcao == 6){ 
                x+=hidratar;
                vet[opcao-1]=6;
            }
                if(opcao == 7){ 
                x+=sobrancelha;
                vet[opcao-1]=7;
            }
            }while(opcao != 0);
        return x;
    }

    public void promocao(){
        int opcao;
        int x;
        Scanner sc1 = new Scanner(System.in);
        do{
                System.out.print("qual opcao deseja aplicar a promocao:\n\n1 - corte\n2 - barba\n3 - navalhado\n4 - nevado\n5 - lavar\n6 - hidratar\n7 - sobrancelha\n0 - voltar\n\n");
                opcao = Integer.parseInt(sc1.nextLine());
                if(opcao == 1){
                    System.out.println("Digite o desconto que voce deseja aplicar em um de seus itens do catálogo: ");
                    x = sc1.nextInt();
                    ant = corte;
                    corte =(int)(corte - x);
                    promotion = true;
                    oppromo = 1;
                    break;
                }
                else if(opcao == 2){
                    System.out.println("Digite o desconto que voce deseja aplicar em um de seus itens do catálogo: ");
                    x = sc1.nextInt();
                    ant = barba;
                    barba =(int)(barba - x);
                    promotion = true;
                    oppromo = 2;
                    break;
                } 
                else if(opcao == 3){
                    System.out.println("Digite o desconto que voce deseja aplicar em um de seus itens do catálogo: ");
                    x = sc1.nextInt();
                    ant = navalhado;
                    navalhado =(int)(navalhado - x);
                    promotion = true;
                    oppromo = 3;
                    break;
                } 
                else if(opcao == 4){
                    System.out.println("Digite o desconto que voce deseja aplicar em um de seus itens do catálogo: ");
                    x = sc1.nextInt();
                    ant = nevado;
                    nevado = (int)(nevado - x);
                    promotion = true;
                    oppromo = 4;
                    break;
                } 
                else if(opcao == 5){
                    System.out.println("Digite o desconto que voce deseja aplicar em um de seus itens do catálogo: ");
                    x = sc1.nextInt();
                    ant = lavar;
                    lavar= (int)(lavar - x);
                    promotion = true;
                    oppromo = 5;
                    break;
                } 
                else if(opcao == 6){
                    System.out.println("Digite o desconto que voce deseja aplicar em um de seus itens do catálogo: ");
                    x = sc1.nextInt();
                    ant = hidratar;
                    hidratar = (int)(hidratar - x);
                    promotion = true;
                    oppromo = 6;
                    break;
                } 
                else if(opcao == 7){
                    System.out.println("Digite o desconto que voce deseja aplicar em um de seus itens do catálogo: ");
                    x = sc1.nextInt();
                    ant = sobrancelha;
                    sobrancelha = (int)(sobrancelha - x);
                    promotion = true;
                    oppromo = 7;
                    break;
                } 
            }while(opcao != 0);
    }

    public boolean verificapromo(){
        if(promotion) return true;
        else return false;
    }

    public void tirapromo(){
        if(oppromo == 1){
            corte = ant;
            promotion = false;
        }
        if(oppromo == 2){
            barba = ant;
            promotion = false;
        }
        if(oppromo == 3){
            navalhado = ant;
            promotion = false;
        }
        if(oppromo == 4){
            nevado = ant;
            promotion = false;
        }
        if(oppromo == 5){
            lavar = ant;
            promotion = false;
        }
        if(oppromo == 6){
            hidratar = ant;
            promotion = false;
        }
        if(oppromo == 7){
            sobrancelha = ant;
            promotion = false;
        }
    }

}