package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzfq;
import com.google.android.gms.internal.play_billing.zzfu;
import defpackage.az4;
import defpackage.dr0;
import defpackage.e32;
import defpackage.ed4;
import defpackage.f8;
import defpackage.hv4;
import defpackage.mv4;
import defpackage.pv1;
import defpackage.tc4;
import defpackage.vq2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzfu<MessageType extends zzfu<MessageType, BuilderType>, BuilderType extends zzfq<MessageType, BuilderType>> extends zzeg<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzic zzc = zzic.f;

    public static final boolean h(zzfu zzfuVar, boolean z) {
        byte bByteValue = ((Byte) zzfuVar.i(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = hv4.c.a(zzfuVar.getClass()).a(zzfuVar);
        if (z) {
            zzfuVar.i(2);
        }
        return zA;
    }

    public static zzfu m(zzfu zzfuVar, byte[] bArr) throws zzgc {
        int length = bArr.length;
        zzfh zzfhVar = zzfh.b;
        int i = ed4.a;
        zzfh zzfhVar2 = zzfh.b;
        if (length != 0) {
            zzfu zzfuVar2 = (zzfu) zzfuVar.i(4);
            try {
                mv4 mv4VarA = hv4.c.a(zzfuVar2.getClass());
                mv4VarA.b(zzfuVar2, bArr, 0, length, new f8(zzfhVar2));
                mv4VarA.zzf(zzfuVar2);
                zzfuVar = zzfuVar2;
            } catch (zzgc e) {
                throw e;
            } catch (zzia e2) {
                throw e2.d();
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzgc) {
                    throw ((zzgc) e3.getCause());
                }
                throw new zzgc(e3);
            } catch (IndexOutOfBoundsException unused) {
                y.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        if (zzfuVar == null || h(zzfuVar, true)) {
            return zzfuVar;
        }
        throw new zzia(zzfuVar).d();
    }

    public static Object n(Method method, zzfu zzfuVar, Object... objArr) {
        try {
            return method.invoke(zzfuVar, objArr);
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

    public abstract Object i(int i);

    public final zzfq j() {
        return (zzfq) i(5);
    }

    public final zzfq k() {
        zzfq zzfqVar = (zzfq) i(5);
        if (!zzfqVar.a.equals(this)) {
            if (!zzfqVar.b.g()) {
                zzfqVar.f();
            }
            zzfu zzfuVar = zzfqVar.b;
            hv4.c.a(zzfuVar.getClass()).zzg(zzfuVar, this);
        }
        return zzfqVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhc
    public final /* synthetic */ zzfu zzl() {
        return (zzfu) i(6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhc
    public final boolean zzo() {
        return h(this, true);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final /* synthetic */ zzfq zzw() {
        return (zzfq) i(5);
    }

    public static zzfu l(Class cls) {
        Map map = zzb;
        zzfu zzfuVar = (zzfu) map.get(cls);
        if (zzfuVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfuVar = (zzfu) map.get(cls);
            } catch (ClassNotFoundException e) {
                dr0.l("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzfuVar != null) {
            return zzfuVar;
        }
        zzfu zzfuVar2 = (zzfu) ((zzfu) az4.g(cls)).i(6);
        if (zzfuVar2 != null) {
            map.put(cls, zzfuVar2);
            return zzfuVar2;
        }
        y.b();
        return null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final void a(zzfc zzfcVar) {
        mv4 mv4VarA = hv4.c.a(getClass());
        tc4 tc4Var = zzfcVar.a;
        if (tc4Var == null) {
            tc4Var = new tc4(zzfcVar);
        }
        mv4VarA.f(this, tc4Var);
    }

    public final void d() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return hv4.c.a(getClass()).e(this, (zzfu) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean g() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final void o() {
        hv4.c.a(getClass()).zzf(this);
        d();
    }

    public static void e(Class cls, zzfu zzfuVar) {
        zzfuVar.d();
        zzb.put(cls, zzfuVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg
    public final int c(mv4 mv4Var) {
        if (g()) {
            int iC = mv4Var.c(this);
            if (iC >= 0) {
                return iC;
            }
            e32.i(pv1.k(iC, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int iC2 = mv4Var.c(this);
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
        if (!g()) {
            int i = this.zza;
            if (i == 0) {
                int iD = hv4.c.a(getClass()).d(this);
                this.zza = iD;
                return iD;
            }
            return i;
        }
        return hv4.c.a(getClass()).d(this);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = b.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        b.c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final int zzn() {
        if (g()) {
            int iC = hv4.c.a(getClass()).c(this);
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
        int iC2 = hv4.c.a(getClass()).c(this);
        if (iC2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
            return iC2;
        }
        e32.i(pv1.k(iC2, "serialized size must be non-negative, was "));
        return 0;
    }
}
