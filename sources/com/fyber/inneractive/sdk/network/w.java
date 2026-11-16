package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class w {
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    public InneractiveAdRequest a;
    public t b;
    public u c;
    public JSONArray d;
    public final com.fyber.inneractive.sdk.response.e e;
    public final JSONArray f;
    public boolean g;

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e9, code lost:
    
        if (r6 != false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.w.a(java.lang.String):boolean");
    }

    public w(com.fyber.inneractive.sdk.response.e eVar) {
        this.g = false;
        this.e = eVar;
        this.f = new JSONArray();
    }

    public w(t tVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.b = tVar;
        this.a = inneractiveAdRequest;
        this.d = null;
    }

    public w(u uVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.c = uVar;
        this.a = null;
        this.d = null;
    }

    public w(u uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.c = uVar;
        this.a = inneractiveAdRequest;
        this.d = null;
    }

    public w(t tVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.b = tVar;
        this.a = null;
        this.d = null;
    }

    public final w a(Object... objArr) {
        if (objArr.length > 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < objArr.length - 1; i += 2) {
                String string = objArr[i].toString();
                Object obj = objArr[i + 1];
                try {
                    jSONObject.put(string, obj);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", string, obj);
                }
            }
            this.f.put(jSONObject);
        }
        return this;
    }
}
