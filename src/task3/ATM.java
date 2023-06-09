package task3;

public class ATM {
    private int numberOfBanknotesDenominationOf20;
    private int numberOfBanknotesDenominationOf50;
    private int numberOfBanknotesDenominationOf100;

    public ATM(int numberOfBanknotesDenominationOf20, int numberOfBanknotesDenominationOf50, int numberOfBanknotesDenominationOf100) {
        this.numberOfBanknotesDenominationOf20 = numberOfBanknotesDenominationOf20;
        this.numberOfBanknotesDenominationOf50 = numberOfBanknotesDenominationOf50;
        this.numberOfBanknotesDenominationOf100 = numberOfBanknotesDenominationOf100;
    }

    public void addMoney(int denomination, int quantity){
        if ( quantity >= 0) {
            switch (denomination) {
                case 20:
                    numberOfBanknotesDenominationOf20 += quantity;
                    break;
                case 50:
                    numberOfBanknotesDenominationOf50 += quantity;
                    break;
                case 100:
                    numberOfBanknotesDenominationOf100 += quantity;
                    break;
                default:
                    System.out.println("Wrong banknote denomination");
            }
        } else System.out.println("You cannot add amount less than 0");
    }

    public boolean checkPossibleWithdrawMoney(double quantity) {
        int totalSum = (this.numberOfBanknotesDenominationOf20 * 20) + (this.numberOfBanknotesDenominationOf50 * 50)
                + (this.numberOfBanknotesDenominationOf100 * 100);
        return totalSum >= quantity;
    }

    public boolean withdrawMoney(double quantity) {
        if (checkPossibleWithdrawMoney(quantity)) {
            int num100 = numberOfBanknotesDenominationOf100;
            int num50 = numberOfBanknotesDenominationOf50;
            int num20 = numberOfBanknotesDenominationOf20;
            int count100 = 0, count50 = 0, count20 = 0;
            while (quantity > 0) {
                if (quantity % 100 == 0 && num100 > 0) {
                    quantity -= 100;
                    num100--;
                    count100++;
                } else if (quantity % 50 == 0 && num50 > 0) {
                    quantity -= 50;
                    num50--;
                    count50++;
                } else if (quantity % 20 == 0 && num20 > 0) {
                    quantity -= 20;
                    num20--;
                    count20++;
                } else {
                    quantity -= 20;
                    num20--;
                    count20++;
                }
            }
            if (quantity == 0) {
                numberOfBanknotesDenominationOf100 = num100;
                numberOfBanknotesDenominationOf50 = num50;
                numberOfBanknotesDenominationOf20 = num20;

                System.out.println("You received: " +
                        "\nBanknotes in denominations of 20: " + count20 +
                        "\nBanknotes in denominations of 50: " + count50 +
                        "\nBanknotes in denominations of 100: " + count100 + "\n");
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "\n\tnumberOfBanknotesDenominationOf20 = " + numberOfBanknotesDenominationOf20 +
                ", \n\tnumberOfBanknotesDenominationOf50 = " + numberOfBanknotesDenominationOf50 +
                ", \n\tnumberOfBanknotesDenominationOf100 = " + numberOfBanknotesDenominationOf100 +
                "\n}";
    }
}
