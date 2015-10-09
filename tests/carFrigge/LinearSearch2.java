class LinearSearch{
    public static void main(String[] a){
    	System.out.println(1111);
	System.out.println(new LS().Start(10));
    }
}


// This class contains an array of integers and
// methods to initialize, print and search the array
// using Linear Search
class LS {
    int[] number ;
    int size ;
    
    // Invoke methods to initialize, print and search
    // for elements on the array
    public int Start(int sz){
		int aux01 ;
		int aux02 ;
	
		System.out.println(2111);
		aux01 = this.Init(sz);
		System.out.println(2112);
		return 55 ;
    }


    public int Init(int sz){
		int j ;
		int k ;
		int aux01 ;
		int aux02 ;

//    	System.out.println(3111);
		size = sz ;
//    	System.out.println(3112);
		number = new int[sz] ;
//    	System.out.println(3113);
		
		j = 1 ;
//    	System.out.println(3114);
		k = size + 1 ;
//    	System.out.println(3115);
		while (j < (size)) {
		    aux01 = 2 * j ;
		    aux02 = k - 3 ;
		    number[j] = aux01 + aux02 ;
		    j = j + 1 ;
		    k = k - 1 ;
		}
		return 0 ;	
    }

}