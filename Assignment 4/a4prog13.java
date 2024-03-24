public class a4prog13 {
    public static void main(String[] args) {
        try {
            validateAge(19); // Calling the method with an invalid age
            System.out.println("Age is valid.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }
    }
}

/*class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}*/

