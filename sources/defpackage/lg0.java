package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lg0 {
    public static final lg0 a;
    public static final lg0 b;
    public static final lg0 c;
    public static final lg0 d;
    public static final lg0 e;
    public static final lg0 f;
    public static final lg0 g;
    public static final lg0 h;
    public static final lg0 i;
    public static final lg0 j;
    public static final lg0 k;
    public static final lg0 l;
    public static final /* synthetic */ lg0[] m;

    static {
        lg0 lg0Var = new lg0("ERROR_CORRECTION", 0);
        a = lg0Var;
        lg0 lg0Var2 = new lg0("CHARACTER_SET", 1);
        b = lg0Var2;
        lg0 lg0Var3 = new lg0("DATA_MATRIX_SHAPE", 2);
        c = lg0Var3;
        lg0 lg0Var4 = new lg0("MIN_SIZE", 3);
        d = lg0Var4;
        lg0 lg0Var5 = new lg0("MAX_SIZE", 4);
        e = lg0Var5;
        lg0 lg0Var6 = new lg0("MARGIN", 5);
        f = lg0Var6;
        lg0 lg0Var7 = new lg0("PDF417_COMPACT", 6);
        g = lg0Var7;
        lg0 lg0Var8 = new lg0("PDF417_COMPACTION", 7);
        h = lg0Var8;
        lg0 lg0Var9 = new lg0("PDF417_DIMENSIONS", 8);
        i = lg0Var9;
        lg0 lg0Var10 = new lg0("AZTEC_LAYERS", 9);
        j = lg0Var10;
        lg0 lg0Var11 = new lg0("QR_VERSION", 10);
        k = lg0Var11;
        lg0 lg0Var12 = new lg0("GS1_FORMAT", 11);
        l = lg0Var12;
        m = new lg0[]{lg0Var, lg0Var2, lg0Var3, lg0Var4, lg0Var5, lg0Var6, lg0Var7, lg0Var8, lg0Var9, lg0Var10, lg0Var11, lg0Var12};
    }

    public static lg0 valueOf(String str) {
        return (lg0) Enum.valueOf(lg0.class, str);
    }

    public static lg0[] values() {
        return (lg0[]) m.clone();
    }
}
