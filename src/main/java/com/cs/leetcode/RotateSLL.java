package com.cs.leetcode;

public class RotateSLL {
    public static void main(String[] args) {
        //ListNode head=createSLL(new int[]{1,2,3,4,5});
        ListNode head=createSLL(new int[]{1,2});
        print(head);
        ListNode headRR=rotateRight(head,1);
        print(headRR);
    }

    private static ListNode rotateRight(ListNode head, int k) {

        if(head==null || k==0){
           return head;
        }
        ListNode pnt=head;

        int count=0;
        while(pnt!=null){
            count++;
            pnt=pnt.next;
        }


        //System.out.println( k+ " "+ count);
        if(count!=0)
            k=k%count;
        //System.out.println( k+ " "+ count);
        if(k==count || k==0 )
            return head;
        //System.out.println( k+ " "+ count);
        int rem=count-k-1;
        pnt=head;
        while(rem>0){
            System.out.println(pnt.val);
            rem--;
            pnt=pnt.next;
        }
        ListNode temp=pnt.next;
        pnt.next=null;
        pnt=temp;
        while(pnt.next!=null){
            pnt=pnt.next;
        }
        pnt.next=head;
        head=temp;
        //print(head);


        return head;
    }

    private static void print(ListNode head) {
        ListNode pnt=head;
        while(pnt!=null) {
            System.out.print(pnt.val+" ");
            pnt=pnt.next;
        }
        System.out.println();
    }

    private static ListNode createSLL(int[] ints) {
        if(ints.length==0)
            return null;
        ListNode head=new ListNode(ints[0],null);
        if(ints.length==1)
            return head;
        ListNode pnt=head;
        for (int i=1;i<ints.length;i++){

            ListNode tmp=new ListNode(ints[i],null);
            pnt.next=tmp;
            pnt=pnt.next;

        }
        return head;
    }
}
