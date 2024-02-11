package LeetCode.P1_10;

public class problem2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder lista1 = numeroString(l1);
        StringBuilder lista2 = numeroString(l2);

        int num1 = numeroReverso(lista1);
        int num2 = numeroReverso(lista2);
        int resultNum = num1 + num2;

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

    public static int numeroReverso(StringBuilder lista){
        StringBuilder num = new StringBuilder();

        for(int i = lista.length() -1; i >= 0; i--){
            num.append(lista.charAt(i));
        }

        return Integer.parseInt(num.toString());
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
