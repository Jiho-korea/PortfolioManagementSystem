package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>{
	public Member findByMemberId(String memberId);
	public Member findByMemberIdAndMemberPw(String memberId, String memberPw);


}
