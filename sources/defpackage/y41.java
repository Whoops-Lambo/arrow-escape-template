package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y41 implements u41 {
    public final /* synthetic */ InitializationCompleteCallback a;

    @Override // defpackage.u41
    public final void onInitializeError(AdError adError) {
        this.a.onInitializationFailed(adError.toString());
    }

    @Override // defpackage.u41
    public final void onInitializeSuccess() {
        this.a.onInitializationSucceeded();
    }

    public y41(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }
}
