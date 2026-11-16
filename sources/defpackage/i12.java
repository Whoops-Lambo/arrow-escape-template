package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i12 {
    public static final i12 a;
    public static final /* synthetic */ i12[] b;

    static {
        i12 i12Var = new i12("DEFAULT", 0);
        a = i12Var;
        i12 i12Var2 = new i12("UNMETERED_ONLY", 1);
        i12 i12Var3 = new i12("UNMETERED_OR_DAILY", 2);
        i12 i12Var4 = new i12("FAST_IF_RADIO_AWAKE", 3);
        i12 i12Var5 = new i12("NEVER", 4);
        i12 i12Var6 = new i12("UNRECOGNIZED", 5);
        b = new i12[]{i12Var, i12Var2, i12Var3, i12Var4, i12Var5, i12Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, i12Var);
        sparseArray.put(1, i12Var2);
        sparseArray.put(2, i12Var3);
        sparseArray.put(3, i12Var4);
        sparseArray.put(4, i12Var5);
        sparseArray.put(-1, i12Var6);
    }

    public static i12 valueOf(String str) {
        return (i12) Enum.valueOf(i12.class, str);
    }

    public static i12[] values() {
        return (i12[]) b.clone();
    }
}
