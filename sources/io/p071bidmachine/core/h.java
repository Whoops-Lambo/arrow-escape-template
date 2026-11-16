package io.p071bidmachine.core;

import com.inmobi.unification.sdk.InitializationStatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final /* synthetic */ h[] f;

    static {
        h hVar = new h("Idle", 0);
        a = hVar;
        h hVar2 = new h("Running", 1);
        b = hVar2;
        h hVar3 = new h(InitializationStatus.SUCCESS, 2);
        c = hVar3;
        h hVar4 = new h("Fail", 3);
        d = hVar4;
        h hVar5 = new h("Canceled", 4);
        e = hVar5;
        f = new h[]{hVar, hVar2, hVar3, hVar4, hVar5};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f.clone();
    }
}
