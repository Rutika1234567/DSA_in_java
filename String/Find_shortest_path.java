

// ques: Given a route containing 4 direction find shortest path to reachdestination
public class Find_shortest_path {
    
     public static int get_shortest_path(String path){
        int x=0,y=0;
        
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //north
            else if(dir=='N'){
                y++;
            }
            //east
            else if(dir=='E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }
         int x2=x*x;
         int y2=y*y;
         return (int)Math.sqrt(x2+y2);
     }
    public static void main(String[] args) {
       String path="WNEENESENNN";
       System.out.println(get_shortest_path(path));
    }
}
