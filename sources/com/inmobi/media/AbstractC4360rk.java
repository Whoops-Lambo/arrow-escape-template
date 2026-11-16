package com.inmobi.media;

import com.inmobi.sdk.SdkInitializationListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.rk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4360rk {
    public static byte a(Pa pa, byte b) {
        pa.getClass();
        byte b2 = 0;
        if (pa.c != 2) {
            return (byte) 0;
        }
        if (b == 1) {
            return (byte) 1;
        }
        if (b != 2 && b != 3) {
            return (byte) 0;
        }
        AtomicBoolean atomicBoolean = AbstractC4305pk.a;
        if (b == 2) {
            b2 = 1;
        } else if (b == 3) {
            b2 = 2;
        }
        AbstractC4305pk.f = b2;
        SdkInitializationListener sdkInitializationListener = pa.e;
        if (sdkInitializationListener != null) {
            AbstractC4305pk.e.add(sdkInitializationListener);
        }
        AtomicBoolean atomicBoolean2 = AbstractC4305pk.a;
        AbstractC4305pk.e.size();
        return (byte) 2;
    }
}
