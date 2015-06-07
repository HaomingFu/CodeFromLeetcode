/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap();
        Queue<UndirectedGraphNode> q = new LinkedList();                                     
        q.add(node);
        UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
        map.put(node, copy);
        while(!q.isEmpty()){
           UndirectedGraphNode cur= q.poll();
           for(UndirectedGraphNode neigh : cur.neighbors){
               if (map.containsKey(neigh)){
                   map.get(cur).neighbors.add(map.get(neigh));
               }else{
                   UndirectedGraphNode neighCopy = new UndirectedGraphNode(neigh.label);
                   map.get(cur).neighbors.add(neighCopy);
                   map.put(neigh, neighCopy);
                   q.add(neigh);
               }   
           }
        }   
            
        return copy;
        
    }
}