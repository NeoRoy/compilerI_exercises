class MainTest{
    public static void main(String[] arg0){
    	int n;
    	int i;
    	
    	n = 5;
    	i = 100;
    	while(0 < n){
    		while(n*n < i){
    			i = i - n*n;
    		}
    		System.out.println(n);
    		n = n-1;
    	}
    }
}