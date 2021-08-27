package Pack;

import java.util.Iterator;
import java.util.Random;

/*
// ex)
class Animal{
	
}
class Tiger extends Animal{
	
}
public class Hello 
{
	public static void main(String[] args) {
		System.out.println("1000");
	}
}
*/


//ex37)
class Animal{
	void cry() {
		System.out.println(". . .");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍! 멍!");
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("미야옹~");
	}
}
class Snake extends Animal{
	
}
public class Hello 
{
	public static void main(String[] args) {
		Random rn = new Random();
		Animal t0 = new Dog(); 
		Animal t1 = new Cat(); 
		Animal t2 = new Snake(); 
		for (int i = 0; i < 10; i++) {
			int num = rn.nextInt(3);
			switch (num) {
			case 0:
				t0.cry();
				break;
			case 1:
				t1.cry();
				break;
			case 2:
				t2.cry();
				break;
			}
		}
		System.out.println("-----------");
		for (int i = 0; i < 10; i++) {
			Animal[] t3 = new Animal[] {new Dog(), new Cat(), new Snake()};
			t3[rn.nextInt(3)].cry();	
		}
	}
}


/*
//ex36) random
public class Hello 
{
	public static void main(String[] args) {
		Random rn = new Random();
		System.out.println(rn.nextInt());//int 범위안에 수를 가져온다
		for (int i = 0; i < 10; i++) {//랜덤으로 뽑음
			//int num = rn.nextInt(2);
			//System.out.println(num);
			System.out.println(rn.nextInt(10));
		}
	}
}
*/

/*
//ex35)
public class Hello 
{
	public static void main(String[] args) {
		int a = 10;//4바이트 인수 한개 주세요
		int [] ar = new int[5];
		int [] br = new int[] {1, 2, 3, 4, 5};
		int [] cr = {10, 20, 30, 40, 50};
		System.out.println(ar.length);
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] + " ");
			//일반적으로 배열이나 연속된 수를 사용할때 println을 주로 사용 안함
		}
		System.out.println("");
		System.out.println("호랑이");
		//i대신 쓰는 변수 : x, data, value
		for (int x : cr) {
			//for문의 간략화 형태, 배열에서 앞에서부터 x변수에 넣어준다
			//foreach문을 사용할떄 각자의 index를 알 수 없다.
			System.out.print(x + " ");
		}
		System.out.println("");
		//cr의 경우 메모리를 5개 달라고 하였따
		//배열의 길이 - 1 의 크기를 사용가능
		cr[0] = 100;
		cr[4] = 200;
		//cr[5] = 300; 유효 범의를 벗어났기 떄문에 에러 발생
		//ar[-1] = 400; 
		int num = 3;
		ar[num] = 500;
		ar[num * 3 - 5] = 600;
		ar[2] = 3;
		ar[ar[2]] = 999;
		
		System.out.println(ar[2] + " " + ar[3]);
		
		ar[ar[3] - 998] = 888;
		
		for (int x : ar) {
			System.out.print(x + " ");
		}
		//배열의 유효 범위 : 0 ~ (배열의 길이 - 1)
		System.out.println("\n------------------");
		
		boolean[] dr = {true, false, true, false};
		for (boolean x : dr) {
			System.out.print(x + " ");
		}
		System.out.println("-------------------");
		
		String[] ss = new String[4];
		ss[0] = "호랑이";
		ss[1] = "고양이";
		ss[2] = "개";
		ss[3] = "판다";
		
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i] + " ");
		}
		System.out.println("");
		for (String x : ss) {
			System.out.print(x + " ");
		}
		System.out.println("");
		
		String [] st = new String[] {"장미", "튤립", "해바라기"};
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
		String s1 = "호랑이";
		String s2 = new String("호랑이");
		
		String [] su = new String[] {new String("장미")};
		
	}
}
*/

