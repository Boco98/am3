package org.unibl.etf.pisio.am3.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "username", nullable = false, length = 100)
    private String username;
    @Basic
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Basic
    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;
    @Basic
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    @Basic
    @Column(name = "role", nullable = false)
    private Byte role;
    @Basic
    @Column(name = "status", nullable = false)
    private Byte status;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "userByCreatedBy")
    @JsonIgnore
    private List<AssetEntity> assetsById;
    @OneToMany(mappedBy = "userByUpdatedBy")
    @JsonIgnore
    private List<AssetEntity> assetsById_0;
    @OneToMany(mappedBy = "userByCreatedBy")
    @JsonIgnore
    private List<AssetStatusEntity> assetStatusesById;
    @OneToMany(mappedBy = "userByUpdatedBy")
    @JsonIgnore
    private List<AssetStatusEntity> assetStatusesById_0;
    @OneToMany(mappedBy = "userByCreatedBy")
    @JsonIgnore
    private List<AssetTypeEntity> assetTypesById;
    @OneToMany(mappedBy = "userByUpdatedBy")
    @JsonIgnore
    private List<AssetTypeEntity> assetTypesById_0;
    @OneToMany(mappedBy = "userByCreatedBy")
    @JsonIgnore
    private List<LocationEntity> locationsById;
    @OneToMany(mappedBy = "userByUpdatedBy")
    @JsonIgnore
    private List<LocationEntity> locationsById_0;
    @ManyToOne
    @JoinColumn(name = "updated_by", referencedColumnName = "id")
    private UserEntity userByUpdatedBy;
    @OneToMany(mappedBy = "userByUpdatedBy")
    @JsonIgnore
    private List<UserEntity> usersById;

}
