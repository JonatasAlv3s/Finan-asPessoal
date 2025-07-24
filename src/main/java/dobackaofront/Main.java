package dobackaofront;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Dados Pessoas");
        System.out.println();
        People p = new People(11, "Jonatas", "Alves", "000.000.000-00", "22/03/1991",
                "jonatas@email.com", "********");

        p.show();

        System.out.println();

        System.out.println("Dados Contas");

        System.out.println();

        Bills b = new Bills(11, "03/07/2025", "08/08/2025", Status.Paid);

        b.show();

    }
}