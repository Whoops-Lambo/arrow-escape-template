package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jq1 {
    public static final SparseArray a;
    public static final /* synthetic */ jq1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    jq1 EF1;

    static {
        jq1 jq1Var = new jq1("MOBILE", 0);
        jq1 jq1Var2 = new jq1("WIFI", 1);
        jq1 jq1Var3 = new jq1("MOBILE_MMS", 2);
        jq1 jq1Var4 = new jq1("MOBILE_SUPL", 3);
        jq1 jq1Var5 = new jq1("MOBILE_DUN", 4);
        jq1 jq1Var6 = new jq1("MOBILE_HIPRI", 5);
        jq1 jq1Var7 = new jq1("WIMAX", 6);
        jq1 jq1Var8 = new jq1("BLUETOOTH", 7);
        jq1 jq1Var9 = new jq1("DUMMY", 8);
        jq1 jq1Var10 = new jq1("ETHERNET", 9);
        jq1 jq1Var11 = new jq1("MOBILE_FOTA", 10);
        jq1 jq1Var12 = new jq1("MOBILE_IMS", 11);
        jq1 jq1Var13 = new jq1("MOBILE_CBS", 12);
        jq1 jq1Var14 = new jq1("WIFI_P2P", 13);
        jq1 jq1Var15 = new jq1("MOBILE_IA", 14);
        jq1 jq1Var16 = new jq1("MOBILE_EMERGENCY", 15);
        jq1 jq1Var17 = new jq1("PROXY", 16);
        jq1 jq1Var18 = new jq1("VPN", 17);
        jq1 jq1Var19 = new jq1("NONE", 18);
        b = new jq1[]{jq1Var, jq1Var2, jq1Var3, jq1Var4, jq1Var5, jq1Var6, jq1Var7, jq1Var8, jq1Var9, jq1Var10, jq1Var11, jq1Var12, jq1Var13, jq1Var14, jq1Var15, jq1Var16, jq1Var17, jq1Var18, jq1Var19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, jq1Var);
        sparseArray.put(1, jq1Var2);
        sparseArray.put(2, jq1Var3);
        sparseArray.put(3, jq1Var4);
        sparseArray.put(4, jq1Var5);
        sparseArray.put(5, jq1Var6);
        sparseArray.put(6, jq1Var7);
        sparseArray.put(7, jq1Var8);
        sparseArray.put(8, jq1Var9);
        sparseArray.put(9, jq1Var10);
        sparseArray.put(10, jq1Var11);
        sparseArray.put(11, jq1Var12);
        sparseArray.put(12, jq1Var13);
        sparseArray.put(13, jq1Var14);
        sparseArray.put(14, jq1Var15);
        sparseArray.put(15, jq1Var16);
        sparseArray.put(16, jq1Var17);
        sparseArray.put(17, jq1Var18);
        sparseArray.put(-1, jq1Var19);
    }

    public static jq1 valueOf(String str) {
        return (jq1) Enum.valueOf(jq1.class, str);
    }

    public static jq1[] values() {
        return (jq1[]) b.clone();
    }
}
