
public class Main {
    public static void main(String[] args) {

        //Task1

        int month = 0;
        int progSum = 0;
        int allWant = 2459000;
        int everyMonth = 15000;
        while (progSum <= allWant) {
            progSum = (int) (progSum + progSum * 0.13);
            progSum = progSum + everyMonth;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + progSum + " рублей");
        }

        //Task2

    int k = 0;
    while (k < 10) {
        k++;
        System.out.print(k + " ");
   }
        System.out.println();

    for (int i = 10; i > 0; i--){
        System.out.print(i + " ");
    }
        System.out.println();

    //Task3

        int allPeople = 12000000;
        int newPep = 17;
        int deathPep = 8;
        int dif = newPep - deathPep;
        for (int i = 1; i <= 10; i++){
            allPeople += allPeople * dif / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + allPeople);
        }

        //Task4,5,6

        int money = 15000;
        //int goal = 12000000;
        int monthNext = 0;

        while (monthNext < 108) {
            money = (int) (money + money * 0.07);
            monthNext++;
            boolean monthNextReal = monthNext % 6 == 0;
            if (monthNextReal) {
                System.out.println("Месяц " + monthNext + ", сумма накоплений " + money);
            }
        }

        //Task7

        int firstFriday = 5;
        int date = 0;
        while (date <= 31){
            date++;
            firstFriday++;
            boolean firstFridayTrue = date % 7 == 0;
            if (firstFridayTrue){
                System.out.println("Сегодня пятница, " + firstFriday + " число. Необходимо подготовить отчёт");
            }
        }

        //Task8

        int i;
        for (i = 0; i <= 2054; i++){
            boolean i1 = i % 79 == 0;
            if (i1 && i >= 1825){
                System.out.println(i);
            }
        }
















    }
}




