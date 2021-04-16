package LinkedInJavaEssential;

public class Disease {

    private String name;
    public boolean curable;

    Disease(String title, boolean isCurable) {
        this.curable = isCurable;
        this.name = title;
    }
}
