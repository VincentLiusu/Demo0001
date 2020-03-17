public class Test001 {
    public static void main(String[] args) {
        String str = "111@ 555 444 222";
        String[] st = str.split("@");
        String string = st[0]+st[1];
        String[] ss = string.split(" ");
        for (String s : ss) {
            System.out.println(s);
        }
    }
}
