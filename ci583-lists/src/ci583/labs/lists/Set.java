package ci583.labs.lists;

public class Set extends LinkedCollection{

    public void insert(int data){
        Node n = new Node(data);
        if (_head == null){
            _head = n;
            return;
        }
        Node last = _head;
        Node prev = null;
        while (last != null){
            if (last.data == data) {
                return;
            } else if(last.next == null) {
                last.next = n;
                return;
            }
            prev = last;
            last = last.next;
        }
    }

    public Set union(Set s2) {
        Set unified = new Set();
        Node n = _head;
        while (n != null){
            unified.insert(n.data);
            n = n.next;
        }
        n = s2._head;
        while (n != null){
            unified.insert(n.data);
            n = n.next;
        }
        return unified;

    }

    public Set intersection (Set s2) {
        Set s3 = new Set();
        Node n = _head;
        while (n != null){
            if (s2.member(n.data)){
                s3.insert(n.data);
            }
            n = n.next;

        }
        return s3;

    }

    public Set difference (Set s2) {
        Set s3 = new Set();
        Node n = _head;
        while (n != null){
            if (!s2.member(n.data)){
                s3.insert(n.data);
            }
            n = n.next;

        }
        return s3;
    }




    public boolean equals(Object o) {
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

    /* Check if o is an instance of Set or not
      "null instanceof [type]" also returns false */
        if (!(o instanceof Set)) {
            return false;
        }

        // typecast o to Set so that we can compare it to this
        Set s2 = (Set) o;

        //check that the two sets are the same length
        if(this.length() != s2.length()) {
            return false;
        }

        //loop through the current set and check that every element is an element of the other set
        Node n = _head;
        while(n != null) {
            if(!s2.member(n.data)) {
                return false;
            }
            n = n.next;
        }
        return true;
    }


    }








