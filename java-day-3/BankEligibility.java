public class BankEligibility{
    public static void main(String[] args) {
        int age = 30;
        double salary = 50000;
        int creditScore = 720;
        boolean existingCustomer = true;

        if ((age >= 18 && salary >= 30000 && creditScore >= 700) || (existingCustomer && creditScore >= 650)) {
            System.out.println("Loan eligibility: APPROVED");
        } else {
            System.out.println("Loan eligibility: NOT APPROVED");
        }
    }
}