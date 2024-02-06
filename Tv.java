public class Tv {
    boolean power;
    int channel;
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class VCR{
    boolean power;
    int counter = 0;
    void power() {
        power = !power;
    }

    void play() {
        if (power) {
            System.out.println("VCR 재생 시작");
        } else {
            System.out.println("VCR 전원이 꺼져 있습니다.");
        }
    }

    void stop() {
        if (power) {
            System.out.println("VCR 재생 중지");
        } else {
            System.out.println("VCR 전원이 꺼져 있습니다.");
        }
    }

    void rew() {
        if (power) {
            System.out.println("VCR 되감기");
        } else {
            System.out.println("VCR 전원이 꺼져 있습니다.");
        }
    }

    void ff() {
        if (power) {
            System.out.println("VCR 빨리 감기");
        } else {
            System.out.println("VCR 전원이 꺼져 있습니다.");
        }
    }
}

class TVCR extends Tv{
    VCR vcr = new VCR();

    void play(){
        vcr.play();
    }
    void stop(){
        vcr.stop();
    }
    void rew(){
        vcr.rew();
    }

    void ff(){
        vcr.ff();
    }
}


class test {
    public static void main(String[] args) {
        TVCR tvcr = new TVCR();

        tvcr.power();

        tvcr.channelUp();

        tvcr.play();

        tvcr.channelDown();

        tvcr.stop();
    }
}