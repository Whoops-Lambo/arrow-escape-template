package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import com.ironsource.G5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.util.b;
import com.safedk.android.internal.partials.MintegralNetworkBridge;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        MintegralNetworkBridge.webviewLoadDataWithBaseURL(new WindVaneWebView(context), null, "<html><script>" + b.c().d() + "</script></html>", "text/html", G5.O, null);
    }
}
