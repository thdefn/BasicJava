package datastructure.linear;

import java.util.List;

/*
연결리스트
-데이터를 링크로 연결해서 관리하는 자료구조
-자료의 순서는 정해져 있지만, 메모리의 연속성이 보장되지는 않음
    :배열은 연속된 공간에 데이터가 들어 있다

연결 리스트의 장점
-데이터 공간을 미리 할당할 필요 없음
-즉, 리스트의 길이가 가변적이라 데이터 추가/삭제 용이
    :구현 관점이 아닌, 컴퓨터의 메모리 관리 측면에서 용이

연결 리스트의 단점
-연결 구조를 위한 별도 데이터 공간 필요
    :다음 데이터의 위치가 어딘지 링크로 연결한다
-연결 정보를 찾는 시간이 필요(접근 속도가 상대적으로 느림)
-데이터 추가, 삭제 시 앞뒤 데이터의 연결을 재구성하는 작업 필요 :코딩 관점

연결 리스트 기본 구조
-노드 :데이터 저장 단위로, 값과 포인터로 구성
-가장 처음 위치하는 노드를 헤드, 가장 끝에 있는 노드를 테일

연결 리스트 기본 연산
-데이터 추가
    :데이터 추가 위치(head, 중간, tail)에 따른 연결 작업 필요
    :ex) 가장 앞에 추가 1.추가할 데이터를 담을 노드 생성 2.링크 연결 작업 3.head 이전 작업
    :ex) 가장 끝에 추가 1.추가할 데이터를 담을 노드 생성 2.head로부터 끝 노드까지 순회 (더 이상 가르키는 애가 없을 때까지) 3.링크 연결 작업
    :ex) 중간에 추가 1.추가할 데이터를 담을 노드 생성 2.head로부터 데이터 추가 위치 직전 노드까지 순회 3.링크 연결 작업
-데이터 삭제
    :데이터 삭제 위치(head, 중간, tail)에 따른 연결 작업 필요
    :ex) 가장 앞에 삭제 1.삭제 대상 노드 지정 (delete_node) 2.head 이전 작업 3.delete_node 삭제
        JAVA는 가비지 컬랙션 기능으로 더 이상 해당 메모리를 레퍼런스 하고 있는 애가 없으면 자동으로 지워줌 > 헤드만 이전
    :ex) 가장 끝에 삭제 1.head로 부터 가장 끝까지 순회 2.끝 노드 삭제 3.삭제 이전 노드의 링크 처리
    :ex) 중간 삭제 1.head로부터 삭제 대상 노드까지 순회 및 해당 노드 지정 (delete_node) 2.삭제 대상 이전/이후 노드의 링크 연결 작업 3.delete_node 삭제
* */
class Node{
    int data;
    Node next;

    Node(){}

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class LinkedList {
    Node head;

    LinkedList(){}

    LinkedList(Node node){
        this.head = node;
    }

    //연결 리스트 비어 있는지 확인
    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }

    //연결 리스트의 맨 뒤에 데이터 추가
    public void addData(int data){
        if(this.head == null){
            this.head = new Node(data, null);
        }else{
            Node cur = this.head;
            while (cur.next != null){ //next가 존재할때까지만 while문
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }

    //연결 리스트이 맨 뒤의 데이터 삭제
    public void removeData(){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return;
        }

        //마지막 노드를 지우고 그 앞의 노드의 링크를 null 처리
        Node cur = this.head;
        Node prev = cur;

        while (cur.next!=null){
            prev = cur;
            cur = cur.next;
        }

        if(cur == this.head){
            this.head = null;
        }else{
            prev.next = null;
        }
    }

    //연결 리스트에서 데이터 찾기
    public void findData(int data){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        while (cur!=null){
            if(cur.data==data){
                System.out.println("Data exist");
                return;
            }
            cur=cur.next;
        }
        System.out.println("Data not found");
    }

    //연결 리스트의 모든 데이터 출력
    public void showData(){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node cur = this.head;
        while (cur!=null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList(new Node(1, null));
        myList.showData();      // 1

        myList.addData(2);
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
        myList.showData();      // 1 2 3 4 5

        myList.findData(3);     // Data exist!
        myList.findData(100);   // Data not found!

        myList.removeData();
        myList.removeData();
        myList.removeData();
        myList.showData();      // 1 2

        myList.removeData();
        myList.removeData();
        myList.removeData();    // List is empty
    }
}

