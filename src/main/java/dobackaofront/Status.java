package dobackaofront;

public enum Status {
    Paid("Pago"),
    Pending("Pendente"),
    Overdue("Atrasado"),
    Canceled("Cancelado");

    private final String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
