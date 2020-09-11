package com.elekant.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import com.elekant.domain.Member;
import java.util.List;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Member> findAll() {
        String sql = "SELECT * FROM member";
        TypedQuery<Member> query = em.createQuery(sql, Member.class);
        return query.getResultList();
    }
}
