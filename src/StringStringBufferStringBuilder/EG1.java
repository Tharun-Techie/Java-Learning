package StringStringBufferStringBuilder;


// string buffer object are immutable, string object are mutable
// immutable - not changeable

class EG1 {
    public static void main(String[] args) {
        String  s = new String("Hello brother");
        String a = s.concat("hello");
        System.out.println("a:"+a);

        System.out.println(s);

        StringBuffer sb = new StringBuffer("Durga sir ");
        sb.append("goat");

        System.out.println(sb);
    }
}
