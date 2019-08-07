// The maximum depth is the number of nodes along the longest path from the root node down to the farthest node that has no childern.

// A leaf is a node that doesn't have any children. 

// MaxDepth is a function that returns exactly what the question asks. 

public int maxDepth(TreeNode root) {
    if(root==null)
        return 0;
 
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);
 
    int bigger = Math.max(leftDepth, rightDepth);
 
    return bigger+1;
}

// The below is a solution that does not utilize the above MaxDepth() and does it manually.

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;             // edge case
	Deque<TreeNode> dq = new ArrayDeque<>();    // array that grows and allows users to add or remove an element from both                                             // the sides of the queue
        int depth = 0, next = 0;
        TreeNode cur;
        dq.offer(root);
        
        while (!dq.isEmpty()) {
            depth++;
            next = dq.size();
            for (int i = 0; i < next; ++i) {
                cur = dq.poll();                // poll returns and removes the element at the front 
                if (cur.left != null) dq.offer(cur.left);
                if (cur.right != null) dq.offer(cur.right);
            }
        }
        return depth;
    }
}