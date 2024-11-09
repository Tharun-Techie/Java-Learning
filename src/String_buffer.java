public class String_buffer {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("naveen");
        name.append("L");

        name.insert(6,".");

        name.delete(5,7);

        name.reverse();
        name.replace(0,1,"P");

        System.out.println(name.capacity());
        System.out.println(name.length());

        name.ensureCapacity(190);
        System.out.println(name.capacity());

        System.out.println(name);

    }
}
