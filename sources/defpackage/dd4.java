package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcch;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzfmb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class dd4 implements zzdhi {
    public final Context a;
    public final zzcfd b;

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void z(zzfmb zzfmbVar) {
        String str = zzfmbVar.b.b.e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzcfd zzcfdVar = this.b;
        Context context = this.a;
        zzcfdVar.getClass();
        if (((Boolean) zzba.zzc().a(zzbjr.j1)).booleanValue() && zzcfdVar.a(context) && zzcfd.g(context)) {
            synchronized (zzcfdVar.j) {
            }
        }
        zzcfdVar.h(context, "_aq", str, null);
    }

    public dd4(Context context, zzcfd zzcfdVar) {
        this.a = context;
        this.b = zzcfdVar;
    }
}
