class num_even_numOfdigit{
          public static int digit(int arr[]){
            int d=0;
            for(int i=0;i<arr.length;i++){
                int num=arr[i];
                int c=0;
                while(num>0){
                     c++;
                     num=num/10;
                }
                if(c%2==0){
                    d++;
                }
            }
            return d;
          }
    public static void main(String[] args) {
        int arr[]={11,123,355,8976,11,123097,55,8976};
           System.out.println(digit(arr));
    }
}