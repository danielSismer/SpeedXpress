package company.model;

import java.time.LocalDate;

public class Pedido {

    private int id;
    private LocalDate data_saida;
    private String volume_m3;
    private double peso_kg;
    private status status_pedido;
    private int cliente_id;
    private int motorista_id;

    public enum status {
        PENDENTE, ENTREGUE, CANCELADO
    }

    public Pedido(int id, LocalDate data_saida, String volume_m3, double peso_kg, status status, int cliente_id, int motorista_id) {
        this.id = id;
        this.data_saida = data_saida;
        this.volume_m3 = volume_m3;
        this.peso_kg = peso_kg;
        this.status_pedido = status;
        this.cliente_id = cliente_id;
        this.motorista_id = motorista_id;
    }

    public Pedido(LocalDate data_saida, String volume_m3, double peso_kg, status status, int cliente_id, int motorista_id) {
        this.data_saida = data_saida;
        this.volume_m3 = volume_m3;
        this.peso_kg = peso_kg;
        this.status_pedido = status;
        this.cliente_id = cliente_id;
        this.motorista_id = motorista_id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData_saida() {
        return data_saida;
    }

    public String getVolume_m3() {
        return volume_m3;
    }

    public double getPeso_kg() {
        return peso_kg;
    }

    public status getStatus() {
        return status_pedido;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public int getMotorista_id() {
        return motorista_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData_saida(LocalDate data_saida) {
        this.data_saida = data_saida;
    }

    public void setVolume_m3(String volume_m3) {
        this.volume_m3 = volume_m3;
    }

    public void setPeso_kg(double peso_kg) {
        this.peso_kg = peso_kg;
    }

    public void setStatus(status status) {
        this.status_pedido = status;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public void setMotorista_id(int motorista_id) {
        this.motorista_id = motorista_id;
    }
}
