class RecursionPower1 {  //  xpowern,  xpown%2
    public static int calcPower(int x, int n) {
        if(n==0) {
            return 1;
        }
        if(x==0) {
            return 0;

            
            }
            if(n % 2 == 0) {
                return calcPower(x,n/2)*calcPower(x, n/2); // even
            }else{
                return  calcPower(x,n/2)*calcPower(x, n/2) * x; // odd  
        }
    }
    public static void main(String[] args) {
        int x = 2; int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
        
    }
}