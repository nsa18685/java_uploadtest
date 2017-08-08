package org.opentutorials.javatutorials.exception;
/*예외: 오류를 제어하는 법 (실패하지 않는 법)
예외의 핵심은 뒷수습이다
Throwable클래스의 상속을 받지 않은 경우 throw가 불가능 하다.*/

import java.io.IOException;

class E {
	void throwArithmeticException(){
		throw new ArithmeticException();
	}/*예외 클래스를 throw 뒤에 인스턴스화 시켜서 전달했음
	ArithmeticException은 RuntimeException객체에 상속되어있음
	unchecked Exception임:try-catch구분 필요 없음*/
	
	void throwIOException1(){
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//checked Exception임! RuntimeException을 제외한 Exception의 하위클래스는 예외처리가 존재해야함
		//throw new Exception=>try{}catch{구문}실행!
		/*다중 catch사용 가능
		catch는 위에서 아래로 처리되기때문에 아래의 클래스가 더 포괄적이어야한다.
		else if와 같은 역할
		예외 발생시 매소드가 끝나는 것이 아니라 catch밖 나머지도 출력함
		예)
		객체.getMessage():기본적 내용
		객체.toString():좀더 자세한 정보
		객체.printStackTrace():내부적으로 화면에 에러사항을 출력 
		finally{
		예외여부와 관계없이 실행되는 로직(반드시 실행되어야하는 것)
		}
		*/
	}
	void throwIOException2() throws IOException{
		throw new IOException();
	}
}