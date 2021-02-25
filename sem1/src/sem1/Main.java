package sem1;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;
import clase.ZooKeeper;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello");
		Zoo zoo=new Zoo();
		ZooKeeper keeper=new ZooKeeper();
		zoo.setKeeper(keeper);
		Zebra zebra1=new Zebra("zebra1");
		Zebra zebra2=new Zebra("zebra2");
		zoo.addAnimal(zebra1);
		zoo.addAnimal(zebra2);
		zoo.feedAll();
		Giraffe giraffe1=new Giraffe("girafa1");
		Giraffe giraffe2=new Giraffe("girafa2");
		zoo.addAnimal(giraffe1);
		zoo.addAnimal(giraffe2);
		zoo.feedAll();
		
		
	}

}
