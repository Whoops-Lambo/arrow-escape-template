package defpackage;

import com.applovin.impl.sdk.l;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ue3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener c;

    public /* synthetic */ ue3(l lVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener, int i) {
        this.a = i;
        this.b = lVar;
        this.c = sdkInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.c;
        l lVar = this.b;
        switch (i) {
            case 0:
                lVar.a(sdkInitializationListener);
                break;
            default:
                lVar.b(sdkInitializationListener);
                break;
        }
    }
}
