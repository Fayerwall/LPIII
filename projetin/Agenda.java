import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Cliente> clientes;

    public Agenda() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void cancelarAgendamento(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public void resetAgenda() {
        this.clientes.clear();
    }

    public List<Cliente> getAgendaDoDia() {
        return this.clientes;
    }
}