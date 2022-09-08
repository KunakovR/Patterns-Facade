public class BinOps {

    private String a;
    private String b;

    public String sum(String a, String b) {
        int A = Integer.parseInt(a, 2);
        int B = Integer.parseInt(b, 2);
        int result = A + B;
        String resultSum = Integer.toBinaryString(result);
        return resultSum;
    }

    public String mult(String a, String b) {
        int A = Integer.parseInt(a, 2);
        int B = Integer.parseInt(b, 2);
        int result = A * B;
        String resultMult = Integer.toBinaryString(result);
        return resultMult;
    }

}


