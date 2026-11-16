package io.p071bidmachine;

import com.inmobi.unification.sdk.InitializationStatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class f0 {
    public static final f0 a;
    public static final f0 b;
    public static final f0 c;
    public static final f0 d;
    public static final f0 e;
    public static final f0 f;
    public static final f0 g;
    public static final /* synthetic */ f0[] h;

    static {
        f0 f0Var = new f0("Idle", 0);
        a = f0Var;
        f0 f0Var2 = new f0("Requesting", 1);
        b = f0Var2;
        f0 f0Var3 = new f0("Loading", 2);
        c = f0Var3;
        f0 f0Var4 = new f0(InitializationStatus.SUCCESS, 3);
        d = f0Var4;
        f0 f0Var5 = new f0("Failed", 4);
        e = f0Var5;
        f0 f0Var6 = new f0("Destroyed", 5);
        f = f0Var6;
        f0 f0Var7 = new f0("Expired", 6);
        g = f0Var7;
        h = new f0[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) h.clone();
    }
}
