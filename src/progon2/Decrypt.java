package progon2;

import java.util.*;
import java.io.*;

public class Decrypt {

    public static void main(String[] args) {
        List<List<String>> lists = List.of(
            List.of("SGUxMTExbC0tMGxvMjEyMy4uLi8v", "dzBvcjFsZA=="),
            List.of("aW4=", "dGgxMTExMjMyaXM="),
            List.of("YmVhdXQxMjNpZjMxMnVs", "ZGF5"));

        lists.stream().flatMap(Collection::stream).forEach(el -> System.out.println(
            new String(Base64.getDecoder().decode(el)).replaceAll("[^A-z]", "")));
    }

}
