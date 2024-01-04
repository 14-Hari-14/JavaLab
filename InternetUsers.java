public class InternetUsers {
    static int count = 0;
    static int happyCustomers;
    final static int MAXTIME = 2;
    String loginName;

    public InternetUsers(String loginName) {
        this.loginName = loginName;
    }

    public static void show() {
        System.out.println("Number of Internet Users: " + count);
        System.out.println("Number of Happy Customers: " + happyCustomers);
    }

    public void compute(boolean isHappy) {
        if (isHappy) {
            happyCustomers++;
            System.out.println(loginName + " is a happy customer!");
        }
    }

    static {
        System.out.println("Let's start browsing.");
        System.out.println("Maximum allotted time for browsing: " + MAXTIME + " hrs");
        happyCustomers = count;
    }

    public static void main(String[] args) {
        InternetUsers user1 = new InternetUsers("User1");
        InternetUsers user2 = new InternetUsers("User2");
        InternetUsers user3 = new InternetUsers("User3");

        count += 3; // Simulating three users logged in

        // Display initial stats
        show();

        // Simulating happy customers
        user1.compute(true);
        user2.compute(true);
        user3.compute(false);

        // Display updated stats
        show();
    }
}


