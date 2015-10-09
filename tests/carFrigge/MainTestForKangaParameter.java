class MainTest{
    public static void main(String[] arg0){
    	int t0;
    	int t1;
    	int t2; 
    	int t3;
    	int t4;
    	A a;
    	
    	t0 = 1;
    	t1 = 2;
    	t2 = 3;
    	t3 = 4;
    	t4 = 5;
    	a = new A();
    	
    	t0 = a.ma(t0, t1, t2, t3, t4, 6);
    }
}

class A{

    public int ma(int i0, int i1, int i2, int i3, int i4, int i5){
    	System.out.println(i0);
    	System.out.println(i1);
    	System.out.println(i2);
    	System.out.println(i3);
    	System.out.println(i4);
    	System.out.println(i5);
    	return 0;
    }
}