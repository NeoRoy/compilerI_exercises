class MainTest{
    public static void main(String[] arg0){
    	List l;
    	
    	l = new List();
    	System.out.println(l.init());	//0
    	System.out.println(l.add(5));	//0
    	System.out.println(l.add(7));	//1
    	System.out.println(l.add(9));	//2

    	System.out.println(l.get(2));	//9
    	System.out.println(l.get(0));	//5
    	System.out.println(l.get(3));	//0
    	System.out.println(l.remove(1));	//7
    	System.out.println(l.get(1));	//9
    }
}

class List{
	int size;
	int eintraege;
	int[] liste;
	
	public int init(){
		eintraege = 0;
		size = 1;
		liste = new int[size];
		return 0;
	}
	
	public int add(int i){
		boolean passt;
		int[] neueListe;
		int count;
		
		passt = eintraege < size;
		if(!passt){
			neueListe = new int[size*2];
			count = 0;
			while(count < size){
				neueListe[count] = liste[count];
				count = count + 1;
			}
			liste = neueListe;
			size = size * 2;
		} else {}
		liste[eintraege] = i;
		eintraege = eintraege + 1;
		return eintraege - 1;
	}
	
	public int get(int i){
		int result;
		if(i < eintraege){
			result = liste[i];
		} else {
			result = 0;
		}
		return result;
	}
	
	public int remove(int num){
		int result;
		int nummer;

		nummer = num;
		if(num < eintraege){
			result = liste[num];
			while(nummer < eintraege){
				liste[nummer] = liste[nummer+1];
				nummer = nummer +1;
			}
		} else {
			result = 0;
		}
		return result;
	}
}