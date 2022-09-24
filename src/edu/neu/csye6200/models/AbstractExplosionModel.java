package edu.neu.csye6200.models;

import edu.neu.csye6200.apis.AbstractExplosion;
import edu.neu.csye6200.plugins.GrenadeA;
import edu.neu.csye6200.plugins.GunShotA;

public class AbstractExplosionModel {

	public static void demo() {
		AbstractExplosion explo;
		explo = new GrenadeA();
		explo.explode();
		explo = new GunShotA();
		explo.explode();
	}
	
	
}
