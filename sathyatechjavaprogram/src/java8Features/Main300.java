package java8Features;

public class Main300 {
	
    public static void main(String[] args) {
		
    	//referring to a static method
    	Calculator  cal=Scientific::findSum;
    	cal.calculator(30,50);
    	
    	Calculator call=Scientific::findDivision;
    	call.calculator(40,20);
    	
    	//referring to a instance method
    	Calculator cal2=new Scientific()::findProduct;
    			cal2.calculator(30,40);
	}

}
