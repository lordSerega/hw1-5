package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int moneyMaria = 67_760;
        int moneyDenis = 83_690;
        int moneyKristina = 76_230;
        float boost = 0.1f;

        float newMoneyMaria = moneyMaria + moneyMaria * boost;
        float newMoneyDenis = moneyDenis+  moneyDenis * boost;
        float newMoneyKristina = moneyKristina + moneyKristina * boost;

        float differenceMaria = (newMoneyMaria * 12) - (moneyMaria * 12);
        float differenceDenis = (newMoneyDenis * 12) - (moneyDenis * 12);
        float differenceKristina = (newMoneyKristina * 12) - (moneyKristina * 12);

        System.out.println("Маша теперь получает " + newMoneyMaria + " рублей. Годовой доход вырос на "+differenceMaria+ " рублей");
        System.out.println("Денис теперь получает " + newMoneyDenis + " рублей. Годовой доход вырос на "+differenceDenis+ " рублей");
        System.out.println("Кристина теперь получает " + newMoneyKristina + " рублей. Годовой доход вырос на "+differenceKristina+ " рублей");
    }
}
