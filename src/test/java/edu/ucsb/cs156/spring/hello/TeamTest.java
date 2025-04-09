package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object() {
        assert(team.equals(team));
    }

    @Test
    public void equals_different_object() {
        String notATeam = "Not a team";
        assert(!team.equals(notATeam));
    }

    @Test
    public void equals_same_fields(){
        Team team2 = new Team("test-team");
        assert(team.equals(team2));
    }

    @Test
    public void equals_diff_names(){
        Team team2 = new Team("test-team-2");
        assert(!team.equals(team2));
    }

    @Test
    public void hashCode_same_name(){
        Team team2 = new Team("test-team");
        assert(team.hashCode() == team2.hashCode());
    }

    @Test
    public void hashCode_diff_name(){
        Team team2 = new Team("test-team-2");
        assert(team.hashCode() != team2.hashCode());
    }

    @Test
    public void hashCode_diff_mems(){
        Team team2 = new Team("test-team");
        team2.addMember("Gaucho");
        assert(team.hashCode() != team2.hashCode());
    }

    @Test
    public void hashCode_diff_names_and_mems(){
        Team team2 = new Team("test-team-2");
        team2.addMember("Gaucho");
        assert(team.hashCode() != team2.hashCode());
    }

    @Test
    public void hashCode_replace_and(){
        int hash1 = team.hashCode();
        int hash2 = team.getName().hashCode() & team.getMembers().hashCode();
        assert(hash1 != hash2);
    }
}
