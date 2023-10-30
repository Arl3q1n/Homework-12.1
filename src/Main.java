public class Main {
    public static void main(String[] args) {

        String[] array1 = {"Andrei", "Ion", "Vasile", "Vlad"};
        String[] array2 = new String[array1.length];

        Methods methods = new Methods();

        System.out.println(methods.contains(array1, "Igor")); // False
        System.out.println(methods.contains(array1, "Andrei")); // True

        System.out.println();

        methods.addAll(array1, array2); // Andrei, Ion, Vasile, Vlad

    }
}