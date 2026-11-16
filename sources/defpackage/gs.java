package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gs {
    public static final gs a;
    public static final /* synthetic */ gs[] b;

    /* JADX INFO: Fake field, exist only in values array */
    gs EF0;

    static {
        gs gsVar = new gs("UNKNOWN", 0);
        gs gsVar2 = new gs("ANDROID_FIREBASE", 1);
        a = gsVar2;
        b = new gs[]{gsVar, gsVar2};
    }

    public static gs valueOf(String str) {
        return (gs) Enum.valueOf(gs.class, str);
    }

    public static gs[] values() {
        return (gs[]) b.clone();
    }
}
