public class ClienteVIP extends Cliente {
    private int saldoDevedor = 0;
    private boolean fiado;
    public ClienteVIP(String nome, String horario, String numero, boolean vaipagar) 
    {
        super(nome, horario, numero, vaipagar);
        this.fiado = vaipagar;
        if(!vaipagar)
            saldoDevedor = opcoes.calculartotal();
        else
            setTotal(opcoes.calculartotal());        
    }
    public boolean getvaipagar()
    {
        return this.fiado;
    }
    
    public int getSaldoDevedor()
    {
        return saldoDevedor;
    }

    
}