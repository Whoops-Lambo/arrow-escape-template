package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.android.gms.internal.ads.zzghy;
import com.google.android.gms.internal.ads.zzgrr;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class oo4 implements zzgrr, zzghy {
    public static final String[] g = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public final Context a;
    public final ExecutorService b;
    public long c = 0;
    public long d = 0;
    public long e = -1;
    public boolean f = false;

    public final void d() {
        synchronized (this) {
            try {
                if (this.f) {
                    this.d = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final ListenableFuture zza() {
        if (Build.VERSION.SDK_INT < 30) {
            return nu4.b;
        }
        xu4 xu4Var = new xu4(Executors.callable(new bd4(this, 25), null));
        this.b.execute(xu4Var);
        return xu4Var;
    }

    public oo4(Context context, ExecutorService executorService, String[] strArr) {
        this.a = context;
        this.b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void a(HashMap map) {
        d();
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void b(HashMap map) {
        long j;
        long j2;
        d();
        synchronized (this) {
            try {
                if (this.f) {
                    j = this.d - this.c;
                } else {
                    j = -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        map.put("vs", Long.valueOf(j));
        synchronized (this) {
            j2 = this.e;
            this.e = -1L;
        }
        map.put("vf", Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void c(HashMap map, Context context, View view) {
        d();
    }
}
