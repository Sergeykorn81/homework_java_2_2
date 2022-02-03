public class Main {
    public static void main(String[] args) {

        int deposit = 3000;
        int depositAmount = 4000;

        int bonus = (depositAmount > 1000) ? depositAmount / 100 : 0;
        int balance = deposit + depositAmount + bonus;
        System.out.println("Ваш платеж зачислен.Сумма на счете: " + balance + "руб.");
        System.out.println("Бонусныe рубли: " + bonus + "руб.");
    }
}