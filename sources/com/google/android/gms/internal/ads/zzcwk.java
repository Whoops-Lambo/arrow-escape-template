package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.singular.sdk.internal.Constants;
import defpackage.k92;
import defpackage.xb2;
import defpackage.y40;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcwk extends zzcyy {
    public final zzcly l;
    public final int m;
    public final Context n;
    public final zzcvy o;
    public final zzdoz p;
    public final zzdln q;
    public final zzdep r;
    public final boolean s;
    public final zzcgm t;
    public final zzeaw u;
    public boolean v;

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
        zzcly zzclyVar;
        zzflq zzflqVarZzC;
        int i;
        zzdln zzdlnVar = this.q;
        zzdep zzdepVar = this.r;
        Context context = activity;
        if (activity == null) {
            context = this.n;
        }
        boolean z2 = this.s;
        if (z2) {
            zzdlnVar.k0(xb2.v);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdoz zzdozVar = this.p;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdozVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Gf)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(context, this.b, this.u);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.v1)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(context)) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    zzdepVar.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.w1)).booleanValue()) {
                        new zzgah(context.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzs().zza()).a(this.a.b.b.b);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Md)).booleanValue() && (zzclyVar = this.l) != null && (zzflqVarZzC = zzclyVar.zzC()) != null && zzflqVarZzC.r0) {
            int i3 = zzflqVarZzC.s0;
            zzcgm zzcgmVar = this.t;
            synchronized (zzcgmVar.a) {
                zzcgj zzcgjVar = zzcgmVar.d;
                synchronized (zzcgjVar.f) {
                    i = zzcgjVar.l;
                }
            }
            if (i3 != i) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("The app open consent form has been shown.");
                zzdepVar.zzc(zzfnl.d(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.v) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("App open interstitial ad is already visible.");
            zzdepVar.zzc(zzfnl.d(10, null, null));
        }
        if (this.v) {
            return;
        }
        try {
            zzdozVar.b(z, context, zzdepVar);
            if (z2) {
                zzdlnVar.k0(k92.v);
            }
            this.v = true;
        } catch (zzdoy e) {
            zzdepVar.A(e);
        }
    }

    public final void d() {
        zzdfb zzdfbVar = this.c;
        zzdfbVar.getClass();
        zzdfbVar.k0(new y40(null, 5));
        zzcly zzclyVar = this.l;
        if (zzclyVar != null) {
            zzclyVar.destroy();
        }
    }

    public final void e(int i, long j) {
        String str;
        zzcvy zzcvyVar = this.o;
        zzeav zzeavVarA = zzcvyVar.a.a();
        zzeavVarA.b("gqi", zzcvyVar.b.b.b.b);
        zzeavVarA.b("action", "ad_closed");
        zzeavVarA.b("show_time", String.valueOf(j));
        zzeavVarA.b("ad_format", "app_open_ad");
        int i2 = i - 1;
        if (i2 == 0) {
            str = CmcdData.STREAMING_FORMAT_HLS;
        } else if (i2 == 1) {
            str = "bb";
        } else if (i2 == 2) {
            str = "cc";
        } else if (i2 != 3) {
            str = i2 != 4 ? Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME;
        } else {
            str = "cb";
        }
        zzeavVarA.b("acr", str);
        zzeavVarA.c();
    }

    public zzcwk(zzcyx zzcyxVar, Context context, zzcly zzclyVar, int i, zzcvy zzcvyVar, zzdoz zzdozVar, zzdln zzdlnVar, zzdep zzdepVar, zzcgm zzcgmVar, zzeaw zzeawVar) {
        super(zzcyxVar);
        this.v = false;
        this.l = zzclyVar;
        this.n = context;
        this.m = i;
        this.o = zzcvyVar;
        this.p = zzdozVar;
        this.q = zzdlnVar;
        this.r = zzdepVar;
        this.s = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.I6)).booleanValue();
        this.t = zzcgmVar;
        this.u = zzeawVar;
    }
}
