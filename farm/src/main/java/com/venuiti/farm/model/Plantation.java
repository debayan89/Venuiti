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
@Table(name="plantation")
public class Plantation implements Serializable{
	

	 @JsonProperty("id")
	  private Long id = null;

	  @JsonProperty("plantationId")
	  private Long plantationId = null;

	  @JsonProperty("plantationArea")
	  private Integer plantationArea = null;
	  
	  @JsonProperty("farmName")
	  private String farmName = null;

	  @JsonProperty("cropType")
	  private PlantationCropType cropType = null;

	  public Plantation id(Long id) {
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

	  public Plantation plantationId(Long plantationId) {
	    this.plantationId = plantationId;
	    return this;
	  }

	  /**
	   * Get plantationId
	   * @return plantationId
	   **/
	
	  @Column(name = "plantationId", nullable = false)
	    public Long getPlantationId() {
	    return plantationId;
	  }

	  public void setPlantationId(Long plantationId) {
	    this.plantationId = plantationId;
	  }

	  public Plantation plantationArea(Integer plantationArea) {
	    this.plantationArea = plantationArea;
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
	   * Get plantationArea
	   * @return plantationArea
	   **/

	  @Column(name = "plantationArea", nullable = false)
	    public Integer getPlantationArea() {
	    return plantationArea;
	  }

	  public void setPlantationArea(Integer plantationArea) {
	    this.plantationArea = plantationArea;
	  }

	  @Column(name = "cropType", nullable = false)
	 
	  public Plantation cropType(PlantationCropType cropType) {
	    this.cropType = cropType;
	    return this;
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
		return "Plantation [id=" + id + ", plantationId=" + plantationId + ", plantationArea=" + plantationArea
				+ ", farmName=" + farmName + ", cropType=" + cropType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cropType, farmName, id, plantationArea, plantationId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plantation other = (Plantation) obj;
		return Objects.equals(cropType, other.cropType) && Objects.equals(farmName, other.farmName)
				&& Objects.equals(id, other.id) && Objects.equals(plantationArea, other.plantationArea)
				&& Objects.equals(plantationId, other.plantationId);
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
