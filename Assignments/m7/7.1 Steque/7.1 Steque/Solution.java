import java.util.Scanner;
final class Solution {
    private Solution() { }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            LinkedList object = new LinkedList();
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                if (str.equals("")) {
                    System.out.println("");
                    break;
                } else {
                    String[] token = str.split(" ");
                    switch (token[0]) {
                    case "push":
                        object.pushAtStart(Integer.parseInt(token[1]));
                        object.displayAll();
                        break;
                    case "pop":
                        object.popAtStart();
                        object.displayAll();
                        break;
                    case "enqueue":
                        object.pushAtEnd(Integer.parseInt(token[1]));
                        object.displayAll();
                        break;
                    default:
                        break;
                    }
                }

            }
        }
    }
}