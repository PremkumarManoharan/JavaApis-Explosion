package edu.neu.csye6200.plugins;

import edu.neu.csye6200.apis.Explosion;

public class GunShot extends Explosion{
	
	@Override
	public String toString() {
		return "GunShot Explode";
	}

	@Override
	public void explode() {
		// TODO Auto-generated method stub
		System.out.println("GunShot Explode");
	}
	
}
