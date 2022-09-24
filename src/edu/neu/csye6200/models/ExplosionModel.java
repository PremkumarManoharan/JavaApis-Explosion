package edu.neu.csye6200.models;
import edu.neu.csye6200.apis.Explosion;
import edu.neu.csye6200.plugins.Grenade;
import edu.neu.csye6200.plugins.GunShot;


public class ExplosionModel {

	public static void demo() {
		Explosion explo;
		explo = new Grenade();
		explo.explode();
		explo = new GunShot();
		explo.explode();
	}
}
