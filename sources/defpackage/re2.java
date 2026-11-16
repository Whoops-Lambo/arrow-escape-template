package defpackage;

import com.facebook.internal.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class re2 implements m {
    public static final re2 a;
    public static final /* synthetic */ re2[] b;

    static {
        re2 re2Var = new re2("SHARE_STORY_ASSET", 0);
        a = re2Var;
        b = new re2[]{re2Var};
    }

    public static re2 valueOf(String str) {
        return (re2) Enum.valueOf(re2.class, str);
    }

    public static re2[] values() {
        return (re2[]) b.clone();
    }

    @Override // com.facebook.internal.m
    public final String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    @Override // com.facebook.internal.m
    public final int d() {
        return 20170417;
    }
}
