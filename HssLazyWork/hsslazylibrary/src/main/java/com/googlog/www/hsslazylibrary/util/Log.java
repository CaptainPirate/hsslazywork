package com.googlog.www.hsslazylibrary.util;

/**
 * Created by ubuntu on 17-5-12.
 */

/**
 * This utility class is the main entrance to print log with Android Log class. Our
 * application should always use this class to print logs.
 */
public final class Log {
    private static final String LOG_TAG = "CAM_ori/";

    private Log() {
    }

    public static void v(String tag, String msg) {
        android.util.Log.v(LOG_TAG + tag, msg);
    }

    public static void v(String tag, String msg, Throwable t) {
        android.util.Log.v(LOG_TAG + tag, msg, t);
    }

    public static void d(String tag, String msg) {
        android.util.Log.d(LOG_TAG + tag, msg);
    }

    public static void d(String tag, String msg, Throwable t) {
        android.util.Log.d(LOG_TAG + tag, msg, t);
    }

    public static void i(String tag, String msg) {
        android.util.Log.i(LOG_TAG + tag, msg);
    }

    public static void i(String tag, String msg, Throwable t) {
        android.util.Log.i(LOG_TAG + tag, msg, t);
    }

    public static void w(String tag, String msg) {
        android.util.Log.w(LOG_TAG + tag, msg);
    }

    public static void w(String tag, String msg, Throwable t) {
        android.util.Log.w(LOG_TAG + tag, msg, t);
    }

    public static void e(String tag, String msg) {
        android.util.Log.e(LOG_TAG + tag, msg);
    }

    public static void e(String tag, String msg, Throwable t) {
        android.util.Log.e(LOG_TAG + tag, msg, t);
    }

    /**
     * print log for performance test. this log records the starting time.
     *
     * @param description
     *            the description of this check point.
     */
    public static void performanceStart(String description) {
        String msg = makePerformanceLogText("start", description);
        android.util.Log.i(LOG_TAG, msg);
    }

    /**
     * print log for performance test. this log records the ending time of
     * procedure.
     *
     * @param description
     *            the description of this check point.
     */
    public static void performanceEnd(String description) {
        String msg = makePerformanceLogText("end", description);
        android.util.Log.i(LOG_TAG, msg);
    }

    /**
     * the format of performance test about Camera app part.
     */
    private static final String PERFORMANCE_FORMAT_STRING =
            "[Performance test][Camera][app] %s %s[%d]";

    /**
     * A tool to make the text following the {@link }
     * format.
     *
     * @param checkPoint
     *            can be "start" or "end".
     * @param description
     *            the description of the check point
     * @return text
     */
    private static String makePerformanceLogText(String checkPoint, String description) {
        String desc = description == null ? "" : description;
        String msg = String.format(PERFORMANCE_FORMAT_STRING, new Object[] { desc, checkPoint,
                System.currentTimeMillis() });
        return msg;
    }
}