/*
//ex34)
class Animal{
	void cry() {
		System.out.println(". . .");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍! 멍!");
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("미야옹~");
	}
}
class Snake extends Animal{
	
}
class Zoo{
	//확장해서 열려있다. (개방) 쉽게 사용할수있게한다 
	//코드변경은 하지마라 (폐쇄적)
	//void sound(Dog t) {
		//t.cry();
	//}
	//void sound(Cat t) {
		//t.cry();
	//}
	//void sound(Snake t) {
		//t.cry();
	//}
	void sound(Animal t) {
		t.cry();
	}
}
public class Hello 
{
	public static void main(String[] args) {
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Snake();
		t1.cry();
		t2.cry();
		t3.cry();
		
		Dog t4 = new Dog();
		Cat t5 = new Cat();
		Snake t6 = new Snake();
		t4.cry();
		t5.cry();
		t6.cry();
	
		System.out.println("--------");
		
		Zoo t7 = new Zoo();
		t7.sound(new Dog());
		t7.sound(new Cat());
		t7.sound(new Snake());
	}
}
//객체지향 개발 5가지 원리 : SOILD
//SRP(단일책임의 원칙)
//ex)도서관 책 관리할떄 프린터에 문제가 생겨도 도서관 책 관리에 책임이 없다.
//프린터에 문제가 생겼는데 도서관 책 관리 프로그램을 건드려도 의미가 없다.
//OCP(개방폐쇄의 원칙)
//LSP(리스코브 치환의 원칙)
//ISP(인터페이스 분리의 원칙)
//DIP(의존성역전의 원칙)
*/
/*
//ex33)
class Animal{
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(31);
	}
}
class Tiger extends Animal{
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(32);
	}
}
public class Hello 
{
	public static void main(String[] args) {
		Animal t1 = new Animal();//case 1)
		Tiger t2 = new Tiger();//case 2)
		Animal t3 = new Tiger(); //case 3) 업 캐스팅, 부자관계
		//Tiger(문법) t4 = new Animal(메모리)(); case 4) 자바에서는 사용 안 한다. 다운 캐스팅
		t3.m1();
		//t3.m2(); Tiger의 메모리를 받아오지만 Animal 문법만 사용가능하여 m2를 사용할수 없다.
		t3.m3();
		//메모리를 받아왔기때문에 Animal 문법만 받지만 자식class에 같은 함수가 있으면 자식 함수를 사용한다.
	}
}
*/

/*
//ex32) 
class Animal{
	Animal(){
		System.out.println("부모생성자 콜");
	}
	Animal(int n){
		System.out.println(n);
	}
}
class Tiger extends Animal{
	Tiger(){
		//현재 라인의 코드가 한줄이 생략되어있다. 밑에 명령문
		super();//부모의 생성자를 콜하는 명령문
		System.out.println("자식생성자 콜");
	}
	Tiger(int num){
		super(num + 100);//이거 없어도 결과 똑같음(없으면 자동으로 만들어 줌)
		//원하는 부모 생성자가 있으면 인수를 맞춰주면 된다.
		System.out.println(num);
	}
	Tiger(int a, int b){
		super(a * b);
		System.out.println("3번쨰 생성자");
		//super();  -->  super()는 함수의 제일 첫번째 와야한다
		//뒤에 사용하면 에러 발생
	}	
}

public class Hello 
{
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger(100);
		Tiger t3 = new Tiger(3, 4);
	}
}
*/

/*
//ex31) 상속
class Animal{
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(31);
	}
}
class Tiger extends Animal{
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(32);
	}
	void m4() {
		m3();
		super.m3();//super를 사용하여 부모class에서 m3를 호출가능
		System.out.println(4);
	}
}
public class Hello 
{
	public static void main(String[] args) {
		Animal t1 = new Animal();
		Tiger t2 = new Tiger();
		t2.m1();
		t2.m2();//자신 class에 확인 이후 찾는 함수가 없을 경우 부모 class에서 찾아서 사용
		t2.m3();//같은 이름의 함수가 있을 경우 자신의 class안의 함수 사용
		t2.m4();//같은 class안의 함수를 서로 사용할 수 있다.
	}
}
*/

/*
//ex30 math함수)
public class Hello 
{
	public static void main(String[] args) {
		//절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);

		//올림값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);

		//버림값
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		
		//최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.7);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8);

		//최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.7);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10);
		
		//가까운 정수의 실수 값
		double v11 = Math.rint(5.3);
		double v12 = Math.rint(5.74343);
		System.out.println("v12 = " + v11);
		System.out.println("v13 = " + v12);

		//반올림
		long v13 = Math.round(5.3);
		long v14 = Math.round(5.7);
		System.out.println("v13 = " + v13);
		System.out.println("v14 = " + v14);
	}
}
*/

