package defpackage;

import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a73 implements x63 {
    public final /* synthetic */ InitializationCompleteCallback a;

    @Override // defpackage.x63
    public final void onInitializeError(AdError adError) {
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.a.onInitializationFailed(adError.toString());
    }

    @Override // defpackage.x63
    public final void onInitializeSuccess() {
        this.a.onInitializationSucceeded();
    }

    public a73(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }
}
