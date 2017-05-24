import model.Girl;
import model.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.security.util.Resources;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by anlu on 2017/5/2.
 */

public class TestDataSource {

    private SqlSession sqlSession;

    @Before
    public void prepare() throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = org.apache.ibatis.io.Resources.getResourceAsReader(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        //factory 创建会话 session
        sqlSession = factory.openSession();
    }

    @Test
    public void testInsert()throws Exception{

        Girl girl = new Girl();
        girl.setAge(38);
        girl.setCup_size("F");
        sqlSession.insert("model.Girl.insert", girl);
    }

    @Test
    public void testFindOne(){

      Girl girl =  sqlSession.selectOne("model.Girl.selectGirl",1);
      System.out.println(girl.toString());
      System.out.println(girl.getStudent().getSchool());
    }

    @Test
    public void testFindAll(){

    }

    @Test
    public void testUpdate(){
        Girl girl = new Girl();
        girl.setId(18);
        girl.setAge(49);
        sqlSession.update("update",girl);
    }

    @Test
    public void testDelete(){
        Girl girl = new Girl();
        girl.setId(43);

        sqlSession.delete("delete",girl);
    }

    @Test
    public void testInsertGirl(){
        Girl girl = new Girl();
        girl.setAge(30);
        girl.setCup_size("R");

        sqlSession.insert("insertGirl",girl);
    }

    @Test
    public void testFindStu(){
        Girl girl = new Girl();
        girl.setId(1);

        girl = sqlSession.selectOne("selectMyStu",girl);
        System.out.println(girl.getAge());
        System.out.println(girl.getStudent().getId());
        System.out.println(girl.getStudent().getSchool());
    }

    @Test
    public void selectStudent(){
        Student s = new Student();
        s.setId(3);

        s = sqlSession.selectOne("model.Girl.selectStudent",s);
        System.out.println(s.getSchool());
    }

    @Test
    public void findGirlTest(){
        Girl girl = new Girl();
        girl.setId(1);

       girl = sqlSession.selectOne("findGirl",girl);

    }

    @After
    public void afterMethod(){
        sqlSession.commit();


    }
}
