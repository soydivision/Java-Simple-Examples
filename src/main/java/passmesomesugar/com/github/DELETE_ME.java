package passmesomesugar.com.github;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DELETE_ME implements Comparable {
  public static void main(String[] args) throws ParseException {

    String sDate2 = "31/12/1998";
    String sDate1 = "  ff";
    Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
    System.out.println(sDate1 + "\t" + date1);
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
