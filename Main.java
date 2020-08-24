public class Main {
    public static void main(String[] args) {
        int balans = (int) 100F;
        int deposit = 145;
        int i = 100;
        int bonus;
        if (deposit >= 1000) {
            bonus = deposit / i;
        } else {
            bonus = 0;
        }
        int totalBalans = balans + deposit;
        System.out.println("Бонус = " + bonus);
        System.out.println("Баланс итого = " + totalBalans);


    }
}