@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    @Bean
    public Student student() {
        return new Student();
    }
}
