package daelim.java_ch_01;

public class CalDiv implements ICalculator{
    @Override
    public int doOperation(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}
