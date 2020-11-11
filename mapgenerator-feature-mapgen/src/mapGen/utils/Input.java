package mapGen.utils;

import java.util.Scanner;

public class Input {

    private static boolean autoGen;

    public Input() {
        autoGen = false;
    }

    public static void autoGen(boolean auto) {
        autoGen = auto;
    }

    public static int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    
    public static float randomFloat(float min, float max) {
        return (float) (Math.random() * (max - min + 1) + min);
    }

    public static int inputInt(String hint, int min, int max, int[] avs) {
        int a;
        if (autoGen) {
            a = randomInt(min, max);
            System.out.println("自動產生 : " + a);
            return a;
        }
        while (true) {
            System.out.print(hint + "(" + min + "~" + max + "):");
            Scanner sc = new Scanner(System.in);
            //使用正則表示式
            String s = filterNumber(sc.nextLine());
            if (s.equals("")){
                System.out.println("請輸入數字!");
                continue;
            }
            a =Integer.parseInt(s);
//            a = sc.nextInt();
            if (avs != null) {
                for (int i = 0; i < avs.length; i++) {
                    if (a == avs[i]) {
                        return a;
                    }
                }
            }
            if (a >= min && a <= max) {
                return a;
            }
            System.out.println("輸入範圍錯誤!");
        }
    }
    
    public static float inputFloat(String hint, float min, float max, int[] avs) {
        float a;
        if (autoGen) {
            a = randomFloat(min, max);
            System.out.println("自動產生 : " + a);
            return a;
        }
        while (true) {
            System.out.print(hint + "(" + min + "~" + max + "):");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if (avs != null) {
                for (int i = 0; i < avs.length; i++) {
                    if (a == avs[i]) {
                        return a;
                    }
                }
            }
            if (a >= min && a <= max) {
                return a;
            }
            System.out.println("輸入範圍錯誤!");
        }
    }

    public static String inputStr(String hint, int min, int max) {
        String str;
        if (autoGen) {
            str = "";
            int length = randomInt(min, max);
            for (int i = 0; i < length; i++) {
                str += (char) randomInt(97, 122);
            }
            System.out.println("自動產生 : " + str);
            return str;
        }
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(hint + "(長度必須為" + min + "~" + max + ") : ");
            str = sc.nextLine();
            if (str.length() >= min && str.length() <= max) {
                return str;
            }
            System.out.println("長度不符，請重新輸入!");
        } while (true);
    }
    
    public static String inputLine() {
        String str;
        if (autoGen) {
            str = "";
            int length = randomInt(1, 10);
            for (int i = 0; i < length; i++) {
                str += (char) randomInt(97, 122);
            }
            System.out.println("自動產生 : " + str);
            return str;
        }
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }

    public static int[] inputDate() {
        Scanner sc= new Scanner(System.in);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] d = new int[3];
        if (autoGen) {
            d[0] = inputInt("", 1900, 2050, null);//年
            d[1] = inputInt("", 1, 12, null);//月
            d[2] = inputInt("", 1, days[d[1]-1], null);//日
            return d;
        }
        
        do {
            System.out.print("請輸入日期(yyyy-mm-dd):");
            String str = sc.nextLine();
            //判定是否符合格式
            String[] tmp = str.split("-");//拆分字串
            if (tmp.length == 3) {
                for (int i = 0; i < 3; i++) {
                    d[i] = Integer.parseInt(tmp[i]);//字串轉換成數字  
                }
                if (d[0] > 0 && d[1] > 0 && d[1] <= 12 && d[2] > 0 && d[2] <= days[d[1]-1]) {//判定範圍內，才進行回傳
                    return d;
                }
            }
            System.out.print("格式不符!");
        } while (true);
    }

    
    // 正則表示式 過濾字串
    public static String filterNumber(String number) {
        number = number.replaceAll("[^(0-9)]", "");
        return number;
    }

    public static String filterAlphabet(String alph) {
        alph = alph.replaceAll("[^(A-Za-z)]", "");
        return alph;
    }

    public static String filterChinese(String chin) {
        chin = chin.replaceAll("[^(\\u4e00-\\u9fa5)]", "");
        return chin;
    }

    public static String filter(String character) {
        character = character.replaceAll("[^(a-zA-Z0-9\\u4e00-\\u9fa5)]", "");
        return character;
    }
}
