package org.explorer

class LandmarkType {
	
	String name
	String description
	
	static hasMany = [landmarks:Landmark]

    static constraints = {
		name()
		description()
    }
	
	String toString(){
		return name
	}
}
