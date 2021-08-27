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
		System.out.println("��! ��!");
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("�̾߿�~");
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
		System.out.println(rn.nextInt());//int �����ȿ� ���� �����´�
		for (int i = 0; i < 10; i++) {//�������� ����
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
		int a = 10;//4����Ʈ �μ� �Ѱ� �ּ���
		int [] ar = new int[5];
		int [] br = new int[] {1, 2, 3, 4, 5};
		int [] cr = {10, 20, 30, 40, 50};
		System.out.println(ar.length);
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] + " ");
			//�Ϲ������� �迭�̳� ���ӵ� ���� ����Ҷ� println�� �ַ� ��� ����
		}
		System.out.println("");
		System.out.println("ȣ����");
		//i��� ���� ���� : x, data, value
		for (int x : cr) {
			//for���� ����ȭ ����, �迭���� �տ������� x������ �־��ش�
			//foreach���� ����ҋ� ������ index�� �� �� ����.
			System.out.print(x + " ");
		}
		System.out.println("");
		//cr�� ��� �޸𸮸� 5�� �޶�� �Ͽ���
		//�迭�� ���� - 1 �� ũ�⸦ ��밡��
		cr[0] = 100;
		cr[4] = 200;
		//cr[5] = 300; ��ȿ ���Ǹ� ����� ������ ���� �߻�
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
		//�迭�� ��ȿ ���� : 0 ~ (�迭�� ���� - 1)
		System.out.println("\n------------------");
		
		boolean[] dr = {true, false, true, false};
		for (boolean x : dr) {
			System.out.print(x + " ");
		}
		System.out.println("-------------------");
		
		String[] ss = new String[4];
		ss[0] = "ȣ����";
		ss[1] = "�����";
		ss[2] = "��";
		ss[3] = "�Ǵ�";
		
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i] + " ");
		}
		System.out.println("");
		for (String x : ss) {
			System.out.print(x + " ");
		}
		System.out.println("");
		
		String [] st = new String[] {"���", "ƫ��", "�عٶ��"};
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
		String s1 = "ȣ����";
		String s2 = new String("ȣ����");
		
		String [] su = new String[] {new String("���")};
		
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
		System.out.println("��! ��!");
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("�̾߿�~");
	}
}
class Snake extends Animal{
	
}
class Zoo{
	//Ȯ���ؼ� �����ִ�. (����) ���� ����Ҽ��ְ��Ѵ� 
	//�ڵ庯���� �������� (�����)
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
//��ü���� ���� 5���� ���� : SOILD
//SRP(����å���� ��Ģ)
//ex)������ å �����ҋ� �����Ϳ� ������ ���ܵ� ������ å ������ å���� ����.
//�����Ϳ� ������ ����µ� ������ å ���� ���α׷��� �ǵ���� �ǹ̰� ����.
//OCP(��������� ��Ģ)
//LSP(�����ں� ġȯ�� ��Ģ)
//ISP(�������̽� �и��� ��Ģ)
//DIP(������������ ��Ģ)
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
		Animal t3 = new Tiger(); //case 3) �� ĳ����, ���ڰ���
		//Tiger(����) t4 = new Animal(�޸�)(); case 4) �ڹٿ����� ��� �� �Ѵ�. �ٿ� ĳ����
		t3.m1();
		//t3.m2(); Tiger�� �޸𸮸� �޾ƿ����� Animal ������ ��밡���Ͽ� m2�� ����Ҽ� ����.
		t3.m3();
		//�޸𸮸� �޾ƿԱ⶧���� Animal ������ ������ �ڽ�class�� ���� �Լ��� ������ �ڽ� �Լ��� ����Ѵ�.
	}
}
*/

