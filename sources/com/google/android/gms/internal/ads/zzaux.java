package com.google.android.gms.internal.ads;

import android.util.Log;
import com.ironsource.C4788i2;
import com.mbridge.msdk.foundation.download.Command;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaux {
    public static zzatj a(zzatw zzatwVar) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzatwVar.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jB = str != null ? b(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jB2 = str3 != null ? b(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        long jB3 = str4 != null ? b(str4) : j;
        String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
        if (i != 0) {
            long j6 = (j3 * 1000) + jCurrentTimeMillis;
            j5 = z ? j6 : (j2 * 1000) + j6;
            j4 = j6;
        } else {
            j4 = (jB <= j || jB2 < jB) ? j : (jB2 - jB) + jCurrentTimeMillis;
            j5 = j4;
        }
        zzatj zzatjVar = new zzatj();
        zzatjVar.a = zzatwVar.b;
        zzatjVar.b = str5;
        zzatjVar.f = j4;
        zzatjVar.e = j5;
        zzatjVar.c = jB;
        zzatjVar.d = jB3;
        zzatjVar.g = map;
        zzatjVar.h = zzatwVar.d;
        return zzatjVar;
    }

    public static long b(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || C4788i2.f.equals(str)) {
                zzaum.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", zzaum.d("Unable to parse dateStr: %s, falling back to 0", str), e);
            return 0L;
        }
    }
}
