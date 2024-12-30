import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("task 1");
        int[] expenses = new int[5];
        Arrays.fill(expenses, 10000);
        int sum = 0;
        for (int expens : expenses) {
            sum += expens;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("task 2");
        int[] expenses2 = {14500, 16400, 15800, 13200, 14101};
        Arrays.sort(expenses2);
        System.out.println("Минимальная сумма трат за неделю составила " + expenses2[0] + " рублей. " +
                "Максимальная сумма трат за неделю составила " + expenses2[expenses2.length - 1] + " рублей.");

        System.out.println("task 3");
        int [] expenses3 = Arrays.copyOf(expenses2, expenses2.length);
        sum = 0;
        for (int expens : expenses3) {
            sum += expens;
        }
        double midExpens = (expenses3.length == 0 ? 0 : (double) sum / expenses3.length);
        System.out.println("Средняя сумма трат за месяц составила " + midExpens + " рублей");

        System.out.println("task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int arrLength = reverseFullName.length;
        int midCharIndex = arrLength / 2;
        char firstCharacter = reverseFullName[0];
        for (int i = 0; i < midCharIndex; i++) {
            reverseFullName[i] = reverseFullName[arrLength - 1 - i];
            reverseFullName[arrLength - 1 - i] = firstCharacter;
            firstCharacter = reverseFullName[i + 1];
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}