/*
//ex32) 
class Animal{
	Animal(){
		System.out.println("�θ������ ��");
	}
	Animal(int n){
		System.out.println(n);
	}
}
class Tiger extends Animal{
	Tiger(){
		//���� ������ �ڵ尡 ������ �����Ǿ��ִ�. �ؿ� ��ɹ�
		super();//�θ��� �����ڸ� ���ϴ� ��ɹ�
		System.out.println("�ڽĻ����� ��");
	}
	Tiger(int num){
		super(num + 100);//�̰� ��� ��� �Ȱ���(������ �ڵ����� ����� ��)
		//���ϴ� �θ� �����ڰ� ������ �μ��� �����ָ� �ȴ�.
		System.out.println(num);
	}
	Tiger(int a, int b){
		super(a * b);
		System.out.println("3���� ������");
		//super();  -->  super()�� �Լ��� ���� ù��° �;��Ѵ�
		//�ڿ� ����ϸ� ���� �߻�
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
//ex31) ���
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
		super.m3();//super�� ����Ͽ� �θ�class���� m3�� ȣ�Ⱑ��
		System.out.println(4);
	}
}
public class Hello 
{
	public static void main(String[] args) {
		Animal t1 = new Animal();
		Tiger t2 = new Tiger();
		t2.m1();
		t2.m2();//�ڽ� class�� Ȯ�� ���� ã�� �Լ��� ���� ��� �θ� class���� ã�Ƽ� ���
		t2.m3();//���� �̸��� �Լ��� ���� ��� �ڽ��� class���� �Լ� ���
		t2.m4();//���� class���� �Լ��� ���� ����� �� �ִ�.
	}
}
*/

/*
//ex30 math�Լ�)
public class Hello 
{
	public static void main(String[] args) {
		//���밪
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);

		//�ø���
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);

		//������
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		
		//�ִ밪
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.7);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8);

		//�ּҰ�
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.7);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10);
		
		//����� ������ �Ǽ� ��
		double v11 = Math.rint(5.3);
		double v12 = Math.rint(5.74343);
		System.out.println("v12 = " + v11);
		System.out.println("v13 = " + v12);

		//�ݿø�
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
		t.m1();//new�� ���� �����Ǿ��⶧���� ��� ����
		//m1(); static m1()�� �ƴϱ� ������ ����� �� ����.
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
		//static �Լ� �ȿ����� static ������ ��� �����ϴ�.
		m1();//���
		Hello h = new Hello();
		h.m1();//��� m1�� static�� ���ؼ� ���� �����⶧���� ���� h.m1()�� �� �ʿ䰡 ����.
		h.m2();//���
		Hello.m1(); // class�̸����� �ҷ��鿴���� static�� ���� ����ϸ� ��� ����
		//Hello.m2(); static m2()�� �ƴϱ� ������ ����� �� ����.
	}
	void m2() {
		System.out.println(2);
	}
}
*/

