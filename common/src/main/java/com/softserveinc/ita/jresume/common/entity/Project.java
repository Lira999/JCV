package com.softserveinc.ita.jresume.common.entity;

import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;

/**
 * This class describes Project entity which stores the information about
 * projects in which the developer has been involved.
 * 
 * This Project entity has a many to one relationship with the UserInformation
 * entity.
 * 
 * @author Andriy Luchko
 */
@Entity
@Table(name = "project")
public class Project extends Base {
    
    /**
     * Project description.
     */
    @Column(name = "description")
    private String description;
    
    /**
     * Describes project's customer.
     */
    @Column(name = "customer")
    private String customer;
    
    /**
     * Describes the role of which was involved.
     */
    @Column(name = "projectRole")
    private String projectRole;
    
    /**
     * Describes project's team size.
     */
    @Column(name = "projectTeamSize")
    private Long projectTeamSize;
    
    /**
     * Describes involvement duration in a project.
     */
    @Column(name = "involvementDuration")
    private Time involvementDuration;
    
    /**
     * Describes tools and technologies which were used in a project.
     */
    @Column(name = "tools")
    private String tools;
    
    /**
     * Project associates with UserInformation. Many to one relationship,
     * references to usetInformation table
     */
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "usetInformationId")
    private UserInformation usetInformation;
    
    /**
     * Public constructor.
     */
    public Project() {
    }
    
    /**
     * Sets the project description.
     * 
     * @param newDescription
     *            description to set
     */
    public final void setDescription(final String newDescription) {
        description = newDescription;
    }
    
    /**
     * Sets the project's customer.
     * 
     * @param newCustomer
     *            name of a customer
     */
    public final void setCustomer(final String newCustomer) {
        customer = newCustomer;
    }
    
    /**
     * Sets the project role of a developer.
     * 
     * @param newProjectRole
     *            description of a developer's position
     */
    public final void setProjectRole(final String newProjectRole) {
        projectRole = newProjectRole;
    }
    
    /**
     * Sets the team size of a project.
     * 
     * @param newProjectTeamSize
     *            count of workers in a team
     */
    public final void setProjectTeamSize(final Long newProjectTeamSize) {
        projectTeamSize = newProjectTeamSize;
    }
    
    /**
     * Sets the project tools and technologies.
     * 
     * @param newTools
     *            tools and technologies were involved in a project
     */
    public final void setTools(final String newTools) {
        tools = newTools;
    }
    
    /**
     * Sets the involvement duration of a developer in a project.
     * 
     * @param newInvolvementDuration
     *            description of a time to be involvement
     */
    public final void setInvolvementDuration(
            final Time newInvolvementDuration) {
        involvementDuration = newInvolvementDuration;
    }
    
    /**
     * Changes information about user associated with this project.
     * 
     * @param newUsetInformation
     *            information about user.
     */
    public final void setUsetInformation(
            final UserInformation newUsetInformation) {
        usetInformation = newUsetInformation;
    }
    
    /**
     * Get value of field description.
     * 
     * @return value of column description
     */
    public final String getDescription() {
        return description;
    }
    
    /**
     * Get value of field customer.
     * 
     * @return customer of a project
     */
    public final String getCustomer() {
        return customer;
    }
    
    /**
     * Get value of field projectRole.
     * 
     * @return projectRole of a developer in a project
     */
    public final String getProjectRole() {
        return projectRole;
    }
    
    /**
     * Get value of field projectTeamSize.
     * 
     * @return number of workers which were involved in a project
     */
    public final Long getProjectTeamSize() {
        return projectTeamSize;
    }
    
    /**
     * Get value of field involvementDuration.
     * 
     * @return time have been spent in a project
     */
    public final Time getInvolvementDuration() {
        return involvementDuration;
    }
    
    /**
     * Get value of field tools.
     * 
     * @return tools and technologies which were used in a project
     */
    public final String getTools() {
        return tools;
    }
    
    /**
     * Gets information about user associated with this project.
     * 
     * @return information about user associated with this project.
     */
    public final UserInformation getUsetInformation() {
        return usetInformation;
    }
    
}