class RecTilesExample { 
	public static int placeTiles(int n, int m) {
		if(n==m){
			return 2;
		}
		if(n<m) {
			return 1;
		}
		//vertically tiles
		int vertPlacements = placeTiles(n-m,m);
		// horizontally
		int horPlacements = placeTiles(n-1,m);
		return vertPlacements + horPlacements; 
	}
	public static void main(String[] args) {
		int n=4, m=2;
		System.out.println(placeTiles(n,m));
	}
}