/*
//ex29)
class Tiger{
	static void myMain() {
		Tiger t = new Tiger();
		t.m1();//new를 통해 생성되었기때문에 사용 가능
		//m1(); static m1()이 아니기 때문에 사용할 수 없다.
	}
	void m1() {
		
	}
}

public class Hello 
{
	static int num = 10;
	Hello(){

	}
	static void m1() {
		System.out.println(1);
	}
	public static void main(String[] args) {
		System.out.println(num);
		//static 함수 안에서는 static 변수만 사용 가능하다.
		m1();//출력
		Hello h = new Hello();
		h.m1();//출력 m1은 static을 통해서 같이 나가기때문에 굳이 h.m1()을 할 필요가 없다.
		h.m2();//출력
		Hello.m1(); // class이름으로 불러들였을때 static을 같이 사용하면 사용 가능
		//Hello.m2(); static m2()가 아니기 떄문에 사용할 수 없다.
	}
	void m2() {
		System.out.println(2);
	}
}
*/

/*
//ex28)
class Tiger{//공용으로 사용하는 변수를 만들고 싶을때 사용, 객체간의 전역 변수
	int num1;
	static int num2 = 100;
	static void m1() {
		System.out.println("static 함수 쿼리");
	}
}

public class Hello 
{
	public static void main(String[] args) {
		System.out.println(Tiger.num2);
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		System.out.println(t1.num2);
		t2.num2 = 200;
		System.out.println(t1.num2);
		System.out.println(Tiger.num2);
		Tiger.m1();
		
		//ex) 
		System.out.println(Math.abs(-10));
	}
}
*/


/*
//ex27)
class Car{
	int fuel = 100;
	String name = "n";
	Car(){
		name = "무명";
	}//default 쿼리
	Car(String n,int f){//인수받음
		fuel = f;
	}
	void Move() {	
		System.out.println("자동차가 달린다.");
		fuel -= 30;
		System.out.println("달린다" + name);
	}
	void Stop() {
		System.out.println("스탑");
		fuel -= 10;
	}
	void Show() {
		System.out.println(fuel);
	}
	void Inject() {
		fuel += 100;
	}
	void Inject(int f) {
		fuel += f;
	}
	
}
public class Hello 
{
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("꼬마자동차", 50);
		
		car1.Move();
		car2.Move();
	}
}
*/

/*
//ex26)
class Tiger{
	Tiger(int a, int b){
		
	}
	Tiger(){}//안에 아무것도 없다는 가정하에 한줄로 하자
}
public class Hello 
{
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger(10,20);
	}
}
*/

/*
//ex25) 생성자
// 1) 생성자는 함수이다. 생성자 함수라 한다.
// 2) 함수 이름은 클래스 이름과 반드시 동일해야한다.
// 3) 생성자 함수는 return값을 가질 수가 없다.그래서 void도 생략한다.
// 4) 생성자 함수도 오버로딩이 가능하다.
// 5) 생성자 함수는 객체가 생성될 때 단 한번만 호출된다.(임의로 호출할 수 없다.)
// 6) 생성자를 사용하는 목적은 멤버 메소드를 초기화시키기 위해 사용된다.
// 7) 생성자 함수를 작성하지 않을시에는 자동으로 default생성자가 만들어진다.

class Tiger{
	int age = 20;
	String name = "홍길동";
	Tiger(){//인수 전달이 없는 생성자 - defualt 생성자
		System.out.println("생성자 쿼리");
		System.out.println("생성자가 호출되었다.");
		//age = 20;
		//name = "홍길동";
	}
	Tiger(int a, String n){
		age = a;
		name = n;
	}
	void showInfo() {
		System.out.println(age + " " + name);
	}
}

public class Hello 
{
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		Tiger t3 = new Tiger(100, "독수리");
		Tiger t4 = new Tiger(200, "앵무새");
		//System.out.println(t1.age + t1.name);
		//System.out.println(t2.age + t2.name);
		//System.out.println(t3.age + t3.name);
		//System.out.println(t4.age + t4.name); 아래와 같은 역활
		t1.showInfo();
		t2.showInfo();
		t3.showInfo();
		t4.showInfo();
	}
}
*/

