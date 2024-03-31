package daelim.java_ch_01;

public class CalAssembler {
    MyCalculator calculator;
    CalAdd calAdd;
    CalSub calSub;
    CalMul calMul;
    CalDiv calDiv;

    public CalAssembler(MyCalculator myCalculator, CalAdd calAdd, CalSub calSub, CalDiv calDiv, CalMul calMul) {
        calculator = new MyCalculator();
        calAdd = new CalAdd();
        calSub = new CalSub();
        calMul = new CalMul();
        calDiv = new CalDiv();
    }


    public void assemble() {
        calculator.calculator(10, 5, calAdd);
        calculator.calculator(10, 5, calSub);
        calculator.calculator(10, 5, calMul);
        calculator.calculator(10, 5, calDiv);
    }
}
