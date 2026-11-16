package com.adsurge.adn.oversea_ad;

import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Aquila {
    public static final AtomicReference a = new AtomicReference();

    public static void b() {
        if (TextUtils.isEmpty(null)) {
            return;
        }
        AtomicReference atomicReference = a;
        synchronized (atomicReference) {
            atomicReference.set(null);
        }
    }

    public static String a() {
        String str;
        AtomicReference atomicReference = a;
        String str2 = (String) atomicReference.get();
        if (str2 != null) {
            return str2;
        }
        synchronized (atomicReference) {
            try {
                str = (String) atomicReference.get();
                if (str == null) {
                    str = Build.MODEL;
                    atomicReference.set(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
