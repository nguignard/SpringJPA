package app.entry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.app.config.AppConfig;


public class Entry {

    public static void main(String[] args) {
	AnnotationConfigApplicationContext contextAnnotation = new AnnotationConfigApplicationContext(AppConfig.class);
	contextAnnotation.getBeanFactory().createBean(MyApp.class).run();
	contextAnnotation.close();
    }

}
