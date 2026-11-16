package com.google.android.gms.internal.measurement;

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
/* JADX INFO: loaded from: classes6.dex */
public final class zzagm {
    public static final zzagm c;
    public static final zzagm d;
    public static final zzagm e;
    public static final /* synthetic */ zzagm[] f;
    public final zzagn a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF0;

    static {
        zzagm zzagmVar = new zzagm("DOUBLE", 0, zzagn.d, 1);
        zzagm zzagmVar2 = new zzagm("FLOAT", 1, zzagn.c, 5);
        zzagn zzagnVar = zzagn.b;
        zzagm zzagmVar3 = new zzagm("INT64", 2, zzagnVar, 0);
        zzagm zzagmVar4 = new zzagm("UINT64", 3, zzagnVar, 0);
        zzagn zzagnVar2 = zzagn.a;
        zzagm zzagmVar5 = new zzagm("INT32", 4, zzagnVar2, 0);
        zzagm zzagmVar6 = new zzagm("FIXED64", 5, zzagnVar, 1);
        zzagm zzagmVar7 = new zzagm("FIXED32", 6, zzagnVar2, 5);
        zzagm zzagmVar8 = new zzagm("BOOL", 7, zzagn.e, 0);
        zzagm zzagmVar9 = new zzagm("STRING", 8, zzagn.f, 2);
        c = zzagmVar9;
        zzagn zzagnVar3 = zzagn.i;
        zzagm zzagmVar10 = new zzagm("GROUP", 9, zzagnVar3, 3);
        d = zzagmVar10;
        zzagm zzagmVar11 = new zzagm("MESSAGE", 10, zzagnVar3, 2);
        e = zzagmVar11;
        f = new zzagm[]{zzagmVar, zzagmVar2, zzagmVar3, zzagmVar4, zzagmVar5, zzagmVar6, zzagmVar7, zzagmVar8, zzagmVar9, zzagmVar10, zzagmVar11, new zzagm("BYTES", 11, zzagn.g, 2), new zzagm("UINT32", 12, zzagnVar2, 0), new zzagm("ENUM", 13, zzagn.h, 0), new zzagm("SFIXED32", 14, zzagnVar2, 5), new zzagm("SFIXED64", 15, zzagnVar, 1), new zzagm("SINT32", 16, zzagnVar2, 0), new zzagm("SINT64", 17, zzagnVar, 0)};
    }

    public static zzagm[] values() {
        return (zzagm[]) f.clone();
    }

    public zzagm(String str, int i, zzagn zzagnVar, int i2) {
        super(str, i);
        this.a = zzagnVar;
        this.b = i2;
    }
}
