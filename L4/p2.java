class Time{
	int hours;
	int minutes;
	int seconds;

    Time(){
        hours=1;
        minutes=1;
        seconds=1;
    }


	Time(int h,int m, int s){
		hours = h;
		minutes = m;
		seconds = s;
	}

	void displayTime(){
		System.out.println(hours+":"+minutes+":"+seconds);
	}

	Time addTime(Time x, Time y){
		Time result = new Time();
		result.hours = x.hours + y.hours;
		result.minutes = x.minutes + y.minutes;
		result.seconds = x.seconds + y.seconds;
		if(result.seconds>59){
			result.seconds -=60;
			result.minutes++;
		}
		if(result.minutes>59){
			result.minutes -= 60;
			result.hours++;
		}
		if(result.hours>24){
			result.hours = result.hours-24;
		}
			
		return result; 
	}

	Time subtractTime(Time x, Time y){
		Time result = new Time();
		if(x.seconds<y.seconds){
			x.minutes--;
			x.seconds+=60;
			result.seconds = x.seconds - y.seconds;
		}
		else{
			result.seconds = x.seconds - y.seconds;
		}
		if(x.minutes<y.minutes){
			x.hours--;
			x.minutes +=60;
			result.minutes = x.minutes - y.minutes;
		}
		else{
			result.minutes = x.minutes - y.minutes;
		}
		if(x.hours<y.hours){
			System.out.println("Cannot Subract");
		}
		else{
			result.hours = x.hours - y.hours;
		}
		return result; 
	}

	static void compareTime(Time x,Time y){
		if(x.hours>=y.hours){
			if(x.hours == y.hours && x.minutes == y.minutes && x.seconds == y.seconds){
				System.out.println("Both are the same");
			}
			else{
				System.out.println("T1 is greater");
			}
		}
		else{
			System.out.println("T2 is greater");
		}
		
	}
}

class p2{
	public static void main(String args[]){
		Time t1 = new Time(16,34,13);
		Time t2 = new Time(14,54,21);
		Time result = new Time();
        
		t1.displayTime();
		t2.displayTime();
        result.displayTime();
		System.out.println("Adding t1 and t2:");
		result = result.addTime(t1,t2);
		result.displayTime();
		System.out.println("Subtracting t1 and t2:");
		result = result.subtractTime(t1,t2);
		result.displayTime();
		System.out.println("Comparing t1 and t2");
		Time.compareTime(t1,t2);
	}
}
