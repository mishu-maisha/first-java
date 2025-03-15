public class ConcatenationExample {
    public static void main(String[] args) {
        String result = "";
        
        // Concatenating numbers using a loop
        for (int i = 1; i <= 5; i++) {
            result += i + " ";  // Adds the current number and a space
        }
        
        System.out.println(result);  // Output: 1 2 3 4 5
    }
}
