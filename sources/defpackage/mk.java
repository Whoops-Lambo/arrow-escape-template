package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mk {

    @NotNull
    public static final lk Companion;
    public static final mk a;
    public static final mk b;
    public static final mk c;
    public static final /* synthetic */ mk[] d;

    static {
        mk mkVar = new mk("HORIZONTAL", 0);
        a = mkVar;
        mk mkVar2 = new mk("VERTICAL", 1);
        b = mkVar2;
        mk mkVar3 = new mk("DEFAULT", 2);
        c = mkVar3;
        d = new mk[]{mkVar, mkVar2, mkVar3};
        Companion = new lk();
    }

    public static mk valueOf(String str) {
        return (mk) Enum.valueOf(mk.class, str);
    }

    public static mk[] values() {
        return (mk[]) d.clone();
    }
}
