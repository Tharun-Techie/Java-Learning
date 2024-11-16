package Basic_Concepts;

public class String_buffers_builders {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Tharun R");
//        System.out.println(sb);
        System.out.println(sb.capacity());
//        System.out.println(sb.toString());
        sb.append("Hello");
        System.out.println(sb.length());
        System.out.println(sb);
//        System.out.println(sb.insert(8," "));
//        System.out.println(sb.delete(4,6));
//        System.out.println(sb.deleteCharAt(5));
        sb.setLength(10);
        sb.ensureCapacity(100);
        System.out.println(sb);

        // string buffer thread safe but string builder is not

    }
}
