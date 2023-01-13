public class Patterns {
    public static void main(String[] args) {
        String s = "Testing1!";
        var r = s.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[!-/:-@_{-~}]).{8,}$");
        System.out.println(r);
    }
}


