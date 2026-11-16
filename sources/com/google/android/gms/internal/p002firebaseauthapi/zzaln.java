package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.gs3;
import defpackage.h50;

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
/* JADX INFO: loaded from: classes5.dex */
public final class zzaln {
    public static final zzaln b;
    public static final zzaln c;
    public static final zzaln[] d;
    public static final /* synthetic */ zzaln[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    zzaln EF0;

    static {
        zzamf zzamfVar = zzamf.e;
        zzaln zzalnVar = new zzaln("DOUBLE", 0, 0, 1, zzamfVar);
        zzamf zzamfVar2 = zzamf.d;
        zzaln zzalnVar2 = new zzaln("FLOAT", 1, 1, 1, zzamfVar2);
        zzamf zzamfVar3 = zzamf.c;
        zzaln zzalnVar3 = new zzaln("INT64", 2, 2, 1, zzamfVar3);
        zzaln zzalnVar4 = new zzaln("UINT64", 3, 3, 1, zzamfVar3);
        zzamf zzamfVar4 = zzamf.b;
        zzaln zzalnVar5 = new zzaln("INT32", 4, 4, 1, zzamfVar4);
        zzaln zzalnVar6 = new zzaln("FIXED64", 5, 5, 1, zzamfVar3);
        zzaln zzalnVar7 = new zzaln("FIXED32", 6, 6, 1, zzamfVar4);
        zzamf zzamfVar5 = zzamf.f;
        zzaln zzalnVar8 = new zzaln("BOOL", 7, 7, 1, zzamfVar5);
        zzamf zzamfVar6 = zzamf.g;
        zzaln zzalnVar9 = new zzaln("STRING", 8, 8, 1, zzamfVar6);
        zzamf zzamfVar7 = zzamf.j;
        zzaln zzalnVar10 = new zzaln("MESSAGE", 9, 9, 1, zzamfVar7);
        zzamf zzamfVar8 = zzamf.h;
        zzaln zzalnVar11 = new zzaln("BYTES", 10, 10, 1, zzamfVar8);
        zzaln zzalnVar12 = new zzaln("UINT32", 11, 11, 1, zzamfVar4);
        zzamf zzamfVar9 = zzamf.i;
        zzaln zzalnVar13 = new zzaln("ENUM", 12, 12, 1, zzamfVar9);
        zzaln zzalnVar14 = new zzaln("SFIXED32", 13, 13, 1, zzamfVar4);
        zzaln zzalnVar15 = new zzaln("SFIXED64", 14, 14, 1, zzamfVar3);
        zzaln zzalnVar16 = new zzaln("SINT32", 15, 15, 1, zzamfVar4);
        zzaln zzalnVar17 = new zzaln("SINT64", 16, 16, 1, zzamfVar3);
        zzaln zzalnVar18 = new zzaln("GROUP", 17, 17, 1, zzamfVar7);
        zzaln zzalnVar19 = new zzaln("DOUBLE_LIST", 18, 18, 2, zzamfVar);
        zzaln zzalnVar20 = new zzaln("FLOAT_LIST", 19, 19, 2, zzamfVar2);
        zzaln zzalnVar21 = new zzaln("INT64_LIST", 20, 20, 2, zzamfVar3);
        zzaln zzalnVar22 = new zzaln("UINT64_LIST", 21, 21, 2, zzamfVar3);
        zzaln zzalnVar23 = new zzaln("INT32_LIST", 22, 22, 2, zzamfVar4);
        zzaln zzalnVar24 = new zzaln("FIXED64_LIST", 23, 23, 2, zzamfVar3);
        zzaln zzalnVar25 = new zzaln("FIXED32_LIST", 24, 24, 2, zzamfVar4);
        zzaln zzalnVar26 = new zzaln("BOOL_LIST", 25, 25, 2, zzamfVar5);
        zzaln zzalnVar27 = new zzaln("STRING_LIST", 26, 26, 2, zzamfVar6);
        zzaln zzalnVar28 = new zzaln("MESSAGE_LIST", 27, 27, 2, zzamfVar7);
        zzaln zzalnVar29 = new zzaln("BYTES_LIST", 28, 28, 2, zzamfVar8);
        zzaln zzalnVar30 = new zzaln("UINT32_LIST", 29, 29, 2, zzamfVar4);
        zzaln zzalnVar31 = new zzaln("ENUM_LIST", 30, 30, 2, zzamfVar9);
        zzaln zzalnVar32 = new zzaln("SFIXED32_LIST", 31, 31, 2, zzamfVar4);
        zzaln zzalnVar33 = new zzaln("SFIXED64_LIST", 32, 32, 2, zzamfVar3);
        zzaln zzalnVar34 = new zzaln("SINT32_LIST", 33, 33, 2, zzamfVar4);
        zzaln zzalnVar35 = new zzaln("SINT64_LIST", 34, 34, 2, zzamfVar3);
        zzaln zzalnVar36 = new zzaln("DOUBLE_LIST_PACKED", 35, 35, 3, zzamfVar);
        b = zzalnVar36;
        zzaln zzalnVar37 = new zzaln("FLOAT_LIST_PACKED", 36, 36, 3, zzamfVar2);
        zzaln zzalnVar38 = new zzaln("INT64_LIST_PACKED", 37, 37, 3, zzamfVar3);
        zzaln zzalnVar39 = new zzaln("UINT64_LIST_PACKED", 38, 38, 3, zzamfVar3);
        zzaln zzalnVar40 = new zzaln("INT32_LIST_PACKED", 39, 39, 3, zzamfVar4);
        zzaln zzalnVar41 = new zzaln("FIXED64_LIST_PACKED", 40, 40, 3, zzamfVar3);
        zzaln zzalnVar42 = new zzaln("FIXED32_LIST_PACKED", 41, 41, 3, zzamfVar4);
        zzaln zzalnVar43 = new zzaln("BOOL_LIST_PACKED", 42, 42, 3, zzamfVar5);
        zzaln zzalnVar44 = new zzaln("UINT32_LIST_PACKED", 43, 43, 3, zzamfVar4);
        zzaln zzalnVar45 = new zzaln("ENUM_LIST_PACKED", 44, 44, 3, zzamfVar9);
        zzaln zzalnVar46 = new zzaln("SFIXED32_LIST_PACKED", 45, 45, 3, zzamfVar4);
        zzaln zzalnVar47 = new zzaln("SFIXED64_LIST_PACKED", 46, 46, 3, zzamfVar3);
        zzaln zzalnVar48 = new zzaln("SINT32_LIST_PACKED", 47, 47, 3, zzamfVar4);
        zzaln zzalnVar49 = new zzaln("SINT64_LIST_PACKED", 48, 48, 3, zzamfVar3);
        c = zzalnVar49;
        e = new zzaln[]{zzalnVar, zzalnVar2, zzalnVar3, zzalnVar4, zzalnVar5, zzalnVar6, zzalnVar7, zzalnVar8, zzalnVar9, zzalnVar10, zzalnVar11, zzalnVar12, zzalnVar13, zzalnVar14, zzalnVar15, zzalnVar16, zzalnVar17, zzalnVar18, zzalnVar19, zzalnVar20, zzalnVar21, zzalnVar22, zzalnVar23, zzalnVar24, zzalnVar25, zzalnVar26, zzalnVar27, zzalnVar28, zzalnVar29, zzalnVar30, zzalnVar31, zzalnVar32, zzalnVar33, zzalnVar34, zzalnVar35, zzalnVar36, zzalnVar37, zzalnVar38, zzalnVar39, zzalnVar40, zzalnVar41, zzalnVar42, zzalnVar43, zzalnVar44, zzalnVar45, zzalnVar46, zzalnVar47, zzalnVar48, zzalnVar49, new zzaln("GROUP_LIST", 49, 49, 2, zzamfVar7), new zzaln("MAP", 50, 50, 4, zzamf.a)};
        zzaln[] zzalnVarArrValues = values();
        d = new zzaln[zzalnVarArrValues.length];
        for (zzaln zzalnVar50 : zzalnVarArrValues) {
            d[zzalnVar50.a] = zzalnVar50;
        }
    }

    public static zzaln[] values() {
        return (zzaln[]) e.clone();
    }

    public zzaln(String str, int i, int i2, int i3, zzamf zzamfVar) {
        super(str, i);
        this.a = i2;
        int iC = h50.C(i3);
        if (iC == 1 || iC == 3) {
            zzamfVar.getClass();
        }
        if (i3 == 1) {
            int i4 = gs3.a[zzamfVar.ordinal()];
        }
    }
}
