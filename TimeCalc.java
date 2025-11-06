public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        //i found the index of the ":" and then did substring to extract the hours
        int hours = Integer.parseInt(time.substring(time.indexOf(":") - 2, time.indexOf(":")));
        int minutes = Integer.parseInt(time.substring(time.indexOf(":") +1, time.indexOf(":")+3));
        int Totalminutes = ((hours * 60) + minutes + minutesToAdd); 
        int Totalhours = Totalminutes/60;
        int NewHours = Totalhours % 24;
        int Newminutes = Totalminutes - (Totalhours * 60);
        String strHours = String.valueOf(NewHours);
        String strMinutes = String.valueOf(Newminutes);
         if (NewHours < 10) {
            strHours = "0" + strHours;
        }

        if (Newminutes < 10) {
            strMinutes = "0" + strMinutes;
        }


        System.out.println(strHours+":"+strMinutes);
            }
}
