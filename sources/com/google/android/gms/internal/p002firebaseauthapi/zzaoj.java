package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.bu3;
import defpackage.wt3;
import defpackage.yt3;
import defpackage.zt3;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
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
public class zzaoj {
    public static final zzaoj b;
    public static final zzaoj c;
    public static final zzaoj d;
    public static final zzaoj e;
    public static final zzaoj f;
    public static final zzaoj g;
    public static final zzaoj h;
    public static final zzaoj i;
    public static final yt3 j;
    public static final wt3 k;
    public static final bu3 l;
    public static final zt3 m;
    public static final zzaoj n;
    public static final zzaoj o;
    public static final zzaoj p;
    public static final zzaoj q;
    public static final zzaoj r;
    public static final zzaoj s;
    public static final /* synthetic */ zzaoj[] t;
    public final zzaoq a;

    static {
        zzaoj zzaojVar = new zzaoj("DOUBLE", 0, zzaoq.d, 1);
        b = zzaojVar;
        zzaoj zzaojVar2 = new zzaoj("FLOAT", 1, zzaoq.c, 5);
        c = zzaojVar2;
        zzaoq zzaoqVar = zzaoq.b;
        zzaoj zzaojVar3 = new zzaoj("INT64", 2, zzaoqVar, 0);
        d = zzaojVar3;
        zzaoj zzaojVar4 = new zzaoj("UINT64", 3, zzaoqVar, 0);
        e = zzaojVar4;
        zzaoq zzaoqVar2 = zzaoq.a;
        zzaoj zzaojVar5 = new zzaoj("INT32", 4, zzaoqVar2, 0);
        f = zzaojVar5;
        zzaoj zzaojVar6 = new zzaoj("FIXED64", 5, zzaoqVar, 1);
        g = zzaojVar6;
        zzaoj zzaojVar7 = new zzaoj("FIXED32", 6, zzaoqVar2, 5);
        h = zzaojVar7;
        zzaoj zzaojVar8 = new zzaoj("BOOL", 7, zzaoq.e, 0);
        i = zzaojVar8;
        yt3 yt3Var = new yt3("STRING", 8, zzaoq.f, 2);
        j = yt3Var;
        zzaoq zzaoqVar3 = zzaoq.i;
        wt3 wt3Var = new wt3("GROUP", 9, zzaoqVar3, 3);
        k = wt3Var;
        bu3 bu3Var = new bu3("MESSAGE", 10, zzaoqVar3, 2);
        l = bu3Var;
        zt3 zt3Var = new zt3("BYTES", 11, zzaoq.g, 2);
        m = zt3Var;
        zzaoj zzaojVar9 = new zzaoj("UINT32", 12, zzaoqVar2, 0);
        n = zzaojVar9;
        zzaoj zzaojVar10 = new zzaoj("ENUM", 13, zzaoq.h, 0);
        o = zzaojVar10;
        zzaoj zzaojVar11 = new zzaoj("SFIXED32", 14, zzaoqVar2, 5);
        p = zzaojVar11;
        zzaoj zzaojVar12 = new zzaoj("SFIXED64", 15, zzaoqVar, 1);
        q = zzaojVar12;
        zzaoj zzaojVar13 = new zzaoj("SINT32", 16, zzaoqVar2, 0);
        r = zzaojVar13;
        zzaoj zzaojVar14 = new zzaoj("SINT64", 17, zzaoqVar, 0);
        s = zzaojVar14;
        t = new zzaoj[]{zzaojVar, zzaojVar2, zzaojVar3, zzaojVar4, zzaojVar5, zzaojVar6, zzaojVar7, zzaojVar8, yt3Var, wt3Var, bu3Var, zt3Var, zzaojVar9, zzaojVar10, zzaojVar11, zzaojVar12, zzaojVar13, zzaojVar14};
    }

    public static zzaoj[] values() {
        return (zzaoj[]) t.clone();
    }

    public zzaoj(String str, int i2, zzaoq zzaoqVar, int i3) {
        super(str, i2);
        this.a = zzaoqVar;
    }
}
