
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

        //Task4

        int money = 15000;
        int monthNext = 0;

        while (money < 12000000) {
            money = (int) (money + money * 0.07);
            monthNext++;
                System.out.println("Месяц " + monthNext + ", сумма накоплений " + money);
            }

        //Task5

        int money2 = 15000;
        //int goal = 12000000;
        int monthNext2 = 0;

        while (money2 < 12000000) {
            money2 = (int) (money2 + money2 * 0.07);
            monthNext2++;
            boolean monthNextReal2 = monthNext2 % 6 == 0;
            if (monthNextReal2) {
                System.out.println("Месяц " + monthNext2 + ", сумма накоплений " + money2);
            }
        }

        //Task6

        int money3 = 15000;
        //int goal = 12000000;
        int monthNext3 = 0;

        while (monthNext3 < 108) {
            money3 = (int) (money3 + money3 * 0.07);
            monthNext3++;
            boolean monthNextReal3 = monthNext3 % 6 == 0;
            if (monthNextReal3) {
                System.out.println("Месяц " + monthNext3 + ", сумма накоплений " + money3);
            }
        }

        //Task7

        int firstFriday = 5;
        int date = 0;

        System.out.println("Сегодня пятница, " + firstFriday + " число. Необходимо подготовить отчёт");

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




