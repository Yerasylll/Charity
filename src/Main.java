public class Main {
    public static void main(String[] args) {
        // Create donations
        Donation donation1 = new Donation("N001", 100.0);
        Donation donation2 = new Donation("N002", 200.0);
        Donation donation3 = new Donation("N003", 110.0);

        // Create donors and add donations
        Donor donor1 = new Donor("Yerasyl Alimbek", 3);
        donor1.addDonation(donation1);
        donor1.addDonation(donation2);
        donor1.addDonation(donation3);

        // Display donor information
        System.out.println("Donor Information:");
        System.out.println("Donor ID: " + donor1.getDonorId());
        System.out.println("Full Name: " + donor1.getFullName());
        donor1.displayDonations();

        // Create a charity
        Charity charity = new Charity("C001", "Biz Birgemiz", 5);

        // Add donations to charity
        charity.addDonation(donation1);
        charity.addDonation(donation2);
        charity.addDonation(donation3);

        // Display charity information
        System.out.println("\nCharity Information:");
        System.out.println("Charity ID: " + charity.getCharityId());
        System.out.println("Charity Name: " + charity.getName());
        charity.displayDonations();
    }
}
