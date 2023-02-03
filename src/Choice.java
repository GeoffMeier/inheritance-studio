public class Choice {
    private final String content;
    private final boolean coorect;

    public Choice(String content, boolean coorect){
        this.content=content;
        this.coorect=coorect;
    }
    public Choice(String content){
        this(content,false);
    }
}
