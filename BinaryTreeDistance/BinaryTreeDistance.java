/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeDistance {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        
        List<Integer> nodeList = new ArrayList<Integer>();
        findFromChild(target,K,nodeList);
        findfromroot(root,target,K,nodeList);

        return nodeList;
        
    }
    private static int findfromroot(TreeNode root, TreeNode target,int k, List<Integer> nodeList)
    {
        if(root == null) return -1;
        if(root == target) return 1;

        int dis1 = findfromroot(root.left,target,k,nodeList);

        if(dis1>=0)
        {
            if(dis1==k)
            {
                nodeList.add(root.val);
            }
            else
            {
                findFromChild(root.right,k-dis1-1,nodeList);
            }
            return dis1+1;
        }
        int dis2=findfromroot(root.right,target,k,nodeList);
        if(dis2>=0){
            if(dis2==k){
                nodeList.add(root.val);
            } else{
                findFromChild(root.left,k-dis2-1,nodeList);
            }
            return dis2+1;
        }
        return -1;




    }

    private static void findFromChild(TreeNode target, int k,List nodeList)
    {
       if(target==null) return;
        if(k==0)
        {
            nodeList.add(target.val);
            return;
        }
        findFromChild(target.left,k-1,nodeList);
        findFromChild(target.right,k-1,nodeList);

    }
}