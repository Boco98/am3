package org.unibl.etf.pisio.am3.models.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@Entity
@Table(name = "asset")
public class AssetEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "identifier", nullable = false, length = 50)
    private String identifier;
    @Basic
    @Column(name = "name", nullable = false, length = 120)
    private String name;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "asset_type_id", nullable = false)
    private Integer assetTypeId;
    @Basic
    @Column(name = "asset_status_id", nullable = false)
    private Integer assetStatusId;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    private LocationEntity locationByLocationId;
    @ManyToOne
    @JoinColumn(name = "asset_type_id", referencedColumnName = "id", nullable = false)
    private AssetTypeEntity assetTypeByAssetTypeId;
    @ManyToOne
    @JoinColumn(name = "asset_status_id", referencedColumnName = "id", nullable = false)
    private AssetStatusEntity assetStatusByAssetStatusId;
    @ManyToOne
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private UserEntity userByCreatedBy;
    @ManyToOne
    @JoinColumn(name = "updated_by", referencedColumnName = "id")
    private UserEntity userByUpdatedBy;

}
