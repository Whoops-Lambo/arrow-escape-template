package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class zzir {
    public static final zzir c;
    public static final zzir d;
    public static final zzir e;
    public static final /* synthetic */ zzir[] f;
    public final zzis a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    zzir EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzir EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzir EF0;

    static {
        zzir zzirVar = new zzir("DOUBLE", 0, zzis.d, 1);
        zzir zzirVar2 = new zzir("FLOAT", 1, zzis.c, 5);
        zzis zzisVar = zzis.b;
        zzir zzirVar3 = new zzir("INT64", 2, zzisVar, 0);
        zzir zzirVar4 = new zzir("UINT64", 3, zzisVar, 0);
        zzis zzisVar2 = zzis.a;
        zzir zzirVar5 = new zzir("INT32", 4, zzisVar2, 0);
        zzir zzirVar6 = new zzir("FIXED64", 5, zzisVar, 1);
        zzir zzirVar7 = new zzir("FIXED32", 6, zzisVar2, 5);
        zzir zzirVar8 = new zzir("BOOL", 7, zzis.e, 0);
        zzir zzirVar9 = new zzir("STRING", 8, zzis.f, 2);
        c = zzirVar9;
        zzis zzisVar3 = zzis.i;
        zzir zzirVar10 = new zzir("GROUP", 9, zzisVar3, 3);
        d = zzirVar10;
        zzir zzirVar11 = new zzir("MESSAGE", 10, zzisVar3, 2);
        e = zzirVar11;
        f = new zzir[]{zzirVar, zzirVar2, zzirVar3, zzirVar4, zzirVar5, zzirVar6, zzirVar7, zzirVar8, zzirVar9, zzirVar10, zzirVar11, new zzir("BYTES", 11, zzis.g, 2), new zzir("UINT32", 12, zzisVar2, 0), new zzir("ENUM", 13, zzis.h, 0), new zzir("SFIXED32", 14, zzisVar2, 5), new zzir("SFIXED64", 15, zzisVar, 1), new zzir("SINT32", 16, zzisVar2, 0), new zzir("SINT64", 17, zzisVar, 0)};
    }

    public static zzir[] values() {
        return (zzir[]) f.clone();
    }

    public zzir(String str, int i, zzis zzisVar, int i2) {
        super(str, i);
        this.a = zzisVar;
        this.b = i2;
    }
}
