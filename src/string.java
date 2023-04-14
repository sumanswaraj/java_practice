public class string {
    public static void main( String [] args) {
        String name = "Suman Swaraj";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,8));
        /*the end value of the string will be the provided (end index value - 1)
        for above example the output for given substring if till index value 7*/
        String wrong_name = "Ruman Rwaraj";
        System.out.println(wrong_name.replace('R','S'));
        System.out.println(name.startsWith("ma"));
        System.out.println(name.startsWith("Su"));
        System.out.println  (name.endsWith("aj"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("ra"));//it only gives the index value of first charecter
        System.out.println(name.lastIndexOf('S'));
        System.out.println(name.equals("Suman Swaraj"));




    }
}