class GfG
{
    Node merge(Node a, Node b){
        Node res = new Node(-1);
        Node temp = res;
        
        while(a!=null && b!=null){
            if(a.data<b.data){
                temp.bottom = a;
                a = a.bottom;
            }
            else{
                temp.bottom = b;
                b = b.bottom;
            }
            
            temp = temp.bottom;
        }
        
        while(a!=null){
            temp.bottom = a;
            a = a.bottom;
            temp = temp.bottom;
        }
        
        while(b!=null){
            temp.bottom = b;
            b = b.bottom;
            temp = temp.bottom;
        }
        
        res = res.bottom;
        res.next = null;
        return res;
    }
    
    
    Node flatten(Node root)
    {
	    if(root==null || root.next==null){
	        return root;
	    }
	    
	    root.next = flatten(root.next);
	    
	    root = merge(root, root.next);
	    
	    return root;
    }
}