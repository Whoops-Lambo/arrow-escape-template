package defpackage;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class go0 {
    public static final go0 a;
    public static final go0 b;
    public static final /* synthetic */ go0[] c;

    static {
        go0 go0Var = new go0("LINK", 0);
        a = go0Var;
        go0 go0Var2 = new go0(NativeAdContent.ViewTag.AD_ICON, 1);
        b = go0Var2;
        c = new go0[]{go0Var, go0Var2};
    }

    public static go0 valueOf(String str) {
        return (go0) Enum.valueOf(go0.class, str);
    }

    public static go0[] values() {
        return (go0[]) c.clone();
    }
}
