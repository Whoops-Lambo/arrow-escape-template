package com.ironsource;

import android.webkit.JavascriptInterface;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4865m8 {
    private C4919p8 a;

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/m8;->receiveMessageFromExternal(Ljava/lang/String;)V");
        CreativeInfoManager.onReceiveMessageFromExternal(com.safedk.android.utils.h.f, this, str);
        safedk_m8_receiveMessageFromExternal_f6df2e67e8e3a157bd953b642618ebc9(str);
    }

    @JavascriptInterface
    public void safedk_m8_receiveMessageFromExternal_f6df2e67e8e3a157bd953b642618ebc9(String p0) {
        this.a.handleMessageFromAd(p0);
    }

    public C4865m8(C4919p8 c4919p8) {
        this.a = c4919p8;
    }
}
