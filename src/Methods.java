import com.sun.source.tree.BreakTree;

public class Methods {

    public boolean contains(String[] array, String element) {

        for (String el: array) {
            if (el.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void addAll(String[] array1, String[] array2) {

        for (int idx = 0; idx < array1.length; idx++) {
            array2[idx] = array1[idx];
        }

        // IDE propose
        // System.arraycopy(array1, 0, array2, 0, array1.length);

        for (String element: array2) {
            System.out.print(element + " ");
        }
    }
}


