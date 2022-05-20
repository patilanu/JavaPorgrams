package Program_Practice;

public class StringRvs {
    public static void main(String[] args) {
        //Using StringBuffer
        String s= "StringBuffer";
        //converting String object to StringBuffer
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);

        //Using LOOP
        String s1 = "UsingLoop";
        int l = s1.length();  //get length
        while(l > 0){
            System.out.print(s1.charAt(l-1));
            l--;
        }
        //Using StringBuilder
        String s2 = "StringBuilder";
        StringBuilder sb1 = new StringBuilder();
        sb1.append(s2);
        sb1.reverse();
        System.out.println("\nReverse String : " +sb1);

        //Using ByteArray
        String s3 = "ByteArray";
        // getBytes() is inbuilt method  to convert string into bytes[].
        byte[] sByteArray = s3.getBytes();
        byte[] result = new byte[sByteArray.length];
        for(int i = 0; i < sByteArray.length; i++){
            result[i] = sByteArray[sByteArray.length-i-1];
        }
        System.out.println("\n Reverse String : " +new String(result));
    }
}
