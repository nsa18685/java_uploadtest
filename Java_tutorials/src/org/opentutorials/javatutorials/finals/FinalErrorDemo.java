package org.opentutorials.javatutorials.finals;

class A{
	final void b(){}
}
/*final �޼ҵ�b�� �������̵��Ϸ� �ϸ� error�߻�
class B extends A{
	void b(){}
}
*/
final class C{
	final void b(){}

}
/*final Ŭ������ ����Ϸ� �ϸ� �����߻�
 * class D extends c{}
 */

public class FinalErrorDemo {

}
