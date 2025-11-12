public class Test1 {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            int result = arr[3] / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range!");
        } catch (Exception e) {
            System.out.println("General exception!");
        }
    }
}