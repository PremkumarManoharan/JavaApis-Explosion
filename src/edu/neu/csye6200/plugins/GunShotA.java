package edu.neu.csye6200.plugins;

import edu.neu.csye6200.apis.AbstractExplosion;

public class GunShotA extends AbstractExplosion{

	@Override
	public String toString() {
		return "GunShotA Explode";
	}

	@Override
	public void explode() {
		// TODO Auto-generated method stub
		System.out.println("GunShotA Explode");
	}
}
