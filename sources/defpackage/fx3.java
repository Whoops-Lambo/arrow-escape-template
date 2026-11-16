package defpackage;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fx3 extends AdListener implements AppEventListener, zza {
    public final AbstractAdViewAdapter a;
    public final MediationBannerListener b;

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.b.onAdClicked(this.a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.b.onAdClosed(this.a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.b.onAdFailedToLoad(this.a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.b.onAdLoaded(this.a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.b.onAdOpened(this.a);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.b.zza(this.a, str, str2);
    }

    public fx3(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.a = abstractAdViewAdapter;
        this.b = mediationBannerListener;
    }
}
