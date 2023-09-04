public class powerbank {
    
static String powerbankbrand;
static String powerbankcolour;
static String powerbankcapacity;
static short powerbankprice;
static byte powerbankports;
static boolean fastchargingsupport;

static {
powerbankbrand="Lenevo";
powerbankcolour="balck";
powerbankcapacity="20000mah";
powerbankprice=999;
powerbankports=3;
fastchargingsupport=true;
}


public static void main(String[] args) {


System.out.println(powerbankbrand);
System.out.println(powerbankcolour);
System.out.println(powerbankcapacity);
System.out.println(powerbankprice);
System.out.println(powerbankports);
System.out.println(fastchargingsupport);


}
}