/*
//ex24)
public class Hello 
{
	public static void main(String[] args) {
		int a = 100;
		String s1 = Integer.toString(a);
		System.out.println(s1 + 200);
		String s2 = "" + a;
		System.out.println(s2 + 200);
		String s3 = "456";
		int b = Integer.parseInt(s3);
	}
}
*/

/*
//ex23)
class Tiger{
	//함수에 전달되는 인수의 갯수가 다르거나 타입이 다르면 함수의 이름을 동일하게 사용할 수 있다.
	//이것을 함수 오버로딩, 재정의라고 한다.
	void method01() {
		System.out.println(1);
	}
	void method01(int a) {
		System.out.println(2);
	}
	void method01(int a, int b) {
		System.out.println(3);
	}
	void method01(String a, int b) {
		System.out.println(4);
	}
	int getArea(int w, int h) {
		System.out.println(w * h);
		return w * h;
	}
	int getArea(int w) {
		System.out.println(w * w);
		return w * w;
	}
}
public class Hello 
{
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.method01();
		t1.method01(0);
		t1.method01(0, 0);
		t1.method01("호랑이", 0);
	}
}
*/
/*
//ex22)
public class Hello 
{
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i < 3) {
				continue;
			}
			System.out.println(i);
			if(i == 7) {
				break;
			}
		}
		System.out.println("호랑이");
		int num = 0;
		while(true) {
			num++;
			if(num % 2 != 0) {
				System.out.println("호랑이" + num);
				continue;
			}
			if(num == 10) {
				System.out.println("코끼리" + num);
				break;
			}
		}
	}
}
*/

/*
ex21)
class Tiger{
	int m1(int a, int b) {
		if(a > b) {
			return 100;
		}else {
			return 200;
		}
	}
	void m2() {
		System.out.println(1);
		return ;
		//System.out.println(2);
	}
	void m3(int num) {
		for(int i = 0; i < 10; i++) {
			if(i == num) {
				System.out.println("찾았다");
				return ;
			}
		}
		System.out.println("검색 데이터 찾지 못함.");
	}
}

public class Hello 
{
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.m1(2, 1));
		t1.m3(7);
	}
}
*/

/*
//ex20)
class Tiger{
   String m1() {
      
      return "독수리";
   }
   Rion m2() {
      //return new Rion(); 아래와 동일
      Rion t = new Rion();
      return t;
   }
   Rion m3 (Rion t) {
      return t;
   }
}
class Rion{
   void show() {
      System.out.println(1000);
   }
}
public class Hello{
   
   public static void main(String[] args) {
   
   Tiger t1 = new Tiger();
   String s1 = t1.m1();
   System.out.println(s1);
   System.out.println(t1.m1());
   
   Rion t2 = t1.m2();
   t2.show();
   
   Rion t3 = t1.m3(new Rion());
   t3.show();
   
   t1.m3(new Rion()).show();
   }
}
*/

/*
//ex19)
class Tiger{
	//주의 - 인수 전달 2개 이상 할 경우 int a, b는 안된다.
	//각각의 데이터 타입을 적어주어야한다.
	void m1(int a, int b) {
		System.out.println(a + " " + b);
		System.out.println(a * b + a);
	}
	void m2(int a, char b, boolean c, float d, String e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	void m3(Lion a) {//사용자가 생성한 클래스를 받아 사용가능하다.
		System.out.println(a.hashCode());
		a.sound();
	}
}

class Lion{
	void sound() {
		System.out.println("어흥");
	}
}
public class Hello 
{
	public static void main(String[] args) {
		String s1 = "호랑이";//자바에서 제공하는 표준 클래스 - String
		System.out.println(s1.length());
		Tiger t1 = new Tiger();
		t1.m1(3, 4);
		t1.m2(10, '한', true, 3.14f, "호랑이");
		
		Lion t2 = new Lion();
		System.out.println(t2.hashCode());
		t1.m3(t2);
		//Lion a = new Lion()
		t1.m3(new Lion());
	}
}
*/


