package Chapter16.exercise8;

public class LinkedIntList
{
    /*
        Write a method called hasTwoConsecutive that returns whether or not a list of integers has two adjacent
        numbers that are consecutive integers (true if such a pair exists and false otherwise). For example, if a variable
        list stores the values [1, 18, 2, 7, 8, 39, 18, 40], then the call list.hasTwoConsecutive() should
        return true because the list contains the adjacent numbers (7, 8), which are a pair of consecutive numbers.
   */

    private ListNode front;

    //  Exercise 8 ////////////////////////////////////////////////////////
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
    ////////////////////////////////////////////////////////

    public LinkedIntList()
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
