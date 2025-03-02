package StringStringBufferStringBuilder;

class Eg2 {
    public static void main(String[] args) {
//        Object so = "Hello";
//
//        Object so2;
//        so2 = "Hello";
          String p =  new String("Test");
            p = null;

        String so = "This is a literal string";
//        String so2 = "This is a literal string";

//        String so = new String("This is a literal string");
        String so2 = new String("This is a literal string");

        System.out.println("so: "+System.identityHashCode(so));
        System.out.println("so2:"+System.identityHashCode(so2));

        System.out.println(so.equals(so2));



    }




}
