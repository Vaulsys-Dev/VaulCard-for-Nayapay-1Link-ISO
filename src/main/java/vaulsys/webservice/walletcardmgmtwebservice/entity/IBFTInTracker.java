package vaulsys.webservice.walletcardmgmtwebservice.entity;

import vaulsys.persistence.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "IBFT_IN_TRACKER")
@PrimaryKeyJoinColumn(name = "ID")
public class IBFTInTracker extends BaseEntity<Long> {
    @Id
    @GeneratedValue(generator="IBFT_IN_TRACKER_SEQ-gen")
    @org.hibernate.annotations.GenericGenerator(name = "IBFT_IN_TRACKER_SEQ-gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "optimizer", value = "pooled"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "IBFT_IN_TRACKER_SEQ")
            })
    private Long id;

    @Column(name = "SERVICENAME")
    private String servicename;

    @Column(name = "STAN")
    private String stan;

    @Column(name = "RRN")
    private String rrn;

    @Column(name = "TRANSDATETIME")
    private String transdatetime;

    @Column(name = "LOG_DATE")
    private Date logDate = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getTransdatetime() {
        return transdatetime;
    }

    public void setTransdatetime(String transdatetime) {
        this.transdatetime = transdatetime;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }
}
