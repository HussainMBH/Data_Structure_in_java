package StringBufferClass;
/*
* StringBuffer objects are mutable, meaning that you can change the contents of the buffer without creating a new object.
The initial capacity of a StringBuffer can be specified when it is created, or it can be set later with the ensureCapacity() method.
The append() method is used to add characters, strings, or other objects to the end of the buffer.
* */
public class usingStringBufferConcatenate {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Mohamed");
        sb.append(" ");
        sb.append("Bahir");
        System.out.println(sb);
    }

}
