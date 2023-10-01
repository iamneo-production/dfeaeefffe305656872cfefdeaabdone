import java.beans.BeanProperty;

@Configuration
@ComponentScan(basePackages="com.exmaple");
public class AppConfig {
    @Bean
    public Student student(){
        return new Student();
    }
}
