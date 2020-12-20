package exercise11;

public class LinkedQueue {
    private Node frontNode;
    private Node backNode;

    public boolean isEmpty() {
        return frontNode == null;
    }

    public void offer(String data) {
        Node nextNode = new Node(data);
        if(isEmpty()){
          frontNode= nextNode;
          backNode= nextNode;
        }else{
         backNode.setNextNode(nextNode);
         backNode = nextNode;
        }
    }

    public String poll() {
        if(isEmpty()){
          System.out.println("The Queue is empty");
          return null;
        }
        String data = frontNode.getData();
        frontNode = frontNode.getNextNode();
        return data;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(frontNode);
    }
}
