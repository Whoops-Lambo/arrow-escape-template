package defpackage;

import android.util.Log;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qt1 implements lt1 {
    public final /* synthetic */ InitializationCompleteCallback a;

    @Override // defpackage.lt1
    public final void onInitializeError(AdError adError) {
        Log.w(PangleMediationAdapter.TAG, adError.toString());
        this.a.onInitializationFailed(adError.getMessage());
    }

    @Override // defpackage.lt1
    public final void onInitializeSuccess() {
        this.a.onInitializationSucceeded();
    }

    public qt1(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }
}
