package StringBufferClass;
//The insert() method inserts the given string with this string at the given position.
public class inserMethodinStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(2, "Java");
        System.out.println(sb);
    }
}
