package defpackage;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.internal.ads.zzeez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class qc4 extends AdListener {
    public final /* synthetic */ zzeez a;

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.a.P3(zzeez.S3(loadAdError));
    }

    public qc4(zzeez zzeezVar) {
        Objects.requireNonNull(zzeezVar);
        this.a = zzeezVar;
    }
}
