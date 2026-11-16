package defpackage;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.internal.ads.zzeez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class nc4 extends AdListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ BaseAdView b;
    public final /* synthetic */ zzeez c;

    public nc4(zzeez zzeezVar, String str, BaseAdView baseAdView) {
        this.a = str;
        this.b = baseAdView;
        Objects.requireNonNull(zzeezVar);
        this.c = zzeezVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.c.P3(zzeez.S3(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        String str = this.a;
        this.c.O3(this.b, str);
    }
}
