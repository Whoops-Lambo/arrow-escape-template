package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.dz4;
import defpackage.gl0;
import defpackage.pv1;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaos {
    public static final gl0 a;

    static {
        zzanv.zza zzaVarY = zzanv.y();
        zzaVarY.k(-62135596800L);
        zzaVarY.l(0);
        zzanv.zza zzaVarY2 = zzanv.y();
        zzaVarY2.k(253402300799L);
        zzaVarY2.l(999999999);
        zzanv.zza zzaVarY3 = zzanv.y();
        zzaVarY3.k(0L);
        zzaVarY3.l(0);
        a = new gl0(2);
        try {
            Class.forName("java.time.Instant").getMethod("now", null);
        } catch (Exception unused) {
        }
        try {
            Class.forName("java.time.Instant").getMethod("getEpochSecond", null);
        } catch (Exception unused2) {
        }
        try {
            Class.forName("java.time.Instant").getMethod("getNano", null);
        } catch (Exception unused3) {
        }
    }

    public static zzanv a(String str) throws ParseException {
        String strSubstring;
        int iCharAt;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            throw new ParseException(pv1.n("Failed to parse timestamp: invalid timestamp \"", str, "\""), 0);
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String strSubstring2 = str.substring(0, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(46);
        boolean z = true;
        if (iIndexOf3 != -1) {
            String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
            strSubstring = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring3;
        } else {
            strSubstring = "";
        }
        long time = ((SimpleDateFormat) a.get()).parse(strSubstring2).getTime() / 1000;
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                }
            }
        }
        if (str.charAt(iIndexOf2) != 'Z') {
            String strSubstring4 = str.substring(iIndexOf2 + 1);
            int iIndexOf4 = strSubstring4.indexOf(58);
            if (iIndexOf4 == -1) {
                throw new ParseException("Invalid offset value: ".concat(strSubstring4), 0);
            }
            try {
                long j = ((Long.parseLong(strSubstring4.substring(0, iIndexOf4)) * 60) + Long.parseLong(strSubstring4.substring(iIndexOf4 + 1))) * 60;
                time = str.charAt(iIndexOf2) == '+' ? time - j : time + j;
            } catch (NumberFormatException e) {
                ParseException parseException = new ParseException("Invalid offset value: ".concat(strSubstring4), 0);
                parseException.initCause(e);
                throw parseException;
            }
        } else if (str.length() != iIndexOf2 + 1) {
            throw new ParseException(pv1.n("Failed to parse timestamp: invalid trailing data \"", str.substring(iIndexOf2), "\""), 0);
        }
        try {
            if (!(time >= -62135596800L && time <= 253402300799L)) {
                throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + time + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                long j2 = iCharAt / 1000000000;
                long j3 = time + j2;
                if (!((j2 ^ time) < 0) && !((time ^ j3) >= 0)) {
                    throw new ArithmeticException();
                }
                iCharAt %= 1000000000;
                time = j3;
            }
            if (iCharAt < 0) {
                iCharAt += 1000000000;
                long j4 = time - 1;
                boolean z2 = (1 ^ time) >= 0;
                if ((time ^ j4) < 0) {
                    z = false;
                }
                if (!z2 && !z) {
                    throw new ArithmeticException();
                }
                time = j4;
            }
            zzanv.zza zzaVarY = zzanv.y();
            zzaVarY.k(time);
            zzaVarY.l(iCharAt);
            zzanv zzanvVar = (zzanv) zzaVarY.f();
            b(zzanvVar);
            return zzanvVar;
        } catch (IllegalArgumentException e2) {
            ParseException parseException2 = new ParseException(pv1.n("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
            parseException2.initCause(e2);
            throw parseException2;
        }
    }

    public static void b(zzanv zzanvVar) {
        long jX = zzanvVar.x();
        int iU = zzanvVar.u();
        if (jX >= -62135596800L && jX <= 253402300799L && iU >= 0 && iU < 1000000000) {
            return;
        }
        dz4.e("Timestamp is not valid. See proto definition for valid values. Seconds (", jX, ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (", iU, ") must be in range [0, +999,999,999].");
    }
}
