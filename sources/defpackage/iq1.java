package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class iq1 {
    public static final SparseArray a;
    public static final /* synthetic */ iq1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    iq1 EF1;

    static {
        iq1 iq1Var = new iq1("UNKNOWN_MOBILE_SUBTYPE", 0);
        iq1 iq1Var2 = new iq1("GPRS", 1);
        iq1 iq1Var3 = new iq1("EDGE", 2);
        iq1 iq1Var4 = new iq1("UMTS", 3);
        iq1 iq1Var5 = new iq1("CDMA", 4);
        iq1 iq1Var6 = new iq1("EVDO_0", 5);
        iq1 iq1Var7 = new iq1("EVDO_A", 6);
        iq1 iq1Var8 = new iq1("RTT", 7);
        iq1 iq1Var9 = new iq1("HSDPA", 8);
        iq1 iq1Var10 = new iq1("HSUPA", 9);
        iq1 iq1Var11 = new iq1("HSPA", 10);
        iq1 iq1Var12 = new iq1("IDEN", 11);
        iq1 iq1Var13 = new iq1("EVDO_B", 12);
        iq1 iq1Var14 = new iq1("LTE", 13);
        iq1 iq1Var15 = new iq1("EHRPD", 14);
        iq1 iq1Var16 = new iq1("HSPAP", 15);
        iq1 iq1Var17 = new iq1("GSM", 16);
        iq1 iq1Var18 = new iq1("TD_SCDMA", 17);
        iq1 iq1Var19 = new iq1("IWLAN", 18);
        iq1 iq1Var20 = new iq1("LTE_CA", 19);
        b = new iq1[]{iq1Var, iq1Var2, iq1Var3, iq1Var4, iq1Var5, iq1Var6, iq1Var7, iq1Var8, iq1Var9, iq1Var10, iq1Var11, iq1Var12, iq1Var13, iq1Var14, iq1Var15, iq1Var16, iq1Var17, iq1Var18, iq1Var19, iq1Var20, new iq1("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, iq1Var);
        sparseArray.put(1, iq1Var2);
        sparseArray.put(2, iq1Var3);
        sparseArray.put(3, iq1Var4);
        sparseArray.put(4, iq1Var5);
        sparseArray.put(5, iq1Var6);
        sparseArray.put(6, iq1Var7);
        sparseArray.put(7, iq1Var8);
        sparseArray.put(8, iq1Var9);
        sparseArray.put(9, iq1Var10);
        sparseArray.put(10, iq1Var11);
        sparseArray.put(11, iq1Var12);
        sparseArray.put(12, iq1Var13);
        sparseArray.put(13, iq1Var14);
        sparseArray.put(14, iq1Var15);
        sparseArray.put(15, iq1Var16);
        sparseArray.put(16, iq1Var17);
        sparseArray.put(17, iq1Var18);
        sparseArray.put(18, iq1Var19);
        sparseArray.put(19, iq1Var20);
    }

    public static iq1 valueOf(String str) {
        return (iq1) Enum.valueOf(iq1.class, str);
    }

    public static iq1[] values() {
        return (iq1[]) b.clone();
    }
}
