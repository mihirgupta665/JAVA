class A2_datatypes_literals {   //name must be same as file name otherwise print from the console 
    public static void main(String[] args) {
        int a = 0b101;              // 0b means binary
        System.out.println(a);
        int x= 0x7E;                // 0x means hexadecimal number
        System.out.println(x);
        int y=100_00_45_000;        // java gives ability to give underscore between numbers
        System.out.println(y);

        int i=257;
        byte h= (byte) i;                // it will modulate with 256 and return the remainder.
        //explicitly done so type casting.
        System.out.println(h);
        byte e=10;
        byte f=20;
        System.out.println(e*f);        //e*f=200 out of byte range[-128 to 127]. So, type gets promoted 
    }
}
