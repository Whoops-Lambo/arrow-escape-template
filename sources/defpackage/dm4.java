package defpackage;

import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzbaa;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzglv;
import com.google.android.gms.internal.ads.zzgsu;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class dm4 implements zzglv {
    public final Map a;
    public final zzayj b;
    public final zzgsw c;
    public final zzgsu d;
    public final long e;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzgsu zzgsuVar;
        zzazk zzazkVar;
        try {
            try {
                try {
                    try {
                        try {
                            this.d.a();
                            ListenableFuture listenableFuture = (ListenableFuture) this.a.get("gs");
                            if (listenableFuture != null && (zzazkVar = (zzazk) listenableFuture.get(this.e, TimeUnit.MILLISECONDS)) != null) {
                                zzayj zzayjVar = this.b;
                                synchronized (zzayjVar) {
                                    try {
                                        zzbaa zzbaaVarL0 = zzazkVar.L0();
                                        zzayjVar.l();
                                        ((zzazk) zzayjVar.b).C0(zzbaaVarL0);
                                        long jI0 = zzazkVar.I0();
                                        zzayjVar.l();
                                        ((zzazk) zzayjVar.b).h0(jI0);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            zzgsuVar = this.d;
                        } catch (ExecutionException e) {
                            e = e;
                            Throwable cause = e.getCause();
                            zzgsu zzgsuVar2 = this.d;
                            if (cause != null) {
                                e = cause;
                            }
                            zzgsuVar2.b(e);
                            zzgsuVar2.c();
                            return null;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        zzgsuVar = this.d;
                    }
                } catch (TimeoutException unused2) {
                    this.c.b(127);
                    zzgsuVar = this.d;
                }
                zzgsuVar.c();
                return null;
            } catch (ClassCastException e2) {
                zzgsu zzgsuVar3 = this.d;
                zzgsuVar3.b(e2);
                zzgsuVar3.c();
                return null;
            }
        } catch (Throwable th2) {
            this.d.c();
            throw th2;
        }
    }

    public dm4(zzayj zzayjVar, Map map, zzgfx zzgfxVar, zzgsw zzgswVar) {
        this.a = map;
        this.b = zzayjVar;
        this.c = zzgswVar;
        this.d = zzgswVar.a(112);
        this.e = zzgfxVar.g0();
    }
}
