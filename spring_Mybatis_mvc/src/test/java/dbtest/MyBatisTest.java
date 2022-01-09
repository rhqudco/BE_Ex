package dbtest;

import com.spring_mvc.mybatis.model.ProductVo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisTest {
    @Inject
    private SqlSessionFactory sqlFactory;

    @Test
    public void testFactory(){
        System.out.println("\n >>>>>>>>>> sqlFactory 출력 : " + sqlFactory);
    }

    @Test
    public void testSession() throws Exception{
        try(SqlSession session = sqlFactory.openSession()){
            System.out.println(" >>>>>>>>>> session 출력 : " + session + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}