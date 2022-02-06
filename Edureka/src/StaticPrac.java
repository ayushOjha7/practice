
public class StaticPrac {
	
	int y=10;
	static int z=10;
	
	void incrementY() {
		y+=1;
	}
	void incrementZ() {
		z+=1;
	}

	public static void main(String[] args) {
		
		StaticPrac sp1 =new StaticPrac();
		StaticPrac sp2 =new StaticPrac();
		StaticPrac sp3 =new StaticPrac();
		
		sp1.incrementY();
		System.out.println(sp1.y);
		sp2.incrementY();
		System.out.println(sp2.y);
		sp3.incrementY();
		System.out.println(sp3.y);
		
		System.out.println("*******************************");
		
		sp1.incrementZ();
		System.out.println(sp1.z);
		sp2.incrementZ();
		System.out.println(sp2.z);
		sp3.incrementZ();
		System.out.println(sp3.z);
		
	}

}
