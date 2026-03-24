package thiGK.ntu65131508caitrandangkhoi_fitcms.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "topic") 
public class Topic {
    
    @Id 
    @Column(name = "id") 
    private String id;
    
    @Column(name = "topic_name") 
    private String topicName;
    
    @Column(name = "topic_description") 
    private String topicDescription;
    
    @Column(name = "supervisor_id") 
    private String supervisorId;
    
    @Column(name = "topic_type") 
    private String topicType;

    
    
    public Topic() {
    }

    public Topic(String id, String topicName, String topicDescription, String supervisorId, String topicType) {
        this.id = id;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
        this.supervisorId = supervisorId;
        this.topicType = topicType;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTopicName() { return topicName; }
    public void setTopicName(String topicName) { this.topicName = topicName; }

    public String getTopicDescription() { return topicDescription; }
    public void setTopicDescription(String topicDescription) { this.topicDescription = topicDescription; }

    public String getSupervisorId() { return supervisorId; }
    public void setSupervisorId(String supervisorId) { this.supervisorId = supervisorId; }

    public String getTopicType() { return topicType; }
    public void setTopicType(String topicType) { this.topicType = topicType; }
}