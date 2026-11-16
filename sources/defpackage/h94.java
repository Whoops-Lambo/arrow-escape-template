package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzdmh;
import com.google.android.gms.internal.ads.zzdpy;
import com.ironsource.C4664b4;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h94 implements zzbqs {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public /* synthetic */ h94(zzdpy zzdpyVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(zzdpyVar);
                break;
            default:
                this.b = new WeakReference(zzdpyVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final void a(Object obj, Map map) {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                zzdpy zzdpyVar = (zzdpy) weakReference.get();
                if (zzdpyVar != null) {
                    zzdmh zzdmhVar = zzdpyVar.i;
                    if ("_ac".equals((String) map.get(C4664b4.i.j0))) {
                        zzdpyVar.h.onAdClicked();
                        if (((Boolean) zzba.zzc().a(zzbjr.zc)).booleanValue()) {
                            zzdmhVar.W();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                zzdmhVar.i0();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                zzdpy zzdpyVar2 = (zzdpy) weakReference.get();
                if (zzdpyVar2 != null) {
                    zzdmh zzdmhVar2 = zzdpyVar2.i;
                    zzdpyVar2.h.onAdClicked();
                    if (((Boolean) zzba.zzc().a(zzbjr.zc)).booleanValue()) {
                        zzdmhVar2.W();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            zzdmhVar2.i0();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
