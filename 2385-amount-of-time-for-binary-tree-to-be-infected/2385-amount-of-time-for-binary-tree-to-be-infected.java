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

class Solution {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    public void treeGraph(TreeNode root, int parent){
        if(root == null)
            return;
        
        while(adjList.size() <= root.val)
            adjList.add(new ArrayList<>());
        
        if(parent != -1){
            adjList.get(parent).add(root.val);
            adjList.get(root.val).add(parent);
        }

        if(root.left != null){
            while(adjList.size() <= root.left.val){
                adjList.add(new ArrayList<>());
            }

            adjList.get(root.val).add(root.left.val);
            adjList.get(root.left.val).add(root.val);

        }

        if(root.right != null){
            while(adjList.size() <= root.right.val){
                adjList.add(new ArrayList<>());
            }

            adjList.get(root.val).add(root.right.val);
            adjList.get(root.right.val).add(root.val);

        }

        


        treeGraph(root.left, root.val);
        treeGraph(root.right, root.val);
    }
    public int amountOfTime(TreeNode root, int start) {
        
        treeGraph(root, -1);
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> vis = new HashSet<>();
        q.offer(start);
        vis.add(start);
        int min= 0;
        while(!q.isEmpty()){
            int level = q.size();
            for(int i = 0; i < level; i++){
                int curr = q.poll();
                for(int adj: adjList.get(curr)){
                    if(!vis.contains(adj)){
                        q.offer(adj);
                        vis.add(adj);
                    }
                }
            }
            min++;
        }


        return min-1;
        
    }
}