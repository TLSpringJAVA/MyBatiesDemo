import model.Girl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by anlu on 2017/4/28.
 */
public class MyBatisUtil {
    public static void main(String[] args) {
        try {
            String resource = "mybatis-config.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(reader);
            //factory 创建会话 session
            SqlSession session = factory.openSession();

            Girl girl = new Girl();
            girl.setAge(28);
            girl.setCup_size("A");

            session.insert("insert", girl);
            session.commit();
            System.out.println("生成的Id:"+girl.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
