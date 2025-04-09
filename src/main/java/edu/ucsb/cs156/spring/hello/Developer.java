package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Andrew C";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "andrewc512";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-10");
        team.addMember("Andrew C");
        team.addMember("Benjamin S");
        team.addMember("Junjie L");
        team.addMember("Matthew Z");
        team.addMember("Mihir K");
        team.addMember("Milad H");
        return team;
    }
}
