package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class d1 extends Handler {
    public final WeakReference a;

    public d1(Looper looper, com.fyber.inneractive.sdk.network.f fVar) {
        super(looper);
        this.a = new WeakReference(fVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String strA;
        String string;
        super.handleMessage(message);
        e1 e1Var = (e1) v.a(this.a);
        if (e1Var != null) {
            com.fyber.inneractive.sdk.network.f fVar = (com.fyber.inneractive.sdk.network.f) e1Var;
            int i = message.what;
            if (i == 12312329 || i == 20150330) {
                if (fVar.f && fVar.a.size() > 0) {
                    while (true) {
                        JSONObject jSONObject = null;
                        string = null;
                        if (fVar.a.size() <= 0) {
                            break;
                        }
                        try {
                            jSONObject = (JSONObject) fVar.a.poll();
                        } catch (Throwable unused) {
                        }
                        if (jSONObject != null) {
                            fVar.b.put(jSONObject);
                        }
                    }
                    if (fVar.b.length() > 0) {
                        JSONArray jSONArray = fVar.b;
                        int i2 = com.fyber.inneractive.sdk.config.n.a;
                        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                        if (TextUtils.isEmpty(property)) {
                            strA = "https://" + IAConfigManager.Q.j.f;
                        } else {
                            strA = com.fyber.inneractive.sdk.config.a.a(property, "Event");
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            string = jSONArray.toString();
                        } catch (Throwable unused2) {
                        }
                        if (string != null) {
                            IAConfigManager.Q.s.a(new com.fyber.inneractive.sdk.network.x0(new com.fyber.inneractive.sdk.network.e(strA, jSONArray, jCurrentTimeMillis), strA, string));
                        }
                        fVar.b = new JSONArray();
                    }
                }
                d1 d1Var = fVar.d;
                if (d1Var != null) {
                    d1Var.removeMessages(12312329);
                    long j = fVar.e * 1000;
                    d1 d1Var2 = fVar.d;
                    if (d1Var2 != null) {
                        d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j));
                    }
                }
            }
        }
    }
}
