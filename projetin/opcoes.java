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
        Scanner sc1 = new Scanner(System.in);
        int opcao = 0; 
            do{
                System.out.print("qual opção o cliente deseja:\n\n1 - corte\n2 - barba\n3 - navalhado\n4 - nevado\n5 - lavar\n6 - hidratar\n7 - sobrancelha\n0 - concluido\n");
                opcao = sc1.nextInt();
                if(opcao == 1) x+=corte;
                if(opcao == 2) x+=barba;
                if(opcao == 3) x+=navalhado;
                if(opcao == 4) x+=nevado;
                if(opcao == 5) x+=lavar;
                if(opcao == 6) x+=hidratar;
                if(opcao == 7) x+=sobrancelha;
            }while(opcao != 0);
        return x;
    }

    public void promocao(int x){
        float y;int opcao;
        y = x/100;
        Scanner sc1 = new Scanner(System.in);
        do{
                System.out.print("qual opcao deseja aplicar a promocao:\n\n1 - corte\n2 - barba\n3 - navalhado\n4 - nevado\n5 - lavar\n6 - hidratar\n7 - sobrancelha\n0 - voltar\n" +
                        "\"");
                opcao = Integer.parseInt(sc1.nextLine());
                if(opcao == 1){
                    ant = corte;
                    corte =(int)(corte - corte*y);
                    promotion = true;
                    oppromo = 1;
                    break;
                }
                if(opcao == 2){
                    ant = barba;
                    barba =(int)(barba - barba*(y));
                    promotion = true;
                    oppromo = 2;
                    break;
                } 
                if(opcao == 3){
                    ant = navalhado;
                    navalhado =(int)(navalhado - navalhado*y);
                    promotion = true;
                    oppromo = 3;
                    break;
                } 
                if(opcao == 4){
                    ant = nevado;
                    nevado = (int)(nevado - nevado*y);
                    promotion = true;
                    oppromo = 4;
                    break;
                } 
                if(opcao == 5){
                    ant = lavar;
                    lavar= (int)(lavar - lavar*y);
                    promotion = true;
                    oppromo = 5;
                    break;
                } 
                if(opcao == 6){
                    ant = hidratar;
                    hidratar = (int)(hidratar - hidratar*y);
                    promotion = true;
                    oppromo = 6;
                    break;
                } 
                if(opcao == 7){
                    ant = sobrancelha;
                    sobrancelha = (int)(sobrancelha - sobrancelha*y);
                    promotion = true;
                    oppromo = 7;
                    break;
                } 
            }while(opcao != 0);
            sc1.close();
    }

    public boolean verificapromo(){
        if(promotion = true) return true;
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