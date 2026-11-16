package com.google.android.gms.internal.ads;

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
public final class zzijx {
    public static final zzijx c;
    public static final zzijx d;
    public static final zzijx e;
    public static final /* synthetic */ zzijx[] f;
    public final zzijy a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    zzijx EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzijx EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzijx EF0;

    static {
        zzijx zzijxVar = new zzijx("DOUBLE", 0, zzijy.d, 1);
        zzijx zzijxVar2 = new zzijx("FLOAT", 1, zzijy.c, 5);
        zzijy zzijyVar = zzijy.b;
        zzijx zzijxVar3 = new zzijx("INT64", 2, zzijyVar, 0);
        zzijx zzijxVar4 = new zzijx("UINT64", 3, zzijyVar, 0);
        zzijy zzijyVar2 = zzijy.a;
        zzijx zzijxVar5 = new zzijx("INT32", 4, zzijyVar2, 0);
        zzijx zzijxVar6 = new zzijx("FIXED64", 5, zzijyVar, 1);
        zzijx zzijxVar7 = new zzijx("FIXED32", 6, zzijyVar2, 5);
        zzijx zzijxVar8 = new zzijx("BOOL", 7, zzijy.e, 0);
        zzijx zzijxVar9 = new zzijx("STRING", 8, zzijy.f, 2);
        c = zzijxVar9;
        zzijy zzijyVar3 = zzijy.i;
        zzijx zzijxVar10 = new zzijx("GROUP", 9, zzijyVar3, 3);
        d = zzijxVar10;
        zzijx zzijxVar11 = new zzijx("MESSAGE", 10, zzijyVar3, 2);
        e = zzijxVar11;
        f = new zzijx[]{zzijxVar, zzijxVar2, zzijxVar3, zzijxVar4, zzijxVar5, zzijxVar6, zzijxVar7, zzijxVar8, zzijxVar9, zzijxVar10, zzijxVar11, new zzijx("BYTES", 11, zzijy.g, 2), new zzijx("UINT32", 12, zzijyVar2, 0), new zzijx("ENUM", 13, zzijy.h, 0), new zzijx("SFIXED32", 14, zzijyVar2, 5), new zzijx("SFIXED64", 15, zzijyVar, 1), new zzijx("SINT32", 16, zzijyVar2, 0), new zzijx("SINT64", 17, zzijyVar, 0)};
    }

    public static zzijx[] values() {
        return (zzijx[]) f.clone();
    }

    public zzijx(String str, int i, zzijy zzijyVar, int i2) {
        super(str, i);
        this.a = zzijyVar;
        this.b = i2;
    }
}
