package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vk0 implements AudienceNetworkAds.InitListener {
    public static vk0 d;
    public boolean a = false;
    public boolean b = false;
    public final ArrayList c = new ArrayList();

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        int i = 0;
        this.a = false;
        this.b = initResult.isSuccess();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wk0 wk0Var = (wk0) obj;
            if (initResult.isSuccess()) {
                wk0Var.a.onInitializationSucceeded();
            } else {
                wk0Var.a.onInitializationFailed(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN).getMessage());
            }
        }
        arrayList.clear();
    }
}
