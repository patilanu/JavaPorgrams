package Java8_Features;


import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {
    public static void main(String[] args)
    {
       /* Stream.of("Java","Programming","Johnson","IPO")
                .filter((String str) -> str.startsWith("J"))
                .forEach(System.out::println);*/

        String[] words = new String[10];
        Optional<String> checkNull
                = Optional.of(words[5] = "StringClass");
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
}


