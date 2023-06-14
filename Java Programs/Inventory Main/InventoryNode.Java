public class InventoryNode {
    private String item;
    private int numberOfItems;
    private InventoryNode nextNodeRef;

    public InventoryNode() {
        item = "";
        numberOfItems = 0;
        nextNodeRef = null;
    }

    public InventoryNode(String itemInit, int numberOfItemsInit) {
        this.item = itemInit;
        this.numberOfItemsInit = numberOfItemsInit;
        this.nextNodeRef = null;
    }

    public InventoryNode(String itemInit, int numberOfItemsInit, InventoryNode nextLoc) {
        this.item = itemInit;
        this.numberOfItems = numberOfItemsInit;
        this.nextNodeRef = nextLoc;
    }

    public void insertAtFront(InventoryNode headNode, InventoryNode currNode) {
        if (currNode == null || headNode == null)
        return;
        currNode.nextNodeRef = headNode.nextNodeRef;
        headNode.nextNodeRef = currNode;
    }

    public InventoryNode getNext() {
        return this.nextNodeRef;
    }

    public void printNodeData() {
        System.out.println(this.numberOfItems + " " + this.item);
    }
}