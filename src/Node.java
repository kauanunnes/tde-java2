public class Node {
    private Integer information;
    private Node next;

    public Node(Integer information) {
        this.information = information;
        this.next = null;
    }

    public Integer getInformation() {
        return information;
    }

    public Node getNext() {
        return next;
    }

    public void setInformation(Integer information) {
        this.information = information;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
