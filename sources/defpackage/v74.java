package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcal;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcly;
import com.google.android.gms.internal.ads.zzdct;
import com.google.android.gms.internal.ads.zzdew;
import com.google.android.gms.internal.ads.zzdex;
import com.google.android.gms.internal.ads.zzdfq;
import com.google.android.gms.internal.ads.zzeav;
import com.google.android.gms.internal.ads.zzeaw;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzfmb;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class v74 implements zzdfq, zzdex, zzdew {
    public final Context a;
    public zzcbe b;
    public zzcbe c;
    public final zzflq d;
    public final zzcly e;
    public final Clock f;
    public final zzeaw g;
    public final String h;
    public final zzdct i;

    public final /* synthetic */ void a(long j, Bundle bundle, String str, String str2) {
        String string = bundle != null ? new zzf().zzn(bundle, new JSONObject()).toString() : null;
        long jElapsedRealtime = this.f.elapsedRealtime() - j;
        String strEncodeToString = string != null ? Base64.encodeToString(string.getBytes(), 1) : null;
        if (((Boolean) zzba.zzc().a(zzbjr.Re)).booleanValue()) {
            zzeav zzeavVarA = this.g.a();
            zzeavVarA.b("action", str);
            zzeavVarA.b("ppwpfl", String.valueOf(jElapsedRealtime));
            zzeavVarA.b("ppwpfst", str2);
            String str3 = this.h;
            if (str3 != null) {
                zzeavVarA.b("gqi", str3);
            }
            if (strEncodeToString != null) {
                zzeavVarA.b("ppwpferr", strEncodeToString);
            }
            zzeavVarA.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void x(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zza(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void Q() {
        zzcal zzcalVar = this.d.d0;
        if (zzcalVar == null || !zzcalVar.a) {
            return;
        }
        if (f()) {
            if (g(4)) {
                b(g(8), ((Boolean) zzba.zzc().a(zzbjr.Te)).booleanValue());
                return;
            }
            return;
        }
        if (g(256)) {
            ArrayList arrayList = new ArrayList();
            if (g(512)) {
                String str = zzcalVar.b;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                arrayList.add(str);
            }
        }
    }

    public final void b(boolean z, boolean z2) {
        zzcly zzclyVar;
        Activity activityZzj;
        zzcal zzcalVar = this.d.d0;
        if (zzcalVar == null) {
            return;
        }
        if (z) {
            String str = zzcalVar.e;
            if (!TextUtils.isEmpty(str)) {
                Bundle bundleG = rl3.g("targetPackage", str);
                bundleG.putString("referrer", zzcalVar.g);
                bundleG.putBundle("extra_query_params", zzcalVar.h);
                if (z2 && (zzclyVar = this.e) != null && (activityZzj = zzclyVar.zzj()) != null && activityZzj.getWindow() != null && activityZzj.getWindow().getDecorView() != null) {
                    bundleG.putBinder("window_token", activityZzj.getWindow().getDecorView().getWindowToken());
                }
                c(bundleG, "ppfla");
                return;
            }
        }
        c(null, "ppwla");
    }

    public final void c(Bundle bundle, String str) {
        try {
            t74 t74Var = new t74(this, str, this.f.elapsedRealtime());
            ArrayList arrayList = new ArrayList();
            if (bundle != null) {
                arrayList.add(bundle);
            }
            zzdct zzdctVar = this.i;
            Context context = this.a;
            IHsdpDeepLinkServiceWrapper iHsdpDeepLinkServiceWrapperA = zzdctVar.a(context);
            if (iHsdpDeepLinkServiceWrapperA != null) {
                iHsdpDeepLinkServiceWrapperA.prewarm(new ObjectWrapper(context), arrayList, t74Var);
            }
        } catch (Throwable th) {
            e("invokeHsdpPrewarmOrPrefetch", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void d(Context context) {
        zzcal zzcalVar = this.d.d0;
        if (zzcalVar == null || !f()) {
            return;
        }
        if (((Boolean) zzba.zzc().a(zzbjr.Qe)).booleanValue()) {
            String str = zzcalVar.e;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                zzdct zzdctVar = this.i;
                Context context2 = this.a;
                IHsdpDeepLinkServiceWrapper iHsdpDeepLinkServiceWrapperA = zzdctVar.a(context2);
                if (iHsdpDeepLinkServiceWrapperA != null) {
                    iHsdpDeepLinkServiceWrapperA.endSession(new ObjectWrapper(context2), str);
                }
            } catch (Throwable th) {
                e("invokeEndSession", th);
            }
        }
    }

    public final void e(String str, Throwable th) {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(zzbjr.Se)).booleanValue();
        Context context = this.a;
        if (zBooleanValue) {
            if (this.c == null) {
                this.c = zzcbc.e(context);
            }
            this.c.b("HsdpServiceUnsampled.".concat(str), th);
        } else {
            if (this.b == null) {
                this.b = zzcbc.c(context);
            }
            this.b.b("HsdpService.".concat(str), th);
        }
    }

    public final boolean f() {
        zzcal zzcalVar;
        return ((Boolean) zzba.zzc().a(zzbjr.Ne)).booleanValue() && (zzcalVar = this.d.d0) != null && zzcalVar.d;
    }

    public final boolean g(int i) {
        zzcal zzcalVar = this.d.d0;
        return (zzcalVar == null || (zzcalVar.f & i) == 0) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzg() {
        zzcal zzcalVar = this.d.d0;
        if (zzcalVar == null || !zzcalVar.a) {
            return;
        }
        if (f()) {
            if (g(1)) {
                b(g(2), ((Boolean) zzba.zzc().a(zzbjr.Ue)).booleanValue());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzcalVar.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public v74(Context context, zzflq zzflqVar, zzcly zzclyVar, zzfmb zzfmbVar, Clock clock, zzeaw zzeawVar, zzdct zzdctVar) {
        this.a = context;
        this.d = zzflqVar;
        this.e = zzclyVar;
        this.f = clock;
        this.g = zzeawVar;
        this.i = zzdctVar;
        this.h = zzfmbVar.b.b.b;
    }
}
