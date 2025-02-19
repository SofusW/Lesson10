public class StringThings {

    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3();
        System.out.println(exercise4("Sofus"));
        exercise5();
        exercise6();
        exercise7();
        System.out.println(exercise8(9,5));

    }

    public static void exercise1() {

        System.out.println("Roman Aplhabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();

    }

    public static void exercise2() {

        System.out.println("Roman Aplhabet: ");
        for (char i = 913; i <= 937; i++) {
            System.out.print((char) i);

        }
        System.out.println();


    }

    public static void exercise3() {

        String text = "Computer Science is fun!";
        System.out.println(text);
        System.out.println(text.replace("Computer Science", "CS"));
        System.out.println();
    }

    public static String exercise4(String s) {

        String r = "";
        for(int i = s.length() - 1; 0 <= i; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

    public static void exercise5() {
        String fruit = "Banana";
        System.out.println(fruit.substring(0, 3));
        System.out.println(fruit.substring(2, 5));
        System.out.println(fruit.substring(6, 6));

    }

    public static void exercise6() {

        String fruit = "Banana";
        int index = fruit.indexOf('a');
        System.out.println(index);

    }

    public static void exercise7() {

        String name1 = "Sofus";
        String name2 = "Sufos";

        int diff = name1.compareTo(name2);
        if(diff == 0) {
            System.out.println("The names are the same");
        }
        else if (diff < 0) {
            System.out.println("name1 comes before name2");
        }
        else if (diff > 0) {
            System.out.println("name2 comes before name1");
        }

    }

    public static String exercise8(int hour, int minute) {
        String ampm;
            if(hour < 12) {
                ampm = "AM";
                if (hour == 0) {
                    hour = 12;
                }

            } else {
                ampm = "PM";
                hour -= 12;
            }
        return String.format("%02d:%02d %s", hour, minute, ampm);
    }

    public static void exercise9() {

        String str1 = "12345";
        int num1 = Integer.parseInt(str1);
        int num2 = 12345;
        String str2 = Integer.toString(num2);


    }

}
