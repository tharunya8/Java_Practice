//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //---------append()----------
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java


        //---------replace()---------
//        StringBuffer sb=new StringBuffer("Hello");
//        sb.replace(1,3,"Java");
//        System.out.println(sb); // prints: HJavalo

        //----------insert()---------
//        StringBuffer sb=new StringBuffer("Hello ");
//        sb.insert(1,"Java");//now original string is changed
//        System.out.println(sb);// prints: HJavaello
    }
}