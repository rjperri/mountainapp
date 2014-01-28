package org.explorer

class Trail {
	String name
	Long distance
	static hasMany = [landmarks:Landmark]
	
    static constraints = {
		name()
		distance()
    }
	
	String toString(){
		return name
	}
}