/*
//ex28)
class Tiger{//�������� ����ϴ� ������ ����� ������ ���, ��ü���� ���� ����
	int num1;
	static int num2 = 100;
	static void m1() {
		System.out.println("static �Լ� ����");
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
		name = "����";
	}//default ����
	Car(String n,int f){//�μ�����
		fuel = f;
	}
	void Move() {	
		System.out.println("�ڵ����� �޸���.");
		fuel -= 30;
		System.out.println("�޸���" + name);
	}
	void Stop() {
		System.out.println("��ž");
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
		Car car2 = new Car("�����ڵ���", 50);
		
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
	Tiger(){}//�ȿ� �ƹ��͵� ���ٴ� �����Ͽ� ���ٷ� ����
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
//ex25) ������
// 1) �����ڴ� �Լ��̴�. ������ �Լ��� �Ѵ�.
// 2) �Լ� �̸��� Ŭ���� �̸��� �ݵ�� �����ؾ��Ѵ�.
// 3) ������ �Լ��� return���� ���� ���� ����.�׷��� void�� �����Ѵ�.
// 4) ������ �Լ��� �����ε��� �����ϴ�.
// 5) ������ �Լ��� ��ü�� ������ �� �� �ѹ��� ȣ��ȴ�.(���Ƿ� ȣ���� �� ����.)
// 6) �����ڸ� ����ϴ� ������ ��� �޼ҵ带 �ʱ�ȭ��Ű�� ���� ���ȴ�.
// 7) ������ �Լ��� �ۼ����� �����ÿ��� �ڵ����� default�����ڰ� ���������.

class Tiger{
	int age = 20;
	String name = "ȫ�浿";
	Tiger(){//�μ� ������ ���� ������ - defualt ������
		System.out.println("������ ����");
		System.out.println("�����ڰ� ȣ��Ǿ���.");
		//age = 20;
		//name = "ȫ�浿";
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
		Tiger t3 = new Tiger(100, "������");
		Tiger t4 = new Tiger(200, "�޹���");
		//System.out.println(t1.age + t1.name);
		//System.out.println(t2.age + t2.name);
		//System.out.println(t3.age + t3.name);
		//System.out.println(t4.age + t4.name); �Ʒ��� ���� ��Ȱ
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
	//�Լ��� ���޵Ǵ� �μ��� ������ �ٸ��ų� Ÿ���� �ٸ��� �Լ��� �̸��� �����ϰ� ����� �� �ִ�.
	//�̰��� �Լ� �����ε�, �����Ƕ�� �Ѵ�.
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
		t1.method01("ȣ����", 0);
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
		System.out.println("ȣ����");
		int num = 0;
		while(true) {
			num++;
			if(num % 2 != 0) {
				System.out.println("ȣ����" + num);
				continue;
			}
			if(num == 10) {
				System.out.println("�ڳ���" + num);
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
				System.out.println("ã�Ҵ�");
				return ;
			}
		}
		System.out.println("�˻� ������ ã�� ����.");
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
      
      return "������";
   }
   Rion m2() {
      //return new Rion(); �Ʒ��� ����
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
	//���� - �μ� ���� 2�� �̻� �� ��� int a, b�� �ȵȴ�.
	//������ ������ Ÿ���� �����־���Ѵ�.
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
	void m3(Lion a) {//����ڰ� ������ Ŭ������ �޾� ��밡���ϴ�.
		System.out.println(a.hashCode());
		a.sound();
	}
}

class Lion{
	void sound() {
		System.out.println("����");
	}
}
public class Hello 
{
	public static void main(String[] args) {
		String s1 = "ȣ����";//�ڹٿ��� �����ϴ� ǥ�� Ŭ���� - String
		System.out.println(s1.length());
		Tiger t1 = new Tiger();
		t1.m1(3, 4);
		t1.m2(10, '��', true, 3.14f, "ȣ����");
		
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
	//�޼ҵ�(�Լ� : ���ֻ���ϴ� �ڵ带 ���� �� �ҷ��� ����Ѵ�.)
	void merry() {
		System.out.println('��');
	}
	void happy(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println('��');
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
		t.merry();//�Լ� ��
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
		//���� ��    �μ� ����
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
	// �ʵ�(Ŭ���� �ȿ��� ���ǵǴ� ����)
	int a;
	int b = 20;
	int c, d = 30;
	// ������
	// �޼ҵ�
}


public class Hello 
{
	public static void main(String[] args) {
		Tiger t1 = new Tiger();// ��ü ���� - �ν��Ͻ�ȭ, new ���
		Tiger t2 = new Tiger();
		t1.a = 100;
		t1.c = t1.a + 30;
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t2.c);
		//��� ��ü�� �����Ǹ� ������ȣ�� �����Ѵ�.
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		Tiger t3;
		t3 = t2;//�� ������ �����Ѵ�, �޸𸮸� �����Ѵ�.
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
		b = a++;//����, ���� ������ �Ͼ��.
		System.out.println(a + " " + b);
		
		int c = 10, d;
		d = ++c;//����, ���� ������ �Ͼ��.
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
		//(int)->Ÿ�� (a)->���� (=)->���Կ����� (10)->���ͷ�
		int a = 10;
		int b = 20;
		short c = 30;
		//���Կ����ڴ� ���ʰ� �������� Ÿ���� �����ؾ��Ѵ�.
		//b = c;
		b = (int)c;//�� ���ο����� intŸ������ ��ȯ
		c = (short)a;//Ÿ�� ĳ����
		
		int num = 10;
		num = num + 3;
		num += 3;//���� �ڵ庸�� ������ �ӵ��� �� ����
		
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
				System.out.println("Ż�� ����");
				break;
			}
		}
		
		//2)
		int n2 = 1234;
		//���ڸ��� ���� ���ϴ� ���
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
//ex13) while��
//���α׷��Ӱ� �ݺ� Ƚ���� �˰� ���α׷����� �ҋ��� for�� ���
//�ݺ� Ƚ���� �𸣸� while�� ���
public class Hello 
{
	public static void main(String[] args) {
		int num = 0;
		//while(true) {
			//System.out.print(); ������� �� �ٲ� ����
		//	num++;
		//	System.out.println(num + " ");
		//}
		
		int n = 0;
		while(n < 10) {
			System.out.println(n);
			n++;
			
		}
		System.out.println("ȣ����");
		//�ݺ� Ƚ���� �˱� ������ for�� �������
		
		int a = 0;
		while(true) {
			System.out.println(a);
			if (a == 5) {
				System.out.println("Ż�� ����");
				break;
			}
			a++;
		}
	}
}
*/

