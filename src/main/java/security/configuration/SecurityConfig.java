package security.configuration;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();//Дефолдное шифрование
        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("a.lutsenko").password("a.lutsenko").roles("Collector"))
                .withUser(userBuilder.username("v.yaresko").password("v.yaresko").roles("TeamLidCollectors"))
                .withUser(userBuilder.username("e.akutin").password("e.akutin").roles("HeadOfCollectors","TeamLidCollectors","Collector"));
    }
}
