package com.safedk.android.utils;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class g {
    private static final String a = "RegexFactory";
    private static final Map<String, Pattern> b = new HashMap();

    public static Pattern a(String str, int i) {
        Pattern patternCompile = b.get(str);
        if (patternCompile == null) {
            try {
                synchronized (b) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    patternCompile = i == 0 ? Pattern.compile(str) : Pattern.compile(str, i);
                    b.put(str, patternCompile);
                    Logger.d(a, "pattern initialization completed in ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), "ms, regex: ", str);
                }
            } catch (Throwable th) {
                Logger.d(a, "pattern initialization failed", th);
            }
        }
        return patternCompile;
    }

    public static Pattern a(String str) {
        return a(str, 0);
    }
}
