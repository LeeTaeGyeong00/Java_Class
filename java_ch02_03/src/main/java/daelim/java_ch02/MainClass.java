package daelim.java_ch02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        //Annotaion 사용
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        CalAssembler calAssembler = ctx.getBean("calAssembler", CalAssembler.class);
        calAssembler.assemble();
        ctx.close();
    }
}
