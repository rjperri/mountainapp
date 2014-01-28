package org.explorer

class Landmark {
	
	String name
	Integer elevation
	
	static hasMany=[trails:Trail]
	static belongsTo = [Trail, LandmarkType]

	
    static constraints = {
		name()
		elevation()
    }
	
	String toString(){
		return name
	}
}
