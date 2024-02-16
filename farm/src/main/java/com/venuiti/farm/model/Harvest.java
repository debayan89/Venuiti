package com.venuiti.farm.model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="harvest")
public class Harvest implements Serializable{

	@JsonProperty("id")
	  private Long id = null;

	  @JsonProperty("harvestId")
	  private Long harvestId = null;

	  @JsonProperty("harvestName")
	  private String harvestName = null;
	  
	  @JsonProperty("farmName")
	  private String farmName = null;

	  @JsonProperty("cropType")
	  private PlantationCropType cropType = null;

	  public Harvest id(Long id) {
	    this.id = id;
	    return this;
	  }

	  /**
	   * Get id
	   * @return id
	   **/
	 
	  	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    public Long getId() {
	    return id;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }
	  
	  
	  public Harvest harvestId(Long harvestId) {
	    this.harvestId = harvestId;
	    return this;
	  }

	  /**
	   * Get harvestId
	   * @return harvestId
	   **/
	  
	  	@Column(name = "harvestId", nullable = false)
	    public Long getHarvestId() {
	    return harvestId;
	  }

	  public void setHarvestId(Long harvestId) {
	    this.harvestId = harvestId;
	  }

	  public Harvest harvestName(String harvestName) {
	    this.harvestName = harvestName;
	    return this;
	  }

	  /**
	   * Get harvestName
	   * @return harvestName
	   **/
	
	  @Column(name = "harvestName", nullable = false)
	    public String getHarvestName() {
	    return harvestName;
	  }

	  public void setHarvestName(String harvestName) {
	    this.harvestName = harvestName;
	  }

	  @Column(name = "cropType", nullable = false)
	  public Harvest cropType(PlantationCropType cropType) {
	    this.cropType = cropType;
	    return this;
	  }
	  
	  
	  @Column(name = "farmName", nullable = false)
	  public String getFarmName() {
		return farmName;
	}

	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}

	/**
	   * Get cropType
	   * @return cropType
	   **/
	  
	    public PlantationCropType getCropType() {
	    return cropType;
	  }

	  public void setCropType(PlantationCropType cropType) {
	    this.cropType = cropType;
	  }


	 
	  @Override
	public String toString() {
		return "Harvest [id=" + id + ", harvestId=" + harvestId + ", harvestName=" + harvestName + ", farmName="
				+ farmName + ", cropType=" + cropType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cropType, farmName, harvestId, harvestName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Harvest other = (Harvest) obj;
		return Objects.equals(cropType, other.cropType) && Objects.equals(farmName, other.farmName)
				&& Objects.equals(harvestId, other.harvestId) && Objects.equals(harvestName, other.harvestName)
				&& Objects.equals(id, other.id);
	}

	/**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }
}
