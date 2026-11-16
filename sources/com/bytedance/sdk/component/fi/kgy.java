package com.bytedance.sdk.component.fi;

import android.os.Bundle;
import com.bytedance.sdk.component.ahm.kgy.fi;
import com.bytedance.sdk.component.ahm.kgy.kgy.kgy.ct;
import com.bytedance.sdk.component.ahm.kgy.nu;
import com.bytedance.sdk.openadsdk.um.uq;
import defpackage.d;
import defpackage.n30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kgy {
    private static rz ahm;
    private static ct kgy;
    private nu rz;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
        void ahm(uq uqVar);

        void kgy(uq uqVar);

        void rz(uq uqVar);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.fi.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C0214kgy {
        private Set<String> noq;
        ahm uq;
        private Bundle yo;
        final List<fi> ct = new ArrayList();
        int kgy = 10000;
        int ahm = 10000;
        int rz = 10000;

        private static int kgy(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                d.r(n30.m(str, " < 0"));
                return 0;
            }
            if (timeUnit == null) {
                d.w("unit == null");
                return 0;
            }
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                d.r(n30.m(str, " too large."));
                return 0;
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            d.r(n30.m(str, " too small."));
            return 0;
        }

        public C0214kgy ahm(long j, TimeUnit timeUnit) {
            this.ahm = kgy("timeout", j, timeUnit);
            return this;
        }

        public C0214kgy rz(long j, TimeUnit timeUnit) {
            this.rz = kgy("timeout", j, timeUnit);
            return this;
        }

        public C0214kgy kgy(long j, TimeUnit timeUnit) {
            this.kgy = kgy("timeout", j, timeUnit);
            return this;
        }

        public C0214kgy kgy(fi fiVar) {
            this.ct.add(fiVar);
            return this;
        }

        public C0214kgy kgy(ahm ahmVar) {
            this.uq = ahmVar;
            return this;
        }

        public C0214kgy kgy(boolean z) {
            return this;
        }

        public kgy kgy() {
            return new kgy(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface rz {
        boolean ahm();

        void kgy(String str, String str2, String str3, int i, String str4, boolean z, int i2, int i3);

        boolean kgy();
    }

    public static boolean ct() {
        ct ctVar = kgy;
        if (ctVar == null) {
            return false;
        }
        return ctVar.kgy();
    }

    public static void kgy(String str, String str2, String str3, int i, String str4, boolean z, int i2, int i3) {
        rz rzVar = ahm;
        if (rzVar == null) {
            return;
        }
        rzVar.kgy(str, str2, str3, i, str4, z, i2, i3);
    }

    public static boolean noq() {
        rz rzVar = ahm;
        if (rzVar == null) {
            return false;
        }
        return rzVar.kgy();
    }

    public static boolean yo() {
        rz rzVar = ahm;
        if (rzVar == null) {
            return false;
        }
        return rzVar.ahm();
    }

    public com.bytedance.sdk.component.fi.ahm.uq ahm() {
        return new com.bytedance.sdk.component.fi.ahm.uq(this.rz);
    }

    public nu fi() {
        return this.rz;
    }

    public com.bytedance.sdk.component.fi.ahm.ahm rz() {
        return new com.bytedance.sdk.component.fi.ahm.ahm(this.rz);
    }

    public com.bytedance.sdk.component.fi.ahm.kgy uq() {
        return new com.bytedance.sdk.component.fi.ahm.kgy(this.rz);
    }

    private kgy(C0214kgy c0214kgy) {
        nu.kgy kgyVar = new nu.kgy();
        long j = c0214kgy.kgy;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nu.kgy kgyVarAhm = kgyVar.kgy(j, timeUnit).rz(c0214kgy.rz, timeUnit).ahm(c0214kgy.ahm, timeUnit);
        List<fi> list = c0214kgy.ct;
        if (list != null && list.size() > 0) {
            Iterator<fi> it = c0214kgy.ct.iterator();
            while (it.hasNext()) {
                kgyVarAhm.kgy(it.next());
            }
        }
        if (c0214kgy.yo != null) {
            Bundle unused = c0214kgy.yo;
        }
        Set unused2 = c0214kgy.noq;
        kgyVarAhm.kgy(c0214kgy.uq);
        this.rz = kgyVarAhm.kgy();
    }

    public static void kgy(ct ctVar) {
        kgy = ctVar;
    }

    public static void kgy() {
        com.bytedance.sdk.component.fi.rz.uq.kgy(com.bytedance.sdk.component.fi.rz.uq.kgy.DEBUG);
    }

    public static void kgy(rz rzVar) {
        ahm = rzVar;
    }
}
