package com.adsurge.adn.M;

import android.content.Context;
import android.util.Pair;
import com.adsurge.adn.managers.localt.MMPProvider;
import com.unity3d.services.core.fid.Constants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class b extends MMPProvider {
    @Override // com.adsurge.adn.managers.localt.MMPProvider
    public Pair a() {
        try {
            try {
                Class<?> cls = Class.forName("com.appsflyer.AppsFlyerLib");
                Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                if (objInvoke == null) {
                    return new Pair(null, null);
                }
                try {
                    try {
                        return new Pair((String) cls.getMethod("getAppsFlyerUID", null).invoke(objInvoke, null), null);
                    } catch (NoSuchMethodException unused) {
                        return new Pair((String) cls.getMethod("getAppsFlyerUID", Context.class).invoke(objInvoke, null), null);
                    }
                } catch (NoSuchMethodException unused2) {
                    return new Pair(null, 2);
                }
            } catch (ClassNotFoundException unused3) {
                return new Pair(null, 1);
            } catch (Exception unused4) {
                return new Pair(null, null);
            }
        } catch (NoSuchMethodException unused5) {
            return new Pair(null, 2);
        }
    }

    @Override // com.adsurge.adn.managers.localt.MMPProvider
    public int b() {
        return 1;
    }

    @Override // com.adsurge.adn.managers.localt.MMPProvider
    public String c() {
        return "AppsFlyerProvider";
    }

    @Override // com.adsurge.adn.managers.localt.MMPProvider
    public c a(String str) {
        return new c(1, str);
    }
}
