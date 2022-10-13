public enum Weekdays {
    Sunday("Domingo", 1),
    Monday("Lunes", 2),
    Tuesday("Martes", 3),
    Wednesday("Miércoles", 4),
    Thursday("Jueves", 5),
    Friday("Viernes", 6),
    Saturday("Sabado", 7);

    private final String day;
    private final int index;
    private Weekdays(String dayInSpanish, int indexDay) {
        day = dayInSpanish;
        index = indexDay;
    }

    public String getDay() {
        return day;
    }

    public int getIndex() {
        return index;
    }
}
