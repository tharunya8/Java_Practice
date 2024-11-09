
interface A{
    void man();
}

public class Lambda_exp {
    public static void main( String[] args)
    {
        A alexa = ()->{
                System.out.println("hi man!!");};
        alexa.man();
    }
}