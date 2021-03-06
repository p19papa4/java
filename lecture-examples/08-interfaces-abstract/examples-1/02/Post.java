import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Post {
    private String username;
    protected long timestamp;
    private int likes;
    
    public Post(String username) {
        this.username = username;
        this.timestamp =  Long.parseLong((new SimpleDateFormat("yyyyMMddHHmm")).format(new Date()));
    }
    
    public void increaseLikes() {
        this.likes++;
    }
    public int getLikes() {
        return this.likes;
    }
    protected void resetLikes() {
        this.likes = 0;
    }
    public String getUsername() {
        return this.username;
    }
    public long getTimestamp() {
        return this.timestamp;
    }
    
    public String toString() {
        return  "by "+ this.username +
                " @ "+this.timestamp+"\n"+
                "Liked "+this.likes+" times.";

    }
    
    public abstract String render();
}