public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList();
        if (rowIndex == 0){
            res.add(1);
            return res;
        }
        if (rowIndex == 1){
            res.add(1);res.add(1);
            return res;
        }
        List<Integer> last = new ArrayList(rowIndex);
        last.set(0,1);last.set(1,1);
        List<Integer> cur = new ArrayList(rowIndex);
        cur.set(0, 1);cur.set(1,1);
        int count = 2;
        while(count <= rowIndex){
            for(int ix = 1; ix < count; ++ix)
                cur.set(ix,  last.get(ix-1) + last.get(ix));
            List<Integer> tmp = last;
            last = cur;
            cur = tmp;
            count--;
        }
        return last;
        
    }
}