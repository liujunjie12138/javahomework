package club.banyuan;

import java.util.List;

public interface PersonalRecom {
    void add(String name, List<String> project);

    boolean likeBoth(String name, String project1, String project2) throws UnknownPersonException;

    List<String> recommendByPerson(String name);

    List<String> recommendByProject(String project);
}
