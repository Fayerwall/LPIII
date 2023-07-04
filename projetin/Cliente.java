public class Cliente implements Comparable<Cliente>{
    private String Nome;
    private String numero;
    private String horario;
    private int total;


    public Cliente(String nome,String horario,String numero,int total){
        this.Nome = nome;
        this.horario = horario;
        this.numero = numero;
        this.total = total;
      
    }

    public Cliente(String nome,String horario, String numero){
        this(nome,horario,numero,opcoes.calculartotal());
    }

    @Override
    public int compareTo(Cliente outroCliente) {
        return this.horario.compareTo(outroCliente.horario);
    }

    public String getHorario() {
            return horario;
        }

        public void setHorario(String horario) {
            this.horario = horario;
        }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}