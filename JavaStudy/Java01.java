package JavaStudy;
class Tv {
	//Tv의 속
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능(메소드)
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}	
}

class TvTest {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재채널은 " +t.channel + " 입니다.");
	}
}