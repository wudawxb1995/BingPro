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
        //1.��ȡ�����ļ�
        String resource  = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //2.���������ļ����� SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //3.ͨ�� SqlSessionFactory ���� SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.��ȡ����
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        //5.1��ѯĳһ����¼
        Member member1 = new Member();
        member1 = memberMapper.getMember(2);
        System.out.println("ID:"+member1.getId()+" ���ţ�"+member1.getdepartment()+" Ȩ�޵ȼ���"+member1.getManageLevel());
        //5.2����ĳһ����¼
        int count_data = memberMapper.getAllCount();
        Member member2 = new Member();
        member2.setId(count_data+1);
        member2.setdepartment("������ȫ��");
        member2.setManageLevel(1);
        memberMapper.insertMember(member2);
        //5.3ɾ��ĳһ����¼,param:id(int����)
//        memberMapper.deleteMember(5);
//        memberMapper.updateDate(5,"GOOD��ȫ��",1);
        sqlSession.commit();        
        //6.�ر� SqlSession
        sqlSession.close();
        System.out.println("���");
    }
}
