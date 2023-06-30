import java.util.Scanner;

public abstract class opcoes{
    static private int corte = 20;
    static private int barba = 15;
    static private int navalhado = 25;
    static private int nevado = 30;
    static private int lavar = 20;
    static private int hidratar = 25;
    static private int sobrancelha = 15;

    public static int getCorte() {
        return corte;
    }
    public static void setCorte(int corte) {
        opcoes.corte = corte;
    }
    public static int getBarba() {
        return barba;
    }
    public static void setBarba(int barba) {
        opcoes.barba = barba;
    }
    public static int getNavalhado() {
        return navalhado;
    }
    public static void setNavalhado(int navalhado) {
        opcoes.navalhado = navalhado;
    }
    public static int getNevado() {
        return nevado;
    }
    public static void setNevado(int nevado) {
        opcoes.nevado = nevado;
    }
    public static int getLavar() {
        return lavar;
    }
    public static void setLavar(int lavar) {
        opcoes.lavar = lavar;
    }
    public static int getHidratar() {
        return hidratar;
    }
    public static void setHidratar(int hidratar) {
        opcoes.hidratar = hidratar;
    }
    public static int getSobrancelha() {
        return sobrancelha;
    }
    public static void setSobrancelha(int sobrancelha) {
        opcoes.sobrancelha = sobrancelha;
    }

    public int calculartotal(){
        int x = 0;
        Scanner sc1 = new Scanner(System.in);
        int opcao = 0; 
            do{
                System.out.print("qual opção o cliente deseja:\n\n1 - corte\n2 - barba\n3 - navalhado\n4 - nevado\n5 - lavar\n6 - hidratar\n7 - sobrancelha\n\n0 - concluido");
                opcao = Integer.parseInt(sc1.nextLine());
                if(opcao == 1) x+=corte;
                if(opcao == 2) x+=barba;
                if(opcao == 3) x+=navalhado;
                if(opcao == 4) x+=nevado;
                if(opcao == 5) x+=lavar;
                if(opcao == 6) x+=hidratar;
                if(opcao == 7) x+=sobrancelha;
            }while(opcao != 0);
            sc1.close();
        return x;
    }
}