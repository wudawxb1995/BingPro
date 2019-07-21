package MybatisTest;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import ConMapper.MemberMapper;

import java.io.InputStream;
import java.util.List;

import ConObj.Member;
import ConMapper.MemberMapper;

public class MybatisTest {
	@Test
    public void findMemberByIdTest() throws Exception{
        //1.读取配置文件
        String resource  = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //2.根据配置文件构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //3.通过 SqlSessionFactory 创建 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.获取对象
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        //5.1查询某一个记录
        Member member1 = new Member();
        member1 = memberMapper.getMember(2);
        System.out.println("ID:"+member1.getId()+" 部门："+member1.getdepartment()+" 权限等级："+member1.getManageLevel());
        //5.2插入某一个记录
        int count_data = memberMapper.getAllCount();
        Member member2 = new Member();
        member2.setId(count_data+1);
        member2.setdepartment("冰冰安全局");
        member2.setManageLevel(1);
        memberMapper.insertMember(member2);
        //5.3删除某一条记录,param:id(int类型)
//        memberMapper.deleteMember(5);
//        memberMapper.updateDate(5,"GOOD安全局",1);
        sqlSession.commit();        
        //6.关闭 SqlSession
        sqlSession.close();
        System.out.println("完成");
    }
}
