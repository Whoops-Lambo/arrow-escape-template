package com.google.android.gms.internal.measurement;

import defpackage.jc1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzyz {
    public static final zzyz e;
    public static final zzyz[] f;
    public static final /* synthetic */ zzyz[] g;
    public final char a;
    public final zzzb b;
    public final int c;
    public final String d;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF0;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF3;

    static {
        zzyz zzyzVar = new zzyz("STRING", 0, 's', zzzb.GENERAL, "-#", true);
        zzyz zzyzVar2 = new zzyz("BOOLEAN", 1, 'b', zzzb.BOOLEAN, "-", true);
        zzyz zzyzVar3 = new zzyz("CHAR", 2, 'c', zzzb.CHARACTER, "-", true);
        zzzb zzzbVar = zzzb.INTEGRAL;
        zzyz zzyzVar4 = new zzyz("DECIMAL", 3, 'd', zzzbVar, "-0+ ,(", false);
        zzyz zzyzVar5 = new zzyz("OCTAL", 4, 'o', zzzbVar, "-#0(", false);
        zzyz zzyzVar6 = new zzyz("HEX", 5, 'x', zzzbVar, "-#0(", true);
        e = zzyzVar6;
        zzzb zzzbVar2 = zzzb.FLOAT;
        g = new zzyz[]{zzyzVar, zzyzVar2, zzyzVar3, zzyzVar4, zzyzVar5, zzyzVar6, new zzyz("FLOAT", 6, 'f', zzzbVar2, "-#0+ ,(", false), new zzyz("EXPONENT", 7, 'e', zzzbVar2, "-#0+ (", true), new zzyz("GENERAL", 8, 'g', zzzbVar2, "-0+ ,(", true), new zzyz("EXPONENT_HEX", 9, 'a', zzzbVar2, "-#0+ ", true)};
        f = new zzyz[26];
        for (zzyz zzyzVar7 : values()) {
            f[(zzyzVar7.a | ' ') - 97] = zzyzVar7;
        }
    }

    public static zzyz[] values() {
        return (zzyz[]) g.clone();
    }

    public zzyz(String str, int i, char c, zzzb zzzbVar, String str2, boolean z) {
        int i2;
        super(str, i);
        this.a = c;
        this.b = zzzbVar;
        zzza zzzaVar = zzza.e;
        if (true != z) {
            i2 = 0;
        } else {
            i2 = 128;
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            int iCharAt = ((int) ((zzza.d >>> ((str2.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (iCharAt >= 0) {
                i2 |= 1 << iCharAt;
            } else {
                defpackage.d.r("invalid flags: ".concat(str2));
                throw null;
            }
        }
        this.c = i2;
        this.d = jc1.q(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }
}
