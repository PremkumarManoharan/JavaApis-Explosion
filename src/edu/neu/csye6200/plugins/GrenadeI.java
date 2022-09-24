package edu.neu.csye6200.plugins;
import edu.neu.csye6200.apis.Explodable;

public class GrenadeI implements Explodable{
	
	@Override
	public String toString() {
		return "GrenadeI Explode";
	}

	@Override
	public void explode() {
		// TODO Auto-generated method stub
		System.out.println("GrenadeI Explode");
	}

}
