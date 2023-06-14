public class ItemNode {
    private String item;
    private ItemNode nextNodeRef;

    public ItemNode() {
        item = "";
        nextNodeRef = null;
    }
  
    // Constructor                                                                                     
    public ItemNode(String itemInit) {
        this.item = itemInit;
        this.nextNodeRef = null;
    }
  
    // Constructor                                                                                     
    public ItemNode(String itemInit, ItemNode nextLoc) {
        this.item = itemInit;
        this.nextNodeRef = nextLoc;
    }

    public void insertAfter(ItemNode nodeLoc) {
        ItemNode tmpNext;
  
        tmpNext = this.nextNodeRef;
        this.nextNodeRef = nodeLoc;
        nodeLoc.nextNodeRef = tmpNext;
    }

    public void insertAtEnd(ItemNode headNode, ItemNode currNode) {
        ItemNode tmpNext;
        tmpNext = headNode;

        if (tmpNext = null) {
            headNode = currNode;
        } else {
            while (tmpNext.getNext() != null) {
                tmpNext = tmpNext.getNext();
            }
        tmpNext.nextNodeRef = currNode;
        }
    }

    public ItemNode getNext() {
        return this.nextNodeRef;
    }

    public void printNodeData() {
        System.out.println(this.item);
    }
}