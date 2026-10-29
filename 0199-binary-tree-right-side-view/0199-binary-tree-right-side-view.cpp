class Solution {
public:
    vector<int> rightSideView(TreeNode* root) {
        vector<int> res;

        if (root == nullptr) {
            return res;
        }

        queue<TreeNode*> qu;
        qu.push(root);

        while (!qu.empty()) {
            int level_size = qu.size();

            for (int i = 0; i < level_size; i++) {
                TreeNode* curr = qu.front();
                qu.pop();

                if (curr == nullptr) continue;

                // Last node at each level
                if (i == level_size - 1) {
                    res.push_back(curr->val);
                }

                if (curr->left != nullptr) {
                    qu.push(curr->left);
                }

                if (curr->right != nullptr) {
                    qu.push(curr->right);
                }
            }
        }

        return res;
    }
};