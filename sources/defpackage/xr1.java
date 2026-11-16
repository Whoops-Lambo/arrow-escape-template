package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzql;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xr1 implements zzph {
    public Object a;
    public volatile Object b;

    @Override // com.google.android.gms.internal.measurement.zzph
    public zzpg a(final zzlk zzlkVar) {
        final b55 b55Var = (b55) this.b;
        b55 b55Var2 = zzpg.j;
        if (b55Var != b55Var2) {
            zzpe zzpeVar = zzpg.i;
            zzpeVar.getClass();
            final a50 a50Var = new a50(23);
            a50Var.b = false;
            ConcurrentHashMap concurrentHashMap = zzpeVar.a;
            Context context = zzlkVar.b;
            String str = b55Var.d;
            if (str == null) {
                str = (String) b55Var.a.apply(context);
                b55Var.d = str;
            }
            c55 c55Var = (c55) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: p55
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    c55 c55Var2 = new c55(new zzpg(zzlkVar, b55Var));
                    a50Var.b = true;
                    return c55Var2;
                }
            });
            if (a50Var.b) {
                Context context2 = zzlkVar.b;
                do4 do4Var = new do4(zzpeVar, 24);
                if (zzql.a == null) {
                    synchronized (zzql.class) {
                        try {
                            if (zzql.a == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (PlatformVersion.isAtLeastT()) {
                                        context2.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                zzql.a = do4Var;
                                do4 do4Var2 = zzql.a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.a = c55Var.a;
            this.b = b55Var2;
        }
        return (zzpg) this.a;
    }

    public void b() {
        Serializable serializable = (Serializable) this.b;
        if (serializable == null) {
            return;
        }
        List<wr0> listZ0 = du.z0((ArrayList) this.a);
        ((ArrayList) this.a).clear();
        for (wr0 wr0Var : listZ0) {
            if (wr0Var != null) {
                wr0Var.invoke(serializable);
            }
        }
    }

    public void c(wr0 wr0Var) {
        Serializable serializable = (Serializable) this.b;
        if (serializable != null) {
            wr0Var.invoke(serializable);
        } else {
            ((ArrayList) this.a).add(wr0Var);
        }
    }

    public xr1(int i) {
        switch (i) {
            case 1:
                this.a = new AtomicBoolean(false);
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }
}
