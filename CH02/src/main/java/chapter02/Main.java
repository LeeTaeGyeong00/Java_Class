package chapter02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
            AnnotationConfigApplicationContext ctx =
                    new AnnotationConfigApplicationContext(AppContext.class);
            Greeter g = ctx.getBean("greeter", Greeter.class);
            String msg = g.greet("스프링");
            System.out.println(msg);
            ctx.close();
/*
//1. 설정 정보를 이용해 빈 객체를 생성
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
//2. 빈 객체를 제공
        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        Greeter g2 = ctx.getBean("greeter", Greeter.class);

        System.out.println(g1 == g2); // true

 */
// 별도 설정을 하지 않을 경우 스프링은 한 개의 빈 객체만을 생성
/*
        Greeter g = ctx.getBean("greeter", Greeter.class);
        String msg = g.greet("스프링");
        System.out.println(msg);

        ctx.close();

 */
    }
}