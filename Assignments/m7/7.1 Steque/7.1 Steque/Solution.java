import java.util.Scanner;
/**
 * This is a Solution class, which contains a main method.
 */
final class Solution {
    /**
     *This is a default private constructor.
     */
    private Solution() { }
    /**
     * This is main method.
     * Here, we take the input from the user.
     * An object for LinkedList is created.
     * Then the items are pushed into the stack.
     * The required operations are made as per output.
     * We use switch case in the main method.
     *  which helps in determining the input and the actions.
     * For the push we call PushAtStart with the parameter item.
     * For enqueue we call PushAtEnd with the parameter item.
     * For pop we call popAt Start.
     * For every action we call the displayAll method,
     * So that the output is printed all the times.
     * @param args [description]
     */
    public static void main(final String[] args) {
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
                        //System.out.println(object.displayAll());
                        break;
                    case "pop":
                        object.popAtStart();
                        object.displayAll();
                        //System.out.println(object.displayAll());
                        break;
                    case "enqueue":
                        object.pushAtEnd(Integer.parseInt(token[1]));
                        object.displayAll();
                        //System.out.println(object.displayAll());
                        break;
                    default:
                        break;
                    }
                    // if(token[0].equals("")){
                    //     System.out.println();
                    //     break;
                    // }
                }

            }
        }
    }
}
