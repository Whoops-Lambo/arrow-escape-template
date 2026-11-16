package defpackage;

import com.facebook.internal.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class go implements m {
    public static final go a;
    public static final /* synthetic */ go[] b;

    static {
        go goVar = new go("SHARE_CAMERA_EFFECT", 0);
        a = goVar;
        b = new go[]{goVar};
    }

    public static go valueOf(String str) {
        return (go) Enum.valueOf(go.class, str);
    }

    public static go[] values() {
        return (go[]) b.clone();
    }

    @Override // com.facebook.internal.m
    public final String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    @Override // com.facebook.internal.m
    public final int d() {
        return 20170417;
    }
}
