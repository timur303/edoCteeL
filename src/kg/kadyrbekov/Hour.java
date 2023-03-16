package kg.kadyrbekov;

public class Hour {
    public static void main(String[] args) throws InterruptedException {
        int timeInMinutes = 1; // 1 hour in minutes
        int timeInSeconds = timeInMinutes * 60; // convert to seconds
        for (int i = timeInSeconds; i >= 0; i--) {
            int minutesLeft = i / 60;
            int secondsLeft = i % 60;
            System.out.printf("%02d:%02d\n", minutesLeft, secondsLeft);
            Thread.sleep(1000); // pause for 1 second
        }
        System.out.println("Time's up!");
    }
    }

