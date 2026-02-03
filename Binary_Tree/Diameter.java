public class Diameter {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
          if(root==null){
            return 0;
          }
        int lh=height(root.left);

        int rh=height(root.right);
        int max=Math.max(lh,rh)+1;
        return max;

    }
    public static int diameter(Node root){ //O(n^2)
       if(root==null){
        return 0;
       }
       int leftd=diameter(root.left);
       int rightd=diameter(root.left);
       int lh=height(root.left);
       int rh=height(root.right);
       int selfm=lh+rh+1;

       return Math.max(selfm,Math.max(rightd, leftd));
    }
   static class Info{
         int dia;
         int ht; 
        public Info(int dia,int ht){
              this.dia=dia;
              this.ht=ht;
         }
    }
    public static Info diameter2(Node root){
            if(root==null){
                return new Info(0,0);
            }

           Info lInfo=diameter2(root.left);
           Info rInfo=diameter2(root.right);

           int dia=Math.max(Math.max(rInfo.dia,lInfo.dia), lInfo.ht+rInfo.ht+1);

           int ht=Math.max(lInfo.ht, rInfo.ht)+1;
            return  new Info(dia,ht);
         }
  public static void main(String[] args) {
     Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        //System.out.println("The diameter is "+diameter(root));
         System.out.println("The diameter is "+diameter2(root).dia);
  }  
}
