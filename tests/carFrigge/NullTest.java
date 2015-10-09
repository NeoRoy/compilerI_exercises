class MainTest{
    public static void main(String[] arg0){
    	Integer n;
    	
    	System.out.println(n.set(5));
    }
}

class Integer{
	int zahl;

	public int set(int i){
		zahl = i;
		return zahl;
	}
	public int get(){
		return zahl;
	}
}