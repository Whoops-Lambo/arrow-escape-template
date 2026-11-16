package com.mbridge.msdk.video.signal.impl;

import com.ironsource.C4664b4;
import com.mbridge.msdk.foundation.tools.t;
import defpackage.dr0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class p extends g {
    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put(C4664b4.i.G, new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e) {
            dr0.m(e);
        }
    }
}
