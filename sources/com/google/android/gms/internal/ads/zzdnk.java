package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.g44;
import defpackage.k92;
import defpackage.xb2;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdnk extends zzcyy {
    public final Context l;
    public final WeakReference m;
    public final zzdln n;
    public final zzdoz o;
    public final zzczt p;
    public final zzgah q;
    public final zzdep r;
    public final zzcgm s;
    public final zzeaw t;
    public boolean u;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(Activity activity, boolean z) {
        zzflq zzflqVarZzC;
        int i;
        Context context = this.l;
        zzdep zzdepVar = this.r;
        zzdln zzdlnVar = this.n;
        zzdlnVar.k0(xb2.v);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdoz zzdozVar = this.o;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdozVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Gf)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(context, this.b, this.t);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.v1)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(context)) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    zzdepVar.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.w1)).booleanValue()) {
                        this.q.a(this.a.b.b.b);
                        return;
                    }
                    return;
                }
            }
        }
        zzcly zzclyVar = (zzcly) this.m.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Md)).booleanValue() && zzclyVar != null && (zzflqVarZzC = zzclyVar.zzC()) != null && zzflqVarZzC.r0) {
            int i3 = zzflqVarZzC.s0;
            zzcgm zzcgmVar = this.s;
            synchronized (zzcgmVar.a) {
                zzcgj zzcgjVar = zzcgmVar.d;
                synchronized (zzcgjVar.f) {
                    i = zzcgjVar.l;
                }
            }
            if (i3 != i) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("The interstitial consent form has been shown.");
                zzdepVar.zzc(zzfnl.d(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.u) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("The interstitial ad has been shown.");
            zzdepVar.zzc(zzfnl.d(10, null, null));
        }
        Context context2 = activity;
        if (this.u) {
            return;
        }
        if (activity == null) {
            context2 = context;
        }
        try {
            zzdozVar.b(z, context2, zzdepVar);
            zzdlnVar.k0(k92.v);
            this.u = true;
        } catch (zzdoy e) {
            zzdepVar.A(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            zzcly zzclyVar = (zzcly) this.m.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.T7)).booleanValue()) {
                if (!this.u && zzclyVar != null) {
                    zzcgv.f.execute(new g44(zzclyVar, 4));
                }
            } else if (zzclyVar != null) {
                zzclyVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public zzdnk(zzcyx zzcyxVar, Context context, zzcly zzclyVar, zzdln zzdlnVar, zzdoz zzdozVar, zzczt zzcztVar, zzgah zzgahVar, zzdep zzdepVar, zzcgm zzcgmVar, zzeaw zzeawVar) {
        super(zzcyxVar);
        this.u = false;
        this.l = context;
        this.m = new WeakReference(zzclyVar);
        this.n = zzdlnVar;
        this.o = zzdozVar;
        this.p = zzcztVar;
        this.q = zzgahVar;
        this.r = zzdepVar;
        this.s = zzcgmVar;
        this.t = zzeawVar;
    }
}
