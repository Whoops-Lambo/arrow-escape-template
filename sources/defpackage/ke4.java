package defpackage;

import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzeng;
import com.google.android.gms.internal.ads.zzeom;
import com.google.android.gms.internal.ads.zzeos;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ke4 extends zzbxs {
    public final zzeng a;
    public final /* synthetic */ zzeom b;

    public /* synthetic */ ke4(zzeom zzeomVar, zzeng zzengVar) {
        this.b = zzeomVar;
        this.a = zzengVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void a(zze zzeVar) {
        ((zzeos) this.a.c).s(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzf(String str) {
        ((zzeos) this.a.c).M3(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void l(IObjectWrapper iObjectWrapper) {
        this.b.c = (View) ObjectWrapper.z1(iObjectWrapper);
        ((zzeos) this.a.c).zzj();
    }
}
