package com.explorestack.protobuf;

import defpackage.h50;
import java.lang.reflect.Type;

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
/* JADX INFO: loaded from: classes10.dex */
public final class z3 {
    public static final z3 c;
    public static final z3 d;
    public static final z3 e;
    public static final z3[] f;
    public static final Type[] g;
    public static final /* synthetic */ z3[] h;
    public final int a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    z3 EF0;

    static {
        m5 m5Var = m5.DOUBLE;
        z3 z3Var = new z3("DOUBLE", 0, 0, 1, m5Var);
        m5 m5Var2 = m5.FLOAT;
        z3 z3Var2 = new z3("FLOAT", 1, 1, 1, m5Var2);
        m5 m5Var3 = m5.LONG;
        z3 z3Var3 = new z3("INT64", 2, 2, 1, m5Var3);
        z3 z3Var4 = new z3("UINT64", 3, 3, 1, m5Var3);
        m5 m5Var4 = m5.INT;
        z3 z3Var5 = new z3("INT32", 4, 4, 1, m5Var4);
        z3 z3Var6 = new z3("FIXED64", 5, 5, 1, m5Var3);
        z3 z3Var7 = new z3("FIXED32", 6, 6, 1, m5Var4);
        m5 m5Var5 = m5.BOOLEAN;
        z3 z3Var8 = new z3("BOOL", 7, 7, 1, m5Var5);
        m5 m5Var6 = m5.STRING;
        z3 z3Var9 = new z3("STRING", 8, 8, 1, m5Var6);
        m5 m5Var7 = m5.MESSAGE;
        z3 z3Var10 = new z3("MESSAGE", 9, 9, 1, m5Var7);
        m5 m5Var8 = m5.BYTE_STRING;
        z3 z3Var11 = new z3("BYTES", 10, 10, 1, m5Var8);
        z3 z3Var12 = new z3("UINT32", 11, 11, 1, m5Var4);
        m5 m5Var9 = m5.ENUM;
        z3 z3Var13 = new z3("ENUM", 12, 12, 1, m5Var9);
        z3 z3Var14 = new z3("SFIXED32", 13, 13, 1, m5Var4);
        z3 z3Var15 = new z3("SFIXED64", 14, 14, 1, m5Var3);
        z3 z3Var16 = new z3("SINT32", 15, 15, 1, m5Var4);
        z3 z3Var17 = new z3("SINT64", 16, 16, 1, m5Var3);
        z3 z3Var18 = new z3("GROUP", 17, 17, 1, m5Var7);
        z3 z3Var19 = new z3("DOUBLE_LIST", 18, 18, 2, m5Var);
        z3 z3Var20 = new z3("FLOAT_LIST", 19, 19, 2, m5Var2);
        z3 z3Var21 = new z3("INT64_LIST", 20, 20, 2, m5Var3);
        z3 z3Var22 = new z3("UINT64_LIST", 21, 21, 2, m5Var3);
        z3 z3Var23 = new z3("INT32_LIST", 22, 22, 2, m5Var4);
        z3 z3Var24 = new z3("FIXED64_LIST", 23, 23, 2, m5Var3);
        z3 z3Var25 = new z3("FIXED32_LIST", 24, 24, 2, m5Var4);
        z3 z3Var26 = new z3("BOOL_LIST", 25, 25, 2, m5Var5);
        z3 z3Var27 = new z3("STRING_LIST", 26, 26, 2, m5Var6);
        z3 z3Var28 = new z3("MESSAGE_LIST", 27, 27, 2, m5Var7);
        z3 z3Var29 = new z3("BYTES_LIST", 28, 28, 2, m5Var8);
        z3 z3Var30 = new z3("UINT32_LIST", 29, 29, 2, m5Var4);
        z3 z3Var31 = new z3("ENUM_LIST", 30, 30, 2, m5Var9);
        z3 z3Var32 = new z3("SFIXED32_LIST", 31, 31, 2, m5Var4);
        z3 z3Var33 = new z3("SFIXED64_LIST", 32, 32, 2, m5Var3);
        z3 z3Var34 = new z3("SINT32_LIST", 33, 33, 2, m5Var4);
        z3 z3Var35 = new z3("SINT64_LIST", 34, 34, 2, m5Var3);
        z3 z3Var36 = new z3("DOUBLE_LIST_PACKED", 35, 35, 3, m5Var);
        c = z3Var36;
        z3 z3Var37 = new z3("FLOAT_LIST_PACKED", 36, 36, 3, m5Var2);
        z3 z3Var38 = new z3("INT64_LIST_PACKED", 37, 37, 3, m5Var3);
        z3 z3Var39 = new z3("UINT64_LIST_PACKED", 38, 38, 3, m5Var3);
        z3 z3Var40 = new z3("INT32_LIST_PACKED", 39, 39, 3, m5Var4);
        z3 z3Var41 = new z3("FIXED64_LIST_PACKED", 40, 40, 3, m5Var3);
        z3 z3Var42 = new z3("FIXED32_LIST_PACKED", 41, 41, 3, m5Var4);
        z3 z3Var43 = new z3("BOOL_LIST_PACKED", 42, 42, 3, m5Var5);
        z3 z3Var44 = new z3("UINT32_LIST_PACKED", 43, 43, 3, m5Var4);
        z3 z3Var45 = new z3("ENUM_LIST_PACKED", 44, 44, 3, m5Var9);
        z3 z3Var46 = new z3("SFIXED32_LIST_PACKED", 45, 45, 3, m5Var4);
        z3 z3Var47 = new z3("SFIXED64_LIST_PACKED", 46, 46, 3, m5Var3);
        z3 z3Var48 = new z3("SINT32_LIST_PACKED", 47, 47, 3, m5Var4);
        z3 z3Var49 = new z3("SINT64_LIST_PACKED", 48, 48, 3, m5Var3);
        d = z3Var49;
        z3 z3Var50 = new z3("GROUP_LIST", 49, 49, 2, m5Var7);
        z3 z3Var51 = new z3("MAP", 50, 50, 4, m5.VOID);
        e = z3Var51;
        h = new z3[]{z3Var, z3Var2, z3Var3, z3Var4, z3Var5, z3Var6, z3Var7, z3Var8, z3Var9, z3Var10, z3Var11, z3Var12, z3Var13, z3Var14, z3Var15, z3Var16, z3Var17, z3Var18, z3Var19, z3Var20, z3Var21, z3Var22, z3Var23, z3Var24, z3Var25, z3Var26, z3Var27, z3Var28, z3Var29, z3Var30, z3Var31, z3Var32, z3Var33, z3Var34, z3Var35, z3Var36, z3Var37, z3Var38, z3Var39, z3Var40, z3Var41, z3Var42, z3Var43, z3Var44, z3Var45, z3Var46, z3Var47, z3Var48, z3Var49, z3Var50, z3Var51};
        g = new Type[0];
        z3[] z3VarArrValues = values();
        f = new z3[z3VarArrValues.length];
        for (z3 z3Var52 : z3VarArrValues) {
            f[z3Var52.a] = z3Var52;
        }
    }

    public static z3 valueOf(String str) {
        return (z3) Enum.valueOf(z3.class, str);
    }

    public static z3[] values() {
        return (z3[]) h.clone();
    }

    public z3(String str, int i, int i2, int i3, m5 m5Var) {
        super(str, i);
        this.a = i2;
        this.b = i3;
        int iC = h50.C(i3);
        if (iC == 1 || iC == 3) {
            m5Var.getClass();
        }
        if (i3 == 1) {
            m5Var.ordinal();
        }
    }
}
