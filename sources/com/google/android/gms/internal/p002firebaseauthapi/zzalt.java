package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.firebase-auth-api.zzalt.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzalt;
import defpackage.cs3;
import defpackage.d;
import defpackage.dr0;
import defpackage.e32;
import defpackage.f8;
import defpackage.ft3;
import defpackage.gt3;
import defpackage.lh;
import defpackage.mr3;
import defpackage.pv1;
import defpackage.st3;
import defpackage.vq2;
import defpackage.w13;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzalt<MessageType extends zzalt<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzaju<MessageType, BuilderType> {
    private static final Map<Class<?>, zzalt<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzaoa zzb = zzaoa.f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class zza<MessageType extends zzalt<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzajt<MessageType, BuilderType> {
        public final zzalt a;
        public zzalt b;

        public static void e(zzalt zzaltVar, zzalt zzaltVar2) {
            ft3 ft3Var = ft3.c;
            ft3Var.getClass();
            ft3Var.a(zzaltVar.getClass()).i(zzaltVar, zzaltVar2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final /* synthetic */ Object clone() {
            zza zzaVar = (zza) this.a.k(5);
            zzaVar.b = g();
            return zzaVar;
        }

        public final void d(zzalt zzaltVar) {
            zzalt zzaltVar2 = this.a;
            if (zzaltVar != null && !zzaltVar2.getClass().isInstance(zzaltVar)) {
                d.r("mergeFrom(MessageLite) can only merge messages of the same type.");
            } else {
                if (zzaltVar2.equals(zzaltVar)) {
                    return;
                }
                if (!this.b.t()) {
                    j();
                }
                e(this.b, zzaltVar);
            }
        }

        public final zzalt g() {
            boolean zT = this.b.t();
            zzalt zzaltVar = this.b;
            if (!zT) {
                return zzaltVar;
            }
            zzaltVar.r();
            return this.b;
        }

        public final void i() {
            if (this.b.t()) {
                return;
            }
            j();
        }

        public final void j() {
            zzalt zzaltVarQ = this.a.q();
            e(zzaltVarQ, this.b);
            this.b = zzaltVarQ;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamx
        public final boolean zzj() {
            return zzalt.o(this.b, false);
        }

        public zza(zzalt zzaltVar) {
            this.a = zzaltVar;
            if (!zzaltVar.t()) {
                this.b = zzaltVar.q();
            } else {
                d.r("Default instance must be immutable.");
                throw null;
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zza clone() {
            return (zza) clone();
        }

        public final zzalt f() {
            zzalt zzaltVarG = g();
            zzaltVarG.getClass();
            if (zzalt.o(zzaltVarG, true)) {
                return zzaltVarG;
            }
            throw new zzany(zzaltVarG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzalt<MessageType, BuilderType> implements zzamx {
        protected cs3 zzc = cs3.d;

        public final cs3 u() {
            cs3 cs3Var = this.zzc;
            if (cs3Var.b) {
                this.zzc = (cs3) cs3Var.clone();
            }
            return this.zzc;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class zzc<T extends zzalt<T, ?>> extends zzajw<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class zzd<ContainingType extends zzamv, Type> extends zzalg<ContainingType, Type> {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final enum zzf {
        public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    public static zzalt i(zzalt zzaltVar, byte[] bArr, zzalf zzalfVar) throws zzamd {
        int length = bArr.length;
        if (length != 0) {
            zzalt zzaltVarQ = zzaltVar.q();
            try {
                ft3 ft3Var = ft3.c;
                ft3Var.getClass();
                gt3 gt3VarA = ft3Var.a(zzaltVarQ.getClass());
                gt3VarA.f(zzaltVarQ, bArr, 0, length, new f8(zzalfVar));
                gt3VarA.b(zzaltVarQ);
                zzaltVar = zzaltVarQ;
            } catch (zzamd e) {
                if (e.t()) {
                    throw new zzamd(e);
                }
                throw e;
            } catch (zzany e2) {
                zzamd zzamdVarD = e2.d();
                zzamdVarD.getClass();
                throw zzamdVarD;
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzamd) {
                    throw ((zzamd) e3.getCause());
                }
                throw new zzamd(e3);
            } catch (IndexOutOfBoundsException unused) {
                zzamd zzamdVarQ = zzamd.q();
                zzamdVarQ.getClass();
                throw zzamdVarQ;
            }
        }
        n(zzaltVar);
        return zzaltVar;
    }

    public static Object l(Method method, zzalt zzaltVar, Object... objArr) {
        try {
            return method.invoke(zzaltVar, objArr);
        } catch (IllegalAccessException e) {
            vq2.n("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            vq2.n("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean o(zzalt zzaltVar, boolean z) {
        byte bByteValue = ((Byte) zzaltVar.k(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        ft3 ft3Var = ft3.c;
        ft3Var.getClass();
        boolean zA = ft3Var.a(zzaltVar.getClass()).a(zzaltVar);
        if (z) {
            zzaltVar.k(2);
        }
        return zA;
    }

    public abstract Object k(int i);

    public final zza p() {
        return (zza) k(5);
    }

    public final zzalt q() {
        return (zzalt) k(4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamx
    public final /* synthetic */ zzalt zzg() {
        return (zzalt) k(6);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamx
    public final boolean zzj() {
        return o(this, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zzl() {
        return c(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* synthetic */ zza zzq() {
        return (zza) k(5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* synthetic */ zza zzr() {
        zza zzaVar = (zza) k(5);
        zzaVar.d(this);
        return zzaVar;
    }

    public static zzalt j(Class cls) {
        Map<Class<?>, zzalt<?, ?>> map = zzc;
        zzalt<?, ?> zzaltVar = map.get(cls);
        if (zzaltVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaltVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                dr0.l("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzaltVar != null) {
            return zzaltVar;
        }
        zzalt<?, ?> zzaltVar2 = (zzalt) ((zzalt) st3.a(cls)).k(6);
        if (zzaltVar2 != null) {
            map.put(cls, zzaltVar2);
            return zzaltVar2;
        }
        y.b();
        return null;
    }

    public static void n(zzalt zzaltVar) throws zzamd {
        if (zzaltVar == null || o(zzaltVar, true)) {
            return;
        }
        zzamd zzamdVarD = new zzany(zzaltVar).d();
        zzamdVarD.getClass();
        throw zzamdVarD;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void b(zzaky zzakyVar) {
        ft3 ft3Var = ft3.c;
        ft3Var.getClass();
        gt3 gt3VarA = ft3Var.a(getClass());
        w13 w13Var = zzakyVar.a;
        if (w13Var == null) {
            w13Var = new w13(zzakyVar);
        }
        gt3VarA.g(this, w13Var);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final void d(int i) {
        if (i < 0) {
            e32.i(pv1.k(i, "serialized size must be non-negative, was "));
        } else {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final int e() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ft3 ft3Var = ft3.c;
        ft3Var.getClass();
        return ft3Var.a(getClass()).h(this, (zzalt) obj);
    }

    public final void r() {
        ft3 ft3Var = ft3.c;
        ft3Var.getClass();
        ft3Var.a(getClass()).b(this);
        s();
    }

    public final void s() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean t() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public static zzalt g(zzalt zzaltVar, zzakb zzakbVar, zzalf zzalfVar) throws zzamd {
        mr3 mr3VarZ = zzakbVar.z();
        zzalt zzaltVarH = h(zzaltVar, mr3VarZ, zzalfVar);
        mr3VarZ.g(0);
        n(zzaltVarH);
        return zzaltVarH;
    }

    public static zzalt h(zzalt zzaltVar, zzakn zzaknVar, zzalf zzalfVar) throws zzamd {
        zzalt zzaltVarQ = zzaltVar.q();
        try {
            ft3 ft3Var = ft3.c;
            ft3Var.getClass();
            gt3 gt3VarA = ft3Var.a(zzaltVarQ.getClass());
            lh lhVar = zzaknVar.e;
            if (lhVar == null) {
                lhVar = new lh(zzaknVar);
            }
            gt3VarA.e(zzaltVarQ, lhVar, zzalfVar);
            gt3VarA.b(zzaltVarQ);
            return zzaltVarQ;
        } catch (zzamd e) {
            if (e.t()) {
                throw new zzamd(e);
            }
            throw e;
        } catch (zzany e2) {
            zzamd zzamdVarD = e2.d();
            zzamdVarD.getClass();
            throw zzamdVarD;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzamd) {
                throw ((zzamd) e3.getCause());
            }
            throw new zzamd(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzamd) {
                throw ((zzamd) e4.getCause());
            }
            throw e4;
        }
    }

    public static void m(Class cls, zzalt zzaltVar) {
        zzaltVar.s();
        zzc.put(cls, zzaltVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final int c(gt3 gt3Var) {
        int iD;
        int iD2;
        if (t()) {
            if (gt3Var == null) {
                ft3 ft3Var = ft3.c;
                ft3Var.getClass();
                iD2 = ft3Var.a(getClass()).d(this);
            } else {
                iD2 = gt3Var.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            e32.i(pv1.k(iD2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (e() != Integer.MAX_VALUE) {
            return e();
        }
        if (gt3Var == null) {
            ft3 ft3Var2 = ft3.c;
            ft3Var2.getClass();
            iD = ft3Var2.a(getClass()).d(this);
        } else {
            iD = gt3Var.d(this);
        }
        d(iD);
        return iD;
    }

    public final int hashCode() {
        if (t()) {
            ft3 ft3Var = ft3.c;
            ft3Var.getClass();
            return ft3Var.a(getClass()).c(this);
        }
        if (this.zza == 0) {
            ft3 ft3Var2 = ft3.c;
            ft3Var2.getClass();
            this.zza = ft3Var2.a(getClass()).c(this);
        }
        return this.zza;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = d.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        d.b(this, sb, 0);
        return sb.toString();
    }
}
