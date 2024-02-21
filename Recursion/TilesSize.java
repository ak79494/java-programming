class TilesSize {
	public static int placeTiles(int n, int m) {
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		// verticallly
		int vertically = placeTiles(n-m,m);
		// horizontally
		int horizontally = placeTiles(n-1,m);
		return vertically +  horizontally;
	}
	public static void main(String[] args) {
		int n = 4; int m = 2;
		System.out.println( placeTiles(n,m));
	}
}