/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
       RandomListNode dummyHead = new RandomListNode(0);
          RandomListNode p = dummyHead, cur = head;
          Map<RandomListNode, RandomListNode> map = new HashMap();                                                         
   
          while (cur != null){
              p.next = new RandomListNode(cur.label);
              map.put(cur, p.next);
              p = p.next; cur = cur.next;
          }   
          cur = head;
          p = dummyHead;
          while(cur!= null){
              p.next.random = map.get(cur.random);
              p = p.next; cur = cur.next;
          }   
          return dummyHead.next;
       
    }
}