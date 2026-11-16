package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import defpackage.az2;
import defpackage.ba0;
import defpackage.cz;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.y80;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Ag extends Sp {
    public final Tp d;
    public Bf e;
    public final X8 f;
    public final Y9 g;

    @Override // com.inmobi.media.Tp
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.Tp
    public final View c() {
        Y9 y9 = this.g;
        if (y9 != null) {
            ((Z9) y9).c("Ag", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.Tp
    public final boolean d() {
        Bf bf = this.e;
        return !(bf == null || bf.c == null) || this.d.d();
    }

    @Override // com.inmobi.media.Tp
    public final void e() {
        Y9 y9 = this.g;
        if (y9 != null) {
            ((Z9) y9).a("Ag", "stopTrackingForImpression");
        }
        this.d.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ag(Context context, Ej ej, Tp tp, cz czVar, Bf bf, X8 x8, Y9 y9) {
        super(ej);
        context.getClass();
        ej.getClass();
        tp.getClass();
        czVar.getClass();
        this.d = tp;
        this.e = bf;
        this.f = x8;
        this.g = y9;
        cz czVarA = AbstractC4318q5.a(czVar);
        if (y9 != null) {
            ((Z9) y9).b("Ag", "initializeOMSDK called");
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        AbstractC4217mg.a(applicationContext);
        tb5.t(czVarA, null, null, new C4575zg(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(Ag ag, fy fyVar) throws Throwable {
        C4548yg c4548yg;
        Y9 y9;
        ag.getClass();
        if (fyVar instanceof C4548yg) {
            c4548yg = (C4548yg) fyVar;
            int i = c4548yg.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4548yg.c = i - Integer.MIN_VALUE;
            } else {
                c4548yg = new C4548yg(ag, fyVar);
            }
        } else {
            c4548yg = new C4548yg(ag, fyVar);
        }
        Object objE = c4548yg.a;
        int i2 = c4548yg.c;
        az2 az2Var = null;
        if (i2 != 0) {
            if (i2 == 1) {
                wz2.a0(objE);
            } else {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            wz2.a0(objE);
            C4356rg c4356rg = C4356rg.a;
            c4548yg.c = 1;
            Context context = AbstractC4221mk.a;
            if (context == null) {
                objE = "";
            } else {
                ba0 ba0Var = xc0.a;
                objE = tb5.E(y80.c, new C4301pg(context, null), c4548yg);
            }
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
        }
        String str = (String) objE;
        X8 x8 = ag.f;
        az2 az2Var2 = az2.a;
        if (x8 != null) {
            Bf bf = ag.e;
            if (bf != null) {
                bf.a(str, x8.a, x8.b, x8.d, x8.c, x8.e);
                az2Var = az2Var2;
            }
            if (az2Var == null) {
                y9 = ag.g;
                if (y9 != null) {
                    ((Z9) y9).a("Ag", "OmidInfo is null, cannot track ad");
                }
            }
        } else {
            y9 = ag.g;
            if (y9 != null) {
                ((Z9) y9).a("Ag", "OmidInfo is null, cannot track ad");
            }
        }
        return az2Var2;
    }

    @Override // com.inmobi.media.Tp
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        view.getClass();
        friendlyObstructionPurpose.getClass();
        Bf bf = this.e;
        if (bf != null) {
            AdSession adSession = bf.c;
            Y9 y9 = bf.b;
            if (adSession == null) {
                if (y9 != null) {
                    ((Z9) y9).a(AbstractC4035g1.f, "Failed to addObstruction: adSession is null");
                    return;
                }
                return;
            }
            if (y9 != null) {
                ((Z9) y9).a(AbstractC4035g1.f, "addObstruction");
            }
            AbstractC4318q5.a(bf.a, new Z0(bf, view, friendlyObstructionPurpose, null));
        }
    }

    @Override // com.inmobi.media.Tp
    public final void a(View view) {
        view.getClass();
        Bf bf = this.e;
        if (bf == null || bf.c == null) {
            return;
        }
        AbstractC4318q5.a(bf.a, new C3924c1(bf, view, null));
    }

    @Override // com.inmobi.media.Tp
    public final void a(Map map) {
        Y9 y9 = this.g;
        if (y9 != null) {
            ((Z9) y9).a("Ag", "startTrackingForImpression");
        }
        this.d.a(map);
    }

    @Override // com.inmobi.media.Tp
    public final void a(Context context, byte b) {
        context.getClass();
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.Tp
    public final void a() {
        Y9 y9 = this.g;
        if (y9 != null) {
            ((Z9) y9).c("Ag", "destroy");
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.e = null;
        this.d.a();
    }
}
