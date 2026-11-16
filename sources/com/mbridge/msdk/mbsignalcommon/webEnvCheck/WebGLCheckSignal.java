package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.c;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {
    public static final /* synthetic */ int g = 0;

    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
            c.n().c(jSONObjectJsonObjectInit.optInt("webgl"));
            c.n().a(jSONObjectJsonObjectInit);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
