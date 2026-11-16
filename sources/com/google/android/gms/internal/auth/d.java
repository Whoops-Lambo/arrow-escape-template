package com.google.android.gms.internal.auth;

import defpackage.hs4;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final Class a;
    public static final hs4 b;
    public static final hs4 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        hs4 hs4Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                hs4Var = (hs4) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = hs4Var;
        c = new hs4();
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void a(hs4 hs4Var, Object obj, Object obj2) {
        hs4Var.getClass();
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        zzha zzhaVar2 = ((zzev) obj2).zzc;
        zzha zzhaVar3 = zzha.e;
        if (!zzhaVar3.equals(zzhaVar2)) {
            if (zzhaVar3.equals(zzhaVar)) {
                int i = zzhaVar.a + zzhaVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(zzhaVar.b, i);
                System.arraycopy(zzhaVar2.b, 0, iArrCopyOf, zzhaVar.a, zzhaVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(zzhaVar.c, i);
                System.arraycopy(zzhaVar2.c, 0, objArrCopyOf, zzhaVar.a, zzhaVar2.a);
                zzhaVar = new zzha(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                zzhaVar.getClass();
                if (!zzhaVar2.equals(zzhaVar3)) {
                    if (zzhaVar.d) {
                        int i2 = zzhaVar.a + zzhaVar2.a;
                        zzhaVar.c(i2);
                        System.arraycopy(zzhaVar2.b, 0, zzhaVar.b, zzhaVar.a, zzhaVar2.a);
                        System.arraycopy(zzhaVar2.c, 0, zzhaVar.c, zzhaVar.a, zzhaVar2.a);
                        zzhaVar.a = i2;
                    } else {
                        defpackage.d.c();
                        return;
                    }
                }
            }
        }
        zzevVar.zzc = zzhaVar;
    }
}
