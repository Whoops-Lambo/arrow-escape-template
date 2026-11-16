package com.adsurge.adn.p008b0;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.adsurge.adn.I0.l;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.Y0.v;
import com.adsurge.adn.Z.c;
import com.singular.sdk.internal.Constants;
import defpackage.ea0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e {
    public static final String a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ com.adsurge.adn.Z.e a;

        public a(com.adsurge.adn.Z.e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.b(this.a.j());
        }
    }

    static {
        a = com.adsurge.adn.J0.a.a ? "NativeCrashAnalyzer" : Constants.RequestBody.EXTRA_ATTRIBUTES_KEY;
    }

    public static void a(g gVar, ApplicationExitInfo applicationExitInfo, String str) {
        gVar.a(applicationExitInfo.getTimestamp());
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split(",")) {
                if (str2 != null && !str2.trim().isEmpty()) {
                    arrayList.add(l.a(str2.trim()));
                }
            }
        }
        String[] strArrG = com.adsurge.adn.Z.a.g();
        String strGroup = null;
        boolean z = false;
        for (String str3 : gVar.e()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str4 = (String) obj;
                if (str3.contains(str4)) {
                    z = true;
                    strGroup = str4;
                    break;
                }
            }
            if (z) {
                break;
            }
            if (strArrG != null) {
                for (String str5 : strArrG) {
                    if (str3.contains("Java_" + str5.replace('.', '_'))) {
                        String strA = a(str3);
                        if (strA != null) {
                            int iLastIndexOf = strA.lastIndexOf(47);
                            if (iLastIndexOf >= 0 && iLastIndexOf < strA.length() - 1) {
                                strA = strA.substring(iLastIndexOf + 1);
                            }
                            strGroup = strA;
                        } else {
                            Matcher matcher = Pattern.compile("([^/\\\\s]+\\\\.so)").matcher(str3);
                            if (matcher.find()) {
                                strGroup = matcher.group(1);
                            }
                        }
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                break;
            }
        }
        gVar.a(z);
        if (z && strGroup != null) {
            gVar.a(strGroup);
        }
        if (z) {
            new f().a(gVar);
        }
    }

    public static void b(String str) {
        try {
            Context contextA = com.adsurge.adn.D0.a.c().a();
            List historicalProcessExitReasons = ((ActivityManager) contextA.getSystemService("activity")).getHistoricalProcessExitReasons(contextA.getPackageName(), 0, 1);
            if (!historicalProcessExitReasons.isEmpty()) {
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo applicationExitInfoC = ea0.c(it.next());
                    if (applicationExitInfoC.getReason() == 5) {
                        try {
                            InputStream traceInputStream = applicationExitInfoC.getTraceInputStream();
                            if (traceInputStream != null) {
                                g gVarA = i.a(traceInputStream);
                                if (gVarA.e() != null && !gVarA.e().isEmpty()) {
                                    a(gVarA, applicationExitInfoC, str);
                                } else {
                                    a(3, "stacktrace is empty");
                                }
                            }
                        } catch (IOException e) {
                            com.adsurge.adn.J0.a.a(a, "IOException while reading native crash trace", e);
                            a(1, e.toString());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.adsurge.adn.J0.a.a(a, "Exception while analyzing native crash", th);
            a(2, th.toString());
        }
    }

    public static void a(com.adsurge.adn.Z.e eVar) {
        if (eVar.d() != 1 || Build.VERSION.SDK_INT < 31) {
            return;
        }
        c.a().postDelayed(new a(eVar), 5000L);
    }

    public static String a(String str) {
        Matcher matcher = Pattern.compile("(/(?:data|system|apex)[^\\s\"'|]+\\.so)").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void a(int i, String str) {
        d dVar = new d();
        dVar.a(NotificationCompat.CATEGORY_MESSAGE, str);
        v.a(9700003, null, Integer.valueOf(i), dVar);
    }
}
