/*
 * Copyright 2020 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.jmix.uidata.entity;

import io.jmix.core.annotation.TenantId;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.SystemLevel;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.ui.presentation.model.TablePresentation;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.annotation.Nullable;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * A screen presentation settings.
 */
@Entity(name = "ui_TablePresentation")
@JmixEntity
@Table(name = "UI_TABLE_PRESENTATION")
@SystemLevel
public class UiTablePresentation implements TablePresentation, Serializable {
    private static final long serialVersionUID = 15523740205131274L;

    @Id
    @Column(name = "ID")
    @JmixGeneratedValue
    protected UUID id;

    @CreatedDate
    @Column(name = "CREATE_TS")
    protected Date createTs;

    @CreatedBy
    @Column(name = "CREATED_BY", length = 50)
    protected String createdBy;

    @Column(name = "COMPONENT")
    private String componentId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SETTINGS", length = 4000)
    private String settings;

    @Column(name = "USER_LOGIN")
    private String userLogin;

    @Column(name = "IS_AUTO_SAVE")
    private Boolean autoSave;

    @LastModifiedDate
    @Column(name = "UPDATE_TS")
    protected Date updateTs;

    @LastModifiedBy
    @Column(name = "UPDATED_BY", length = 50)
    protected String updatedBy;

    @TenantId
    @Column(name = "SYS_TENANT_ID")
    protected String sysTenantId;

    @Transient
    private Boolean isDefault;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date date) {
        this.createTs = date;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getSysTenantId() {
        return sysTenantId;
    }

    public void setSysTenantId(String sysTenantId) {
        this.sysTenantId = sysTenantId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSettings() {
        return settings;
    }

    @Override
    public void setSettings(String settings) {
        this.settings = settings;
    }

    @Nullable
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(@Nullable String userLogin) {
        this.userLogin = userLogin;
    }

    @Override
    public Boolean getDefault() {
        return isDefault;
    }

    @Override
    public void setDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public Boolean getAutoSave() {
        return autoSave;
    }

    @Override
    public void setAutoSave(Boolean autoSave) {
        this.autoSave = autoSave;
    }

    public String getComponentId() {
        return componentId;
    }

    @Override
    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }
}
