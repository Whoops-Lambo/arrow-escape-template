package com.adsurge.adn.oversea_ad;

import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.case, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Ccase {
    public static final AtomicReference a = new AtomicReference(null);

    public static void a() {
        AtomicReference atomicReference = a;
        synchronized (atomicReference) {
            if (atomicReference.get() != null) {
                return;
            }
            try {
                ((AccessibilityManager) Cconst.a().getSystemService("accessibility")).isEnabled();
                Ctry ctry = new Ctry();
                atomicReference.set(ctry);
                TNative$aa.l209406_E8E4F4D4F33FB8BF(ctry, ctry.a, Ctry.class.getClassLoader());
            } catch (Throwable unused) {
            }
        }
    }
}
