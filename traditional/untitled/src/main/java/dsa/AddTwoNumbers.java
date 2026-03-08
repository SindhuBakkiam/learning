package main.java.dsa;

public class AddTwoNumbers {

    public static void main(String[] args){
        ListNode node = new ListNode(9);
        ListNode node1 = new ListNode(9,node);
        ListNode node2 = new ListNode(9,node1);
        ListNode node3 = new ListNode(9,node2);
        ListNode node4 = new ListNode(9,node3);
        ListNode node5 = new ListNode(9,node4);
        ListNode node6 = new ListNode(9,node5);


        ListNode secondNode = new ListNode(9);
        ListNode secondNode1 = new ListNode(9,secondNode);
        ListNode secondNode2 = new ListNode(9,secondNode1);
        ListNode secondNode3 = new ListNode(9,secondNode2);


        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
         ListNode result = addTwoNumbers.addTwoNumbers(node6,secondNode3);

        while(result != null){
            System.out.println(result.val);
            result=result.next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentNode1=l1;
        ListNode currentNode2 = l2;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();

        while(currentNode1 != null || currentNode2 != null){
            stringBuffer.append(currentNode1==null?0: currentNode1.val);
            stringBuffer1.append(currentNode2==null?0: currentNode2.val);
            currentNode1 = currentNode1!=null?currentNode1.next:null;
            currentNode2 = currentNode2!=null?currentNode2.next:null;

        }

        String s1=stringBuffer.reverse().toString();
        String s2=stringBuffer1.reverse().toString();
        int i=s1.length()-1;
        int j = s2.length()-1;
        int carry=0;
        ListNode tempNode=null;
        ListNode currentNode=null;

        while(i>=0 && j>=0){
            int tempSum = Integer.valueOf(String.valueOf(s1.charAt(i))) + Integer.valueOf(String.valueOf(s2.charAt(j))) + carry;
            int sum=0;
                sum = tempSum>10? tempSum%10:tempSum==10?0:tempSum;
                carry = tempSum>10? tempSum/10:tempSum==10?1:0;


            if(tempNode==null) {
                tempNode = new ListNode(sum);
            }else{
                ListNode nxtNode = new ListNode(sum);
                if(currentNode==null){
                    tempNode.next=nxtNode;
                    currentNode=tempNode.next;
                }else{
                    currentNode.next=nxtNode;
                    currentNode=nxtNode;
                }

            }
            if(i==0){
                ListNode nxtNode = new ListNode(carry);
                currentNode.next=nxtNode;
                currentNode=nxtNode;

            }
                i--;
                j--;
        }

        return tempNode;
    }
}
