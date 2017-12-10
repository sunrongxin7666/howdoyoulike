package srx.awesome.code.hdyl.bean;

public class GroupAction {
    private Integer id;

    private Integer groupId;

    private Integer actionId;

    public GroupAction(Integer id, Integer groupId, Integer actionId) {
        this.id = id;
        this.groupId = groupId;
        this.actionId = actionId;
    }

    public GroupAction() {
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

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }
}