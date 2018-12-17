import java.util.Arrays;
public final class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private Key[] keys;
    private Value[] values;
    private int size;
    public BinarySearchTree() {
        keys = (Key[]) new Comparable[2];
        values = (Value[]) new Object[2];
        size = 0;
    }
    private void resize(int cap) {
        keys = Arrays.copyOf(keys, cap);
        values = Arrays.copyOf(values, cap);
    }
    public void put(Key k,Value v) {
        if (v == null) {
            delete(k);
            return;
        }
        int i = getRank(k);
        if (i < size && keys[i].compareTo(k) == 0) {
            values[i] = v;
            return;
        }
        for (int j = size; j > i; j--)  {
            keys[j] = keys[j - 1];
            values[j] = values[j - 1];
        }
        keys[i] = k;
        values[i] = v;
        size++;
        if (size == keys.length) {
            resize(2 * size);
        }
    }
    public int getRank(Key key) {
        int lo = 0, hi = size - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int comp = key.compareTo(keys[mid]);
            if (comp > 0) {
                lo = mid + 1;
            } else if (comp < 0) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return lo;
    }
    public Value get(Key a) {
        if (isEmpty()) {
            return null;
        }
        int i = getRank(a);
        if (i < size && keys[i].compareTo(a) == 0) {
            return values[i];
        }
        return null;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean contains(Key k) {
        return get(k) != null;
    }
    public Key getFloor(Key k) {
        if (isEmpty()) {
            return null;
        }
        int i = getRank(k);
        if (i == 0) {
            return null;
        }
        if (i < size && keys[i].compareTo(k) == 0) {
            return keys[i];
        }
        return keys[i - 1];
    }
    public void delete(Key delkey) {
        final int four = 4;
        if (isEmpty()) {
            return;
        }
        int i = getRank(delkey);
        if (i < size && keys[i].compareTo(delkey) != 0) {
            return;
        }
        for (int j = i; j < size - 1; j++)  {
            keys[j] = keys[j + 1];
            values[j] = values[j + 1];
        }
        size--;
        keys[size] = null;
        values[size] = null;
        if (size > 0 && size == keys.length / four) {
            resize(keys.length / 2);
        }
    }
    public void deleteMin() {
        if (!(isEmpty())) {
            delete(keys[0]);
        }
    }
    public String toString() {
        String s = "";
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                s += keys[i] + " " + values[i] + "\n";
            }
            return s.substring(0, s.length() - 1);
        }
        return s;
    }
    public Key getMax() {
        return keys[size - 1];
    }
}
