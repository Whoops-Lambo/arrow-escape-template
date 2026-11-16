package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class Ub {
    private String a;

    public synchronized boolean b(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        try {
            jSONObjectB = b();
            JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectOptJSONObject.putOpt(next, jSONObject.opt(next));
                }
            } else {
                jSONObjectB.putOpt(str, jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a(jSONObjectB);
    }

    public Ub(String str) {
        this.a = str;
    }

    public boolean a(ArrayList<D8> arrayList) throws Exception {
        int size = arrayList.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            D8 d8 = arrayList.get(i);
            i++;
            if (!a(d8.getName())) {
                z = false;
            }
        }
        return z;
    }

    private void a(D8 d8) throws Exception {
        IronSourceStorageUtils.saveFile(IronSourceNetworkBridge.jsonObjectInit().toString().getBytes(), d8.getPath());
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    public synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        jSONObjectB = b();
        jSONObjectB.put(str, jSONObject);
        return a(jSONObjectB);
    }

    public synchronized boolean a(String str) throws Exception {
        JSONObject jSONObjectB = b();
        if (!jSONObjectB.has(str)) {
            return true;
        }
        jSONObjectB.remove(str);
        return a(jSONObjectB);
    }

    private D8 a() throws Exception {
        D8 d8 = new D8(this.a, "metadata.json");
        if (!d8.exists()) {
            a(d8);
        }
        return d8;
    }

    public synchronized JSONObject b() throws Exception {
        return IronSourceNetworkBridge.jsonObjectInit(IronSourceStorageUtils.readFile(a()));
    }
}
