public class GenericPrint {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] langs = {"Java", "Python", "C++"};
        Integer[] nums = {1, 2, 3, 4};

        printArray(langs);
        printArray(nums);
    }
}