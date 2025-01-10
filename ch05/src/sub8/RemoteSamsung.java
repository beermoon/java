package sub8;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("Samsumg - powerOn...");
		
	}

	@Override
	public void powerOff() {
		
		System.out.println("Samsumg - powerOff...");

	}

	@Override
	public void chUp() {
		System.out.println("Samsumg - chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("Samsumg - chDown...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Samsumg - soundUp...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Samsumg - soundDown...");
		
	}

}
