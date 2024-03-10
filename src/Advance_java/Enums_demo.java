package Advance_java;

public class Enums_demo {

    enum Color{
        RED("red"),GREEN("green"),BLUE("blue");

        private String val;
        Color(String val) {
            this.val = val;
        }
        public String getVal(){
            return val;
        }

    }
    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        System.out.println(c1.getVal());

        for (Color color : Color.values()){
            System.out.println(color);
        }

        System.out.println(c1.name());
    }
}
