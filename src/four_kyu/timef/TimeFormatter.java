package four_kyu.timef;

public class TimeFormatter {



    public static String formatDuration(int seconds) {
        int[] formatedDate = formatedDate(seconds);
        String formatDuration = "";
        String[] labels = new String[]{"year", "day", "hour", "minute", "second"};
        String toReturn = "";
        for (int i = 0; i < formatedDate.length; i++) {
            String toAdd = formatedDate[i] > 0 ? (formatedDate[i] > 1 ? formatedDate[i] + " " + labels[i] + "s" : formatedDate[i] + " " + labels[i]) : ("");
            if (!toAdd.isEmpty()){
                formatDuration += toAdd + "|";
            }
        }

        String[] splittedDate = formatDuration.split("[|]");
        if (splittedDate.length == 1){
            return splittedDate[0];
        } else {

            for (int i = 0; i < splittedDate.length; i++) {
                if (i == splittedDate.length - 1){
                    toReturn += " and ";
                }else if (i > 0) {
                    toReturn += ", ";
                }
                toReturn += splittedDate[i];
            }
        }
        return toReturn;
    }

    private static int[] formatedDate(int seconds){
        int rest_y = seconds % 31536000;
        int years = (seconds - rest_y)/31536000;
        int secondsLeft = seconds - (years * 31536000);
        if (secondsLeft <= 0){
            return new int[]{years,0,0,0,0};
        }

        int rest_d = secondsLeft % 86400;
        int days = (secondsLeft - rest_d)/86400;
        int secondsLeft1 = secondsLeft - (days * 86400);
        if (secondsLeft1 <= 0){
            return new int[]{years,days,0,0,0};
        }

        int rest_h = secondsLeft1 % 3600;
        int hours = (secondsLeft1 - rest_h)/3600;
        int secondsLeft2 = secondsLeft1 - (hours * 3600);
        if (secondsLeft2 <= 0){
            return new int[]{years,days,hours,0,0};
        }
        int rest_m = secondsLeft2 % 60;
        int minutes = (secondsLeft2 - rest_m)/60;
        int secondsLeft3 = secondsLeft2 - (minutes * 60);
        if (secondsLeft3 <= 0){
            return new int[]{years,days,hours,minutes,0};
        }else{
            return new int[]{years,days,hours,minutes,secondsLeft3};
        }

    }

}
