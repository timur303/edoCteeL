package kg.kadyrbekov;

public class Hour {
    public static void main(String[] args) throws InterruptedException {
    countdown(3);
    }


    public static void countdown(int minutes) throws InterruptedException {
        int seconds = 0;
        int hours = 0;
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        while (totalSeconds > 0) {
            int remainingHours = totalSeconds / 3600;
            int remainingMinutes = (totalSeconds % 3600) / 60;
            int remainingSeconds = totalSeconds % 60;
            System.out.printf("%02d:%02d:%02d\n", remainingHours, remainingMinutes, remainingSeconds);
            Thread.sleep(1000);
            totalSeconds--;
        }

        System.out.println("Time's up!");
        int cost = minutes * 2;
        System.out.println("Сиздин чек " + cost + " сом болду ");
    }

    public static void countdown(int hours, int minutes) throws InterruptedException {
        int seconds = 0;
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        while (totalSeconds > 0) {
            int remainingHours = totalSeconds / 3600;
            int remainingMinutes = (totalSeconds % 3600) / 60;
            int remainingSeconds = totalSeconds % 60;
            System.out.printf("%02d:%02d:%02d\n", remainingHours, remainingMinutes, remainingSeconds);
            Thread.sleep(1000);
            totalSeconds--;
        }

        System.out.println("Time's up!");
        int cost = minutes * 2;
        System.out.printf("Total cost: $%d\n", cost);
    }

    public static void countUp(int minutes) throws InterruptedException {
        int seconds = 0;
        int hours = 0;
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        int elapsedHours, elapsedMinutes, elapsedSeconds;
        elapsedHours = elapsedMinutes = elapsedSeconds = 0;
        while (true) {
            System.out.printf("%02d:%02d:%02d\n", elapsedHours, elapsedMinutes, elapsedSeconds);
            Thread.sleep(1000);
            totalSeconds++;
            elapsedHours = totalSeconds / 3600;
            elapsedMinutes = (totalSeconds % 3600) / 60;
            elapsedSeconds = totalSeconds % 60;
        }
    }

}

