package edu.neu.csye6200.models;

import edu.neu.csye6200.plugins.*;

public class ExplosionObjectModel {

	public static void demo() {
		AbstractExplosionModel.demo(); 
		ExplosionModel.demo();
		ExplodableModel.demo();
		
		System.out.println("===========Using Object API=============");
		Object obj = new Object();
		
		obj = new GrenadeA();
		System.out.println(obj.toString());
		
		obj = new GunShotA();
		System.out.println(obj.toString());
		
		obj = new Grenade();
		System.out.println(obj.toString());
		
		obj = new GunShot();
		System.out.println(obj.toString());
		
		obj = new GrenadeI();
		System.out.println(obj.toString());
		
		obj = new GunShotI();
		System.out.println(obj.toString());
		
		
	}
}
