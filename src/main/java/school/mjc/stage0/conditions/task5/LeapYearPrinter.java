package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year%400){
            case 0:
            case 2:
            case 4:
            case 6:
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
                break;
        }
    }
}
