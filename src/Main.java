public class Main {
    public static void main(String[] args) {
        int standartPercent = 1;
        int increasedPercent = 5;
        int specialPercent = 30;

        int correct = 100_00;

        int expenseStandartsumm = 15_155_00;
        int expenseIncreasedsumm = 50_289_00;
        int expenseSpecialsumm = 120_000_00;

        int cashbackStandart = expenseStandartsumm / correct * correct * standartPercent/100;
        int cashbackIncreased = expenseIncreasedsumm / correct * correct *increasedPercent/100;
        int cashbackSpecial = expenseSpecialsumm/correct*correct*specialPercent/100;

        System.out.println(cashbackStandart);
        System.out.println(cashbackIncreased);
        System.out.println(cashbackSpecial);
    }
}
