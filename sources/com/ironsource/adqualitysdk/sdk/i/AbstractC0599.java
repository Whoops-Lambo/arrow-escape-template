package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ՙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0599 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    /* JADX INFO: renamed from: ﾒ */
    public int mo390() {
        return 1;
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract C1033 mo365(C0890 c0890, C1199 c1199);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C1033 m533(C0890 c0890, C1199 c1199) {
        try {
            c0890.f2382.add(this);
            C1033 c1033Mo365 = mo365(c0890, c1199);
            c0890.m645(this);
            return c1033Mo365;
        } catch (AbstractC0804 e) {
            throw e;
        } catch (Throwable th) {
            throw new C1292(c1199, c0890, StringFog.decrypt("8PyjfAF4AfLQ7aRnGjYDqsb6sGcWNQHkwa4=\n", "tY7RE3NYZIo=\n") + this + "\n" + th, th);
        }
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    /* JADX INFO: renamed from: ﾒ */
    public int mo391(C0890 c0890) {
        return 1;
    }
}
