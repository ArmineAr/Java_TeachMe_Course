package org.example;

public class LearningJava {
    // methods should be declared in class BUT
    // cant invoke method in class need to invoke it in method main
    // Also method can be called in other method or in itself (recursion)

    public static void main(String[] args) {
        String s = "abc";
        String s2 = "abc";
        System.out.println(s2.intern());

        printSignOfNumber(2);
        int rectangleArea = calculateRactangleArea(2, 5);
        System.out.println("area is" + rectangleArea);
        String repeatedString = getRepeatedSting("abc", 3);
        System.out.println(getPowerOfNumber(3, 2));
        System.out.println("min " + getMin(new int[]{4, 5, 2}));
        System.out.println("evarage: " + getEvarage(25, 45, 65));
        getMiddleCharacter("abcd");
        getMiddleCharacter("abc");
        System.out.println(getNumberOfWords("The quick brown fox jumps over the lazy dog"));
        System.out.println(getTriangleArea(10, 15, 20)); // ???getting wrong result
        System.out.println("15,16,17 are consecutive numbers: " + checkConsecutiveNumber(15, 16, 17));
        System.out.println(reversString("abc"));
        System.out.println("sum of first 2 numbers is greater than third: " + sumOfTwoBiggerThanThird(15, 20, 25));


    }

    public static boolean sumOfTwoBiggerThanThird(int x, int y, int z) {
        if ((x + y) > z && (x + z) > y && (z + y) > x) {
            return true;
        } else return false;
        // OR write     return ((x + y) > z && (x + z) > y && (z + y) > x);
    }

    public static String reversString(String a) {
        StringBuilder b = new StringBuilder(a);
        return b.reverse().toString();
    }

    public static boolean checkConsecutiveNumber(int x, int y, int z) {
        if ((y - x == 1) && (z - y) == 1) {
            return true;
        } else return false;
    }

    public static double getTriangleArea(int x, int y, int z) {
        double s = (x + y + z) / 2.0;
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        return area;
    }

    public static int getNumberOfWords(String a) {
        String[] splittedString = a.split(" ");
        return splittedString.length;
    }


    public static void getMiddleCharacter(String a) {
        if (a.length() % 2 == 1) {
            System.out.println(a.charAt((a.length() / 2)));
        } else {
            System.out.println(a.substring((a.length() / 2) - 1, (a.length() / 2) + 1));
        }
        // ??? why whith char doesnt work System.out.println((a.charAt((a.length()/2)-1)) + (a.charAt(a.length()/2)));
    }

    public static int getEvarage(int x, int y, int z) {
        return (x + y + z) / 3;
    }
    public static int getMin(int x, int y, int z) {
        return Math.min(x,Math.min(y,z));
    }
    public static int getMin(int[] x) {
        int min = x[0]; // we need to initialize as its local variable and doestn have default value
        for (int i = 1; i < x.length; i++) {
            if (x[0] > x[i]) {
                min = x[i];
            }
        }
        return min;
    }

    public static void printSignOfNumber(int n) {
        if (n == 0) {
            System.out.println("The number " + n + " is zero");
        } else if (n < 0) {
            System.out.println("The number " + n + " is negative");
        } else System.out.println("The number " + n + " is positive");
    }

    public static int calculateRactangleArea(int width, int height) {
        return width * height;
    }

    public static String getRepeatedSting(String textRepeat, int timesRepeat) {
        // getPowerOfNumber(2,3);
        return textRepeat.repeat(timesRepeat);
    }

    public static double getPowerOfNumber(double number, int power) {
        return Math.pow(number, power);
    }

}

