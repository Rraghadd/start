public class StringConstructor {
    public static void main (String[]args){
        char [] chararr = {'b','i','r','t','h',' ','d','a','y'};
        String s = new String("hello");

    // now we start the string Constructure.
    String s1 = new String ();
    String s2 = new String (s);
    String s3 = new String (chararr);
    String s4 = new String (chararr,6,3);

    char letter = s.charAt(0);

    System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n ", s1 , s2 , s3 , s4);
    System.out.println(letter);

    }
    
}
