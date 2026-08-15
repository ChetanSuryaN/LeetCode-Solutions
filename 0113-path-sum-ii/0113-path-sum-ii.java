/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) 
    {
        create(root,new ArrayList<>(),targetSum,0);
        return list;        
    }
    public void create(TreeNode root,List<Integer> list1,int targetSum,int sum)
    {
        if(root==null)
        {
            return ;
        }
        sum+=root.val;
        list1.add(root.val);
        if(root.right==null&&root.left==null&&sum==targetSum)
        {
            list.add(new ArrayList<>(list1));
        }
        create(root.left,list1,targetSum,sum);
        create(root.right,list1,targetSum,sum);
         
    list1.remove(list1.size() - 1);      
    }
}