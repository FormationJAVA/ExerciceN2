package Classes;

public class tst_Ville {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville v1=new Ville();
		Ville v2=new Ville("Tlemcen","Algérie",900000);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v2.compare(v2));
		
	}

}
