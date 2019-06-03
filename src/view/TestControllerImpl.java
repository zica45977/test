package view;

public class TestControllerImpl implements TestController {

	@Override
	public String setTextArea(String s) { // View 요청을 처리해주는 Controller/Service
		String str = "";
		for (int row = 2; row<=9; row++) {
			for(int  col = 1; col<=9; col++) {
			str = str + row + "*" + col + "="+ (row*col)+ "\n";
			}
		}
		// TODO Auto-generated method stub
		return str;
	}

	@Override
	public String appendTextArea(String s) {
		// TODO Auto-generated method stub
		String str = "hello JavaFx1" + s + "\n";
		return str;
	}

}
