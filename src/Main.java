public class Main {
    public static void main (String[] args) {

        int a = 40032;
        System.out.println("A beírt szám: " + a);
        System.out.println("Betűvel: " + numberToString(a));

    }

    public static String numberToString (int a) {
        String b = "";

        if (a==0) {
            return "nulla";
        }

        if (a<100 && a%10 == 0) {
return kerekSzam(a/10);

        } else {
            if (a<1000) {
                return háromjegyűSzám(a);
            }

            if (a<1000000) {
                return ezresek(a) + "-" + háromjegyűSzám(a%1000);
            }

            return milliók(a) + "-" + ezresek(a) + "-" + háromjegyűSzám(a%1000);
        }
    }

    public static String háromjegyűSzám (int a) {
        return szazasok(a/100) + tizesek(a%100/10) + egyesek(a%100%10);
    }

    public static String egyesek (int a) {
        String b = "";

        if (a == 1) {
            b = "egy";
        }

        if (a == 2) {
            b = "kettő";
        }

        if (a == 3) {
            b = "három";
        }

        if (a == 4) {
            b = "négy";
        }

        if (a == 5) {
            b = "öt";
        }

        if (a == 6) {
            b = "hat";
        }

        if (a == 7) {
            b = "hét";
        }

        if (a == 8) {
            b = "nyolc";
        }

        if (a == 9) {
            b = "kilenc";
        }
        return b;
    }

    public static String tizesek (int a) {
        String b = "";

        if (a == 1) {
            b = "tizen";
        }

        if (a == 2) {
            b = "huszon";
        }

        if (a == 3) {
            b = "harminc";
        }

        if (a == 4) {
            b = "negyven";
        }

        if (a == 5) {
            b = "ötven";
        }

        if (a == 6) {
            b = "hatvan";
        }

        if (a == 7) {
            b = "hetven";
        }

        if (a == 8) {
            b = "nyolcvan";
        }

        if (a == 9) {
            b = "kilencven";
        }
        return b;
    }

    public static String kerekSzam (int a) {
        String b = "";

        if (a == 1) {
            b = "tíz";
        }

        if (a == 2) {
            b = "húsz";
        }

        if (a == 3) {
            b = "harminc";
        }

        if (a == 4) {
            b = "negyven";
        }

        if (a == 5) {
            b = "ötven";
        }

        if (a == 6) {
            b = "hatvan";
        }

        if (a == 7) {
            b = "hetven";
        }

        if (a == 8) {
            b = "nyolcvan";
        }

        if (a == 9) {
            b = "kilencven";
        }
        return b;
    }

    public static String szazasok (int a) {
        String b = "";

        if (a==0){
            return "";
        }
        return egyesek(a) + "száz";

    }

    public static String ezresek (int a) {
        String b = "";
        if (a/1000==0){
            return "";
        }

        return háromjegyűSzám(a/1000) + "ezer";

    }

    public static String milliók (int a) {
        String b = "";
        if (a/1000000==0){
            return "";
        }

        return háromjegyűSzám(a/1000000) + "millió";

    }

    public static String milliárdok (int a) {
        String b = "";
        if (a/1000000000==0){
            return "";
        }

        return háromjegyűSzám(a/1000000000) + "milliárd";

    }


}