/*
//ex18)
class Tiger{
	//메소드(함수 : 자주사용하는 코드를 저장 후 불러서 사용한다.)
	void merry() {
		System.out.println('멍');
	}
	void happy(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println('왈');
		}
	}
	int turtle() {
		return 1;
	}
	int fish(int num) {
		num = num * 3;
		return num;
	}
}

public class Hello 
{
	public static void main(String[] args) {
		Tiger t = new Tiger();
		int i;
		t.merry();//함수 콜
		t.merry();
		t.merry();
		for(i = 0; i < 10; i++) {
			t.merry();
		}
		
		System.out.println(" ");
		t.happy(5);
		
		System.out.println(" ");
		int num = t.turtle();
		System.out.println(num);
		System.out.println(t.turtle());
		
		System.out.println(" ");
		int ct;
		ct = t.fish(7);
		System.out.println(ct);
		System.out.println(t.fish(7));
		//리턴 값    인수 전달
		//  X          X
		//  X          O
		//  O          X
		//  O          O
	}
}
*/


/*
//ex17)

class Tiger{
	// 필드(클래스 안에서 정의되는 변수)
	int a;
	int b = 20;
	int c, d = 30;
	// 생성자
	// 메소드
}


public class Hello 
{
	public static void main(String[] args) {
		Tiger t1 = new Tiger();// 객체 생성 - 인스턴스화, new 사용
		Tiger t2 = new Tiger();
		t1.a = 100;
		t1.c = t1.a + 30;
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t2.c);
		//모든 객체는 생성되면 고유번호를 지정한다.
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		Tiger t3;
		t3 = t2;//두 변수는 참조한다, 메모리를 공유한다.
		System.out.println(t3.hashCode());
		t3.a = 999;
		System.out.println(t2.a);
	}
}
*/

/*
//ex16)
public class Hello 
{
	public static void main(String[] args) {
		int a = 10, b;
		b = a++;//대입, 증가 순서로 일어난다.
		System.out.println(a + " " + b);
		
		int c = 10, d;
		d = ++c;//증가, 대입 순서로 일어난다.
		System.out.println(c + " " + d);
		
		int a1 = 10, a2 = 10;
		System.out.println(a1++);
		System.out.println(++a2);
		System.out.println(a1);
		System.out.println(a2);
		int ad = 10;
		System.out.println(++ad * (ad++));
		int ac = 10;
		System.out.println(++ac * ac++);
		int e = 10;
		System.out.println((e++) * ++e);
		int f = 10;
		System.out.println(f++ * ++f);
	}
}
*/

/*
//ex15)
public class Hello 
{
	public static void main(String[] args) {
		//(int)->타입 (a)->변수 (=)->대입연산자 (10)->리터럴
		int a = 10;
		int b = 20;
		short c = 30;
		//대입연산자는 왼쪽과 오른쪽의 타입이 동일해야한다.
		//b = c;
		b = (int)c;//이 라인에서는 int타입으로 변환
		c = (short)a;//타입 캐스팅
		
		int num = 10;
		num = num + 3;
		num += 3;//위의 코드보다 컴파일 속도가 더 빠름
		
		int a1 = 0;
		int a2 = 0;
		a1 = a2 + 3;
		
		int t = +1;
		int u = -1;
		
		int k = 10;
		k += 3;
		System.out.println(k);
		k =+ 3;
		System.out.println(k);
		
		int d = 0;
		d++;
		System.out.println(d);
		++d;
		System.out.println(d);
		d = d + 1;
		System.out.println(d);
		d += 1;
		System.out.println(d);
	}
}
*/

/*
//ex14) 
public class Hello 
{
	public static void main(String[] args) {
		//1)
		int n = 10;
		while(true) {
			System.out.println(n);
			n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
			//if(n % 2 == 0) {
				//n = n / 2;
			//}else {
				//n= n*3 + 1;
			//}
			if(n == 1) {
				System.out.println(n);
				System.out.println("탈출 직전");
				break;
			}
		}
		
		//2)
		int n2 = 1234;
		//각자리의 수를 더하는 경우
		int sum = 0 ;
		while(true) {
			int r = n2 % 10;
			n2 = n2 / 10;
			System.out.println(n2 + " " + n2);
			sum = sum + r;
			if(n2 == 0) {
				System.out.println(n2);
				break;
			}
		}
		System.out.println(sum);
		
		
	}
}
*/