/*
//ex12) for�� ��� ����
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
//ex11) for��
//for( �ʱ� ; ���� ; ����){}
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
		num++;//���� ������ ++
		System.out.println(num);
		num--;//���� ������ --
		System.out.println(num);
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);
		for (int i = 0; i < 3; i++) {
			System.out.println("ȣ���� " + i);
		}
		
		//for (int i = 5; i > 4; i = i + 3) {	
		//}
		//�ʱ� ���� 0�̳� 1�� �ƴѰ�� ������ �ڵ��ϴ� ��
		//�ε�ȣ ��ȣ �Ű澲�� i < 0
		//�������� 1�� �ƴѰ�� ������ �ڵ��ϴ� ��
		
		
		//���� ���
		for (int i = 0; i < 5; i++) {
			//5�� 
		}
		for (int i = 1; i <= 5; i++) {
			//5��
		}
		int n = 5;
		for (int i = -n; i <= n; i++) {
			//���� ����� ��ǥ�� ������ �� ���ȴ�.
			//5*2+1��ŭ 
		}
		
	}
}
*/

/*
//ex10) switch��
public class Hello 
{
	public static void main(String[] args) {
		//1) case�ڿ��� ������ �� �� ����.
		//2) switch�ȿ��� ������ ���� �� �ִ�.
		//3) default, break�� �ʿ� ���ο� ���� ���� �����ϴ�.
		//4) �ǵ����� ��쿡�� break�� ���� �����ϴ�.
		//5) case�ȿ��� ����Ǵ� ������ 1�� �̻��� ��� �Ϲ������� ���ó���� �Ѵ�.
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
		}//if else ���� ���� switch ġȯ�� �� �ʿ����.
		
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
// ex9) if�� 
public class Hello 
{
	public static void main(String[] args) {

		//1) if��
		System.out.println(1);
		if(true){
			System.out.println(2);
			System.out.println(4);
		};// ; ���� ����
		System.out.println(3);

		//2) if else�� (���׿������� �ٲ� �� ������ ���׿��� ����ϴ� ���� ��Ģ)
		if(false){
			System.out.println(5);
		}
		else{
			System.out.println(6);
		}

		//3) ���׿����� ��
		int a = 10;
		int b = 5, c;
		if(a > b){
			c = 7;
		}
		else{
			c = 8;
		}
		System.out.println(c);
		c = a>b ? 8 : 7;// ���� �ڵ�, ���׿���
		System.out.println(c);
		
		if(a > b) {
			System.out.println("ȣ����");
		}
		else {
			System.out.println("�ڳ���");
		}
		
		System.out.println(a > b ? "ȣ����" : "�ڳ���");
		
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
		}// switch�� �����ϸ� ��ȯ
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
		
		System.out.println(a > b * 6);//������ < �񱳿��� < �������
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
		int a10;//ù���ڿ� ���� ��� X
		a10 = 10;
		System.out.println(a10);
		a10 = 20;
		System.out.println(a10);
		
		//5) swap���α׷�(������ ��ȯ)
		int aa = 88, bb = 99;
		int temp;
		System.out.println(aa + " " + bb);
		temp = aa;// temp = 88
		aa = bb;// aa = 99
		bb = temp;// bb = 88
		System.out.println(aa + " " + bb);
		
		//6) 5���� ���� ��ȯ ���α׷�
		int cc = 100;
		int dd = 200;
		int tt = cc; 
		cc = dd; 
		dd= tt;
	}
}
*/

