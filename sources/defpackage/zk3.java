package defpackage;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzaag;
import com.google.android.gms.internal.measurement.zzxx;
import com.google.android.gms.internal.measurement.zzxz;
import com.google.android.gms.internal.measurement.zzzf;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zk3 extends zzaag {
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final AtomicReference f;
    public static final AtomicLong g;
    public static final ConcurrentLinkedQueue h;
    public volatile zzzf b;

    static {
        String str = Build.FINGERPRINT;
        c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        e = "eng".equals(str3) || "userdebug".equals(str3);
        f = new AtomicReference();
        g = new AtomicLong();
        h = new ConcurrentLinkedQueue();
    }

    public static void e() {
        while (true) {
            xk3 xk3Var = (xk3) h.poll();
            if (xk3Var == null) {
                return;
            }
            g.getAndDecrement();
            zk3 zk3Var = xk3Var.a;
            zzxz zzxzVar = xk3Var.b;
            zb5 zb5Var = zzxzVar.c;
            if ((zb5Var != null && Boolean.TRUE.equals(zb5Var.d(zzxx.g))) || zk3Var.b(zzxzVar.a)) {
                zk3Var.c(zzxzVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean b(Level level) {
        return this.b == null || this.b.b(level);
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void c(zzxz zzxzVar) {
        if (this.b != null) {
            this.b.c(zzxzVar);
            return;
        }
        if (g.incrementAndGet() > 20) {
            h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        h.offer(new xk3(this, zzxzVar));
        if (this.b != null) {
            e();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaag, com.google.android.gms.internal.measurement.zzzf
    public final void d(RuntimeException runtimeException, zzxz zzxzVar) {
        if (this.b != null) {
            this.b.d(runtimeException, zzxzVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
