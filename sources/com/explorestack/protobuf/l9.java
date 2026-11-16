package com.explorestack.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class l9 {
    public static final h9 c;
    public static final i9 d;
    public static final j9 e;
    public static final l9 f;
    public static final /* synthetic */ l9[] g;
    public final m9 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    l9 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    l9 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    l9 EF2;

    static {
        l9 l9Var = new l9("DOUBLE", 0, m9.DOUBLE, 1);
        l9 l9Var2 = new l9("FLOAT", 1, m9.FLOAT, 5);
        m9 m9Var = m9.LONG;
        l9 l9Var3 = new l9("INT64", 2, m9Var, 0);
        l9 l9Var4 = new l9("UINT64", 3, m9Var, 0);
        m9 m9Var2 = m9.INT;
        l9 l9Var5 = new l9("INT32", 4, m9Var2, 0);
        l9 l9Var6 = new l9("FIXED64", 5, m9Var, 1);
        l9 l9Var7 = new l9("FIXED32", 6, m9Var2, 5);
        l9 l9Var8 = new l9("BOOL", 7, m9.BOOLEAN, 0);
        h9 h9Var = new h9("STRING", 8, m9.STRING, 2);
        c = h9Var;
        m9 m9Var3 = m9.MESSAGE;
        i9 i9Var = new i9("GROUP", 9, m9Var3, 3);
        d = i9Var;
        j9 j9Var = new j9("MESSAGE", 10, m9Var3, 2);
        e = j9Var;
        k9 k9Var = new k9("BYTES", 11, m9.BYTE_STRING, 2);
        l9 l9Var9 = new l9("UINT32", 12, m9Var2, 0);
        l9 l9Var10 = new l9("ENUM", 13, m9.ENUM, 0);
        f = l9Var10;
        g = new l9[]{l9Var, l9Var2, l9Var3, l9Var4, l9Var5, l9Var6, l9Var7, l9Var8, h9Var, i9Var, j9Var, k9Var, l9Var9, l9Var10, new l9("SFIXED32", 14, m9Var2, 5), new l9("SFIXED64", 15, m9Var, 1), new l9("SINT32", 16, m9Var2, 0), new l9("SINT64", 17, m9Var, 0)};
    }

    public static l9 valueOf(String str) {
        return (l9) Enum.valueOf(l9.class, str);
    }

    public static l9[] values() {
        return (l9[]) g.clone();
    }

    public boolean d() {
        return !(this instanceof h9);
    }

    public l9(String str, int i, m9 m9Var, int i2) {
        super(str, i);
        this.a = m9Var;
        this.b = i2;
    }
}
