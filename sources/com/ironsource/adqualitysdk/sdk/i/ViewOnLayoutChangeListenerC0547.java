package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Т, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0547 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0511 f1312;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Object f1313;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            ArrayList arrayList = new ArrayList();
            this.f1312.mo398(this.f1313, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            View viewMo396 = this.f1312.mo396(this.f1313);
            if (viewMo396 != null && !this.f1312.f1148.f1264) {
                viewMo396.removeOnLayoutChangeListener(this);
            }
            this.f1312.m503(this.f1313, arrayList);
            this.f1312.mo380(IronSourceNetworkBridge.jsonObjectInit(), (WebView) arrayList.get(0), this.f1313);
        } catch (Throwable th) {
            AbstractC1290.m905(StringFog.decrypt("neqr8S/8zWu+8Yb5FP7Rarf6tQ==\n", "25/HnVyfvw4=\n"), StringFog.decrypt("JvQpBU/hg/xD6TUmXLiF5xfFMwtTpo8=\n", "Y4Zbaj3B6pI=\n"), th, false);
        }
    }

    public ViewOnLayoutChangeListenerC0547(AbstractC0511 abstractC0511, Object obj) {
        this.f1312 = abstractC0511;
        this.f1313 = obj;
    }
}
