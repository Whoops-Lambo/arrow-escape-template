package defpackage;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzboj;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g14 extends zzboj {
    public final /* synthetic */ zzbzs a;

    @Override // com.google.android.gms.internal.ads.zzbok
    public final void N(zzbnx zzbnxVar) {
        zzbzt zzbztVar;
        zzbzs zzbzsVar = this.a;
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener = zzbzsVar.a;
        synchronized (zzbzsVar) {
            zzbztVar = zzbzsVar.c;
            if (zzbztVar == null) {
                zzbztVar = new zzbzt(zzbnxVar);
                zzbzsVar.c = zzbztVar;
            }
        }
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzbztVar);
    }
}
