

public class String_compression {
    public static String compress(String s){
         String news="";
         for(int i=0;i<s.length();i++){
            Integer count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
           news +=s.charAt(i);
           if(count>1){
            news +=count.toString();
           }
         }
        return news;
    }
    
    public static void main(String[] args) {
        String s="aannnbbbss";
        System.out.println(compress(s));
    }
}
