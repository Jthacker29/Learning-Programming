public class CustomLinkedList {
    public static int findMax(IntNode headObj) {
        IntNode currObj = headObj.getNext();
        int max = headObj.getNodeData():

        if (currObj == null) {
            return -99;
        }

        while (currObj != null) {
            int compNum = currObj.getNodeData();
            if (compNum > max) {
                max = compNum;
            }
            currObj = currObj.getNext();
        }
        return max;
    }

    public static void main(String[] args) {
        IntNode headObj;
        IntNode currObj;
        IntNode lastObj;
        int i;
        int max;

        headObj = new IntNode(-1);
        lastObj = headObj;

        for (i = 0; i < 20; i++) {
            currObj = new IntNode(i);
            lastObj.insertAfter(currObj);
            lastObj = currObj;
        }

        max = findMax(headObj);
        System.out.println(max);
    }
}