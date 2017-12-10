package srx.awesome.code.hdyl.bean;

public class Ad {
    private Integer id;

    private String title;

    private String imgFileName;

    private String link;

    private Integer weight;

    public Ad(Integer id, String title, String imgFileName, String link, Integer weight) {
        this.id = id;
        this.title = title;
        this.imgFileName = imgFileName;
        this.link = link;
        this.weight = weight;
    }

    public Ad() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName == null ? null : imgFileName.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}