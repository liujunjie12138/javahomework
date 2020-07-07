import club.banyuan.PersonalRecommender;
import club.banyuan.UnknownPersonException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CommonderTest {
    @Test
    public void text() throws UnknownPersonException {
        PersonalRecommender personalRecommender=new PersonalRecommender();
        personalRecommender.add("1", Arrays.asList("1","2","3"));
        personalRecommender.add("2", Arrays.asList("1","2","3","4","5"));
        personalRecommender.likeBoth("1","1","3");
        personalRecommender.likeBoth("1","4","3");
        Assert.assertTrue(personalRecommender.likeBoth("1","1","3"));
        Assert.assertFalse(personalRecommender.likeBoth("1","4","3"));
        try {
            personalRecommender.recommendByPerson("2");
            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<String>list1=personalRecommender.recommendByPerson("2");
        List<String> list =new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list1.containsAll(list);
        Assert.assertTrue(list1.containsAll(list));
//        try {
//            personalRecommender.recommendByProject("5");
//            Assert.fail();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
