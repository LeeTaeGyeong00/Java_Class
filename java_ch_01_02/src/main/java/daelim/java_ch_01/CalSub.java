package daelim.java_ch_01;

public class CalSub implements ICalculator{
    @Override
    public int doOperation(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}
