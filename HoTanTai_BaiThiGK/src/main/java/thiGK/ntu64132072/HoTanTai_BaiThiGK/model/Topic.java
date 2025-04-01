package thiGK.ntu64132072.HoTanTai_BaiThiGK.model;

public class Topic {
	private int id;
	private String topicName;
    private String topicDescription;
    private int supervisorId;
    private String topicType;
    private String viewUrl;
    private String editUrl;
    private String deleteUrl;
    
    public Topic(int id, String topicName, String topicDescription, int supervisorId, String topicType, String viewUrl, String editUrl, String deleteUrl) {
        this.id = id;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
        this.supervisorId = supervisorId;
        this.topicType = topicType;
        this.viewUrl = viewUrl;
        this.editUrl = editUrl;
        this.deleteUrl = deleteUrl;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTopicName() { return topicName; }
    public void setTopicName(String topicName) { this.topicName = topicName; }

    public String getTopicDescription() { return topicDescription; }
    public void setTopicDescription(String topicDescription) { this.topicDescription = topicDescription; }

    public int getSupervisorId() { return supervisorId; }
    public void setSupervisorId(int supervisorId) { this.supervisorId = supervisorId; }

    public String getTopicType() { return topicType; }
    public void setTopicType(String topicType) { this.topicType = topicType; }
    
    public String getViewUrl() {
        return viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }

    public String getEditUrl() {
        return editUrl;
    }

    public void setEditUrl(String editUrl) {
        this.editUrl = editUrl;
    }

    public String getDeleteUrl() {
        return deleteUrl;
    }

    public void setDeleteUrl(String deleteUrl) {
        this.deleteUrl = deleteUrl;
    }
}
