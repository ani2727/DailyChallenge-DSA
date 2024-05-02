//Problem Link: http://surl.li/tjzle

//code
class Tree {
    public ArrayList<Integer> serialize(Node root) {
            ArrayList<Integer> arr=new ArrayList<>();
            
            Queue<Node> q=new LinkedList<>();    
            q.add(root);

            while(!q.isEmpty()){


                Node curr=q.remove();
                
                if(curr==null){
                    arr.add(-1);
                    continue;
                }


                    arr.add(curr.data);
                        q.add(curr.left);
                        q.add(curr.right);
                       
            }
          
            return arr;
            
            
    }
    


    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
        

       Queue<Node> q=new LinkedList<>();
       
       Node root=new Node(A.get(0));
       q.add(root);
       int idx=1;
       while(!q.isEmpty()){
           
           Node curr=q.poll();
           
           if(A.get(idx)!=-1){


               curr.left=new Node(A.get(idx));
               q.add(curr.left);


           }else{


               curr.left=null;
           }
           
           idx++;
           
           if(A.get(idx)!=-1){


               curr.right=new Node(A.get(idx));
               q.add(curr.right);


           }else{


               curr.right=null;


           }
           idx++; 
       }
       
       return root;
     
    }
};