/*
// ex 6)���Կ���
public class Hello 
{
	public static void main(String[] args) {
		
		byte apple; // ���� , 1byte = 8bit
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		apple = 100;
		System.out.println(apple);
	
		short banana; // ���� , 2byte
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		banana = 10000;
		System.out.println(banana);
		
		int orange; // ���� , 4byte
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		orange = 1000000;
		System.out.println(orange);
		
		long melon; // ���� , 8byte
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		melon = 100000000;
		System.out.println(melon);
		
		float tiger; // �Ǽ� , 4byte
		tiger = 3.14f;
		System.out.println(tiger);
		
		double lion; // �Ǽ� , 8byte
		lion = 3.14;
		System.out.println(lion);
		
		char cat; // 2byte , ����� ��밡��()
		//cat = 1000; �̷������� ��� ����
		cat = '��';
		System.out.println();
		System.out.println();
		System.out.println(cat);
		
		boolean dog; // 1byte , true �Ǵ� false�� ���
		dog = true;
		System.out.println(dog);
	}
}
*/
/*
// ex 5) ���� + ���ڿ�
public class Hello 
{

	public static void main(String[] args) {
		System.out.println(10);//����
		System.out.println('��');//����
		System.out.println("ȣ����");//���ڿ�
		System.out.println("1000");//���ڿ�
		
		
		System.out.println(10 +20);//���� + ����
		System.out.println(10 + "ȣ����");//���� + ���ڿ� = ���ڿ��� ��� ����
		System.out.println("ȣ����" + 10);//���ڿ� + ����
		System.out.println("ȣ����" + "�ڳ���");//���ڿ� + ���ڿ�
		System.out.println(10 + "ȣ����" + 20);
		System.out.println(10 + 20 + "ȣ����");
		System.out.println("ȣ����" + 10 + 20);
		System.out.println(10 + " " + 20);
	}
}
*/


/*
// ex4) ��������
public class Hello 
{
	public static void main(String[] args) {
		// �� OR
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		// �� AND 
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		
		System.out.println(true && true && false);
		System.out.println(false || false || true);
		System.out.println(false || (false && true));
		//and �� or�� ������ ��쿡�� ��ȣ�� �̿��Ͽ� ������ �����־���Ѵ�
		System.out.println(3 > 2 || false || 6 <= 3);
		// ����������
		System.out.println(!true);
		System.out.println(!(3 > 2));
	}
}
*/

/*
// ex3) �񱳿�����
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
// ex2) ���������
public class Hello 
{
	public static void main(String[] args) {
		System.out.println("1000");
		System.out.println(20 + 3);
		System.out.println(20 - 3);
		System.out.println(20 * 3);
		System.out.println(20 / 3); // ��
		System.out.println(20 % 3); // ������
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
		System.out.println("����");
	}
}
*/