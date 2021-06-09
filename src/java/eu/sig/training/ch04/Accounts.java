package eu.sig.training.ch04;

public class Accounts {
    @SuppressWarnings("unused")
    public static CheckingAccount findAcctByNumber(String number) {
        return new CheckingAccount();
    }

    // tag::isValid[]
    public static boolean isValid(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += (9 - i) * Character.getNumericValue(number.charAt(i));
        }

        return sum % 11 == 0;
    }
    // end::isValid[]

    public void addInterest(Money balance) {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);

        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}