package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzigw;
import com.google.android.gms.internal.ads.zzihc;
import defpackage.do4;
import defpackage.dr0;
import defpackage.e32;
import defpackage.f8;
import defpackage.fz4;
import defpackage.jz4;
import defpackage.lh;
import defpackage.pv1;
import defpackage.rz4;
import defpackage.vq2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzihc<MessageT extends zzihc<MessageT, BuilderT>, BuilderT extends zzigw<MessageT, BuilderT>> extends zzifg<MessageT, BuilderT> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final ConcurrentMap<Class<?>, Object> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzijl zzt = zzijl.f;

    public static Object q(Method method, zzihc zzihcVar, Object... objArr) {
        try {
            return method.invoke(zzihcVar, objArr);
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

    public static zzihc t(zzihc zzihcVar, byte[] bArr, zzigm zzigmVar) {
        zzihc zzihcVarC = C(zzihcVar, bArr, bArr.length, zzigmVar);
        D(zzihcVarC);
        return zzihcVarC;
    }

    public abstract Object A(zzihb zzihbVar, zzihc zzihcVar);

    @Override // com.google.android.gms.internal.ads.zziij
    public final boolean c() {
        return B(this, true);
    }

    @Override // com.google.android.gms.internal.ads.zziii
    public final int g() {
        return k(null);
    }

    public static final boolean B(zzihc zzihcVar, boolean z) {
        Object objA = zzihcVar.A(zzihb.a, null);
        if (objA != null) {
            if (objA instanceof Byte) {
                byte bByteValue = ((Byte) objA).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue == 0) {
                        return false;
                    }
                }
            }
            boolean zZzl = fz4.b.a(zzihcVar.getClass()).zzl(zzihcVar);
            if (z) {
                zzihcVar.A(zzihb.b, true == zZzl ? zzihcVar : null);
            }
            return zZzl;
        }
        return true;
    }

    public static zzihc C(zzihc zzihcVar, byte[] bArr, int i, zzigm zzigmVar) {
        if (i == 0) {
            return zzihcVar;
        }
        zzihc zzihcVarU = zzihcVar.u();
        try {
            jz4 jz4VarA = fz4.b.a(zzihcVarU.getClass());
            jz4VarA.c(zzihcVarU, bArr, 0, i, new f8(zzigmVar));
            jz4VarA.a(zzihcVarU);
            return zzihcVarU;
        } catch (zzihu e) {
            if (e.f()) {
                throw new zzihu(e);
            }
            throw e;
        } catch (zzijj e2) {
            throw e2.d();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzihu) {
                throw ((zzihu) e3.getCause());
            }
            throw new zzihu(e3);
        } catch (IndexOutOfBoundsException unused) {
            io.p071bidmachine.media3.extractor.ts.y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    public static void D(zzihc zzihcVar) {
        if (zzihcVar != null && !B(zzihcVar, true)) {
            throw new zzijj(zzihcVar).d();
        }
    }

    public static zziiq x(Class cls) {
        ConcurrentMap<Class<?>, Object> concurrentMap = zzd;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            y(cls);
            obj = concurrentMap.get(cls);
        }
        if (obj == null) {
            e32.i("Default instance cannot be null.");
            return null;
        }
        if (obj instanceof zziiq) {
            return (zziiq) obj;
        }
        zzigx zzigxVar = new zzigx((zzihc) obj);
        return concurrentMap.replace((Class<?>) cls, obj, zzigxVar) ? zzigxVar : (zziiq) concurrentMap.get(cls);
    }

    public static zzihc y(Class cls) {
        ConcurrentMap<Class<?>, Object> concurrentMap = zzd;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                obj = concurrentMap.get(cls);
            } catch (ClassNotFoundException e) {
                dr0.l("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (obj == null) {
            obj = ((zzigw) ((zzihc) rz4.a(cls)).A(zzihb.e, null)).a;
            if (obj == null) {
                io.p071bidmachine.media3.extractor.ts.y.b();
                return null;
            }
            concurrentMap.put(cls, obj);
        }
        return obj instanceof zzihc ? (zzihc) obj : ((zzigx) obj).a;
    }

    @Override // com.google.android.gms.internal.ads.zziii
    public final zziih a() {
        return (zzigw) A(zzihb.e, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return fz4.b.a(getClass()).e(this, (zzihc) obj);
    }

    @Override // com.google.android.gms.internal.ads.zziii
    public final void f(zzigh zzighVar) {
        jz4 jz4VarA = fz4.b.a(getClass());
        do4 do4Var = zzighVar.a;
        if (do4Var == null) {
            do4Var = new do4(zzighVar);
        }
        jz4VarA.f(this, do4Var);
    }

    @Override // com.google.android.gms.internal.ads.zzifg
    public final int j() {
        return this.zzc & Integer.MAX_VALUE;
    }

    public final void n(int i) {
        if (i >= 0) {
            this.zzc = i | (this.zzc & Integer.MIN_VALUE);
        } else {
            e32.i(pv1.l(i, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i).length() + 42)));
        }
    }

    public final boolean o() {
        return this.zzc < 0;
    }

    public final void p() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final zzihc u() {
        return (zzihc) A(zzihb.d, null);
    }

    public final zzigw v() {
        return (zzigw) A(zzihb.e, null);
    }

    public final zzigw w() {
        zzigw zzigwVar = (zzigw) A(zzihb.e, null);
        zzigwVar.n(this);
        return zzigwVar;
    }

    public static zzihc r(zzihc zzihcVar, zzigb zzigbVar, zzigm zzigmVar) throws zzihu {
        zzihc zzihcVarU = zzihcVar.u();
        try {
            jz4 jz4VarA = fz4.b.a(zzihcVarU.getClass());
            lh lhVar = zzigbVar.c;
            if (lhVar == null) {
                lhVar = new lh(zzigbVar);
            }
            jz4VarA.d(zzihcVarU, lhVar, zzigmVar);
            jz4VarA.a(zzihcVarU);
            return zzihcVarU;
        } catch (zzihu e) {
            if (e.f()) {
                throw new zzihu(e);
            }
            throw e;
        } catch (zzijj e2) {
            throw e2.d();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzihu) {
                throw ((zzihu) e3.getCause());
            }
            throw new zzihu(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzihu) {
                throw ((zzihu) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzihc s(zzihc zzihcVar, zzifx zzifxVar, zzigm zzigmVar) {
        zzigb zzigbVarD = zzifxVar.D();
        zzihc zzihcVarR = r(zzihcVar, zzigbVarD, zzigmVar);
        zzigbVarD.j(0);
        D(zzihcVarR);
        return zzihcVarR;
    }

    public static void z(Class cls, zzihc zzihcVar) {
        zzihcVar.p();
        zzd.put(cls, zzihcVar);
    }

    @Override // com.google.android.gms.internal.ads.zziii
    public final zziiq b() {
        return x(getClass());
    }

    public final int hashCode() {
        if (o()) {
            return fz4.b.a(getClass()).h(this);
        }
        if (this.zzq == 0) {
            this.zzq = fz4.b.a(getClass()).h(this);
        }
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zziij
    public final zzihc i() {
        return y(getClass());
    }

    @Override // com.google.android.gms.internal.ads.zzifg
    public final int k(jz4 jz4Var) {
        int iG;
        int iG2;
        if (o()) {
            if (jz4Var == null) {
                iG2 = fz4.b.a(getClass()).g(this);
            } else {
                iG2 = jz4Var.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            e32.i(pv1.l(iG2, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(iG2).length() + 42)));
            return 0;
        }
        if (j() != Integer.MAX_VALUE) {
            return j();
        }
        if (jz4Var == null) {
            iG = fz4.b.a(getClass()).g(this);
        } else {
            iG = jz4Var.g(this);
        }
        n(iG);
        return iG;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = y.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        y.b(this, sb, 0);
        return sb.toString();
    }
}
