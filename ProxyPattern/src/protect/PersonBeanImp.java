package protect;

/**
 * Created by Swin on 2016/6/16.
 */
public class PersonBeanImp implements PersonBean {
    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount;

    public PersonBeanImp(String name,String gender,String interests){
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        rating = 0;
        ratingCount = 1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0)
            return 0;
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
