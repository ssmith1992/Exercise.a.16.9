package Chapter16.exercise8;

/*
Write a method called switchPairs that switches the order of values in the list in a pairwise fashion. Your method
should switch the order of the first two values, then switch the order of the next two, switch the order of the next
two, and so on. If the list contains an odd number of values, the final element is not moved. For example, if the list
initially stores [10, 25, 31, 47, 52, 68, 77], your method should switch the first pair (10 and 25), the second
pair (31 and 47), and the third pair (52 and 68) to yield [25, 10, 47, 31, 68, 52, 77].
 */
public class Exercise8 {

    private ListNode front;

    public boolean hasTwoConsecutive()
    {
        if (this.front == null) return false;
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                if (current.getData() == (current.next.getData()-1)) return true;
                current = current.next;
            }
            return false;
        }
    }

    public Exercise8()
    {
        this.front = null;
    }

    public void add(int value)
    {
        if(this.front == null)
            this.front = new ListNode(value);
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }

    @Override
    public String toString()
    {
        if (this.front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.getData();
            ListNode current = this.front.next;

            while (current != null)
            {
                result += ", " + current.getData();
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
}
