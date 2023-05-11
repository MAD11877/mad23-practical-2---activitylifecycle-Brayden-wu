package sg.edu.np.mad.madpractical;

public class User {
    private String name;
    private String description;
    private boolean followed;

    public User(String name, String description, boolean followed) {
        this.name = name;
        this.description = description;
        this.followed = followed;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}
