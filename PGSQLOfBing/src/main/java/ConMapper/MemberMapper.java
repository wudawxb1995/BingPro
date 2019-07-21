package ConMapper;
import org.apache.ibatis.annotations.Param;

import ConObj.Member;
public interface MemberMapper {
	public Member getMember(Integer id);
	public int insertMember(Member member);
	public int deleteMember(Integer id);
	public int getAllCount();
	public int updateDate(@Param("id")Integer id,@Param("department")String department,@Param("ManageLevel")Integer ManageLevel);
}
