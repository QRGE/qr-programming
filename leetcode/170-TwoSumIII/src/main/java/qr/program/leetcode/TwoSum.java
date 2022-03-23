package qr.program.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/two-sum-iii-data-structure-design/"> 两数之和III </a>
 */
class TwoSum {

    private final HashMap<Integer, Integer> map;

    public TwoSum() {
        this.map = new HashMap<>();
    }

    public void add(int number) {
        if (this.map.containsKey(number))
            this.map.replace(number, this.map.get(number) + 1);
        else
            this.map.put(number, 1);
    }

    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : this.map.entrySet()) {
            int complement = value - entry.getKey();
            if (complement != entry.getKey()) {
                if (this.map.containsKey(complement))
                    return true;
            } else {
                // 这里需要 value >= 2 (即查找另一个数)
                if (entry.getValue() > 1)
                    return true;
            }
        }
        return false;
    }
}