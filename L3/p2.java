class Time{
	int hours;
	int minutes;
	int seconds;


	void setValue(int h,int m, int s){
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
		while(result.seconds>59 || result.minutes>59){
			if(result.seconds>59){
				result.seconds -=60;
				result.minutes++;
			}
			else if(result.minutes>59){
				result.minutes -= 60;
				result.hours++;
			}
			
		}
		return result; 
	}

	Time subtractTime(Time x, Time y){
		Time result = new Time();
		result.hours = Math.abs(x.hours - y.hours);
		result.minutes = Math.abs(x.minutes - y.minutes);
		result.seconds = Math.abs(x.seconds - y.seconds);
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
		Time t1 = new Time();
		Time t2 = new Time();
		Time result = new Time();
		t1.setValue(12,54,23);
		t1.displayTime();
		t2.setValue(14,34,21);
		t2.displayTime();
		System.out.println("Adding t1 and t2:");
		result = result.addTime(t1,t2);
		result.displayTime();
		System.out.println("Subtracting t1 and t2:");
		result = result.subtractTime(t1,t2);
		result.displayTime();
		System.out.println("Comparing t1 and t2");
		Time.compareTime(t1,t2);
		t2.setValue(12,54,23);
		t2.displayTime();
		System.out.println("Comparing t1 and t2");
		Time.compareTime(t1,t2);
	}
}
