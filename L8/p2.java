import java.util.*;

class InvalidDayException extends Exception{
	void display(){
		System.out.println("Day is out of valid range (1-31)");
	}
}

class InvalidMonthException extends Exception{
	void display(){
		System.out.println("Month is out of valid range (1-12)");
	}
}

class CurrentDate{
	int day;
	int month;
	int year;

	void create_date() throws InvalidDayException,InvalidMonthException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		this.day = sc.nextInt();
		if(!(day>0 && day<=31)){
			throw new InvalidDayException();
		}
		System.out.println("Enter the month");
		this.month = sc.nextInt();
		if(!(month>0 && month<=12)){
			throw new InvalidMonthException();
		}
		System.out.println("Enter the year");
		this.year = sc.nextInt();
		System.out.println("The date is "+day+"/"+month+"/"+year);
	}
}

class p2{
	public static void main(String args[]){
		CurrentDate c1 = new CurrentDate();
		try{
			c1.create_date();
		}
		catch(InvalidDayException e){
			e.display();
		}
		catch(InvalidMonthException e){
			e.display();
		}
	}
}