import com.course.structure.*;

class p1{
	public static void main(String args[]){
		House H1 = new House();
		School S1 = new School();
		H1.setBuild(5000,2);
		H1.set(3,2);
		S1.setBuild(8000,5);
		S1.set(10,"Elementary");
		H1.getBuild();
		H1.get();
		S1.getBuild();
		S1.get();	
	}
}