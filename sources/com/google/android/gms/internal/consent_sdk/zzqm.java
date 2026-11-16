package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzqj;
import com.google.android.gms.internal.consent_sdk.zzqm;
import defpackage.do4;
import defpackage.dr0;
import defpackage.e32;
import defpackage.i85;
import defpackage.m75;
import defpackage.pv1;
import defpackage.u75;
import defpackage.vq2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzqm<MessageType extends zzqm<MessageType, BuilderType>, BuilderType extends zzqj<MessageType, BuilderType>> extends zzpa<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzsq zzc = zzsq.e;

    public static final boolean g(zzqm zzqmVar, boolean z) {
        byte bByteValue = ((Byte) zzqmVar.f(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = m75.c.a(zzqmVar.getClass()).g(zzqmVar);
        if (z) {
            zzqmVar.f(2);
        }
        return zG;
    }

    public static Object j(Method method, zzqm zzqmVar, Object... objArr) {
        try {
            return method.invoke(zzqmVar, objArr);
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

    public abstract Object f(int i);

    public final zzqj h() {
        return (zzqj) f(5);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final /* synthetic */ zzqm zzl() {
        return (zzqm) f(6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final boolean zzo() {
        return g(this, true);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final /* synthetic */ zzqj zzu() {
        return (zzqj) f(5);
    }

    public static zzqm i(Class cls) {
        Map map = zzb;
        zzqm zzqmVar = (zzqm) map.get(cls);
        if (zzqmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzqmVar = (zzqm) map.get(cls);
            } catch (ClassNotFoundException e) {
                dr0.l("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzqmVar != null) {
            return zzqmVar;
        }
        zzqm zzqmVar2 = (zzqm) ((zzqm) i85.g(cls)).f(6);
        if (zzqmVar2 != null) {
            map.put(cls, zzqmVar2);
            return zzqmVar2;
        }
        y.b();
        return null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final void a(zzpv zzpvVar) {
        u75 u75VarA = m75.c.a(getClass());
        do4 do4Var = zzpvVar.a;
        if (do4Var == null) {
            do4Var = new do4(zzpvVar);
        }
        u75VarA.d(this, do4Var);
    }

    public final void d() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m75.c.a(getClass()).e(this, (zzqm) obj);
    }

    public final void k() {
        m75.c.a(getClass()).b(this);
        l();
    }

    public final void l() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public static void m(Class cls, zzqm zzqmVar) {
        zzqmVar.l();
        zzb.put(cls, zzqmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpa
    public final int c(u75 u75Var) {
        if (e()) {
            int iC = u75Var.c(this);
            if (iC >= 0) {
                return iC;
            }
            e32.i(pv1.k(iC, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int iC2 = u75Var.c(this);
            if (iC2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
                return iC2;
            }
            e32.i(pv1.k(iC2, "serialized size must be non-negative, was "));
            return 0;
        }
        return i;
    }

    public final int hashCode() {
        if (!e()) {
            int i = this.zza;
            if (i == 0) {
                int iA = m75.c.a(getClass()).a(this);
                this.zza = iA;
                return iA;
            }
            return i;
        }
        return m75.c.a(getClass()).a(this);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = e.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        e.c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final int zzn() {
        if (e()) {
            int iC = m75.c.a(getClass()).c(this);
            if (iC >= 0) {
                return iC;
            }
            e32.i(pv1.k(iC, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iC2 = m75.c.a(getClass()).c(this);
        if (iC2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
            return iC2;
        }
        e32.i(pv1.k(iC2, "serialized size must be non-negative, was "));
        return 0;
    }
}
