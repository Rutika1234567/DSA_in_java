class capital {
    public static boolean detectCapitalUse(String word) {
         int uppcount=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isUpperCase(c)){
                 uppcount++;
            }  
        }
         if(uppcount==word.length()){
            return true;
         }
         if(uppcount==0){
            return true;
         }
         if(uppcount==1 && Character.isUpperCase(word.charAt(0))){
            return true;
         }
         
      return false;
    }
    public static void main(String[] args) {
        String word="Hello";
          System.out.println(detectCapitalUse(word));
    }
}