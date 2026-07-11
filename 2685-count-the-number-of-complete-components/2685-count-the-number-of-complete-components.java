import java.util.*;
class Solution
{
    public int countCompleteComponents(int n,int[][]edges){
        List<Integer>[] adj=(List<Integer>[])new ArrayList[n];
        for(int i=0;i<n;i++)
        adj[i]=new ArrayList<>();
        for(int [] e: edges){
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        boolean[] vis=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(vis[i]) continue;
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            vis[i]=true;
            int v=0,e=0;
            while(!q.isEmpty
            ())
            {
                int curr=q.poll();
                v++;
                e+=adj[curr].size();
                for(int neighbor : adj[curr]){
                    if(!vis[neighbor]){
                        vis[neighbor]=true;
                        q.add(neighbor);
                    }
                }
            }
            if(e==v*(v-1))ans++;
        }
        return ans;
                    }
                }
            
        
