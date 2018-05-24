public class BankApp {
    String name;
    int age;
    String taxDetails;
    double amount;

    // Constructor
    public BankApp(String name) {
        this.name = name;
        System.out.println("Constructor called");
    }

    // Ask user for age

    public void accAge(int age) {
        this.age = age;
    }

    public void accTax(String taxDetails) {
        this.taxDetails = taxDetails;
    }

    public void depositAmount(double amount) {
        this.amount = amount;
    }

    public void getUserInfo() {
        System.out.println("Name of User is " + name);
        System.out.println("User balance  is " + amount);

    }

}
