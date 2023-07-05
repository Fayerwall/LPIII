import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Agenda{

    private List<Cliente> clientes; 
    private int posicaoNaLista = 0;

    public Agenda() {
        
        this.clientes = new LinkedList<>();
    }

    private boolean clienteEstaNaLista(String nome) {
        posicaoNaLista = 0;
        for (Cliente c : clientes) {
            if (c.getNome().equals(nome)) {
                return true;
            }
            posicaoNaLista++;
        }
        return false;
    }
    
    public boolean verificaChoqueHorario(String horario){
       
        for(Cliente c: clientes){       
            if(c.getHorario().equals(horario))
                return true;
        }
        return false;
    }
    
    public void trocarHorario(String nome, String novoHorario)
    {
        if(clienteEstaNaLista(nome) && !verificaChoqueHorario(novoHorario)){
            clientes.get(posicaoNaLista).setHorario(novoHorario);
            System.out.println("Horário de agendamento trocado com sucesso!");
        }
        else
            System.out.println("Não é possivel alterar o horario desse cliente!");
        posicaoNaLista = 0;
    }

    public void adicionarCliente(Cliente cliente)
    {     
        if(!verificaChoqueHorario(cliente.getHorario()))
            clientes.add(cliente);
        else
            System.out.println("Não é possivel marcar nesse horario!");
    }

    public void cancelarAgendamento(String nome)
    {
        if(clienteEstaNaLista(nome))
            clientes.remove(posicaoNaLista);
        posicaoNaLista = 0;    
    }

    public void resetAgenda() {
        this.clientes.clear();
    }

    public List<Cliente> getAgendaDoDia() {
        Collections.sort(clientes);
        ClienteVIP v;
        
        for(Cliente c: clientes)
        {
            if(c instanceof ClienteVIP){
                v = (ClienteVIP) c;
                if(c instanceof ClienteVIP && !v.getvaipagar())
                    System.out.println(v.getNome() + " " + v.getHorario() + " Saldo devedor: " + v.getSaldoDevedor() + "\nnumero de contato: " + c.getNumero());
            }    
            else
            System.out.println(c.getNome() + " " + c.getHorario() + " total a pagar: " + c.getTotal() + "\nnumero de contato: " + c.getNumero());
        }
        
        return this.clientes;
    }

    public int calcularReceitaDoDia()
    {
        int receitaDoDia = 0;
        int receitaFiado = 0;
        ClienteVIP v;
        for (Cliente cliente : clientes) {
            if(clientes instanceof ClienteVIP){
                v = (ClienteVIP) cliente;
                if(cliente instanceof ClienteVIP && v.getvaipagar())
                    receitaFiado += v.getSaldoDevedor();
            }
            else
                receitaDoDia += cliente.getTotal();
        }
        return receitaDoDia;
}

}