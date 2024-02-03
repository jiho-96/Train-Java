public class Geo { // 클래스
    // 멤버변수를 보호하기 위한 private 멤버변수 선언과 public 메서드를 만들어 사용하는 방법을 은닉화
    private double latitude; // 외부에 노출 x
    private double longitude; // 외부에 노출 x

    public double getLatitude(){ // 멤버변수를 외부에 노출시킬 때 getter
        return latitude;
    }

    public void setLatitude(double latitude){ // 멤버변수에 값을 넣을 때 setter
        this.latitude = latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }
}
