public class PrintStack {
    public static void printStack(Stack stack1, Stack stack2, Stack stack3) {
        Node current1 = stack1.getTop();
        Node current2 = stack2.getTop();
        Node current3 = stack3.getTop();

        System.out.println("P.1\t\tP.2\t\tP.3");

        while (current1 != null || current2 != null || current3 != null) {
            String data1 = (current1 != null) ? current1.getInformation().toString() : " ";
            String data2 = (current2 != null) ? current2.getInformation().toString() : " ";
            String data3 = (current3 != null) ? current3.getInformation().toString() : " ";

            System.out.println(data1 + "\t\t" + data2 + "\t\t" + data3);

            if (current1 != null) current1 = current1.getNext();
            if (current2 != null) current2 = current2.getNext();
            if (current3 != null) current3 = current3.getNext();
        }
    }
}
