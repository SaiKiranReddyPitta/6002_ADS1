import java.util.Scanner;
final class Solution {
    private Solution() {

    }

    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        switch (type) {
        case "String":
            int number = scan.nextInt();
            for (int i = 0; i < number; i++) {
                String[] tokens = scan.next().split(",");
                try {
                    if (tokens[0].length() == 0) {
                        throw new Exception("false");
                    } else {
                        MinHeap<String> string = new MinHeap<String>(tokens);
                    }
                } catch (Exception e) {
                    System.out.println("false");
                }
            }
            break;
        case "Float":
            number = scan.nextInt();
            for (int i = 0; i < number; i++) {
                try {
                    String line = scan.next();
                    if (line.length() == 0) {
                        throw new Exception("false");
                    } else {
                        String[] tokens = line.split(",");
                        Float[] token = new Float[tokens.length];
                        for (int j = 0; j < tokens.length; j++) {
                            token[j] = Float.parseFloat(tokens[j]);
                        }
                        MinHeap<Float> floa = new MinHeap<Float>(token);
                    }
                } catch (Exception e) {
                    System.out.println("false");
                }
            }
            break;
        case "Integer":
            number = scan.nextInt();
            for (int i = 0; i < number; i++) {
                String[] tokens = scan.next().split(",");
                try {
                    if (tokens[0].length() == 0) {
                        throw new Exception("false");
                    } else {
                        Integer[] token = new Integer[tokens.length];
                        for (int j = 0; j < tokens.length; j++) {
                            token[j] = Integer.parseInt(tokens[j]);
                        }
                        MinHeap<Integer> inte = new MinHeap<Integer>(token);
                    }
                } catch (Exception e) {
                    System.out.println("false");
                }
            }
            break;
        case "Double":
            number = scan.nextInt();
            for (int i = 0; i < number; i++) {
                String[] tokens = scan.next().split(",");
                try {
                    if (tokens[0].length() == 0) {
                        throw new Exception("false");
                    } else {
                        Double[] token = new Double[tokens.length];
                        for (int j = 0; j < tokens.length; j++) {
                            token[j] = Double.parseDouble(tokens[j]);
                        }
                        MinHeap<Double> doub = new MinHeap<Double>(token);
                    }
                } catch (Exception e) {
                    System.out.println("false");
                }
            }
            break;
        default:
            break;
        }
    }
}

class MinHeap<E> {
    private int len;
    private E[] pq;
    MinHeap() {

    }

    MinHeap(final E[] array) {
        len = array.length;
        pq = (E[]) new Object[len + 1];
        for (int i = 0; i < len; i++) {
            pq[i + 1] = array[i];
        }
        System.out.println(isMininimumHeap(1));
    }

    public boolean isMininimumHeap(final int index) {
        if (index > len) {
            return true;
        }
        int lchild = 2 * index;
        int rchild = 2 * index + 1;
        if (lchild  <= len && large(index, lchild)) {
            return false;
        }
        if (rchild <= len && large(index, rchild)) {
            return false;
        }
        return (isMininimumHeap(lchild) && isMininimumHeap(rchild));
    }

    public boolean large(final int i, final int j) {
        return ((Comparable<E>) pq[i]).compareTo(pq[j]) > 0;
    }
}