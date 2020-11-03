package com.dmstjd1024.pattern.gumballProxyPattern;

import java.rmi.Naming;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachineRemote gumballMachine = null;
		int count;
		if( args.length < 1) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}

		try {
			count = Integer.parseInt(args[1]);
			
			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
