public class Main {
    public static void main(String[] args) {
     int initialAccount = 500;
     int account = 1600;




         int bonus;
         if (account > 1000) {
             bonus = account / 100;
             System.out.println(" Начислено " + bonus + " бонусов ");
        } else {
             bonus = 0;
             System.out.println("Начислено 0 бонусов.");
         }
        int totalAccount = account + initialAccount + bonus;
        System.out.println("Баланс составляет " + totalAccount + " руб.");

    }
}