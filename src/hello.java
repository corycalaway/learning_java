public class hello {
    public static void main(String[] args) {
        // How to print
        System.out.println("Hello World");

        // Variables
        int num = 5;
        double doubley = 4.6;
        char firstInitial = 'K';
        String name = "Cory";
        boolean isHome = true;

        // Prints num variable
        System.out.println(num);
        System.out.println(doubley);
        System.out.println(firstInitial);
        System.out.println(name);
        System.out.println(isHome);

        // Checks if variable is less than value.
        if (num < 18) {
            System.out.println("You are not an adult!");
        }

        // checks if name = value
        if (name.equals("Cory")) {
            System.out.println("Go Cory!");
        } else {
            System.out.println("Go Away!");

        }


    }
}
