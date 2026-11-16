package io.p071bidmachine.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class m {
    public static final m a;
    public static final /* synthetic */ m[] b;

    /* JADX INFO: Fake field, exist only in values array */
    m EF0;

    static {
        m mVar = new m("Browser", 0);
        m mVar2 = new m("EmbeddedBrowser", 1);
        m mVar3 = new m("InlineInstall", 2);
        a = mVar3;
        b = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) b.clone();
    }
}
