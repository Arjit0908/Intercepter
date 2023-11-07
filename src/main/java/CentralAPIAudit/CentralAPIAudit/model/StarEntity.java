package CentralAPIAudit.CentralAPIAudit.model;
import CentralAPIAudit.CentralAPIAudit.model.StarEntity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="audit")
@Getter
@Setter
public class StarEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String requestTime;
    private String responseTime;
    private int StatusCode;
    private String timeTaken;
    private String requestURI;
    private String requestMethod;
    private String requestHeaderName;
    private String contentType;
    private String requestID;
    private String hostName;
    private String response;
    private String errorTrace;


    @Override
    public String toString() {
        return "StarEntity{" +
                "id=" + id +
                ", requestTime='" + requestTime + '\'' +
                ", responseTime='" + responseTime + '\'' +
                ", StatusCode=" + StatusCode +
                ", timeTaken='" + timeTaken + '\'' +
                ", requestURI='" + requestURI + '\'' +
                ", requestMethod='" + requestMethod + '\'' +
                ", requestHeaderName='" + requestHeaderName + '\'' +
                ", contentType='" + contentType + '\'' +
                ", requestID='" + requestID + '\'' +
                ", hostName='" + hostName + '\'' +
                ", response='" + response + '\'' +
                ", errorTrace='" + errorTrace + '\'' +
                '}';
    }
}
