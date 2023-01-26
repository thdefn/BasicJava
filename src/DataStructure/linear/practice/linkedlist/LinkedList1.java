package DataStructure.linear.practice.linkedlist;
/*
* 단방향 연결 리스트에서 중복 데이터를 찾아 삭제하세요
* */

public class LinkedList1 {
    //listAfter에 listBefore 데이터를 넣는데 데이터를 넣을 때 listAfter에 이전에 같은 데이터가 들어가지 않았는지 체크
    public static LinkedList removeDup(LinkedList listBefore){
        LinkedList listAfter = new LinkedList();
        Node cur = listBefore.head;
        while (cur!=null){
            if(listAfter.findData(cur.data) == false){
                listAfter.addData(cur.data);
            }
            cur = cur.next;
        }
        return listAfter;
    }

    public static LinkedList answer(LinkedList listBefore){
        Node cur = listBefore.head;
        Node prev = cur;

        while (cur!=null){
            Boolean isRemove=false;
            Node node = listBefore.head;
            while (!node.equals(cur)){
                if(node.data == cur.data){
                    isRemove = true;
                    if(cur.next == null){
                        prev.next = null;
                    }else{
                        prev.next = cur.next;
                    }
                    break;
                }
                node = node.next;
            }
            if(isRemove){
                //데이터 삭제시 prev 노드는 변경되지 않음
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        return listBefore;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addData(1);
        linkedList.addData(3);
        linkedList.addData(3);
        linkedList.addData(4);
        linkedList.addData(2);
        linkedList.addData(4);
        linkedList.addData(2);
        linkedList.showData();

        linkedList = removeDup(linkedList);
        linkedList.showData();
    }
}
