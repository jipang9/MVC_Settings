package hello.servlet.domain.member;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MemberRepositoryTest {

  MemberRepository memberRepository = MemberRepository.getInstance();

  @AfterEach
  void afterEach() {
    memberRepository.clearStore();
  }

  @Test
  void save() {
    //given
    final Member member = new Member("hello", 20);
    //when
    final Member savedMember = memberRepository.save(member);
    //then
    final Member findMember = memberRepository.findById(savedMember.getId());
    assertThat(findMember).isEqualTo(savedMember);
  }

  @Test
  void findAll() {
    //given
    final Member member = new Member("member1", 20);
    final Member member2 = new Member("member2", 30);
    memberRepository.save(member);
    memberRepository.save(member2);
    //when
    final List<Member> Members = memberRepository.findAll();
    //then
    assertThat(Members.size()).isEqualTo(2);
    assertThat(Members).contains(member,member2);
  }
}