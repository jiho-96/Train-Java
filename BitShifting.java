public class BitShifting {
    public static final int BITMASK=1;
    public String makeBit(int value){
        // char 배열을 String으로 만들기 위해
        char[] val=new char[32]; // int 타입이 32비트이므로 크기가 32인 배열
        for (int i=31;i>=0;i--) {
            if ((value & BITMASK) == 1) { // value의 이진수 표현에서 가장 오른쪽 비트가 1인지 아닌지 확인
                                          // value를 2로 나눈 나머지와 같은 결과를 얻음
                val[i] = '1'; // 1&1 일때만 1, 그 외 0
            } else {
                val[i] = '0';
            }
            value >>>=1; // value=value>>>1; 부호를 무시하고 오른쪽으로 이동
        }
        return new String(val); // char 배열을 String으로
    }

    public static void main(String[] args) {
        int ival=2345;
        int eval=-2345;
        BitShifting bitsh = new BitShifting();
        String vals = bitsh.makeBit(ival);
        System.out.println(vals);
        vals=bitsh.makeBit(eval);
        System.out.println(vals);
        char[] vs = vals.toCharArray();  // 문자열 내부에 저장된 문자들을 char[]로 반환
        System.out.println(vs[0]);
    }
}
