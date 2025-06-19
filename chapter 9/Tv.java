public class Tv {
	int Channel = 1;
	int volumeLevel = 1;
	Boolean on = false;

public Tv(){
}
public void turnon() {
	on = true;
}
public void turnoff() {
	on = false;
}
public void setChannel(int newChannel){
	if(on && newChannel >= 1 && newChannel <= 120)
	Channel = newChannel;
}
public void setVolume(int newVolumeLevel) {
	if(on && newVolumeLevel >=1 && newVolumeLevel <= 7)
	volumeLevel = newVolumeLevel;
}
public void channelUp() {
	if(on && Channel < 120)
	Channel++;
}
public void channelDown(){
	if(on && Channel > 1)
	Channel--;
}
public void volumeUp() {
	if(on && volumeLevel < 7)
	volumeLevel++;
}
public void volumeDown() {
	if(on && volumeLevel > 1)
	volumeLevel--;
}
}