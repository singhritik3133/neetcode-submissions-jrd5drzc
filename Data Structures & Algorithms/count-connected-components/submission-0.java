class Solution {
    
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        boolean [] visitedList=new boolean[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int []edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int count=0;

        for(int node=0;node<n;node++){
            if(!visitedList[node]){
                bfs(node,adj,visitedList);
                count++;
            }
        }
        return count;

    }
    private void bfs(int node,List<List<Integer>> adj,boolean[] visitedList){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(node);
        visitedList[node]=true;

        while(!queue.isEmpty()){
            int curr=queue.poll();
            // res.add(curr);

            for(int neighbour:adj.get(curr)){
                if(!visitedList[neighbour]){
                    visitedList[neighbour]=true;
                    queue.add(neighbour);
                }
            }
                    
        }
    }
}
