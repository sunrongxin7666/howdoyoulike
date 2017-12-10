package srx.awesome.code.hdyl.bean;

public class Action {
    private Integer id;

    private String name;

    private String url;

    private Integer menuId;

    private String method;

    public Action(Integer id, String name, String url, Integer menuId, String method) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.menuId = menuId;
        this.method = method;
    }

    public Action() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}