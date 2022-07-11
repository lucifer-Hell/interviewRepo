package Contests.Leetcode.Weekly.Contest_301;

import java.util.TreeSet;

class SmallestInfiniteSet {

    private TreeSet<Integer> set;

    public SmallestInfiniteSet() {
        set=new TreeSet<>();
        for(int i=1;i<=1000;i++)
            set.add(i);
    }

    public int popSmallest() {
       return (!set.isEmpty())?set.pollFirst():-1; // O(log(n))
    }

    public void addBack(int num) {
        set.add(num);   // O(log(n))
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */