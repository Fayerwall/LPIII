import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Agenda{
    private List<Cliente> clientes; 
    private int posicaoNaLista = 0;

    public Agenda() {
        
        this.clientes = new LinkedList<>();
    }

    private boolean clienteEstaNaLista(String nome)
    {   
        for(Cliente c: clientes)
        {
            if(c.getNome().equals(nome))
                return true;
            posicaoNaLista++;        
        }
        return false;        
    }
    
    private boolean verificaChoqueHorario(String horario){
       
        for(Cliente c: clientes){       
            if(c.getHorario().equals(horario))
                return true;
        }
        return false;
    }
    
    public void trocarHorario(String nome, String novoHorario)
    {
        if(clienteEstaNaLista(nome) && verificaChoqueHorario(novoHorario))
            clientes.get(posicaoNaLista).setHorario(novoHorario);
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

    public void cancelarAgendamento(Cliente cliente) 
    {
        /*Entendo a ideia de passar um Clienta como parametro, so fica mais complicado para trabalhar.
         Fica muito mais facil passando o nome do cliente, verificando se ele ta na lista e depois excluir.
        */
         this.clientes.remove(cliente);
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
        for (Cliente c : clientes) {
            System.out.println(c.getNome() + " " + c.getHorario() + " total a pagar: " + c.getTotal() + "\nnumero de contato: " + c.getNumero());
        }
        return this.clientes;
    }

    public int calcularReceitaDoDia(){
    int receitaDoDia = 0;
    for (Cliente cliente : clientes) {
        receitaDoDia += cliente.getTotal();
    }
    return receitaDoDia;
}

}