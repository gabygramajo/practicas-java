public class EnumJava {
    public static void main(String[] args) {
        for (Weekdays day : Weekdays.values()) {
            System.out.println( day.getIndex() + " - " +
                    day + "(" +
                    day.getDay() + ")" );
        }
    }
}
