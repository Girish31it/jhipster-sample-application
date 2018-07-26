package io.github.jhipster.application.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A TestEntity.
 */
@Entity
@Table(name = "test_entity")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TestEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "record_id")
    private Long recordId;

    @Column(name = "lable")
    private String lable;

    @Column(name = "title")
    private String title;

    @Column(name = "url")
    private String url;

    @Column(name = "show_icon")
    private Boolean showIcon;

    @Column(name = "icon")
    private String icon;

    @Column(name = "divider")
    private Boolean divider;

    @Column(name = "sort_order")
    private Integer sortOrder;

    @Column(name = "jhi_type")
    private String type;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "user_id")
    private Integer userId;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecordId() {
        return recordId;
    }

    public TestEntity recordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getLable() {
        return lable;
    }

    public TestEntity lable(String lable) {
        this.lable = lable;
        return this;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getTitle() {
        return title;
    }

    public TestEntity title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public TestEntity url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean isShowIcon() {
        return showIcon;
    }

    public TestEntity showIcon(Boolean showIcon) {
        this.showIcon = showIcon;
        return this;
    }

    public void setShowIcon(Boolean showIcon) {
        this.showIcon = showIcon;
    }

    public String getIcon() {
        return icon;
    }

    public TestEntity icon(String icon) {
        this.icon = icon;
        return this;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean isDivider() {
        return divider;
    }

    public TestEntity divider(Boolean divider) {
        this.divider = divider;
        return this;
    }

    public void setDivider(Boolean divider) {
        this.divider = divider;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public TestEntity sortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getType() {
        return type;
    }

    public TestEntity type(String type) {
        this.type = type;
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getProductId() {
        return productId;
    }

    public TestEntity productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public TestEntity userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestEntity testEntity = (TestEntity) o;
        if (testEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), testEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TestEntity{" +
            "id=" + getId() +
            ", recordId=" + getRecordId() +
            ", lable='" + getLable() + "'" +
            ", title='" + getTitle() + "'" +
            ", url='" + getUrl() + "'" +
            ", showIcon='" + isShowIcon() + "'" +
            ", icon='" + getIcon() + "'" +
            ", divider='" + isDivider() + "'" +
            ", sortOrder=" + getSortOrder() +
            ", type='" + getType() + "'" +
            ", productId=" + getProductId() +
            ", userId=" + getUserId() +
            "}";
    }
}
