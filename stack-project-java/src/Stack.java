
public class Stack {

    Node refNodeJoinStack = null; 


    public Stack(){

        this.refNodeJoinStack = null; 
    }


    public Node top(){

        return refNodeJoinStack;
    }


    public void push(Node newNode){

        Node refAssistent = refNodeJoinStack;
        refNodeJoinStack = newNode;
        refNodeJoinStack.setRefNode(refAssistent);

    }


    public Node pop(){
        if(!this.isEmpty()){
            Node nodePoped = refNodeJoinStack;
            refNodeJoinStack = refNodeJoinStack.getRefNode();
            return nodePoped;
        }else{
            return null; 
        }

    }


    public boolean isEmpty(){
        if(refNodeJoinStack == null){
            return true; 
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        
        String StringReturn = "--------------\n";
        StringReturn += "   Stack   \n";
        StringReturn += "--------------\n";

        Node nodeAssistent = refNodeJoinStack;

        while(true){
            if(nodeAssistent != null){
                StringReturn += "[Node{dado: " + nodeAssistent.getDado() + "}]\n";
                nodeAssistent = nodeAssistent.getRefNode();
            }else{
                break;
            }
           
        }

        StringReturn += "\n==============";
        return StringReturn; 


    }



    



}
