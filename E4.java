public class E4 {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32): ch;
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}

/*
논리연산자 ,  문자 에 저장된 문자가 대문자 , ch인 경우에만 소문자로 변경한다 문자코드는 소문자가 대문자보다 만큼 더 크다 예를 . 32 .
들어 의 코드는 이고 의 코드는 이다*/
