package Interview;

import java.sql.SQLException;
/*
class A
{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}

class B extends A
{
    static void methodOne()
    {
        System.out.println("BBB");
    }
}
*/
class A
{
    void myMethod() {

        System.out.println("Super Class");
    }
}

class B extends A
{
    @Override
    void myMethod() //throws SQLException
    {
        System.out.println("Sub Class");
    }
}
public class MainClass
{
    public static void main(String[] args)  {
        A a =  new B();
            a.myMethod();

        // a.methodOne();

        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = "abc";
        System.out.println(s1==s2); // false
    }
}
