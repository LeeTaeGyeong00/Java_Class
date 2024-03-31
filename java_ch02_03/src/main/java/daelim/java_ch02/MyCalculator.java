package daelim.java_ch02;

public class MyCalculator {
    public void calAdd(int fNum, int sNum, CalAdd calAdd) { // CalAdd 객체 주입
        int value = calAdd.doOperation(fNum, sNum);
        System.out.println("result : "+ value);
    }
    public void calSub(int fNum, int sNum, CalSub calSub) { // CalSub 객체 주입
        int value = calSub.doOperation(fNum, sNum);
        System.out.println("result : " + value);
    }

    public void calMul(int fNum, int sNum, CalMul calMul) { // CalMul 객체 주입
        int value = calMul.doOperation(fNum, sNum);
        System.out.println("result : " + value);
    }

    public void calDiv(int fNum, int sNum, CalDiv calDiv) { // CalDiv 객체 주입
        int value = calDiv.doOperation(fNum, sNum);
        System.out.println("result : " + value);
    }

    public void calculator(int fNum, int sNum, ICalculator calculator){
        int value = calculator.doOperation(fNum, sNum);
        System.out.println("result : "+value);
    }
}
