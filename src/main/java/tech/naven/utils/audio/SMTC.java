/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.utils.audio;

import dsj.smtc.SmtcLoader;
import jh\u0441\u0458.ohh\u0458\u0456;
import \u0445\u0458e.\u04bb\u043ehs\u0435;

public class SMTC {
    public static String info;
    private static String lastTitle;
    private static String lastAuthor;
    public static String base64;
    public static String title;
    public static String author;
    public static long pos;
    public static long dur;
    private static long lastPosUpdateTime;
    private static long lastNativePos;
    private static long songVersion;
    private static \u04bb\u043ehs\u0435 currentLyric;
    private static long lastCheckedPos;
    private static long lastMovedTime;

    public static boolean isPaused() {
        if (pos == 0L && dur == 0L) {
            return true;
        }
        return System.currentTimeMillis() - lastMovedTime > 1500L;
    }

    public static long getInterpolatedPos() {
        if (pos == 0L && dur == 0L) {
            return 0L;
        }
        long l2 = System.currentTimeMillis() - lastPosUpdateTime;
        long l3 = pos + Math.min(l2, 1500L);
        return dur > 0L ? Math.min(l3, dur) : l3;
    }

    public static Thread thread() {
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    SMTC.updateMediaInfo();
                    Thread.sleep(100L);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        });
        thread.setName("SMTC-Thread");
        thread.setDaemon(true);
        return thread;
    }

    private static void updateMediaInfo() {
        try {
            info = SmtcLoader.getSmtcInfo();
            String[] stringArray = info.split("\\|", -1);
            if (stringArray.length >= 4 && !"No media".equals(stringArray[0])) {
                String string;
                String string2;
                String string3 = stringArray[0];
                if (string3.contains(" - ")) {
                    String[] stringArray2 = string3.split(" - ", 2);
                    string2 = stringArray2[0].trim();
                    string = stringArray2[1].trim();
                } else {
                    string2 = string3.trim();
                    string = "Unknown";
                }
                title = string2;
                author = string;
                base64 = stringArray[3];
                long l2 = Long.parseLong(stringArray[1]) * 1000L;
                dur = Long.parseLong(stringArray[2]) * 1000L;
                if (l2 != lastNativePos) {
                    lastNativePos = l2;
                    lastPosUpdateTime = System.currentTimeMillis();
                }
                pos = l2;
                if (l2 != lastCheckedPos) {
                    lastCheckedPos = l2;
                    lastMovedTime = System.currentTimeMillis();
                }
                if (!string2.equals(lastTitle) || !string.equals(lastAuthor)) {
                    lastTitle = string2;
                    lastAuthor = string;
                    ++songVersion;
                    currentLyric.x\u0430a\u0435xs();
                    String string4 = string2;
                    String string5 = string;
                    new Thread(() -> {
                        \u04bb\u043ehs\u0435 \u04bb\u043ehs\u04352 = ohh\u0458\u0456.\u0430\u0445\u0456i\u0455\u043e(string4 + " " + string5);
                        if (\u04bb\u043ehs\u04352 != null) {
                            currentLyric = \u04bb\u043ehs\u04352;
                        } else {
                            currentLyric.x\u0430a\u0435xs();
                        }
                    }).start();
                }
            } else if (!"No Media".equals(lastTitle)) {
                SMTC.reset();
            }
        }
        catch (Exception exception) {
            SMTC.reset();
        }
    }

    private static void reset() {
        title = "No Media";
        author = "No Media";
        lastTitle = "";
        lastAuthor = "";
        base64 = "No Media";
        pos = 0L;
        dur = 0L;
        lastNativePos = 0L;
        lastPosUpdateTime = 0L;
        ++songVersion;
        if (currentLyric != null) {
            currentLyric.x\u0430a\u0435xs();
        }
    }

    public static String getInfo() {
        return info;
    }

    public static String getBase64() {
        return base64;
    }

    public static String getTitle() {
        return title;
    }

    public static String getAuthor() {
        return author;
    }

    public static long getPos() {
        return pos;
    }

    public static long getDur() {
        return dur;
    }

    public static long getSongVersion() {
        return songVersion;
    }

    public static \u04bb\u043ehs\u0435 getCurrentLyric() {
        return currentLyric;
    }

    static {
        lastTitle = "";
        lastAuthor = "";
        base64 = "No Media";
        title = "No Media";
        author = "Unknown";
        pos = 0L;
        dur = 0L;
        lastPosUpdateTime = 0L;
        lastNativePos = 0L;
        songVersion = 0L;
        currentLyric = new \u04bb\u043ehs\u0435();
        lastCheckedPos = -1L;
        lastMovedTime = System.currentTimeMillis();
    }
}

