package lk.SM.ModernPos.Place_Order_Form;
class A{
    private static A ob;
    private A(){}
    public static A getInstance(){
        if(ob==null){
            ob=new A();
        }
        return ob;
    }
}

public class Place_Order_Form {

    
    public static void main(String[] args) {
         //A a1=new A();
        A a1=A.getInstance();
        A a2=A.getInstance();
        System.out.println(a1==a2);
    }
    
}
