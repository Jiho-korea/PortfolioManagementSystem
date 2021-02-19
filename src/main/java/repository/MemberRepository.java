package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>{
	public Member findById(String id);
	public Member findByIdAndPassword(String id, String Password);

}
