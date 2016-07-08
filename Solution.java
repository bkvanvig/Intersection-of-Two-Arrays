import java.util.*;
import java.io.*;
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<Integer>();
        Set<Integer> res = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++){
            if (!n1.contains(Integer.valueOf(nums1[i]))){
                n1.add(Integer.valueOf(nums1[i]));
            }
        }
        for (int i = 0; i < nums2.length; i++){
            if (n1.contains(Integer.valueOf(nums2[i])) && !res.contains(Integer.valueOf(nums2[i]))){
                res.add(Integer.valueOf(nums2[i]));
            }
        }
        int []sol = new int [res.size()];
        int ind = 0;
        for (Integer key : res){
            sol[ind++] = key.intValue();
        }
        return sol;
    }
}