/*
//ex13) while문
//프로그래머가 반복 횟수를 알고 프로그래밍을 할떄는 for문 사용
//반복 횟수를 모르면 while문 사용
public class Hello 
{
	public static void main(String[] args) {
		int num = 0;
		//while(true) {
			//System.out.print(); 출력이후 줄 바꿈 없음
		//	num++;
		//	System.out.println(num + " ");
		//}
		
		int n = 0;
		while(n < 10) {
			System.out.println(n);
			n++;
			
		}
		System.out.println("호랑이");
		//반복 횟수를 알기 때문에 for문 사용하자
		
		int a = 0;
		while(true) {
			System.out.println(a);
			if (a == 5) {
				System.out.println("탈출 직전");
				break;
			}
			a++;
		}
	}
}
*/

/*
//ex12) for문 사용 예시
public class Hello 
{
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println(sum);
		
		int n = 5;
		for (int i = 0; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
*/

/*
//ex11) for문
//for( 초기 ; 조건 ; 증감){}
//for(int x = 0; x < 3; x++){}
public class Hello 
{
	public static void main(String[] args) {
		System.out.println(1000);
		int num = 10;
		num = num + 3;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
		num++;//단항 연산자 ++
		System.out.println(num);
		num--;//단항 연산자 --
		System.out.println(num);
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);
		for (int i = 0; i < 3; i++) {
			System.out.println("호랑이 " + i);
		}
		
		//for (int i = 5; i > 4; i = i + 3) {	
		//}
		//초기 값이 0이나 1이 아닌경우 억지로 코딩하는 것
		//부등호 부호 신경쓰기 i < 0
		//증감값이 1이 아닌경우 억지로 코딩하는 것
		
		
		//정석 사용
		for (int i = 0; i < 5; i++) {
			//5번 
		}
		for (int i = 1; i <= 5; i++) {
			//5번
		}
		int n = 5;
		for (int i = -n; i <= n; i++) {
			//음수 양수의 좌표값 제어할 때 사용된다.
			//5*2+1만큼 
		}
		
	}
}
*/

/*
//ex10) switch문
public class Hello 
{
	public static void main(String[] args) {
		//1) case뒤에는 변수가 올 수 없다.
		//2) switch안에는 변수를 넣을 수 있다.
		//3) default, break는 필요 여부에 따라 생략 가능하다.
		//4) 의도적인 경우에는 break를 생략 가능하다.
		//5) case안에서 실행되는 문장이 1개 이상일 경우 일반적으로 블록처리를 한다.
		int num = 10;
		switch (num) {
		case 10:
			System.out.println(1);
			//break;
		case 20:{
			System.out.println(2);
			System.out.println(100);
		}break;
		case 30:
			System.out.println(3);
			break;
		default:
			System.out.println(4);
			break;
		}
		
		int jumsu = 83;
		int q = jumsu / 10;  
		if(q >= 9) {
			System.out.println('A');
		}else if(q >= 8) {
			System.out.println('B');
		}else if(q >= 7) {
			System.out.println('C');
		}else if(q >= 6) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}//if else 같은 경우는 switch 치환을 할 필요없다.
		
		switch (q) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
*/

/*
// ex9) if문 
public class Hello 
{
	public static void main(String[] args) {

		//1) if문
		System.out.println(1);
		if(true){
			System.out.println(2);
			System.out.println(4);
		};// ; 생략 가능
		System.out.println(3);

		//2) if else문 (삼항연산으로 바꿀 수 있으면 삼항연산 사용하는 것이 원칙)
		if(false){
			System.out.println(5);
		}
		else{
			System.out.println(6);
		}

		//3) 삼항연산의 예
		int a = 10;
		int b = 5, c;
		if(a > b){
			c = 7;
		}
		else{
			c = 8;
		}
		System.out.println(c);
		c = a>b ? 8 : 7;// 슈가 코드, 삼항연산
		System.out.println(c);
		
		if(a > b) {
			System.out.println("호랑이");
		}
		else {
			System.out.println("코끼리");
		}
		
		System.out.println(a > b ? "호랑이" : "코끼리");
		
		//4)
		int num = 83;
		if(num >= 90) {
			System.out.println('A');
		}else if(num >= 80) {
			System.out.println('B');
		}else if(num >= 70) {
			System.out.println('C');
		}else if(num >= 60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}// switch문 가능하면 변환
	}
}
*/


/*
// ex8)
public class Hello 
{
	public static void main(String[] args) {
		int a = 17, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		System.out.println(a > b * 6);//논리연산 < 비교연산 < 산술연산
		System.out.println(a > b * 6 || a - 10 > b);
	}
}
*/

