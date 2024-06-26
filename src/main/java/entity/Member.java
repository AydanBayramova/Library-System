package entity;

import java.util.List;
import java.util.Objects;

public class Member {
    private Long id;
    private String name;
    private String email;
    private List<Loan> loans;

    public Member(Long id, String name, String email, List<Loan> loans) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.loans = loans;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(name, member.name) && Objects.equals(email, member.email) && Objects.equals(loans, member.loans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, loans);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", loans=" + loans +
                '}';
    }
}
