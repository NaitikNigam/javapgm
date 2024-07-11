import java.util.Scanner;
class BirthDay {
    private int date;
    private int month;
    private int year;

    public BirthDay(int date, int month, int year) {
        if (!isValidDate(date, month, year)) {
            throw new IllegalArgumentException("Invalid birth date.");
        }

        this.date = date;
        this.month = month;
        this.year = year;
    }

    private boolean isValidDate(int date, int month, int year) {
        if (year < 0 || month < 1 || month > 12 || date < 1) {
            return false;
        }

        if (month == 2) {
            if (isLeapYear(year)) {
                return date <= 29;
            } else {
                return date <= 28;
            }
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return date <= 30;
        }

        return date <= 31;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Getters and setters (omitted for brevity)
}
public class dob{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    BirthDay obj=new BirthDay(a,b,c);

}
}

