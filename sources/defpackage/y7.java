package defpackage;

import androidx.arch.core.util.Function;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y7 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppLovinNativeAdImpl b;

    public /* synthetic */ y7(AppLovinNativeAdImpl appLovinNativeAdImpl, int i) {
        this.a = i;
        this.b = appLovinNativeAdImpl;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        int i = this.a;
        AppLovinNativeAdImpl appLovinNativeAdImpl = this.b;
        switch (i) {
            case 0:
                return appLovinNativeAdImpl.lambda$getCustomTabsNavigationAbortedPostbacks$6((m5) obj);
            case 1:
                return appLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$10((JSONArray) obj);
            case 2:
                return appLovinNativeAdImpl.lambda$getDirectClickTrackingPostbacks$9((m5) obj);
            case 3:
                return appLovinNativeAdImpl.lambda$getCustomTabsNavigationFinishedPostbacks$4((m5) obj);
            case 4:
                return appLovinNativeAdImpl.lambda$getCustomTabsNavigationFailedPostbacks$5((m5) obj);
            case 5:
                return appLovinNativeAdImpl.lambda$getCustomTabsHeaders$2((m5) obj);
            case 6:
                return appLovinNativeAdImpl.lambda$getCustomTabsTabShownPostbacks$7((m5) obj);
            case 7:
                return appLovinNativeAdImpl.lambda$getCustomTabsTabHiddenPostbacks$8((m5) obj);
            default:
                return appLovinNativeAdImpl.lambda$getCustomTabsNavigationStartedPostbacks$3((m5) obj);
        }
    }
}
