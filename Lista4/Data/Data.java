public class Data{
    private int dia;
    private int mes;
    private int ano;

    public void inicializa(int d, int m, int a)
    {
        if (verificador(d, m, a))
        {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        }
        else
        {
            System.out.println("Data inexistente.");
        }
    }
    
    public void set_a(int a)
    {
        this.ano = a;
    }

    public void set_d(int d)
    {
        if(d >= 1 && d <= 31) this.dia = d;
        else System.out.println("Dia inexistente.");
    }

    public void set_m(int m)
    {
        if(m >= 1 && m <= 12) this.mes = m;
        else System.out.println("Mes inexistente.");
    }

    public int get_a()
    {
        return ano;
    }

    public int get_d()
    {
        return dia;
    }

    public int get_m()
    {
        return mes;
    }

    private boolean verificador(int d, int m, int a)
    {
        if ((m >= 1) && (m <= 12))
        {
            if (m == 2)
            {
                return (d >= 1) && (d <= 28);
            }
            else
            {
                if ((m == 4) || (m == 6) || (m == 9) || (m == 11))
                {
                    return (d >= 1) && (d <= 30);
                }
                else
                {
                    return (d >= 1) && (d <= 31);
                }
            }
        }
        else
        {
            return false;
        }
    }

    public void imprime_data()
    {
        String dia_data = String.format("%02d", dia);
        String mes_data = String.format("%02d", mes);
        System.out.println(dia_data + "/" + mes_data + "/" + ano);
    }

    public void imprime_extenso(){
        final String meses[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        String nome_m = meses[mes-1];
        String dia_data = String.format("%02d", dia);
        System.out.println(dia_data + " de " + nome_m + " de " + ano);

    }
}