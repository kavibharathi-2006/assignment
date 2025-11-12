class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class StudentGrades {
    public static void main(String[] args) {
        int marks = 105;
        try {
            if (marks > 100) {
                throw new InvalidGradeException("Marks cannot be greater than 100!");
            }
            System.out.println("Valid marks: " + marks);
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}