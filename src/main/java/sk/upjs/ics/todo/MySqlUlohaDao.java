package sk.upjs.ics.todo;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlUlohaDao implements UlohaDao {

    private JdbcTemplate jdbcTemplate;

    public MySqlUlohaDao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost/todo");
        dataSource.setUser("root");
        dataSource.setPassword("271294");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void pridat(Uloha uloha) {
      String sql ="INSERT INTO uloha VALUES(?,?,?)";//musia tu byt otazniky
      jdbcTemplate.update(sql,null,uloha.getNazov(),uloha.getDatum());
    }
    
    

    @Override
    public List<Uloha> dajVsetky() {
        String sql = "SELECT * FROM uloha";
        BeanPropertyRowMapper<Uloha> mapper = BeanPropertyRowMapper.newInstance(Uloha.class);//tovaren
        return jdbcTemplate.query(sql, mapper);//ak mam v databaze rovnake meno tych parametrov ako tu v tomto projekte tak mi to vyberie z databazy data tu do Listu
    }

    @Override
    public void odstranit(Uloha uloha) {
       String sql ="DELETE from ULOHA where id=?";
       jdbcTemplate.update(sql, uloha.getId());
    }

}
