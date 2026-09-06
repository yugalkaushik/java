class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        unordered_map<int,int> umap;
        for(int i=0;i<nums.size();i++){
            int curr = target - nums[i];
            if(umap.find(curr)!=umap.end()){
                result.push_back(umap[curr]);
                result.push_back(i);
            }
            umap[nums[i]] = i;
        }
        return result;
    }
};