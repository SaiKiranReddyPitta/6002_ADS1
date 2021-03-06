class BinarySearchSymbolTable {
    /**
     * { keys array }.
     */
    private String[] keys;
    /**
     * { values array }.
     */
    private int[] values;
    /**.
     * { size }
     */
    private int size = 0;
    /**
     * Constructs the object.
     *
     * @param      len   The length
     */
    BinarySearchSymbolTable(int len) {
        keys = new String[len];
        values = new int[len];
    }
    /**
     * { to find the position of key or rank of key }.
     *
     * @param      k     { key }
     *
     * @return     { returns the position of given key in key array }
     */
    public int rank(String k) {
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (keys[mid].compareTo(k) < 0) {
                low = mid + 1;
            } else if (keys[mid].compareTo(k) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }
    /**
     * { put the key int symbol table }.
     *
     * @param      key    The key
     * @param      value  The value
     */
    public void put(final String key, final int value) {
        int i = rank(key);
        if (i < size && keys[i].compareTo(key) == 0) {
            values[i] = value;
            return;
        }
        if (size == 0) {
            keys[size] = key;
            values[size] = value;
            size++;
            return;
        }
        for (int j = size; j > i; j--) {
            values[j] = values[j - 1];
            keys[j] = keys[j - 1];
        }
        values[i] = value;
        keys[i] = key;
        size++;
    }
    /**
     * { checks whether key is in symbol table or not }.
     *
     * @param      key   The key
     *
     * @return     { true if present false otherwise }
     */
    public boolean contains(final String key) {
        int i = rank(key);
        return keys[i].equals(key);
    }
    /**
     * { returns floor of given key }.
     *
     * @param      key   The key
     *
     * @return     { returns largest key less than or equal given key }
     */
    public String floor(final String key) {
        int i = rank(key);
        if (keys[i].equals(key)) {
            return keys[i];
        } else if (i == 0) {
            return null;
        } else {
            return keys[i - 1];
        }
    }
    /**
     * { get the value of given key }.
     *
     * @param      key   The key
     *
     * @return     { return value if key is in symbol table else null }
     */
    public String get(final String key) {
        int i = rank(key);
        if (keys[i].equals(key)) {
            return values[i] + "";
        } else {
            return null;
        }
    }
    /**
     * { prints the symbol table }.
     */
    public void keys() {
        for (int i = 0; i < size; i++) {
            System.out.println(keys[i] + " " + values[i]);
        }
    }
    /**
     * { maximum key in symbol table }.
     *
     * @return     { maximum key in symbol table }
     */
    public String max() {
        return keys[size - 1];
    }
    /**
     * { deletes minimum }.
     */
    public void deleteMin() {
        for (int j = 0; j < size - 1; j++) {
            keys[j] = keys[j + 1];
            values[j] = values[j + 1];
        }
        keys[size] = null;
        values[size] = 0;
        size--;
    }
}