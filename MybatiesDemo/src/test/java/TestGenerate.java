
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.anlu.model.student;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Andrew on 2017/5/25.
 */
public class TestGenerate {

    private SqlSession sqlSession;

    @Before
    public void prepare() throws IOException {
        String resource = "generate-mybatis-config.xml";
        Reader reader = org.apache.ibatis.io.Resources.getResourceAsReader(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        //factory 创建会话 session
        sqlSession = factory.openSession();
    }

    //测试添加方法
    @Test
    public void insert(){
        student stu = new student();
        stu.setSchool("华明中学");
        stu.setStuNum("1001");

       int result = sqlSession.insert("com.anlu.mapper.studentMapper.insert",stu);
        System.out.println("结果"+result);
    }

    @Test
    public void findone(){
        Long stuId = new Long(1);

       student stu = sqlSession.selectOne("com.anlu.mapper.studentMapper.selectByPrimaryKey",stuId);
       System.out.println(stu.getSchool());

    }

    @After
    public void after()throws IOException{
        sqlSession.commit();
    }
}
