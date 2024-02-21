class PathMazeRevision {
	public static int countPath(int i, int j, int n, int m) {
		if(i==n||j==m) {
			return 0;
		}
		if(i==n-1&&j==m-1) {
			return 1;
		}
		// downPath
		int downPath = countPath(i+1,j,m,n);
		//rightPath
		int rightPath = countPath(i,j+1,m,n);
		return downPath + rightPath;
	}
	public static void main(String[] args) {
		int n = 3; int m = 3;
		int totalPath = countPath(0,0,n,m);
		System.out.println(totalPath);
	}
}