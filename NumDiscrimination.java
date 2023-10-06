public class NumDiscrimination {
    public static void main(String[] args) {

        String value = "211o";
        char ch = ' ';
        boolean isNum = true;

        // 반복문과 charAt (int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사
        for (int i=0; i < value.length(); i++) {
            ch = value.charAt(i);

            if(!('0'<=ch && ch<='9')) {
                isNum = false;
                break;
            }
        }
        if (isNum) {
            System.out.println(value+"는 숫자입니다");
        } else {
            System.out.println(value+"는 숫자가 아닙니다");
        }
    }
}

/*
숫자 판별
charAT (int i) 메서드는 문자열에서 i번째 문자를 반환함
'0'<=ch && ch<='9'는 숫자 0~9사이의 문자이면 참이 됨, !를 붙였으니 ch가 숫자가 아니어야 참인 조건식*/
