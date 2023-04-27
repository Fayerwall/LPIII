public class Main{
    public static void main(String[] args)
    {
        Data data = new Data();

        data.inicializa(02, 6, 2004);
        data.imprime_data();
        data.imprime_extenso();
        data.set_d(38);
        data.set_m(-10);
        data.set_a(1947);
        data.inicializa(15, 15, 1515);
        data.imprime_data();
    }
}