
public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println( url + "�� �˻��մϴ�.");
	}

	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		System.out.println( "smartTV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println( "smartTV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if( volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� smart����� ���� : " + this.volume);
		

	}
 // ���߻���� �Ұ��� ������, �������̽��� �����ϴ�.
	

}
