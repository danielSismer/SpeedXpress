package company.model;

import java.time.LocalDate;

public class Entrega {

    private int id;
    private LocalDate data_saida;
    private LocalDate data_entrega;
    private status status_entrega;
    private Motorista motorista_id;
    private Cliente cliente_id;

    public enum status {
        EM_ROTA, ENTREGUE, ATRASADO
    }

    public Entrega(int id, LocalDate data_saida, LocalDate data_entrega, status status_entrega, Motorista motorista_id, Cliente cliente_id) {
        this.id = id;
        this.data_saida = data_saida;
        this.data_entrega = data_entrega;
        this.status_entrega = status_entrega;
        this.motorista_id = motorista_id;
        this.cliente_id = cliente_id;
    }

    public Entrega(LocalDate data_saida, LocalDate data_entrega, status status_entrega, Motorista motorista_id, Cliente cliente_id) {
        this.data_saida = data_saida;
        this.data_entrega = data_entrega;
        this.status_entrega = status_entrega;
        this.motorista_id = motorista_id;
        this.cliente_id = cliente_id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData_saida() {
        return data_saida;
    }

    public LocalDate getData_entrega() {
        return data_entrega;
    }

    public status getStatus_entrega() {
        return status_entrega;
    }

    public int getMotorista_id() {
        return motorista_id.getId();
    }

    public int getCliente_id() {
        return cliente_id.getId();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData_saida(LocalDate data_saida) {
        this.data_saida = data_saida;
    }

    public void setData_entrega(LocalDate data_entrega) {
        this.data_entrega = data_entrega;
    }

    public void setStatus_entrega(status status_entrega) {
        this.status_entrega = status_entrega;
    }

    public void setMotorista_id(Motorista motorista_id) {
        this.motorista_id = motorista_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }
}

