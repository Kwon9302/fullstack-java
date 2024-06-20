package afternoon.speak;

public class SpeakerOption {
    private int volume;

     SpeakerOption() {
        this.volume = 20;
    }

    void volumeUp(){
         this.volume++;
        isVolumeMaxMin();
    }

    void volumeDown(){
         this.volume--;
        isVolumeMaxMin();
    }

    void volumeMute(){
        this.volume = 0;
        System.out.println("스피커가 Mute되었습니다");
    }

    // 볼륨 최대 최소 판단
    void isVolumeMaxMin(){
         boolean isMaxMin = true;
         if(this.volume > 100){
             this.volume = 100;
             isMaxMin = false;
         } else if(this.volume < 0){
             this.volume = 0;
             isMaxMin = false;
         }
         if(isMaxMin){
             System.out.println("더이상 볼륨을 조절할 수 없습니다.");
         }
    }

}
