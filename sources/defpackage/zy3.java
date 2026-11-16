package defpackage;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzcgv;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zy3 extends CustomTabsCallback {
    public final /* synthetic */ zzbkq c;

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        zzbkq zzbkqVar = this.c;
        zzbkqVar.getClass();
        if (!((Boolean) zzba.zzc().a(zzbjr.O5)).booleanValue() || zzbkqVar.d == null) {
            return;
        }
        zzcgv.a.execute(new ei1(i, 2, zzbkqVar));
    }

    public zy3(zzbkq zzbkqVar) {
        this.c = zzbkqVar;
    }
}
