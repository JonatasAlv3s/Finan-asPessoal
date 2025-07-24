package dobackaofront;

public enum Status {
    Paid("Pago"),
    Pending("Pendente"),
    Overdue("Atrasado"),
    Canceled("Cancelado");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
