public class TimeCalc {
    public static void main(String[] args) {
        String timeInput = args[0];
        String minutesToAddString = args[1];
        String hoursString = "" + timeInput.charAt(0)+ timeInput.charAt(1);
        String minutesString = "" + timeInput.charAt(3)+ timeInput.charAt(4);
        int hours = Integer.parseInt(hoursString);
        int minutes = Integer.parseInt(minutesString);
        int minutesToAdd = Integer.parseInt(minutesToAddString);
        int totalMinutes = (hours*60 + minutes+ minutesToAdd);
        int newHour = (totalMinutes/60)%24;
        String finalHours = "";
        if (newHour<10){
            finalHours = "0" + newHour;
        }
        else{
            finalHours = "" + newHour;
        }
        int newMinutes = (totalMinutes)%60;
        String finalMinutes = "";
        if (newMinutes<10) {
            finalMinutes = "0" + newMinutes;
        }
        else {
            finalMinutes= "" + newMinutes;
        }



        System.out.println(finalHours+ ":"+ finalMinutes);
   


    }
}
