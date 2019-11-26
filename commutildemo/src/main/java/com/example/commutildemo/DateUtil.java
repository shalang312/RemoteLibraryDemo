package com.example.commutildemo;

import android.text.TextUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by JsonZ
 * 时间选择控件
 */

public class DateUtil {

    public static final DateFormat DEFAULT_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
    public static final DateFormat DATE_FORMAT_MONTH1 = new SimpleDateFormat("HH:mm");
    public static final DateFormat DATE_FORMAT_WEEK_HOUR = new SimpleDateFormat("EEEE  HH:mm");
    public static final DateFormat DATE_FORMAT_MONTH = new SimpleDateFormat("M月d日  HH:mm");
    public static final DateFormat CHINA_FORMAT_DAY = new SimpleDateFormat("yyyy年MM月dd日", Locale.getDefault());

    /**
     * 比较两个日期大小
     *
     * @param time1
     * @param time2
     * @return -2  解析出错
     * 0  相等
     * 1  time1比time2大
     * -1  time1比time2小
     */
    public static int compareDateTime(String time1, String time2, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            if (date1.getTime() - date2.getTime() == 0) return 0;
            else if (date1.getTime() - date2.getTime() > 0) return 1;
            else return -1;
        } catch (ParseException e) {
            e.printStackTrace();
            return -2;
        }
    }

    public static int compareDateYM(String time1, String time2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            if (date1.getTime() - date2.getTime() == 0) return 0;
            else if (date1.getTime() - date2.getTime() > 0) return 1;
            else return -1;
        } catch (ParseException e) {
            e.printStackTrace();
            return -2;
        }
    }

    public static int compareDateYMD(String time1, String time2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            if (date1.getTime() - date2.getTime() == 0) return 0;
            else if (date1.getTime() - date2.getTime() > 0) return 1;
            else return -1;
        } catch (ParseException e) {
            e.printStackTrace();
            return -2;
        }
    }

    public static int compareDateYMDH(String time1, String time2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            if (date1.getTime() - date2.getTime() == 0) return 0;
            else if (date1.getTime() - date2.getTime() > 0) return 1;
            else return -1;
        } catch (ParseException e) {
            e.printStackTrace();
            return -2;
        }
    }

    public static int compareDateYMDHM(String time1, String time2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            if (date1.getTime() - date2.getTime() == 0) return 0;
            else if (date1.getTime() - date2.getTime() > 0) return 1;
            else return -1;
        } catch (ParseException e) {
            e.printStackTrace();
            return -2;
        }
    }

    public static int compareDateYMDHMS(String time1, String time2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            if (date1.getTime() - date2.getTime() == 0) return 0;
            else if (date1.getTime() - date2.getTime() > 0) return 1;
            else return -1;
        } catch (ParseException e) {
            e.printStackTrace();
            return -2;
        }
    }

    /**
     * 计算两个日期
     *
     * @param time1
     * @param time2
     */
    public static int computDaysYMD(String time1, String time2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            int result = (int) ((date1.getTime() - date2.getTime()) / 1000 / 60 / 60 / 24);
            return result < 1 ? 0 : result;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int computDaysYM(String time1, String time2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            int result = (int) ((date1.getTime() - date2.getTime()) / 1000 / 60 / 60 / 24);
            return result < 1 ? 0 : result;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int computDaysYMDH(String time1, String time2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            int result = (int) ((date1.getTime() - date2.getTime()) / 1000 / 60 / 60 / 24);
            return result < 1 ? 0 : result;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int computDaysYMDHM(String time1, String time2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            int result = (int) ((date1.getTime() - date2.getTime()) / 1000 / 60 / 60 / 24);
            return result < 1 ? 0 : result;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int computDaysYMDHMS(String time1, String time2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            int result = (int) ((date1.getTime() - date2.getTime()) / 1000 / 60 / 60 / 24);
            return result < 1 ? 0 : result;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String getMonth(String time) {
        if (TextUtils.isEmpty(time)) return "";
        String string = time.replace("T", " ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM月", Locale.getDefault());
        try {
            Date date1 = sdf.parse(string);
            return sdf2.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getCurrentYMDHM() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        return sdf.format(new Date());
    }

    public static String getCurrentYMDHMS() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        return sdf.format(new Date());
    }

    public static String getYMDHMS(long time) {
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        return sdf.format(date);
    }

    public static String getChineseMDHM(long time) {
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日 HH:mm", Locale.getDefault());
        return sdf.format(date);
    }

    public static String getChineseMDHM(String time) {
        Date date = new Date(getTimeMillis(time));
        SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日 HH:mm", Locale.getDefault());
        return sdf.format(date);
    }

    public static String getCurrentYMD() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        return sdf.format(new Date());
    }

    public static String getCurrentYMDItalic() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getFirstDateCurrentYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy", Locale.getDefault());
        String year = sdf.format(new Date());
        return year + "-01-01";
    }

    public static String getFirstDateCurrentYearItalic() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy", Locale.getDefault());
        String year = sdf.format(new Date());
        return year + "/01/01";
    }

    public static String getLastDateCurrentYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy", Locale.getDefault());
        String year = sdf.format(new Date());
        return year + "-12-31";
    }

    //BUG 1001229	Begin
    //Libin  2018-6-29
    public static String getLastDateYMCurrentYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy", Locale.getDefault());
        String year = sdf.format(new Date());
        return year + "-12";
    }

    public static String getFirstDateYMCurrentYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy", Locale.getDefault());
        String year = sdf.format(new Date());
        return year + "-01";
    }

    public static String getCurrentYM() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM", Locale.getDefault());
        return sdf.format(new Date());
    }
    //BUG 1001229	End

    public static String getDay(String time) {
        if (TextUtils.isEmpty(time)) return "";
        String string = time.replace("T", " ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd日", Locale.getDefault());
        try {
            Date date1 = sdf.parse(string);
            return sdf2.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getYMDH(String time) {
        if (TextUtils.isEmpty(time)) return "";
        String string = time.replace("T", " ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH", Locale.getDefault());
        try {
            Date date1 = sdf.parse(string);
            return sdf.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getYMDHM(String time) {
        if (TextUtils.isEmpty(time)) return "";
        String string = time.replace("T", " ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        try {
            Date date1 = sdf.parse(string);
            return sdf.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getYMDHMS(String time) {
        if (TextUtils.isEmpty(time)) return "";
        String string = time.replace("T", " ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        try {
            Date date1 = sdf.parse(string);
            return sdf.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getYMD(String time) {
        if (TextUtils.isEmpty(time)) return "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time);
            return sdf.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String zhTransEnYMD(String time) {
        if (TextUtils.isEmpty(time)) return "";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日", Locale.getDefault());
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        try {
            Date date1 = sdf1.parse(time);
            return sdf2.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    // 获取指定格式时间日期
    public static String getYMDStringToday() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    // 获取指定格式时间日期
    public static String getHMSStringToday() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    public static String getYM(String time) {
        if (TextUtils.isEmpty(time)) return "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM", Locale.getDefault());
        try {
            Date date1 = sdf.parse(time);
            return sdf.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getHM(String time) {
        if (TextUtils.isEmpty(time)) return "";
        String string = time.replace("T", " ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm", Locale.getDefault());
        try {
            Date date1 = sdf.parse(string);
            return sdf2.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static int getLastDayOfMonth(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
        Date d;
        try {
            d = sdf.parse(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            return lastDay;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String getLastDateOfCurrentMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-", Locale.getDefault());
        Date d = new Date();
        String date = sdf.format(d);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (lastDay < 10) {
            date = date + "0" + lastDay;
        } else {
            date = date + lastDay;
        }
        return date;
    }

    public static String getFirstDateOfCurrentMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-", Locale.getDefault());
        Date d = new Date();
        String date = sdf.format(d) + "01";
        return date;
    }

    public static long getTimeMillis(String time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date d;
        try {
            d = sdf.parse(time);
            return d.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /*------------------------------------------------------------------------------------------*/

    /**
     * 得到特定格式的当前时间戳
     * yyyy-MM-dd 的当前时间戳和 yyyy-MM 的当前时间戳 的大小是不同的
     *
     * @param sdf
     * @return
     */
    public static long getCurrentTimeStamp(SimpleDateFormat sdf) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (sdf == null) {
            return timeInMillis;
        }
        String format = sdf.format(timeInMillis);
        Date date;
        try {
            date = sdf.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
            return timeInMillis;
        }
        return date.getTime();
    }

    /**
     * 得到特定格式时间的时间戳
     *
     * @param dateStr
     * @param sdf
     * @return
     */
    public static long getFormatTimeStamp(String dateStr, SimpleDateFormat sdf) {
        if (TextUtils.isEmpty(dateStr) || sdf == null) {
            return 0;
        }
        try {
            Date date = sdf.parse(dateStr);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String timeStampToFormat(String timeStamp, SimpleDateFormat sdf) {
        if (TextUtils.isEmpty(timeStamp) || sdf == null) {
            return "";
        }
        try {
            return sdf.format(Long.valueOf(timeStamp));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 将format1格式的时间转成format2格式的时间
     *
     * @param dateStr
     * @param sdf1
     * @param sdf2
     * @return
     */
    public static String formatToFormat(String dateStr, SimpleDateFormat sdf1, SimpleDateFormat sdf2) {
        if (TextUtils.isEmpty(dateStr)) {
            return "";
        }
        try {
            Date date = sdf1.parse(dateStr);
            return sdf2.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return dateStr;
        }
    }

    /*------------------------------------------------------------------------------------------*/

    public interface DateUtilListener {
        void onDateSelect(String date);
    }


    static Calendar today = Calendar.getInstance();

    /*获取年份*/
    public static String getYear(String date) {
        String y;
        String[] day = date.split("-");
        y = day[0];
        return y;
    }

    /*获取当前系统时间*/
    public static String getSysDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    /*格式化日期时间*/
    public static String formatDatetime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(date);
    }

    public static String formatDatetimeYMD(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static String formatDatetimeHM(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(date);
    }

    public static String formatDatetimeYMDHM(String date) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String d = fmt.format(fmt.parse(date));
        return d;
    }

    public static String formatDatetimeYMD(String date) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        String d = fmt.format(fmt.parse(date));
        return d;
    }

    public static String formatDatetimeHM(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date1 = format.parse(date);
        String s = formatDatetimeHM(date1);
        return s;
    }

    public static String formatDatetimeHM_new(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date1 = format.parse(date);
        String s = format.format(date1);
        return s;
    }

    public static String formatDatetimeYYYY(String date) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy");
        String d = fmt.format(fmt.parse(date));
        return d;
    }

    public static String formatDatetimeMM(String date) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fmt1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat fmt2 = new SimpleDateFormat("MM");
        SimpleDateFormat fmt3 = new SimpleDateFormat("dd");
        Date date_new = fmt.parse(date);
        String year = fmt1.format(date_new);
        String month = fmt2.format(date_new);
        String day = fmt3.format(date_new);
        return month;
    }

    public static boolean compare_date_s(String DATE1, String DATE2) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() > dt2.getTime()) {
                return true;
            } else if (dt1.getTime() == dt2.getTime()) {
                return true;
            } else if (dt1.getTime() < dt2.getTime()) {
                return false;
            } else {
                return false;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return true;
        }

    }

    public static boolean compareDate(String DATE1, String DATE2) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() > dt2.getTime()) {
                return true;
            } else if (dt1.getTime() == dt2.getTime()) {
                return true;
            } else if (dt1.getTime() < dt2.getTime()) {
                return false;
            } else {
                return false;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return true;
        }

    }

    public static boolean compare_date(String DATE1, String DATE2) {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() > dt2.getTime()) {
                return true;
            } else if (dt1.getTime() == dt2.getTime()) {
                return false;
            } else if (dt1.getTime() < dt2.getTime()) {
                return false;
            } else {
                return false;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return true;
        }

    }

    public static String formatDatetime(String date, int forid) {
        if (date == null || "".equals(date.trim())) {
            return "";
        } else {
            String str = "";
            str = date.substring(0, date.indexOf("."));
            String[] array = str.split(" ");
            String[] dates = array[0].split("-");
            switch (forid) {
                case 0:  //yyyy-MM-dd HH:mm:ss
                    str = date.substring(0, date.indexOf("."));
                    break;
                case 1:  //yyyy-MM-dd
                    str = date.substring(0, date.indexOf("."));
                    str = str.substring(0, str.indexOf(" "));
                    break;
                case 2:  //yyyy年MM月dd日 HH:mm:ss
                    str = dates[0] + "-" + dates[1] + "-" + dates[2] + " " + array[1];
                    break;
                case 3:  //yyyy年MM月dd日 HH:mm
                    str = dates[0] + "-" + dates[1] + "-" + dates[2] + " " + array[1].substring(0, array[1].lastIndexOf(":"));
                    break;
                case 4:  //yyyy年MM月dd日 HH:mm:ss
                    str = dates[0] + "-" + dates[1] + "-" + dates[2];
                    break;
                default:
                    break;
            }
            return str;
        }
    }

    public static String getDateBetweenCurrentDate(int days) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        int day = c.get(Calendar.DAY_OF_MONTH) - days;
        c.set(Calendar.DAY_OF_MONTH, day);
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getDateBetweenCurrentDate_(int days) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        int day = c.get(Calendar.DAY_OF_MONTH) - days;
        c.set(Calendar.DAY_OF_MONTH, day);
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getCurrentDate() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getCurrentDateYM() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getCurrentH() {
        SimpleDateFormat df = new SimpleDateFormat("HH");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getCurrentYYYY() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getCurrentMM() {
        SimpleDateFormat df = new SimpleDateFormat("MM");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getCurrentDD() {
        SimpleDateFormat df = new SimpleDateFormat("dd");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getCurrentDate_HM() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getCurrentDate_YM() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }

    public static String getCurrentTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Calendar c = Calendar.getInstance(); // 当时的日期和时间
        String defaultdateStartDate = df.format(c.getTime());
        return defaultdateStartDate;
    }


    /*获取当前时间的毫秒*/
    public String getSysTimeMillise() {
        long i = System.currentTimeMillis();
        return String.valueOf(i);
    }

    /*获取星期几*/
    public static String getWeek() {
        Calendar cal = Calendar.getInstance();
        int i = cal.get(Calendar.DAY_OF_WEEK);
        switch (i) {
            case 1:
                return "星期日";
            case 2:
                return "星期一";
            case 3:
                return "星期二";
            case 4:
                return "星期三";
            case 5:
                return "星期四";
            case 6:
                return "星期五";
            case 7:
                return "星期六";
            default:
                return "";
        }
    }

    public static String formatCommentTime(String str) {

        Date date = parse(str, "EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        String dateStr = sdf.format(date);

        return dateStr;
    }

    public static Date parse(String str, String pattern, Locale locale) {
        if (str == null || pattern == null) {
            return null;
        }
        try {
            return new SimpleDateFormat(pattern, locale).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    //农历月份
    static String[] nlMonth = {"正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};

    //农历日
    static String[] nlday = {"初一", "初二", "初三", "初四", "初五", "初六", "初七", "初八", "初九", "初十",
            "十一", "十二", "十三", "十四", "十五", "十六", "十七", "十八", "十九", "二十",
            "廿一", "廿二", "廿三", "廿四", "廿五", "廿六", "廿七", "廿八", "廿九", "三十"};

    //农历天干
    String[] mten = {"null", "甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};

    //农历地支
    String[] mtwelve = {"null", "子（鼠）", "丑（牛）", "寅（虎）", "卯（兔）", "辰（龙）",
            "巳（蛇）", "午（马）", "未（羊）", "申（猴）", "酉（鸡）", "戌（狗）", "亥（猪）"};

    public static String convertNlYear(String year) {
        String maxYear = "";
        for (int i = 0; i < year.length(); i++) {
            maxYear = maxYear + minCaseMax(year.substring(i, i + 1));
        }
        return maxYear;
    }

    public static String convertNlMoeth(int month) {
        String maxMonth = "";
        maxMonth = nlMonth[month - 1];
        return maxMonth;
    }

    public static String convertNlDay(int day) {
        String maxDay = "";
        maxDay = nlday[day - 1];
        return maxDay;
    }

    public static String minCaseMax(String str) {
        switch (Integer.parseInt(str)) {
            case 0:
                return "零";
            case 1:
                return "一";
            case 2:
                return "二";
            case 3:
                return "三";
            case 4:
                return "四";
            case 5:
                return "五";
            case 6:
                return "六";
            case 7:
                return "七";
            case 8:
                return "八";
            case 9:
                return "九";

            default:
                return "null";
        }
    }


    /**
     * 根据提供的年月日获取该月份的第一天
     *
     * @param year
     * @param monthOfYear
     * @return
     * @Description: (这里用一句话描述这个方法的作用)
     * @Author: gyz
     * @Since: 2017-1-9下午2:26:57
     */
    public static String getSupportBeginDayofMonth(int year, int monthOfYear) {
        Calendar cal = Calendar.getInstance();
        // 不加下面2行，就是取当前时间前一个月的第一天及最后一天
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, monthOfYear);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date lastDate = cal.getTime();

        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date firstDate = cal.getTime();
        return formatDatetimeYMD(firstDate);
    }

    /**
     * 根据提供的年月获取该月份的最后一天
     *
     * @param year
     * @param monthOfYear
     * @return
     * @Description: (这里用一句话描述这个方法的作用)
     * @Author: gyz
     * @Since: 2017-1-9下午2:29:38
     */
    public static String getSupportEndDayofMonth(int year, int monthOfYear) {
        Calendar cal = Calendar.getInstance();
        // 不加下面2行，就是取当前时间前一个月的第一天及最后一天
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, monthOfYear);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);

        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date lastDate = cal.getTime();

        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date firstDate = cal.getTime();

        return formatDatetimeYMD(lastDate);
    }

    public static Calendar setPickerDateHM(String timeStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date date = null;
        try {
            if (!TextUtils.isEmpty(timeStr)) {
                date = sdf.parse(timeStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Date getPickerDateHM(String timeStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date date = null;
        try {
            if (!TextUtils.isEmpty(timeStr)) {
                date = sdf.parse(timeStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Calendar setPickerDateYD(String timeStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            if (!TextUtils.isEmpty(timeStr)) {
                date = sdf.parse(timeStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    //时间控件默认值
    public static Calendar getCalendarHM(String strTime) {
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Calendar calendar = Calendar.getInstance();

        try {
            Date e = dfs.parse(strTime);
            calendar.setTime(e);
        } catch (ParseException var6) {
            var6.printStackTrace();
        }
        return calendar;
    }

    public static Calendar getCalendar(String strTime) {
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();

        try {
            Date e = dfs.parse(strTime);
            calendar.setTime(e);
        } catch (ParseException var6) {
            var6.printStackTrace();
        }
        return calendar;
    }

    /**
     * 获取当月的最后一天
     *
     * @return
     */
    public static String getDayOfMonth() {
        Calendar aCalendar = Calendar.getInstance(Locale.CHINA);
        int day = aCalendar.getActualMaximum(Calendar.DATE);
        return day + "";
    }

    public interface GetDateListener<T> {
        void onGetData(T t);
    }

    /**
     * 获取一个月/三个月/一周前的日期
     *
     * @param timeStr 传入的日期
     * @param type    一周/一个月/三个月
     * @return
     */
    public static String getMonthAgo(String timeStr, int type) {
        Date date = getStringToDate(timeStr);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (type == 0) {
            calendar.add(Calendar.WEEK_OF_MONTH, -1);
        } else if (type == 1) {
            calendar.add(Calendar.MONTH, -1);
        } else {
            calendar.add(Calendar.MONTH, -3);
        }
        String monthAgo = simpleDateFormat.format(calendar.getTime());
        return monthAgo;
    }

    // 将字符串转换成Date形式
    private static Date getStringToDate(String dateTime) {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(dateTime);
            return date;
        } catch (ParseException px) {
            px.printStackTrace();
            return new Date();
        }
    }

    public static String enTransToZhYMD(String enTime) {
        if (TextUtils.isEmpty(enTime)) return "";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日", Locale.getDefault());
        try {
            Date date = sdf1.parse(enTime);
            return sdf2.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }

    }

    public static String getLeansYearMonth(String timeStamp) {
        long lt = new Long(timeStamp);
        Date date = new Date(lt * 1000);
        SimpleDateFormat sdr = new SimpleDateFormat("yyyy年MM月");
        return sdr.format(date);
    }

    public static String getPhotoYearMonthDay(String timeStamp) {
        long lt = new Long(timeStamp);
        Date date = new Date(lt * 1000);
        SimpleDateFormat sdr = new SimpleDateFormat("yyyy/MM/dd");
        return sdr.format(date);
    }

    public static String getYearMonthTime(String timeStamp) {
        long lt = new Long(timeStamp);
        Date date = new Date(lt * 1000);
        SimpleDateFormat sdr = new SimpleDateFormat("yyyy年MM月");
        return sdr.format(date);
    }

    /**
     * 将时间戳转为时间字符串
     * <p>格式为format</p>
     *
     * @param millis 毫秒时间戳
     * @param format 时间格式
     * @return 时间字符串
     */
    public static String millis2String(final long millis, final DateFormat format) {
        return format.format(new Date(millis));
    }

    /**
     * 判断是否今天
     *
     * @param millis 毫秒时间戳
     * @return {@code true}: 是<br>{@code false}: 否
     */
    public static boolean isToday(final long millis) {
        long wee = getWeeOfToday();
        return millis >= wee;
    }

    private static long getWeeOfToday() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTimeInMillis();
    }

    public static int getHours(long startTime) {
//        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        Date date = new Date(startTime);
        int hour = date.getHours();
        int minutes = date.getMinutes();
        if (hour == 12 && minutes > 0){
            hour++;
        }
        return hour;
    }

    public static String getDuringDay(int hour){
        if (hour <= 12){
            return "上午";
        }else{
            return "下午";
        }
//        if (hour >= 6 && hour < 11) {
//            return "上午";
//        }if (hour >= 11 && hour <= 13) {
//            return "中午";
//        }if (hour >= 14 && hour <= 18) {
//            return "下午";
//        }else{
//            return "晚上";
//        }
    }

    /**
     * 判断是否为昨天(效率比较高)
     *
     * @param day 传入的 时间  "2016-06-28 10:10:30" "2016-06-28" 都可以
     * @return true今天 false不是
     * @throws ParseException
     */
    public static boolean IsYesterday(String day) throws ParseException {

        Calendar pre = Calendar.getInstance();
        Date predate = new Date(System.currentTimeMillis());
        pre.setTime(predate);

        Calendar cal = Calendar.getInstance();
        Date date = getDateFormat().parse(day);
        cal.setTime(date);

        if (cal.get(Calendar.YEAR) == (pre.get(Calendar.YEAR))) {
            int diffDay = cal.get(Calendar.DAY_OF_YEAR) - pre.get(Calendar.DAY_OF_YEAR);
            if (diffDay == -1) {
                return true;
            }
        }
        return false;
    }

    private static ThreadLocal<SimpleDateFormat> DateLocal = new ThreadLocal<SimpleDateFormat>();

    public static SimpleDateFormat getDateFormat() {
        if (null == DateLocal.get()) {
            DateLocal.set(new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA));
        }
        return DateLocal.get();
    }

    public static String showTime(String s) throws ParseException {
        String distanceTime = "";
        Calendar calendar = Calendar.getInstance();
        Long now = calendar.getTimeInMillis();
        Long add = Long.valueOf(s) * 1000L;
        Long time = now - add;
        String addString = millis2String(add, DEFAULT_FORMAT);
//        if (time < 5 * 60 * 1000) {
//            distanceTime = "刚刚";
//        } else
        if (isToday(add)) {//09:00
            int hour = getHours(add);
            distanceTime = getDuringDay(hour) + " " +millis2String(add, DATE_FORMAT_MONTH1);
        } else if (IsYesterday(addString)) {//昨天 09:00
            distanceTime = "昨天 " + millis2String(add, DATE_FORMAT_MONTH1);
        } else if (time < 7 * 24 * 60 * 60 * 1000) {//星期一 09:00
            distanceTime = millis2String(add, DATE_FORMAT_WEEK_HOUR);
        } else if (time < 365 * 24 * 60 * 60 * 1000L) {//08月08日 09:00
            distanceTime = millis2String(add, DATE_FORMAT_MONTH);
        } else {                                        //2018年08月08日 09:00
            distanceTime = millis2String(add, CHINA_FORMAT_DAY);
        }
//        KLog.i("showTime", TimeUtils.millis2String(add, China_FORMAT));
        return distanceTime;
    }

}
