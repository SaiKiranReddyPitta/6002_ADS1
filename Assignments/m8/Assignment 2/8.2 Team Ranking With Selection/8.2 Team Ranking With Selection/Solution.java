import java.util.Scanner;
public final class Solution {
    private static final int TEN = 10;
    private static final int THREE = 3;
    private Solution() {

    }
    public static void main(String[] args) {
        Team[] cricketteams = new Team[TEN];
        int size = 0;
        Scanner scan = new Scanner(System.in);
        Table t = new Table();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(",");
            cricketteams[size++] = new Team(line[0], Integer.parseInt(line[1]),
                     Integer.parseInt(line[2]), Integer.parseInt(line[THREE]));
        }
        System.out.println(t.leaderboard(cricketteams, size));
    }
}