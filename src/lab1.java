public class lab1 {
    //65130500082
    public static void main(String[] args) {
        System.out.println(1/0);

        int[] list = new int[5];
        System.out.println(list[5]);

        String s = "abc";
        System.out.println(s.charAt(3));

        Object o = new Object();
        String d = (String) o;

        Object o1 = null;
        System.out.println(o1.toString());

        System.out.println(1.0/0);
    }

}
