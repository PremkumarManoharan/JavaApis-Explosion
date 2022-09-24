package edu.neu.csye6200.plugins;

import edu.neu.csye6200.apis.AbstractExplosion;

public class GrenadeA extends AbstractExplosion{
	
	@Override
	public String toString() {
		return "GrenadeA Explode";
	}

	@Override
	public void explode() {
		// TODO Auto-generated method stub
		System.out.println("GrenadeA Explode");
	}
}
