class Solution {
    int[][] dy = new int[900][900];
    public int DFS(int n, int r){
        if(dy[n][r] > 0) return dy[n][r];
        if(n==r || r == 0) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }
    
    public int solution(int balls, int share) {
        return DFS(balls, share);
    }
}