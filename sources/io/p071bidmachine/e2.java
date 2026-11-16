package io.p071bidmachine;

import android.content.Context;
import android.content.res.AssetManager;
import io.p071bidmachine.core.a;
import io.p071bidmachine.core.j;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {
    public static final String[] a = {"network", "format", "ad_units"};

    public static NetworkConfig b(Context context, JSONObject jSONObject) {
        String string;
        if (context != null) {
            try {
                string = jSONObject.getString("network");
                try {
                    NetworkConfig networkConfigA = a(context, string, j.m(jSONObject));
                    if (networkConfigA != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray("ad_units");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            AdFormat adFormatByRemoteName = AdFormat.byRemoteName(jSONObject2.getString("format"));
                            if (adFormatByRemoteName != null) {
                                HashMap mapM = j.m(jSONObject2);
                                try {
                                    String[] strArr = a;
                                    for (int i2 = 0; i2 < 3; i2++) {
                                        mapM.remove(strArr[i2]);
                                    }
                                } catch (Exception unused) {
                                }
                                networkConfigA.withMediationConfig(adFormatByRemoteName, mapM);
                            } else {
                                a.a(new y(string, 10));
                            }
                        }
                        a.a(new k0(networkConfigA, 4));
                        return networkConfigA;
                    }
                } catch (Throwable th) {
                    th = th;
                    a.a(new y(string, 11));
                    a.i(th);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                string = null;
            }
        }
        return null;
    }

    public static NetworkConfig a(Context context, String str, Map map) {
        d2 d2VarA;
        ConcurrentHashMap concurrentHashMap = c2.a;
        if (concurrentHashMap.containsKey(str)) {
            d2VarA = (d2) concurrentHashMap.get(str);
        } else {
            try {
                AssetManager assets = context.getAssets();
                d2VarA = assets == null ? null : c2.a(str + ".bmnetwork", assets);
            } catch (Exception unused) {
            }
        }
        if (d2VarA == null) {
            return null;
        }
        try {
            Constructor<?> constructor = Class.forName(d2VarA.c).getConstructor(Map.class);
            if (map != null) {
                try {
                    String[] strArr = a;
                    for (int i = 0; i < 3; i++) {
                        map.remove(strArr[i]);
                    }
                } catch (Exception unused2) {
                }
            }
            return (NetworkConfig) constructor.newInstance(map);
        } catch (Throwable th) {
            a.a(new y(str, 12));
            a.i(th);
            return null;
        }
    }
}
