package LeetCode.P1_10;

import java.math.BigInteger;
/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

 */

public class problem2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder lista1 = numeroString(l1);
        StringBuilder lista2 = numeroString(l2);

        BigInteger num1 = numeroReverso(lista1);
        BigInteger num2 = numeroReverso(lista2);
        BigInteger resultNum = num1.add(num2);

        StringBuilder result = new StringBuilder(String.valueOf(resultNum));
        return SbToListNode(result);

    }

    public static ListNode SbToListNode(StringBuilder string){
        ListNode nodeAtual = new ListNode(Integer.parseInt(String.valueOf(string.charAt(string.length()-1))));
        ListNode primeiroNode = nodeAtual;
        for(int i = string.length() - 2; i >= 0; i--){
            nodeAtual.next = new ListNode(Integer.parseInt(String.valueOf(string.charAt(i))));
            nodeAtual = nodeAtual.next;
        }
        return primeiroNode;
    }

    public static BigInteger numeroReverso(StringBuilder lista){
        StringBuilder num = new StringBuilder();

        for(int i = lista.length() -1; i >= 0; i--){
            num.append(lista.charAt(i));
        }

        return new BigInteger(num.toString());
    }


    public static StringBuilder numeroString(ListNode list){
        StringBuilder nums = new StringBuilder();
        ListNode nodeAtual = list;

        while (true) {
            nums.append(String.valueOf(nodeAtual.val));
            if(nodeAtual.next == null){
                break;
            }
            nodeAtual = nodeAtual.next;
        }

        return nums;
    }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
