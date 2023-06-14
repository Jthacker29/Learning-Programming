import java.util.Scanner;

public class MileageTrackerLinkedList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        MileageTrackerNode headNode;
        MileageTrackerNode currNode;
        MileageTrackerNode lastNode;

        double miles;
        String date;
        int i;
        int count;

        headNode = new MileageTrackerNode();
        lastNode = headNode;

        count = scnr.nextInt();

        for (i = 0; i < count; ++i) {
            miles = scnr.nextDouble();
            date = scnr.next();
            currNode = new MileageTrackerNode(miles, date);
            lastNode.insertAfter(currNode);
            lastNode = currNode;
        }

        currNode = headNode.getNext();
        for (i = 0; i < count; ++i) {
            currNode.printNodeData();
            currNode = currNode.getNext();
        }
    }
}