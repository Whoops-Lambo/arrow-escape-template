package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Hydra {
    public static Equuleus a() {
        Context context;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            GalacticCore galacticCore = new GalacticCore();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, galacticCore, 1)) {
                try {
                    Gemini gemini = new Gemini(galacticCore.a());
                    return new Equuleus(gemini.a(), gemini.b());
                } catch (Exception unused) {
                } finally {
                    context.unbindService(galacticCore);
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }
}
