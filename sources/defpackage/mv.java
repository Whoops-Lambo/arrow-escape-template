package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mv {
    public static final mv a;
    public static final /* synthetic */ mv[] b;

    /* JADX INFO: Fake field, exist only in values array */
    mv EF0;

    static {
        mv mvVar = new mv("NOT_SET", 0);
        mv mvVar2 = new mv("EVENT_OVERRIDE", 1);
        a = mvVar2;
        b = new mv[]{mvVar, mvVar2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, mvVar);
        sparseArray.put(5, mvVar2);
    }

    public static mv valueOf(String str) {
        return (mv) Enum.valueOf(mv.class, str);
    }

    public static mv[] values() {
        return (mv[]) b.clone();
    }
}
