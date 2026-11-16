package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjd {
    public static final Logger a = Logger.getLogger(zzjd.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class zza {
        public static final n a;
        public static final m b;
        public static final /* synthetic */ zza[] c;

        public abstract boolean zza();

        static {
            n nVar = new n();
            a = nVar;
            m mVar = new m();
            b = mVar;
            c = new zza[]{nVar, mVar};
        }

        public static zza[] values() {
            return (zza[]) c.clone();
        }
    }

    public static boolean a() {
        return b.get();
    }

    private zzjd() {
    }
}
