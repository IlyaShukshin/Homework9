public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int[] cost = {50_000, 165_000, 70_000, 175_000, 90_000};
        int sum = 0;
        for (int i = 0; i < cost.length; i++) {
            sum = sum + cost[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача №2");
        int minCost = cost[0];
        int maxCost = cost[0];
        for (int i = 0; i < cost.length; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
            }
        }
        for (int i = 0; i < cost.length; i++) {
            if (cost[i] > maxCost) {
                maxCost = cost[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minCost + " рублей. Максимальная сумма трат за неделю составила " + maxCost + " рублей");

        System.out.println("Задача №3");
        int week = 4;
        double average = (double) sum / week;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}