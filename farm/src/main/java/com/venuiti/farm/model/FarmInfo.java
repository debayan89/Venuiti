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
@Table(name="farmInfo")
public class FarmInfo implements Serializable{
	
	@JsonProperty("id")
	  private Long id = null;

	  @JsonProperty("farmId")
	  private Long farmId;

	  @JsonProperty("farmName")
	  private String farmName = null;
	
	 @JsonProperty("plantation")
	  private Plantation plantation = null;

	 
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "farmId", nullable = false)
	public Long getFarmId() {
		return farmId;
	}

	public void setFarmId(Long farmId) {
		this.farmId = farmId;
	}

	@Column(name = "farmName", nullable = false)
	public String getFarmName() {
		return farmName;
	}

	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}

	@JsonProperty("harvest")
	  private Harvest harvest = null;

	    
	    /**
	     * Get plantation
	     * @return plantation
	     **/
	@Column(name = "plantation", nullable = false)
	
	      public Plantation getPlantation() {
	      return plantation;
	    }

	    public void setPlantation(Plantation plantation) {
	      this.plantation = plantation;
	    }


	    /**
	     * Get harvest
	     * @return harvest
	     **/
	    @Column(name = "harvest", nullable = false)
	   
	      public Harvest getHarvest() {
	      return harvest;
	    }

	    public void setHarvest(Harvest harvest) {
	      this.harvest = harvest;
	    }


	    

	    @Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			FarmInfo other = (FarmInfo) obj;
			return Objects.equals(farmId, other.farmId) && Objects.equals(farmName, other.farmName)
					&& Objects.equals(harvest, other.harvest) && Objects.equals(id, other.id)
					&& Objects.equals(plantation, other.plantation);
		}

		@Override
		public int hashCode() {
			return Objects.hash(farmId, farmName, harvest, id, plantation);
		}

	   

	    @Override
		public String toString() {
			return "FarmInfo [id=" + id + ", farmId=" + farmId + ", farmName=" + farmName + ", plantation=" + plantation
					+ ", harvest=" + harvest + "]";
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
