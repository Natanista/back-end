package br.com.bandtec.banco.teste;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Connection {

    private BasicDataSource datasource;

    // Exemplo de configuração utilizando H2
    // Obs. O código comentado é um exemplo de como se conectar ao mysql
    public Connection() {
        this.datasource = new BasicDataSource();

        this.datasource.setDriverClassName("org.h2.Driver");
//        this.datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        this.datasource.setUrl("jdbc:h2:file:./meu_banco");
//        this.datasource.setUrl("jdbc:mysql://localhost:3360/meu_banco");
        
        // usuário padrao H2
        this.datasource.setUsername("sa");

        // senha padrao H2
        this.datasource.setPassword("");

        // Não irá funcionar se você não criar um container exatamente igual o meu.
        
        // usuário utilizado em um container MySQL
        //this.datasource.setUsername("root");
        
        // senha padrao utilizada no container MySQL
        //this.datasource.setPassword("teste");
    }

    public BasicDataSource getDatasource() {
        return datasource;
    }
}
