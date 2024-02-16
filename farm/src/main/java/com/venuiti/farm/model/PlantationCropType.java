package com.venuiti.farm.model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="plantationCropType")
public class PlantationCropType implements Serializable{
	
	 @JsonProperty("id")
	  private Long id = null;

	  @JsonProperty("cropName")
	  private String cropName = null;

	  @JsonProperty("amount")
	  private Long amount = null;
	  
	  @JsonProperty("seasonYear")
	  private int seasonYear;

	  public PlantationCropType id(Long id) {
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

	  public PlantationCropType cropName(String cropName) {
	    this.cropName = cropName;
	    return this;
	  }

	  /**
	   * Get cropName
	   * @return cropName
	   **/
	
	  
	  @Column(name = "cropName", nullable = false)
	    public String getCropName() {
	    return cropName;
	  }

	  public void setCropName(String cropName) {
	    this.cropName = cropName;
	  }

	  public PlantationCropType amount(Long amount) {
	    this.amount = amount;
	    return this;
	  }
	  
	  
	  @Column(name = "seasonYear", nullable = false)
	  public int getSeasonYear() {
		return seasonYear;
	}

	public void setSeasonYear(int seasonYear) {
		this.seasonYear = seasonYear;
	}

	/**
	   * Get amount
	   * @return amount
	   **/
	 
	  @Column(name = "amount", nullable = false)
	    public Long getAmount() {
	    return amount;
	  }

	  public void setAmount(Long amount) {
	    this.amount = amount;
	  }



	  @Override
	public String toString() {
		return "PlantationCropType [id=" + id + ", cropName=" + cropName + ", amount=" + amount + ", seasonYear="
				+ seasonYear + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, cropName, id, seasonYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlantationCropType other = (PlantationCropType) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(cropName, other.cropName)
				&& Objects.equals(id, other.id) && Objects.equals(seasonYear, other.seasonYear);
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
