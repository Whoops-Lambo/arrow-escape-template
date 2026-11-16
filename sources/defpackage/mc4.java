package defpackage;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzeez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class mc4 extends AppOpenAd.AppOpenAdLoadCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzeez b;

    public mc4(zzeez zzeezVar, String str) {
        this.a = str;
        Objects.requireNonNull(zzeezVar);
        this.b = zzeezVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.b.P3(zzeez.S3(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        String str = this.a;
        this.b.O3(appOpenAd, str);
    }
}
