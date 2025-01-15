public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello";
        
        // Counting the number of characters
        int count = str.length();
        System.out.println("Number of characters: " + count);
        
        // Printing each character
        System.out.println("Characters in the string:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
