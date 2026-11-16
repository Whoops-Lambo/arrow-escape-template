package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyx;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class xt4 extends au4 {
    public static final ld1 o = new ld1(2, xt4.class);
    public zzgyx l;
    public final boolean m;
    public final boolean n;

    public abstract void s(int i);

    public final void u(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.l = null;
                cancel(false);
            } else {
                try {
                    y(i, zzhfl.a(listenableFuture));
                } catch (ExecutionException e) {
                    v(e.getCause());
                } catch (Throwable th) {
                    v(th);
                }
            }
        } finally {
            w(null);
        }
    }

    public abstract void y(int i, Object obj);

    public abstract void z();

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final void g() {
        zzgyx zzgyxVar = this.l;
        s(1);
        if ((zzgyxVar != null) && isCancelled()) {
            boolean zM = m();
            zzhbp it = zzgyxVar.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(zM);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final String h() {
        zzgyx zzgyxVar = this.l;
        return zzgyxVar != null ? "futures=".concat(zzgyxVar.toString()) : super.h();
    }

    public final void w(zzgyx zzgyxVar) {
        int iZ = au4.j.z(this);
        int i = 0;
        zzgvz.g("Less than 0 remaining futures", iZ >= 0);
        if (iZ == 0) {
            if (zzgyxVar != null) {
                zzhbp it = zzgyxVar.iterator();
                while (it.hasNext()) {
                    ListenableFuture listenableFuture = (ListenableFuture) it.next();
                    if (!listenableFuture.isCancelled()) {
                        try {
                            y(i, zzhfl.a(listenableFuture));
                        } catch (ExecutionException e) {
                            v(e.getCause());
                        } catch (Throwable th) {
                            v(th);
                        }
                    }
                    i++;
                }
            }
            this.h = null;
            z();
            s(2);
        }
    }

    public final void x() {
        Objects.requireNonNull(this.l);
        if (this.l.isEmpty()) {
            z();
            return;
        }
        zzgyx zzgyxVar = this.l;
        fu4 fu4Var = fu4.a;
        if (!this.m) {
            zzgyx zzgyxVar2 = true != this.n ? null : zzgyxVar;
            fj4 fj4Var = new fj4(3, this, zzgyxVar2);
            zzhbp it = zzgyxVar.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    w(zzgyxVar2);
                } else {
                    listenableFuture.addListener(fj4Var, fu4Var);
                }
            }
            return;
        }
        zzhbp it2 = zzgyxVar.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                u(i, listenableFuture2);
            } else {
                listenableFuture2.addListener(new tj(this, i, listenableFuture2, 2), fu4Var);
            }
            i = i2;
        }
    }

    public xt4(zzgyx zzgyxVar, boolean z, boolean z2) {
        int size = zzgyxVar.size();
        this.h = null;
        this.i = size;
        this.l = zzgyxVar;
        this.m = z;
        this.n = z2;
    }

    public final void v(Throwable th) {
        String str;
        th.getClass();
        if (this.m && !f(th)) {
            Set set = this.h;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!isCancelled()) {
                    Throwable thC = c();
                    Objects.requireNonNull(thC);
                    while (thC != null && setNewSetFromMap.add(thC)) {
                        thC = thC.getCause();
                    }
                }
                au4.j.y(this, setNewSetFromMap);
                set = this.h;
                Objects.requireNonNull(set);
            }
            Throwable cause = th;
            while (true) {
                if (cause != null) {
                    if (!set.add(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } else {
                    if (true != (th instanceof Error)) {
                        str = "Got more than one input Future failure. Logging failures after the first";
                    } else {
                        str = "Input Future failed with Error";
                    }
                    o.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", CreativeInfo.f, str, th);
                    return;
                }
            }
        }
        if (th instanceof Error) {
            o.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", CreativeInfo.f, "Input Future failed with Error", th);
        }
    }
}
