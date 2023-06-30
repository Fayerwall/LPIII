public class Cliente{
    private String Nome;
    private String numero;
    private String insta;
    private String horario;


    public Cliente(String nome,String horario,String numero,String insta){
        this.Nome = nome;
        this.horario = horario;
        this.numero = numero;
        this.insta = insta;
      
    }

    public Cliente(String nome,String horario,String numero){
        this(nome,numero,horario,"nao informado");
    }

    public Cliente(String nome,String horario){
        this(nome,horario,"nao informado","nao informado");
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
    public String getInsta() {
        return insta;
    }
    public void setInsta(String insta) {
        this.insta = insta;
    }  
}