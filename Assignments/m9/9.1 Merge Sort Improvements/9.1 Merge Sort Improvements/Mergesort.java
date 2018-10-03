class Mergesort {
    Mergesort() {

    }
    private static final int cutoffPoint = 7;
    void mergeSort(final Comparable[] array,
        final Comparable[] aux1, final int lo,
        final int mid, final int hi) {
        assert isSorted(array, lo, mid);
        assert isSorted(array, mid + 1, hi);

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                aux1[k] = array[j++];
            } else if (j > hi) {
                aux1[k] = array[i++];
            } else if (less(array[j], array[i])) {
                aux1[k] = array[j++];
            } else {
                aux1[k] = array[i++];
            }
    }
}
    void sort(final Comparable[] array,
        final Comparable[] aux1, final int lo,
        final int hi) {
        if (hi <= lo + cutoffPoint) {
            insertionSort(aux1, lo, hi);
            System.out.println("Insertion sort method invoked...");
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(aux1, array, lo, mid);
        sort(aux1, array, mid + 1, hi);

        if (!less(array[mid + 1], array[mid])) {
           for (int i = lo; i <= hi; i++) {
            aux1[i] = array[i];
            }
            System.out.println("Array is already sorted. " +
                "So, skipped the call to merge...");
           return;
        }
        mergeSort(array, aux1, lo, mid, hi);
    }
    void sort(final Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(aux, a, 0, a.length - 1);
        assert isSorted(a);
    }
    void insertionSort(final Comparable[] a, final  int lo,
        final int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
                exchange(a, j, j - 1);
            }
        }
    }
    void exchange(final Comparable[] a, final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }
    boolean isSorted(final Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }
     boolean isSorted(final Comparable[] a,
        final int lo, final int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
    Object display(final Object[] a) {
        String s = "[";
        int i;
        for (i = 0; i < a.length - 1; i++) {
            s += a[i] + ", ";
        }
        s = s + a[a.length - 1] + "]";
        return s;
    }
}