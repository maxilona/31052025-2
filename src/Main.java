//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int deposit = 2000;
        int bonus = deposit / 100;
        int totalAmount = amount + deposit;

        if (deposit > 1000) {
            totalAmount = amount + deposit + bonus;
        } else {
            totalAmount = amount + deposit;
        }
        System.out.println("Первоначальный размер счета:" + " " + amount + " " + "рубль/ей");
        System.out.println("Сумма пополнения:" + " " + deposit + " " + "рубль/ей");
        if (deposit > 1000) {
            System.out.println("Размер бонуса:" + " " + bonus + " " + "рубль/ей");
        }
        System.out.println("Итоговый размер счета:" + " " + totalAmount + " " + "рубль/ей");
        ;


    }
}