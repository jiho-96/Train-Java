class C {
    void autoPlay(I i){
        i.play();
    }
}

interface I {
    public abstract void play();
}

class D implements I {
    public void play(){
        System.out.println("play in D class");
    }
}

class E implements  I {
    public void play() {
        System.out.println("play in E class");
    }
}
class InterfaceTest2 {
    public static void main(String[] args) {
        C c = new C();

        // void autoPlay(I i) 호출
        c.autoPlay(new D());
        c.autoPlay(new E());
    }
}
