package com.google.android.gms.nearby.uwb;

import com.google.android.gms.internal.nearby.zzsg;
import com.google.android.gms.internal.nearby.zzsi;
import com.google.android.gms.internal.nearby.zzth;
import defpackage.d;
import defpackage.s85;
import defpackage.t85;
import defpackage.y85;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class UwbAddress {
    public static final y85 b;
    public final byte[] a;

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[LOOP:0: B:3:0x0004->B:13:0x0021, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0024 A[SYNTHETIC] */
    static {
        t85 t85Var = zzth.a;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i > 0) {
                Character ch = t85Var.c;
                if (ch != null) {
                    if (!(":".indexOf(ch.charValue()) < 0)) {
                        d.r(zzsi.a("Separator (%s) cannot contain padding character", ":"));
                        return;
                    }
                }
                b = new y85(t85Var);
                return;
            }
            s85 s85Var = t85Var.b;
            char cCharAt = ":".charAt(i);
            if (cCharAt < 128) {
                if (s85Var.g[cCharAt] == -1) {
                }
                if (!z) {
                    d.r(zzsi.a("Separator (%s) cannot contain alphabet characters", ":"));
                    return;
                }
                i++;
            } else {
                s85Var.getClass();
            }
            z = false;
            if (!z) {
                d.r(zzsi.a("Separator (%s) cannot contain alphabet characters", ":"));
                return;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbAddress) {
            return Arrays.equals(this.a, ((UwbAddress) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String toString() {
        byte[] bArr = this.a;
        int length = bArr.length;
        y85 y85Var = b;
        y85Var.getClass();
        zzsg.b(0, length, bArr.length);
        StringBuilder sb = new StringBuilder(y85Var.b(length));
        try {
            y85Var.a(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            d.p(e);
            return null;
        }
    }

    public UwbAddress(byte[] bArr) {
        this.a = bArr;
    }
}
