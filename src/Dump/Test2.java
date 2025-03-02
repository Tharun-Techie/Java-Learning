package Dump;

class Test{
    //public static void main(String[] args)
    {
        Object[] ob = new Object[10];

        ob[0] = 10;
        ob[1] = "Hello";

        System.out.println(ob[0]);
        System.out.println(ob[1]);
    }
}

class Test2{

    //public static void main(String[] args)
    {
        String s = new String("Hello Durga Sir");
        s.concat(" Java Toturials are super sir");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Hello Durga Sir");
        sb.append("Java Toturials are super sir");

        System.out.println(sb);
    }

}

class Test3{
    public static void main(String[] args) {
        String s1 = new String("Durga");
        String s2 = new String("Durga");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


    }
}