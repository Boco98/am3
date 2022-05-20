package org.unibl.etf.pisio.am3.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "location")
public class LocationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "latitude", nullable = false, precision = 6)
    private BigDecimal latitude;
    @Basic
    @Column(name = "longitude", nullable = false, precision = 6)
    private BigDecimal longitude;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "locationByLocationId")
    @JsonIgnore
    private List<AssetEntity> assetsById;
    @ManyToOne
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private UserEntity userByCreatedBy;
    @ManyToOne
    @JoinColumn(name = "updated_by", referencedColumnName = "id")
    private UserEntity userByUpdatedBy;

}
