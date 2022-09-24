package edu.neu.csye6200.plugins;

import edu.neu.csye6200.apis.Explosion;

public class Grenade extends Explosion{
	
	@Override
	public String toString() {
		return "Grenade Explode";
	}

	@Override
	public void explode() {
		// TODO Auto-generated method stub
		System.out.println("Grenade Explode");
	}
}
