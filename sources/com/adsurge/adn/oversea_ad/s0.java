package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s0 {
    public static final String a = CanisMinor.a(CanisMinor.y0);
    public static final String b = CanisMinor.a(CanisMinor.z0);
    public static final AtomicBoolean c = new AtomicBoolean(false);

    public static void a() {
        Context context;
        if (c.getAndSet(true)) {
            return;
        }
        try {
            z zVar = new z(null);
            synchronized (Cconst.class) {
                context = Cconst.a;
            }
            long jA = z.a(context, "502");
            int iMyUid = Process.myUid();
            if (jA == 0) {
                zVar.b(iMyUid);
            } else {
                if (iMyUid == jA) {
                    return;
                }
                z.a(jA);
                b();
            }
        } catch (Throwable th) {
            Log.w("Turing", th);
        }
    }

    public static void b() {
        Context context;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        File dir = context.getDir(a, 0);
        if (dir == null || !dir.exists()) {
            return;
        }
        File file = new File(new File(dir, "1"), b);
        if (file.exists()) {
            file.delete();
            File file2 = new File(new File(dir, CreativeInfo.f), ".t.log");
            if (file2.exists()) {
                file2.delete();
            }
        }
    }
}
