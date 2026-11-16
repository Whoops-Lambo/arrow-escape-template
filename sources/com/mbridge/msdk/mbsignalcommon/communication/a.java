package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements e {
    public static final String a = "a";

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void a(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void install(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void c(Object obj, String str) {
        try {
            if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
                f.a().a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b);
            }
        } catch (Throwable th) {
            q0.b(a, "onSignalCommunication", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void b(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (!TextUtils.isEmpty(str)) {
            if (contextD == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) != null) {
                        contextD = windVaneWebView.getContext();
                    }
                } catch (Exception unused) {
                }
            }
            if (contextD == null) {
                f.a().b(obj, d.a(1));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", m0.s(contextD));
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = Base64.encodeToString(string.getBytes(), 2);
                }
                f.a().b(obj, string);
            } catch (Throwable unused2) {
                f.a().b(obj, d.a(1));
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void increaseOfferFrequence(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                d.a(obj, MintegralNetworkBridge.jsonObjectInit(str));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (!TextUtils.isEmpty(str)) {
            if (contextD == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) != null) {
                        contextD = windVaneWebView.getContext();
                    }
                } catch (Exception unused) {
                }
            }
            if (contextD != null) {
                try {
                    JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
                    String strOptString = jSONObjectJsonObjectInit.optString("url");
                    int iOptInt = jSONObjectJsonObjectInit.optInt("type");
                    if (iOptInt == 1) {
                        com.mbridge.msdk.click.c.c(contextD, strOptString);
                    } else if (iOptInt == 2) {
                        com.mbridge.msdk.click.c.e(contextD, strOptString);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
