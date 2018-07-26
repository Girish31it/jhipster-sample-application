package io.github.jhipster.application.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the TestEntity entity.
 */
public class TestEntityDTO implements Serializable {

    private Long id;

    private Long recordId;

    private String lable;

    private String title;

    private String url;

    private Boolean showIcon;

    private String icon;

    private Boolean divider;

    private Integer sortOrder;

    private String type;

    private Integer productId;

    private Integer userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean isShowIcon() {
        return showIcon;
    }

    public void setShowIcon(Boolean showIcon) {
        this.showIcon = showIcon;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean isDivider() {
        return divider;
    }

    public void setDivider(Boolean divider) {
        this.divider = divider;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TestEntityDTO testEntityDTO = (TestEntityDTO) o;
        if (testEntityDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), testEntityDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TestEntityDTO{" +
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
