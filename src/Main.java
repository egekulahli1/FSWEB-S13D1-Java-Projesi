public class Main {
    public static void main(String[] args) {
        System.out.println("--------------shouldWakeUp------------------");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("--------------------------------");
        System.out.println("--------------hasTeen------------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("--------------------------------");
        System.out.println("--------------isCatPlaying------------------");
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("--------------------------------");
        System.out.println("--------------isCatPlaying------------------");
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println("--------------------------------");

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23)
            return false;

        if (!isBarking)
            return false;

        return clock < 8 || clock >= 20;

    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        if (    (age1 <= 19 && age1 >= 13) ||
                (age2 <= 19 && age2 >= 13) ||
                (age3 <= 19 && age3 >= 13) ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        } else {
            return temp >= 25 && temp <= 35;
        }
    }

    public static double area(double x, double y){
        double calculatedArea = 0;
        if(x < 0 || y < 0) {
            return -1;
        } else if (x >= 0 && y >= 0){
            calculatedArea = x*y;
        }
        return calculatedArea;
    }



}

