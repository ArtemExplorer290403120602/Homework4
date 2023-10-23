package Task1;

public class CreditCard {
    String accountNumber; //номер счета
    double theCurrentAmountOnTheAccount; //текущая сумма на счету

    public CreditCard(String accountNumber, double theCurrentAmountOnTheAccount) {
        this.accountNumber = accountNumber;
        this.theCurrentAmountOnTheAccount = theCurrentAmountOnTheAccount;
    }


    void sumCard(double x) {
        if (x > 0) {
            theCurrentAmountOnTheAccount += x;
            System.out.println("В ваше карту было внесено:" + " " + x + " " + "руб");
        } else {
            System.out.println("Вы ввели некорретную сумму!");
            System.exit(1);
        }

    }

    void differenceCard(double y) {
        if (y > 0) {
            theCurrentAmountOnTheAccount -= y;
            System.out.println("В вашей карте было изъято:" + " " + y + " " + "руб");
        } else {
            System.out.println("Вы ввели некорректную сумму!");
            System.exit(2);
        }
    }

    void informationCard() {
        System.out.println("Номер счета вашей карты:" + " " + accountNumber);
        System.out.println("Текущая сумма на вашей карты:" + " " + theCurrentAmountOnTheAccount + " руб");
    }
}
