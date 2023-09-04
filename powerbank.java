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


System.out.println(powerbank.powerbankbrand);
System.out.println(powerbank.powerbankcolour);
System.out.println(powerbank.powerbankcapacity);
System.out.println(powerbank.powerbankprice);
System.out.println(powerbank.powerbankports);
System.out.println(powerbank.fastchargingsupport);


}
}