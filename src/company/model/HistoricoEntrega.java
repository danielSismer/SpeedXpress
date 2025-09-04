package company.model;

import java.time.LocalDate;

public class HistoricoEntrega {

    /*CREATE TABLE historico_entrega (
id INT PRIMARY KEY AUTO_INCREMENT,
entrega_id INT,
data_evento DATETIME NOT NULL,
descricao TEXT,
FOREIGN KEY (entrega_id) REFERENCES entrega(id)
);*/

    private int id;
    private int entrega_id;
    private LocalDate data_evento;
    private String descricao;

    public HistoricoEntrega(int id, int entrega_id, LocalDate data_evento, String descricao) {
        this.id = id;
        this.entrega_id = entrega_id;
        this.data_evento = data_evento;
        this.descricao = descricao;
    }

    public HistoricoEntrega(int entrega_id, LocalDate data_evento, String descricao) {
        this.entrega_id = entrega_id;
        this.data_evento = data_evento;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public int getEntrega_id() {
        return entrega_id;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEntrega_id(int entrega_id) {
        this.entrega_id = entrega_id;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
