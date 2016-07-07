import java.util.*;
import java.io.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> n1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> res = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++){
            if (!n1.containsKey(Integer.valueOf(nums1[i]))){
                n1.put(nums1[i], 0);
            }
        }
        for (int i = 0; i < nums2.length; i++){
            if (n1.containsKey(Integer.valueOf(nums2[i])) && !res.containsKey(Integer.valueOf(nums2[i]))){
                res.put(nums2[i], 0);
            }
        }
        int []sol = new int [res.size()];
        int ind = 0;
        Set<Integer> keys = res.keySet();
        for (Integer key : keys){
            sol[ind++] = key.intValue();
        }
        return sol;
    }
}