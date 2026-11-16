package com.adsurge.adn.z1;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.adsurge.adn.C1.h;
import com.adsurge.adn.C1.q;
import com.adsurge.adn.Y0.i;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class f {
    public static void b(com.adsurge.adn.Y0.c cVar, long j, long j2, boolean z) {
        a(cVar, new com.adsurge.adn.Y0.d().a("duration", Long.valueOf(j)).a(C4664b4.i.L, Long.valueOf(j2)), z ? 5 : 4);
    }

    public static void a(com.adsurge.adn.Y0.c cVar, h hVar, boolean z, com.adsurge.adn.u1.c cVar2) {
        int i;
        int viewWidth;
        DisplayMetrics displayMetricsC = com.adsurge.adn.J.a.d().c().c();
        int viewHeight = 0;
        if (displayMetricsC != null) {
            if (displayMetricsC.widthPixels == 0) {
                viewWidth = 0;
            } else {
                viewWidth = (hVar.getViewWidth() * 100) / displayMetricsC.widthPixels;
            }
            if (displayMetricsC.heightPixels != 0) {
                viewHeight = (hVar.getViewHeight() * 100) / displayMetricsC.heightPixels;
            }
            i = viewHeight;
            viewHeight = viewWidth;
        } else {
            i = 0;
        }
        com.adsurge.adn.Y0.d dVarA = new com.adsurge.adn.Y0.d().a("duration", Integer.valueOf(hVar.getDuration())).a("ver", Integer.valueOf(hVar.getPlayerVersion())).a("width", Integer.valueOf(viewHeight)).a("heignt", Integer.valueOf(i));
        a(cVar, dVarA, z ? 1 : 0, Integer.valueOf(a(cVar2, dVarA, q.a(hVar.getType()))));
    }

    public static void b(com.adsurge.adn.Y0.c cVar, long j, int i) {
        i iVarB = new i(2020005).b(i).b(j);
        iVarB.a(cVar);
        com.adsurge.adn.w1.b.a(iVarB);
    }

    public static int a(com.adsurge.adn.u1.c cVar, com.adsurge.adn.Y0.d dVar, int i) {
        if (cVar == null) {
            return 0;
        }
        int iB = c.a().b();
        String strD0 = cVar.D0();
        int iA = a(strD0);
        int iI0 = cVar.I0();
        if (iI0 == 1 && iA != 1) {
            dVar.a("url", strD0);
        }
        return ((iI0 + 1) * 10) + (iB * 100) + (i * 1000) + iA;
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 2;
        }
        return (str.contains("f140112.mp4") || str.contains("f140110.mp4")) ? 1 : 2;
    }

    public static void a(com.adsurge.adn.Y0.c cVar, long j, long j2, boolean z) {
        a(cVar, new com.adsurge.adn.Y0.d().a("duration", Long.valueOf(j)).a(C4664b4.i.L, Long.valueOf(j2)), z ? 3 : 2);
    }

    public static void a(com.adsurge.adn.Y0.c cVar, long j) {
        a(cVar, new com.adsurge.adn.Y0.d().a("duration", Long.valueOf(j)), 6);
    }

    public static void a(com.adsurge.adn.Y0.c cVar, long j, int i, boolean z) {
        a(cVar, new com.adsurge.adn.Y0.d().a("duration", Long.valueOf(j)).a("play_times", Integer.valueOf(i)), z ? 8 : 7);
    }

    public static void a(com.adsurge.adn.Y0.c cVar, long j, int i) {
        i iVar = new i(2020004);
        iVar.a(cVar);
        iVar.b(j).b(i);
        com.adsurge.adn.w1.b.a(iVar);
    }

    public static void a(com.adsurge.adn.Y0.c cVar, com.adsurge.adn.Y0.d dVar, int i) {
        com.adsurge.adn.w1.b.a(1130300, cVar, Integer.valueOf(i), dVar);
    }

    public static void a(com.adsurge.adn.Y0.c cVar, com.adsurge.adn.Y0.d dVar, int i, Integer num) {
        com.adsurge.adn.w1.b.a(1130300, cVar, Integer.valueOf(i), num, dVar);
    }

    public static void a(com.adsurge.adn.Y0.c cVar, int i, String str, com.adsurge.adn.u1.c cVar2, int i2, int i3) {
        com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
        dVar.a(NotificationCompat.CATEGORY_MESSAGE, str);
        dVar.a("ver", Integer.valueOf(i3));
        com.adsurge.adn.w1.b.a(1130301, cVar, Integer.valueOf(a(cVar2, dVar, i2)), Integer.valueOf(i), dVar);
    }

    public static void a(com.adsurge.adn.u1.c cVar) {
        com.adsurge.adn.Y0.e eVar = new com.adsurge.adn.Y0.e(1130302);
        eVar.a(com.adsurge.adn.Y0.c.a(cVar));
        com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
        dVar.a("vu", cVar.D0());
        eVar.a(dVar);
        com.adsurge.adn.w1.b.a(eVar);
    }
}
