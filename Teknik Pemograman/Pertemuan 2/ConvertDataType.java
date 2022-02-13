public class ConvertDataType{

    static short menthodOne(long l){
        int i = (int) l;
        return (short)i;
    }

    public static void main(String[] args){
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) menthodOne((long) f);
        System.out.println(b);
    }
}