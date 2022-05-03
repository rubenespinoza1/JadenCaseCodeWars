package six_kyu.tenminwalk;


public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10){
            return false;
        }
        int nAmount = 0, sAmount = 0, wAmount = 0, eAmount = 0;
        for (int i = 0; i < walk.length; i++){
            switch (walk[i]){
                case 'n':
                    nAmount++;
                    break;
                case 's':
                    sAmount++;
                    break;
                case 'w':
                    wAmount++;
                    break;
                case 'e':
                    eAmount++;
                    break;
            }
        }

        return nAmount == sAmount && wAmount == eAmount;
    }

}