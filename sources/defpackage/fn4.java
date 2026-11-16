package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgbq;
import com.google.android.gms.internal.ads.zzgbr;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzgil;
import com.google.android.gms.internal.ads.zzgoh;
import com.google.android.gms.internal.ads.zzgoi;
import com.google.android.gms.internal.ads.zzgqh;
import com.google.android.gms.internal.ads.zzgri;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzgvq;
import com.google.android.gms.internal.ads.zzhdy;
import com.google.android.gms.internal.ads.zzheh;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fn4 implements zzgoh {
    public final zzgbr a;
    public final zzgqh b;
    public final zzgri c;
    public final zzgsw d;
    public final ExecutorService e;
    public final Executor f;
    public final boolean g;
    public final AtomicReference h = new AtomicReference("2.960507516.-1");

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final int zzg() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final xu4 a(Context context, String str, View view) {
        return zzheh.c(this.f, new ea4(this, context, str, view, 4));
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final void b(InputEvent inputEvent) {
        xw1 xw1VarB = this.a.b();
        zzgsw zzgswVar = this.d;
        if (xw1VarB == null) {
            zzgswVar.b(15004);
            return;
        }
        if (inputEvent instanceof MotionEvent) {
            if (this.g) {
                this.f.execute(new kw0(this, xw1VarB, MotionEvent.obtain((MotionEvent) inputEvent), false, 15));
            } else {
                try {
                    xw1VarB.f((MotionEvent) inputEvent);
                } catch (zzgbq e) {
                    zzgswVar.d(15005, e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final xu4 c(Context context, View view, Activity activity) {
        return zzheh.c(this.e, new ea4(this, context, view, activity, 3));
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final xu4 d(Context context) {
        return zzheh.c(this.e, new ix3(11, this, context));
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final String zza() {
        return (String) this.h.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final zzhdy zzb() {
        zzhdy zzhdyVarS = zzhdy.s(this.b.zzb());
        qm4 qm4Var = qm4.f;
        fu4 fu4Var = fu4.a;
        final int i = 0;
        ut4 ut4VarH = zzheh.h(zzheh.i(zzheh.e(zzhdyVarS, Throwable.class, qm4Var, fu4Var), new zzgvq(this) { // from class: en4
            public final /* synthetic */ fn4 b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgvq
            public final Object apply(Object obj) {
                int i2 = i;
                fn4 fn4Var = this.b;
                int i3 = 1;
                switch (i2) {
                    case 0:
                        zzgil zzgilVar = (zzgil) obj;
                        if (fn4Var.c.a(zzgilVar) && zzgilVar != null) {
                            return new Boolean(true);
                        }
                        fn4Var.d.b(15003);
                        throw new zzgoi(1);
                    default:
                        zzgbh zzgbhVar = (zzgbh) obj;
                        if (zzgbhVar == null) {
                            throw new zzgoi(3);
                        }
                        File file = zzgbhVar.b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        fn4Var.d.f(15002, new yi4(i3, fn4Var, zzgbhVar));
                        return new Boolean(true);
                }
            }
        }, fu4Var), new a04(this, 15), fu4Var);
        final int i2 = 1;
        return zzheh.i(zzheh.i(ut4VarH, new zzgvq(this) { // from class: en4
            public final /* synthetic */ fn4 b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgvq
            public final Object apply(Object obj) {
                int i3 = i2;
                fn4 fn4Var = this.b;
                int i4 = 1;
                switch (i3) {
                    case 0:
                        zzgil zzgilVar = (zzgil) obj;
                        if (fn4Var.c.a(zzgilVar) && zzgilVar != null) {
                            return new Boolean(true);
                        }
                        fn4Var.d.b(15003);
                        throw new zzgoi(1);
                    default:
                        zzgbh zzgbhVar = (zzgbh) obj;
                        if (zzgbhVar == null) {
                            throw new zzgoi(3);
                        }
                        File file = zzgbhVar.b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        fn4Var.d.f(15002, new yi4(i4, fn4Var, zzgbhVar));
                        return new Boolean(true);
                }
            }
        }, fu4Var), qm4.e, fu4Var);
    }

    public fn4(zzgbr zzgbrVar, zzgqh zzgqhVar, zzgri zzgriVar, zzgsw zzgswVar, ExecutorService executorService, zzgfx zzgfxVar) {
        this.a = zzgbrVar;
        this.b = zzgqhVar;
        this.c = zzgriVar;
        this.d = zzgswVar;
        this.e = executorService;
        boolean zT0 = zzgfxVar.t0();
        this.g = zT0;
        this.f = zT0 ? new tu4(executorService) : executorService;
    }
}
