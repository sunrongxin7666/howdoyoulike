package srx.awesome.code.hdyl.bean;

public class GroupMenu {
    private Integer id;

    private Integer groupId;

    private Integer menuId;

    public GroupMenu(Integer id, Integer groupId, Integer menuId) {
        this.id = id;
        this.groupId = groupId;
        this.menuId = menuId;
    }

    public GroupMenu() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}