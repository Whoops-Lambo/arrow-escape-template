package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.view.View;
import com.google.android.gms.internal.ads.zzghy;
import com.google.android.gms.internal.ads.zzgrr;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mo4 implements zzgrr, zzghy {
    public final Context a;
    public final ExecutorService b;
    public NetworkCapabilities c = null;
    public Network d = null;

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void a(HashMap map) {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0035 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:15:0x001b, B:17:0x0024, B:19:0x0028, B:21:0x0031, B:23:0x0035), top: B:34:0x000a }] */
    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void b(HashMap map) {
        NetworkCapabilities networkCapabilities;
        long j;
        synchronized (this) {
            networkCapabilities = this.c;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j = 2;
                    } else if (this.c.hasTransport(1)) {
                        j = 1;
                    } else {
                        j = this.c.hasTransport(0) ? 0L : -1L;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        map.put("nt", Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void c(HashMap map, Context context, View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final ListenableFuture zza() {
        xu4 xu4Var = new xu4(Executors.callable(new bd4(this, 24), null));
        this.b.execute(xu4Var);
        return xu4Var;
    }

    public mo4(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }
}
