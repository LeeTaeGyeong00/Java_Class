package daelim.java_ch_01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

public class MainClass {
    public static void main(String[] args) {
        /*
        MyCalculator calculator = new MyCalculator();
        calculator.calculator(10,5, new CalAdd()); //객체주입
        calculator.calculator(10,5, new CalSub());
        calculator.calculator(10,5, new CalMul());
        calculator.calculator(10,5, new CalDiv());
    }
         */
        //Annotaion 사용
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        CalAssembler calAssembler = ctx.getBean("calAssembler", CalAssembler.class);
        calAssembler.assemble();
        ctx.close();
    }
}
