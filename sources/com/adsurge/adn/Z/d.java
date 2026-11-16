package com.adsurge.adn.Z;

import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.adsurge.adn.Y0.v;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static volatile d a;

    public void a(e eVar) {
        try {
            a.a(eVar);
            com.adsurge.adn.p005a0.a.a();
            com.adsurge.adn.p008b0.c.a();
            com.adsurge.adn.p008b0.e.a(eVar);
        } catch (Throwable th) {
            com.adsurge.adn.Y0.e eVar2 = new com.adsurge.adn.Y0.e(eVar.g().c());
            new com.adsurge.adn.Y0.d().a(CmcdConfiguration.KEY_OBJECT_TYPE, Log.getStackTraceString(th));
            v.a(eVar2);
        }
    }

    public static d a() {
        if (a == null) {
            synchronized (d.class) {
                try {
                    if (a == null) {
                        a = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }
}
