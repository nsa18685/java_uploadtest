package euni.start.test.from_lecture;
import java.util.*;

class Employee{
	protected String name;
	protected String sno;
	
	public Employee(String name, String sno){
		this.name=name;
		this.sno=sno;
	}
	public String work(){
		return String.format("이름:%s 사원번호:%s",name,sno);
	}
	public long earnings(){
		System.out.println("소득액");
		return 0;
	}
}

class Staff extends Employee{
	String title;
	long staffpay;
	
	public Staff(String name, String sno, String title, long staffpay){
		super(name,sno);
		this.title=title;
		this.staffpay=staffpay;
	}
	public long earning(){
		return 20+staffpay;
	}
	public String work(){
		String result="";
		result +=super.work()+",직책: "+title+", ";
		return result;
	}
}	
class TempEmployee extends Employee{
	String hdept;
	long temphour;
	
	public TempEmployee(String name, String sno, String hdept, long temphour){
		super(name,sno);
		this.hdept=hdept;
		this.temphour=temphour;
	}
	public long earning(){
		return temphour*3;
	}
	public String work(){
		String result=" ";
		result +=super.work()+", 부서: "+hdept+", 근무시간수: "+temphour+", ";
		return result;
	}
}
class RegEmployee extends Employee{
	String dept;
	long regpay;
	String regtitle;
	
	public RegEmployee(String name, String sno, String dept, long regpay,String regtitle){
		super(name, sno);
		this.dept=dept;
		this.regpay=regpay;
		this.regtitle=regtitle;
	}
	public long earning(){
		return 10+regpay;
	}
	public String work(){
		String result=" ";
		result += super.work()+", 부서: "+dept+", 담당업무: "+regpay+", ";
		return result;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
		final int n=Integer.parseInt(args[0]);
		Scanner scn=new Scanner(System.in);
		Employee[] emp=new Employee[n];
		Staff sf;
		RegEmployee rg;
		TempEmployee tp;
		String sno, name;
		System.out.println("입력 자료수"+ n);
		for(int i=0;i<n;i++){
			System.out.println("\n사원번호, 이름..");
			sno=scn.next();
			name=scn.next();
			System.out.println("사원의 근무유형:(1:CEO, 2:정규직, 3:임시직);..");
			int kind=scn.nextInt();
			switch(kind){
			case 1: System.out.printf("직책, 월임금..");
					String title=scn.next();
					long staffpay=scn.nextLong();
					sf= new Staff(name,sno,title,staffpay);
					emp[i]=sf;
					break;
			case 2: System.out.printf("부서, 업무, 월임금 ..");
					String dept=scn.next();
					String regtitle=scn.next();
					long regpay=scn.nextLong();
					rg= new RegEmployee(name,sno,dept,regpay,regtitle);
					emp[i]=rg;
					break;
			case 3: System.out.printf("부서, 월근무시간수..");
					String hdept=scn.next();
					long temphour=scn.nextLong();
					tp= new TempEmployee(name,sno,hdept,temphour);
					emp[i]=tp;
					break;
			default: System.out.println("근무 유형 오류 재입력");
			}
			
		}
		System.out.println("\n       급여보고서");
		for(Employee e:emp)
			System.out.println(e+"급여액"+e.earnings());
	}

}