/*
// ex7)
public class Hello 
{
	public static void main(String[] args) {
		//1)
		int a;
		a = 10;
		System.out.println(a);
		
		//2)
		int b, c, d;
		b = 1;
		c = 2;
		d = 3;
		System.out.println(b + " " + c + " " + d);
		
		//3)
		int e = 10;
		int f = 20, g = 30;
		int h , i = 40, j;
		h = 50;
		j = 60;
		System.out.println(e + g);
		
		//4)
		int a10;//첫글자에 숫자 사용 X
		a10 = 10;
		System.out.println(a10);
		a10 = 20;
		System.out.println(a10);
		
		//5) swap프로그램(데이터 교환)
		int aa = 88, bb = 99;
		int temp;
		System.out.println(aa + " " + bb);
		temp = aa;// temp = 88
		aa = bb;// aa = 99
		bb = temp;// bb = 88
		System.out.println(aa + " " + bb);
		
		//6) 5번과 같은 교환 프로그램
		int cc = 100;
		int dd = 200;
		int tt = cc; 
		cc = dd; 
		dd= tt;
	}
}
*/

/*
// ex 6)대입연산
public class Hello 
{
	public static void main(String[] args) {
		
		byte apple; // 정수 , 1byte = 8bit
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		apple = 100;
		System.out.println(apple);
	
		short banana; // 정수 , 2byte
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		banana = 10000;
		System.out.println(banana);
		
		int orange; // 정수 , 4byte
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		orange = 1000000;
		System.out.println(orange);
		
		long melon; // 정수 , 8byte
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		melon = 100000000;
		System.out.println(melon);
		
		float tiger; // 실수 , 4byte
		tiger = 3.14f;
		System.out.println(tiger);
		
		double lion; // 실수 , 8byte
		lion = 3.14;
		System.out.println(lion);
		
		char cat; // 2byte , 양수만 사용가능()
		//cat = 1000; 이런식으로 사용 안함
		cat = '한';
		System.out.println();
		System.out.println();
		System.out.println(cat);
		
		boolean dog; // 1byte , true 또는 false만 기억
		dog = true;
		System.out.println(dog);
	}
}
*/
/*
// ex 5) 숫자 + 문자열
public class Hello 
{

	public static void main(String[] args) {
		System.out.println(10);//숫자
		System.out.println('한');//문자
		System.out.println("호랑이");//문자열
		System.out.println("1000");//문자열
		
		
		System.out.println(10 +20);//숫자 + 숫자
		System.out.println(10 + "호랑이");//숫자 + 문자열 = 문자열로 취급 연결
		System.out.println("호랑이" + 10);//문자열 + 숫자
		System.out.println("호랑이" + "코끼리");//문자열 + 문자열
		System.out.println(10 + "호랑이" + 20);
		System.out.println(10 + 20 + "호랑이");
		System.out.println("호랑이" + 10 + 20);
		System.out.println(10 + " " + 20);
	}
}
*/


/*
// ex4) 논리연산자
public class Hello 
{
	public static void main(String[] args) {
		// 논리 OR
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		// 논리 AND 
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		
		System.out.println(true && true && false);
		System.out.println(false || false || true);
		System.out.println(false || (false && true));
		//and 와 or이 섞였을 경우에는 괄호를 이용하여 순서를 정해주어야한다
		System.out.println(3 > 2 || false || 6 <= 3);
		// 부정연산자
		System.out.println(!true);
		System.out.println(!(3 > 2));
	}
}
*/

/*
// ex3) 비교연산자
public class Hello 
{
	public static void main(String[] args) {
		System.out.println(5 > 3);
		System.out.println(5 >= 3);
		System.out.println(5 < 3);
		System.out.println(5 <= 3);
		System.out.println(5 == 3);
		System.out.println(5 != 3);
	}
}
*/

/*
// ex2) 산술연산자
public class Hello 
{
	public static void main(String[] args) {
		System.out.println("1000");
		System.out.println(20 + 3);
		System.out.println(20 - 3);
		System.out.println(20 * 3);
		System.out.println(20 / 3); // 몫
		System.out.println(20 % 3); // 나머지
		System.out.println(3 + 2 * 4);
		System.out.println((3 + 2) * 4);
	}
}
*/
/*
// ex1)
public class Hello 
{
	public static void main(String[] args) {
		System.out.println("더존");
	}
}
*/