package methodOverloading;

public class SeventhQuestion {
    double overloadedMethod(double d){
        return d *= d;
    }
    int overloadedMethod(int i){

        return overloadedMethod(i *= i);
    }
    float overloadedMethod(float f){

        return overloadedMethod(f *= f);
    }
    public static void main(String[] args){
        SeventhQuestion s = new SeventhQuestion();
        System.out.println(s.overloadedMethod(100));
    }
}
