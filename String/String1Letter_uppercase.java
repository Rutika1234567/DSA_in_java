
public class String1Letter_uppercase {
    public static String upp(String s){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(s.charAt(0));
        
        sb.append(ch);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' ' && i<s.length()){
                sb.append(s.charAt(i));  //empty space copy
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="hi, i am rutika parekar";
        System.out.println(upp(s));
    }
}
