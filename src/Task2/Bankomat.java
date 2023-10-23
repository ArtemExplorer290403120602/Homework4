package Task2;

public class Bankomat {
    private int count20;
    private int count50;
    private int count100;

    // Конструктор с тремя параметрами
    public Bankomat(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    // Метод для добавления денег в банкомат
    public void addMoney(int count20, int count50, int count100) {
        this.count20 += count20;
        this.count50 += count50;
        this.count100 += count100;
    }

    // Функция для снятия денег
    public boolean withdrawMoney(int amount) {
        int remainingAmount = amount;
        int withdrawn20 = 0;
        int withdrawn50 = 0;
        int withdrawn100 = 0;

        // Вычисляем, сколько купюр какого номинала нужно выдать
        while (remainingAmount > 0) {
            if (remainingAmount >= 100 && count100 > 0) {
                remainingAmount -= 100;
                count100--;
                withdrawn100++;
            } else if (remainingAmount >= 50 && count50 > 0) {
                remainingAmount -= 50;
                count50--;
                withdrawn50++;
            } else if (remainingAmount >= 20 && count20 > 0) {
                remainingAmount -= 20;
                count20--;
                withdrawn20++;
            } else {
                // Не удалось выдать требуемую сумму
                // Возвращаем деньги в банкомат
                count20 += withdrawn20;
                count50 += withdrawn50;
                count100 += withdrawn100;
                return false;
            }
        }

        // Успешное выполнение операции
        System.out.println("Выдано купюр номиналом 20: " + withdrawn20);
        System.out.println("Выдано купюр номиналом 50: " + withdrawn50);
        System.out.println("Выдано купюр номиналом 100: " + withdrawn100);
        return true;
    }

}


