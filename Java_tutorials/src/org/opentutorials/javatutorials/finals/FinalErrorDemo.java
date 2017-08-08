package org.opentutorials.javatutorials.finals;

class A{
	final void b(){}
}
/*final 메소드b를 오버라이딩하려 하면 error발생
class B extends A{
	void b(){}
}
*/
final class C{
	final void b(){}

}
/*final 클래스를 상속하려 하면 오류발생
 * class D extends c{}
 */

public class FinalErrorDemo {

}
