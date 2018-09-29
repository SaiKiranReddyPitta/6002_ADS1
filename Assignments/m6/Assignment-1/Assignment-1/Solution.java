import java.util.Scanner;
class AddLargeNumbers {
    
    /**
     * { function_description }
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList num = new LinkedList();
        String[] numbers = number.split("");
        for (int i = 0; i < numbers.length; i++) {
            num.push(numbers[i]);
        }
        return num;
    }

    /**
     * { function_description }
     *
     * @param      list  The list
     *
     * @return     { description_of_the_return_value }
     */
    public static String digitsToNumber(final LinkedList list) {
        String num = "";
        while (!list.isEmpty()) {
            num += list.pop();
        }
        return num;
    }

    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList addLargeNumbers(final LinkedList list1, final LinkedList list2) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        if (list2.size > list1.size) {
            int diff = list2.size - list1.size;
            while (diff > 0) {
                stack1.push(0);
                diff--;
            }
        }

        while (!list1.isEmpty()) {
            String number = list1.pop();
            stack1.push(Integer.parseInt(number));
        }

        while (!list2.isEmpty()) {
            String number = list2.pop();
            stack2.push(Integer.parseInt(number));
        }

        String sumofnums = "";
        int carrier = 0;
        int digitSum = 0;
        while (!stack1.isEmpty()) {
            digitSum = stack1.pop() + stack2.pop() + carrier;
            carrier = digitSum / (2+2+2+2+2);
            if (stack1.size == 0) {
                sumofnums += (digitSum % (2+2+2+2+2)) + "";
            }
            if (digitSum / (2+2+2+2+2) != 0) {
                sumofnums += (digitSum / (2+2+2+2+2)) + "";
            }
            else {
                sumofnums += (digitSum % (2+2+2+2+2)) + "";
            }
        }

        String answer = "";
        for (int i = sumofnums.length() - 1; i >= 0; i--) {
            answer += sumofnums.charAt(i);
        }

        LinkedList result = numberToDigits(answer);
        return result;
    }
}

/**
 * Class for solution.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
