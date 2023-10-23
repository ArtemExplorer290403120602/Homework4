package Task1;

import java.util.Scanner;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//выводит текущую информацию о карточке. Напишите программу, которая создает три
//объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите
//с третьей. Выведите на экран текущее состояние всех трех карточек.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Создаем три объекта класса!
         */
        CreditCard card = new CreditCard("4563-4553-5000-0090", 1000);
        CreditCard card1 = new CreditCard("9912-5678-4325-0897",532);
        CreditCard card2 = new CreditCard("2312-6754-3123-7491",46);
        /**
         * Проверяем данные наших карт
         */
        System.out.println("Для первой карты:");
        System.out.println("--------------------------------");
        System.out.println("Ваш номер счета:" + " " + card.accountNumber);
        System.out.println("Ваш текущая сумма на карте:" + " " + card.theCurrentAmountOnTheAccount + " " + " руб");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Для второй карты:");
        System.out.println("--------------------------------");
        System.out.println("Ваш номер счета:" + " " + card1.accountNumber);
        System.out.println("Ваш текущая сумма на карте:" + " " + card1.theCurrentAmountOnTheAccount + " " + " руб");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Для третьей карты:");
        System.out.println("--------------------------------");
        System.out.println("Ваш номер счета:" + " " + card2.accountNumber);
        System.out.println("Ваш текущая сумма на карте:" + " " + card2.theCurrentAmountOnTheAccount + " " + " руб");
        System.out.println("--------------------------------");
        System.out.println();
        /**
         * Вводим данные в наши карты!
         */
        System.out.println("Введите сумму которую хотите внести в вашу первую карту:");
        double numberSum = scanner.nextDouble();
        card.sumCard(numberSum);
        System.out.println();
        System.out.println("Введите сумму которую хотите внести в вашу вторую карту:");
        double numberSum1 = scanner.nextDouble();
        card1.sumCard(numberSum1);
        System.out.println();
        System.out.println("Введите сумму которую хотите изъять с третьей карты:");
        double numberDif=scanner.nextDouble();
        card2.differenceCard(numberDif);
        /**
         * Проверяем наши данные!
         */
        System.out.println("Для первой карты:");
        card.informationCard();
        System.out.println();
        System.out.println("Для второй карты:");
        card1.informationCard();
        System.out.println();
        System.out.println("Для третьей карты:");
        card2.informationCard();
    }
}