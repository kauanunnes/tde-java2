import java.util.Random;

public class Stack {

    private Node top;

    public Stack() {
        top = null;
    }

    public Node getTop() {
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void insertAllStack(int length) {
        int count = 0;
        while(count < length) {
            Random random = new Random();
            int data = random.nextInt(100) + 1;
            insert(data);
            count++;
        }
    }

    public void insert(Integer data) {
        Node novoNode = new Node(data);
        novoNode.setNext(top);
        top = novoNode;
    }

    public void insertDescending(Integer data) {
        Node novoNode = new Node(data);
        Stack stackTemp = new Stack();

        while (!isEmpty() && data >= top.getInformation()) {
            stackTemp.insert(remove());
        }
        novoNode.setNext(top);
        top = novoNode;

        while (!stackTemp.isEmpty()) {
            insert(stackTemp.remove());
        }
    }


    public void insertCrescent(Integer data) {
        Node novoNode = new Node(data);
        Stack stackTemp = new Stack();

        while (!isEmpty() && data <= top.getInformation()) {
            stackTemp.insert(remove());
        }
        novoNode.setNext(top);
        top = novoNode;

        while (!stackTemp.isEmpty()) {
            insert(stackTemp.remove());
        }
    }

    public Integer remove() {
        if (isEmpty()) {
            System.out.println("\nA pilha esta vazia\n");
            return null;
        } else {
            Integer removed = top.getInformation();
            top = top.getNext();
            return removed;
        }
    }

    public boolean isCrescent(Stack stackTest) {
        Node current = top;
        while (!isEmpty()) {
            if (current.getInformation() >= current.getNext().getInformation()) {
                stackTest.insert(remove());
            }else {
                while (!stackTest.isEmpty()) {
                    insert(stackTest.remove());
                }
                return false;
            }
        }
        while (!stackTest.isEmpty()) {
            insert(stackTest.remove());
        }
        return true;
    }

    public boolean isDescending(Stack stackTest) {
        Node current = top;
        while (!isEmpty()) {
            if (current.getInformation() <= current.getNext().getInformation()) {
                stackTest.insert(remove());
            }else {
                while (!stackTest.isEmpty()) {
                    insert(stackTest.remove());
                }
                return false;
            }
        }
        while (!stackTest.isEmpty()) {
            insert(stackTest.remove());
        }
        return true;
    }
}
