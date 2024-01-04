public class commandline {
    public static void main(String[] args) {
        String[] features = {
            "Simple",
            "Object-Oriented",
            "Distributed",
            "Robust",
            "Secure",
            "Portable",
            "Multithreaded",
            "Dynamic"
        };

        if (args.length > 0) {
            try {
                int index = Integer.parseInt(args[0]);
                if (index >= 1 && index <= features.length) {
                    System.out.println(index + ". JAVA is " + features[index - 1]);
                } else {
                    System.out.println("Index out of range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } else {
            for (int i = 0; i < features.length; i++) {
                System.out.println((i + 1) + ". JAVA is " + features[i]);
            }
        }
    }
}


