package io.p071bidmachine.media3.extractor.text.webvtt;

import defpackage.d;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.common.util.x;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = x.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                d.r("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static void d(q qVar) {
        int i = qVar.b;
        if (a(qVar)) {
            return;
        }
        qVar.F(i);
        throw g0.a("Expected WEBVTT. Got " + qVar.h(StandardCharsets.UTF_8), null);
    }

    public static boolean a(q qVar) {
        qVar.getClass();
        String strH = qVar.h(StandardCharsets.UTF_8);
        if (strH != null && strH.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }
}
