package club.banyuan;

import java.util.*;

public class PersonalRecommender implements PersonalRecom {
    private Map<String, List<String>> likes=new HashMap<>();
    //List<String> list=new LinkedList<>();

    @Override
    public void add(String name, List<String> project){
        if(name==null||project==null)
            throw new IllegalArgumentException();
        likes.put(name,project);
    }

    @Override
    public boolean likeBoth(String name, String project1, String project2) throws UnknownPersonException {
        List<String> list=likes.get(name);
        if (list==null){
            throw new UnknownPersonException();
        }
        return  (list.contains(project1)&&list.contains(project2));
    }

    @Override
    public List<String> recommendByPerson(String name){
        List<String> list=likes.get(name);
        Set<String> result=new HashSet<>();
        for (List<String> one:likes.values()) {
            List<String> list1=new ArrayList<>(one);
            list1.retainAll(list);
            if (list1.size()>0){
                list.addAll(one);
            }

        }
        result.addAll(list);
        return new LinkedList<>(result);
    }
    @Override
    public List<String> recommendByProject(String project){
        Set<String> result=new HashSet<>();
        List<String> list=new LinkedList<>(result);
        for (List<String> value : likes.values()) {
            if (value.contains(project)){
                result.addAll(value);
            }
        }
        list.addAll(result);
        return list;
    }

}
