import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String in = "Hhheelo WworRld!";

        //System.out.println(in.chars().distinct().mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining()));
        
        StringBuilder res = new StringBuilder();
        char prev = in.charAt(0);
        res.append(prev);
        for (int i = 1; i < in.length(); i++){
            if(Character.toLowerCase(in.charAt(i)) != Character.toLowerCase(prev))
                res.append(in.charAt(i));
            prev = in.charAt(i);
        }
        System.out.println(res);
    }

}
