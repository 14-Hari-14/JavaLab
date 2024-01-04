import java.util.Random;

class RandomNumberGenerator implements Runnable {
    private Random random = new Random();
    
    public void run() {
        while (true) {
            int randomNumber = random.nextInt(20); // Generating a random integer between 0 to 9
            System.out.println("Generated: " + randomNumber);
            if (randomNumber % 2 == 0) {
                Threads.square(randomNumber);
            } else {
                Threads.cube(randomNumber);
            }
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Threads {
    public static void square(int number) {
        Thread squareThread = new Thread(() -> {
            int square = number * number;
            System.out.println("Square: " + square);
        });
        squareThread.start();
    }
    
    public static void cube(int number) {
        Thread cubeThread = new Thread(() -> {
            int cube = number * number * number;
            System.out.println("Cube: " + cube);
        });
        cubeThread.start();
    }
}

public class Multithreaded {
    public static void main(String[] args) {
        Thread randomNumberGeneratorThread = new Thread(new RandomNumberGenerator());
        randomNumberGeneratorThread.start();
    }
}

