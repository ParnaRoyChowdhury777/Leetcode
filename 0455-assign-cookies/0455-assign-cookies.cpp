class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.rbegin(), g.rend());
        sort(s.rbegin(), s.rend());
        int total = 0, curr = 0;
        int m = g.size();
        int n = s.size();
        for(int i=0; i<m; i++)
        {
            if(curr<n && g[i]<=s[curr])
            {
                curr++;
                total++;
            }    
        } 
        return total;    
    }
};