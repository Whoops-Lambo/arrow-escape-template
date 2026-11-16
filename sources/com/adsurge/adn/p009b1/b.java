package com.adsurge.adn.p009b1;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.adsurge.adn.I0.g;
import com.adsurge.adn.X.l;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.p021f1.o;
import defpackage.r70;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements l.g {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ c d;

        @Override // com.adsurge.adn.X.l.g
        public boolean b() {
            return false;
        }

        public a(Context context, String str, String str2, c cVar) {
            this.a = context;
            this.b = str;
            this.c = str2;
            this.d = cVar;
        }

        @Override // com.adsurge.adn.X.l.g
        public boolean a() {
            b.b(this.a, this.b, this.c, this.d);
            return true;
        }
    }

    public static void a() {
        ActivityManager activityManager;
        List<ActivityManager.RunningTaskInfo> runningTasks;
        if (com.adsurge.adn.N.b.a("bafg", 1) == 0) {
            return;
        }
        try {
            Context contextA = com.adsurge.adn.J.a.d().a();
            if (contextA.checkSelfPermission("android.permission.REORDER_TASKS") == 0 && (runningTasks = (activityManager = (ActivityManager) contextA.getSystemService("activity")).getRunningTasks(20)) != null) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    if (contextA.getPackageName().equals(runningTaskInfo.topActivity.getPackageName())) {
                        activityManager.moveTaskToFront(runningTaskInfo.id, 1);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            com.adsurge.adn.J0.a.a("open opt bring to front failed", e);
        }
    }

    public static void c(Context context, String str, String str2, c cVar) {
        g.a(new r70(context, str, str2, cVar, 20), 2000L);
    }

    public static void b(Context context, String str, String str2, c cVar) {
        Intent intentA = o.a(context, str, str2);
        if (intentA == null) {
            TextUtils.isEmpty(str2);
            com.adsurge.adn.w1.b.a(6001811, cVar, (Integer) null, (Integer) 1, (d) null);
        } else if (o.b(context, intentA)) {
            com.adsurge.adn.w1.b.a(6001810, cVar);
        } else {
            com.adsurge.adn.w1.b.a(6001811, cVar, (Integer) null, (Integer) 2, (d) null);
        }
    }

    public static void d(Context context, String str, String str2, c cVar) {
        l.b().a(new a(context, str, str2, cVar));
    }

    public static void a(String str, String str2, c cVar) {
        if (com.adsurge.adn.N.b.a("alaai", 1) == 1) {
            Context contextA = com.adsurge.adn.J.a.d().a();
            if (l.b().c()) {
                b(contextA, str, str2, cVar);
                return;
            }
            a();
            b(contextA, str, str2, cVar);
            if (l.b().c()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                c(contextA, str, str2, cVar);
            } else {
                d(contextA, str, str2, cVar);
            }
        }
    }
}
