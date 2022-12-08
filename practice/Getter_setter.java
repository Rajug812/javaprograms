package practice;

class raju {
    private int num;
    private String name;
    String regex = "^[a-zA-Z]+$";

    public void setName(String str) {
        if (str.matches(regex)) {
            name = str;
            System.out.println(name);
        } else {
            System.out.println("name not valid");
        }
    }
}
public class Getter_setter {
    public static void main(String[] args) {
        raju M = new raju();
        M.setName("rajukumar");
    }
}
