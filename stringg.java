public class stringg{
    public static void main(String[] args) {
        String s1 = "welcome to java";
        String s2 = "welcome";
        String s3 = "java";
  
        System.out.println("Length: " + s1.length());
        System.out.println("Character: " + s1.charAt(0));
        System.out.println("Substring: " + s1.substring(0, 5));
        System.out.println("Contains: " + s1.contains("Java"));
        System.out.println("Is Empty: " + s1.isEmpty());
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        System.out.println("Trim: " + " Hello ".trim());
        System.out.println("Starts With: " + s1.startsWith("Hello"));
        System.out.println("Ends With: " + s1.endsWith("java"));
      
        System.out.println("Equals: " + s1.equals(s3));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));
        System.out.println("Compare To: " + s1.compareTo(s2));
        System.out.println("Reference Comparison: " + (s1 == s2));
        
        System.out.println("Concat: " + s2.concat(" Java"));
        System.out.println("Using +: " + s2 + " Java");
        
        System.out.println("Index Of: " + s1.indexOf("Java"));
        System.out.println("Index Of Character: " + s1.indexOf('a'));
        System.out.println("Last Index: " + s1.lastIndexOf('a'));

        System.out.println("Replace: " + s1.replace("Java", "Python"));
        System.out.println("Replace All: " + s1.replaceAll("a", "o"));

        int num = 100;
        String str = String.valueOf(num);
        System.out.println("Value Of: " + str + 10);

        String obj = new String("Java");
        String internStr = obj.intern();
        System.out.println("Intern: " + internStr);
    }
}