package srx.awesome.code.hdyl.bean;

public class Group {
    private Integer id;

    private String name;

    public Group(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Group() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}