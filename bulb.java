public class bulb{

static String bulbbrand;
static String bulbcolour;
static String bulbtype;
static double bulbprice;
static boolean isitwaterproof;

static {
 bulbbrand="Havells";
 bulbcolour="White";
 bulbtype="LED";
 double bulbprice=299.99;
 boolean isitwaterproof=true;
}
public static void main(String[] args) {

 System.out.println(bulbbrand);
 System.out.println(bulbcolour);
 System.out.println(bulbtype);
 System.out.println(bulbprice);
 System.out.println(isitwaterproof);
}
}
