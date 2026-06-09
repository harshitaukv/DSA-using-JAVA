void deleteFromBeginning() {

        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;	
        }
    }

    void deleteFromEnd() {

        if (tail == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void deleteFromPosition(int position) {

        if (position == 1) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp == tail) {
            deleteFromEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

}

