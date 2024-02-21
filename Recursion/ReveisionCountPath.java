// count total path in a maze to move (0 0) to (n,m)
class ReveisionCountPath {
	public static int countPath(int i, int j, int n, int m) {
		if(i==n|| j==m) {
			return 0;
		}
		if(i==n-1&&j==m-1) {
			return 1;
		}
		// down Path
		int downPath = countPath(i+1,j,n,m);
		// right Path
		int rightPath = countPath(i,j+1,n,m);
		return downPath + rightPath;
	}
	public static void main(String[] args) {
		int n=3; int m=3;
		int ans = countPath( 0,0, n,m);
		System.out.println(ans);
		
	}
}