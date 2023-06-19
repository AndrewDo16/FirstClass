package ru.shik16.firstclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/student_db");
        dataSource.setUsername("admin");
        dataSource.setPassword("1606");
        return dataSource;
    }
}



//root@xxdemonxx21:~/firstclass# sudo chown root /etc/profile.d/maven.sh
//root@xxdemonxx21:~/firstclass# sudo bash -c 'cat << EOF > /etc/profile.d/maven.sh
//export JAVA_HOME=/usr/lib/jvm/default-java
//export M2_HOME=/opt/maven
//export MAVEN_HOME=/opt/maven
//export PATH=/opt/maven/bin:$PATH
//EOF'