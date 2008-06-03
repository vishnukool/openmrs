/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs;


/**
 * The ConceptNumeric extends upon the Concept object by adding some
 * number range values 
 * 
 * @see Concept
 */
public class ConceptNumeric extends Concept implements java.io.Serializable {

	public static final long serialVersionUID = 47323L;

	// Fields

	private Double hiAbsolute;
	private Double hiCritical;
	private Double hiNormal;
	private Double lowAbsolute;
	private Double lowCritical;
	private Double lowNormal;
	private String units;
	private Boolean precise = false;

	// Constructors

	/** default constructor */
	public ConceptNumeric() {
	}
	
	/**
	 * Generic constructor taking the primary key
	 * 
	 * @param conceptId key for this numeric concept
	 */
	public ConceptNumeric(Integer conceptId) {
		setConceptId(conceptId);
	}
	
	/**
	 * Optional constructor for turning a Concept into a ConceptNumeric
	 * Note: This cannot copy over numeric specific values
	 * @param c
	 */
	public ConceptNumeric(Concept c) {
		this.setAnswers(c.getAnswers(true));
		this.setChangedBy(c.getChangedBy());
		this.setConceptClass(c.getConceptClass());
		this.setConceptId(c.getConceptId());
		this.setConceptSets(c.getConceptSets());
		this.setCreator(c.getCreator());
		this.setDatatype(c.getDatatype());
		this.setDateChanged(c.getDateChanged());
		this.setDateCreated(c.getDateCreated());
		this.setSet(c.isSet());
		this.setNames(c.getNames());
		this.setRetired(c.getRetired());
		this.setSynonyms(c.getSynonyms());
		this.setVersion(c.getVersion());
		
		this.hiAbsolute  = null;
		this.hiCritical  = null;
		this.hiNormal    = null;
		this.lowAbsolute = null;
		this.lowCritical = null;
		this.lowNormal   = null;
		this.units     = "";
		this.precise   = false;
	}

	/**
	 * @see org.openmrs.Concept#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj instanceof ConceptNumeric) {
			ConceptNumeric c = (ConceptNumeric)obj;
			return (this.getConceptId().equals(c.getConceptId()));
		}
		return false;
	}
	
	/**
	 * @see org.openmrs.Concept#hashCode()
	 */
	public int hashCode() {
		if (getConceptId() == null) return super.hashCode();
		int hash = 6;
		if (getConceptId() != null)
			hash = hash + getConceptId().hashCode() * 31;
		return hash;
	}

	// Property accessors

	/**
	 * 
	 */
	public Double getHiAbsolute() {
		return this.hiAbsolute;
	}

	public void setHiAbsolute(Double hiAbsolute) {
		this.hiAbsolute = hiAbsolute;
	}

	/**
	 * 
	 */
	public Double getHiCritical() {
		return this.hiCritical;
	}

	public void setHiCritical(Double hiCritical) {
		this.hiCritical = hiCritical;
	}

	/**
	 * 
	 */
	public Double getHiNormal() {
		return this.hiNormal;
	}

	public void setHiNormal(Double hiNormal) {
		this.hiNormal = hiNormal;
	}

	/**
	 * 
	 */
	public Double getLowAbsolute() {
		return this.lowAbsolute;
	}

	public void setLowAbsolute(Double lowAbsolute) {
		this.lowAbsolute = lowAbsolute;
	}

	/**
	 * 
	 */
	public Double getLowCritical() {
		return this.lowCritical;
	}

	public void setLowCritical(Double lowCritical) {
		this.lowCritical = lowCritical;
	}

	/**
	 * 
	 */
	public Double getLowNormal() {
		return this.lowNormal;
	}

	public void setLowNormal(Double lowNormal) {
		this.lowNormal = lowNormal;
	}

	/**
	 * 
	 */
	public String getUnits() {
		return this.units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public Boolean isPrecise() {
		return (precise == null ? false : precise);
	}
	
	public Boolean getPrecise() {
		return isPrecise();
	}

	public void setPrecise(Boolean precise) {
		this.precise = precise;
	}
	
	public boolean isNumeric() {
		return (getDatatype().getName().equals("Numeric"));
	}
}