package defpackage;

import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.unity.MaxUnityAdManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cj1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaxUnityAdManager b;
    public final /* synthetic */ MaxAdFormat c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ cj1(MaxAdFormat maxAdFormat, MaxUnityAdManager maxUnityAdManager, String str, String str2) {
        this.a = 1;
        this.b = maxUnityAdManager;
        this.c = maxAdFormat;
        this.d = str;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.e;
        MaxAdFormat maxAdFormat = this.c;
        String str2 = this.d;
        MaxUnityAdManager maxUnityAdManager = this.b;
        switch (i) {
            case 0:
                maxUnityAdManager.lambda$setAdViewPlacement$21(str2, maxAdFormat, str);
                break;
            case 1:
                maxUnityAdManager.lambda$setAdViewBackgroundColor$29(maxAdFormat, str2, str);
                break;
            default:
                maxUnityAdManager.lambda$setAdViewCustomData$32(str2, maxAdFormat, str);
                break;
        }
    }

    public /* synthetic */ cj1(MaxUnityAdManager maxUnityAdManager, String str, MaxAdFormat maxAdFormat, String str2, int i) {
        this.a = i;
        this.b = maxUnityAdManager;
        this.d = str;
        this.c = maxAdFormat;
        this.e = str2;
    }
}
