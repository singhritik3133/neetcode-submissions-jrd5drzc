class Solution {
    private boolean[][]visited;
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        visited=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
        
    }
    private boolean dfs(char[][]board,String word,int index,int i,int j){
        if(index==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index) || visited[i][j]){
            return false;
        }
        // char temp=board[i][j];
        // board[i][j]='#';
         visited[i][j] = true;

        boolean found=dfs(board,word,index+1,i-1,j) ||
                    dfs(board,word,index+1,i+1,j) ||
                    dfs(board,word,index+1,i,j-1) ||
                    dfs(board,word,index+1,i,j+1) ;

         visited[i][j] = false;
        return found;
    }
}
