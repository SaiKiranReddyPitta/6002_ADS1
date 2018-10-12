import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *This is the class for main.
 */
final class Solution {
    /**
     *empty constructor.
     */
    private Solution() {
    }
    /**
     * the main to read the input.
     *
     * @param  args  The arguments
     */
    public static void main(final String[] args) {
        Student obj = new Student();
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        Scanner scan = new Scanner(System.in);
        Database object = new Database();
        int totalQualified = scan.nextInt();
        int vacancies = scan.nextInt();
        int openSeats = scan.nextInt();
        int bcSeats = scan.nextInt();
        int scSeats = scan.nextInt();
        int stSeats = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < totalQualified; i++) {
            String line  =  scan.nextLine();
            String[] tokens = line.split(",");
            obj = new Student(
                tokens[0], tokens[1], tokens[2],
                tokens[three], tokens[four],
                tokens[five], tokens[six]);
            object.addData(obj);
        }
        object.sorting();
        object.print();
        object.allotment(vacancies,
                         openSeats, bcSeats, scSeats, stSeats);
    }
}
