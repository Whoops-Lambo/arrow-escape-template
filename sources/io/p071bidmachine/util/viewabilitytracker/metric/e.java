package io.p071bidmachine.util.viewabilitytracker.metric;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static final e a;
    public static final /* synthetic */ e[] b;

    static {
        e eVar = new e("HAS_WINDOW_FOCUS", 0);
        a = eVar;
        b = new e[]{eVar};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) b.clone();
    }
}
