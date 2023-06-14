public class IntNode {
    private int dataVal;
    private IntNode nextNodePtr;

    public IntNode() {
        dataVal = 0;
        nextNodePtr = null;
    }
  
    // Constructor
    public IntNode(int dataInit) {
        this.dataVal = dataInit;
        this.nextNodePtr = null;
    }
  
    // Constructor
    public IntNode(int dataInit, IntNode nextLoc) {
        this.dataVal = dataInit;
        this.nextNodePtr = nextLoc;
    }

    public void insertAfter(IntNode nodeLoc) {
        IntNode tmpNext;
  
        tmpNext = this.nextNodePtr;
        this.nextNodePtr = nodeLoc;
        nodeLoc.nextNodePtr = tmpNext;
    }
  
    // Get location pointed by nextNodePtr
    public IntNode getNext() {
        return this.nextNodePtr;
    }
  
    // Get node value
    public int getNodeData() {
        return this.dataVal;
    }
     
    // Print node value
    public void printNodeData() {
        System.out.println(this.dataVal);
    }
}