package edu.neu.csye6200.models;

import edu.neu.csye6200.apis.Explodable;
import edu.neu.csye6200.plugins.GrenadeI;
import edu.neu.csye6200.plugins.GunShotI;

public class ExplodableModel {
	
	public static void demo() {
		Explodable explo;
		explo = new GrenadeI();
		explo.explode();
		explo = new GunShotI();
		explo.explode();
	}

}
