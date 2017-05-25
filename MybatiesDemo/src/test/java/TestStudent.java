import hand.test.model.Girl;
import hand.test.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by anlu on 2017/5/2.
 */
public class TestStudent {

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

        Student student = new Student();
        student.setEnterTime(new Date());
        student.setSchool("耀华中学");
        student.setStuNum("002");
        sqlSession.insert("hand.test.model.Student.insert", student);
    }

    @Test
    public void selectStudent(){

        Student stu = new Student();
        stu.setId(1);

        sqlSession.selectOne("hand.test.model.Student.selectStudent",stu);
    }

    @Test
    public void searchStudent(){
        Student stu = new Student();
        stu.setStuNum("001");

       List<Object> list =  sqlSession.selectList("hand.test.model.Student.searchStudent",stu);
       System.out.println(list);

    }

    @Test
    public void selectStudentByMap(){
        Student s = new Student();
        s.setId(2);

        s = sqlSession.selectOne("hand.test.model.Student.selectStudentByMap",s);
        System.out.println(s.getSchool());

    }

    @Test
    public void findArticleTest(){
        Student stu = new Student();
        stu.setId(1);


      stu = sqlSession.selectOne("hand.test.findStu",stu);
      System.out.println(stu.getSchool());
      System.out.println(stu.getStuNum());
      System.out.println(stu.getArticleList());

    }

    @After
    public void afterMethod(){
        sqlSession.commit();
    }
}
