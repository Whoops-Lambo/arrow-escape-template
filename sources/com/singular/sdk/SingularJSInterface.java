package com.singular.sdk;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.singular.sdk.internal.SingularLog;
import defpackage.n30;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class SingularJSInterface {
    private static final SingularLog logger = SingularLog.getLogger("SingularJSInterface");
    Context mContext;
    int webViewId;

    @JavascriptInterface
    public boolean event(String str) {
        logger.debug("event(name=" + str + ")");
        return Singular.event(str);
    }

    @JavascriptInterface
    public void revenue(String str, double d) throws JSONException {
        logger.debug("revenue(currency=" + str + ", amount=" + d + ")");
        Singular.revenue(str, d);
    }

    @JavascriptInterface
    public void setCustomUserId(String str) throws JSONException {
        logger.debug("setCustomUserId(customUserId=" + str + ")");
        Singular.setCustomUserId(str);
    }

    @JavascriptInterface
    public void setWebViewId(int i) {
        logger.debug("setWebViewId(id=" + i + ")");
        this.webViewId = i;
    }

    @JavascriptInterface
    public void unsetCustomUserId() throws JSONException {
        logger.debug("unsetCustomUserId()");
        Singular.unsetCustomUserId();
    }

    public SingularJSInterface(Context context) {
        this.mContext = context;
    }

    @JavascriptInterface
    public void event(String str, String str2) throws JSONException {
        logger.debug(n30.n("event(name=", str, ", JSONString=", str2, ")"));
        Singular.eventJSON(str, new JSONObject(str2));
    }
}
