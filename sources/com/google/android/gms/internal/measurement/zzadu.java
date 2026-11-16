package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzadu;
import defpackage.dr0;
import defpackage.dz4;
import defpackage.f8;
import defpackage.mp3;
import defpackage.rl3;
import defpackage.so3;
import defpackage.vq2;
import defpackage.w13;
import defpackage.zo3;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzadu<MessageType extends zzadu<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> extends zzacb<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzaga zzc = zzaga.f;

    public static zzadu l(zzadu zzaduVar, byte[] bArr, zzadf zzadfVar) throws zzaeh {
        int length = bArr.length;
        if (length != 0) {
            zzadu zzaduVarO = zzaduVar.o();
            try {
                zo3 zo3VarA = so3.c.a(zzaduVarO.getClass());
                zo3VarA.c(zzaduVarO, bArr, 0, length, new f8(zzadfVar));
                zo3VarA.a(zzaduVarO);
                zzaduVar = zzaduVarO;
            } catch (zzaeh e) {
                if (e.f()) {
                    throw new zzaeh(e);
                }
                throw e;
            } catch (zzafy e2) {
                throw e2.d();
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzaeh) {
                    throw ((zzaeh) e3.getCause());
                }
                throw new zzaeh(e3);
            } catch (IndexOutOfBoundsException unused) {
                dz4.f("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        x(zzaduVar);
        return zzaduVar;
    }

    public static Object v(Method method, zzadu zzaduVar, Object... objArr) {
        try {
            return method.invoke(zzaduVar, objArr);
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

    public static final boolean w(zzadu zzaduVar, boolean z) {
        byte bByteValue = ((Byte) zzaduVar.y(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = so3.c.a(zzaduVar.getClass()).zzl(zzaduVar);
        if (z) {
            zzaduVar.y(2);
        }
        return zZzl;
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final zzafj c() {
        return (zzafj) y(7);
    }

    @Override // com.google.android.gms.internal.measurement.zzafd
    public final /* synthetic */ zzadu e() {
        return (zzadu) y(6);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final /* synthetic */ zzafb f() {
        return (zzadp) y(5);
    }

    @Override // com.google.android.gms.internal.measurement.zzafd
    public final boolean g() {
        return w(this, true);
    }

    public final zzadu o() {
        return (zzadu) y(4);
    }

    public final zzadp q() {
        return (zzadp) y(5);
    }

    public final zzadp r() {
        zzadp zzadpVar = (zzadp) y(5);
        zzadpVar.o(this);
        return zzadpVar;
    }

    public abstract Object y(int i);

    public static zzadu t(Class cls) {
        Map map = zze;
        zzadu zzaduVar = (zzadu) map.get(cls);
        if (zzaduVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaduVar = (zzadu) map.get(cls);
            } catch (ClassNotFoundException e) {
                dr0.l("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzaduVar != null) {
            return zzaduVar;
        }
        zzadu zzaduVar2 = (zzadu) ((zzadu) mp3.d(cls)).y(6);
        if (zzaduVar2 != null) {
            map.put(cls, zzaduVar2);
            return zzaduVar2;
        }
        y.b();
        return null;
    }

    public static void x(zzadu zzaduVar) throws zzaeh {
        if (zzaduVar != null && !w(zzaduVar, true)) {
            throw new zzafy(zzaduVar).d();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return so3.c.a(getClass()).h(this, (zzadu) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final void j(zzada zzadaVar) {
        zo3 zo3VarA = so3.c.a(getClass());
        w13 w13Var = zzadaVar.a;
        if (w13Var == null) {
            w13Var = new w13(zzadaVar);
        }
        zo3VarA.d(this, w13Var);
    }

    public final boolean m() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void n() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void p() {
        so3.c.a(getClass()).a(this);
        n();
    }

    public final void s() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public static void u(Class cls, zzadu zzaduVar) {
        zzaduVar.n();
        zze.put(cls, zzaduVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacb
    public final int h(zo3 zo3Var) {
        if (m()) {
            int iG = zo3Var.g(this);
            if (iG >= 0) {
                return iG;
            }
            y.d(rl3.c(iG, 42), iG, "serialized size must be non-negative, was ");
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int iG2 = zo3Var.g(this);
            if (iG2 >= 0) {
                this.zzb = (this.zzb & Integer.MIN_VALUE) | iG2;
                return iG2;
            }
            y.d(rl3.c(iG2, 42), iG2, "serialized size must be non-negative, was ");
            return 0;
        }
        return i;
    }

    public final int hashCode() {
        if (!m()) {
            int i = this.zza;
            if (i == 0) {
                int iF = so3.c.a(getClass()).f(this);
                this.zza = iF;
                return iF;
            }
            return i;
        }
        return so3.c.a(getClass()).f(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final int i() {
        if (m()) {
            int iG = so3.c.a(getClass()).g(this);
            if (iG >= 0) {
                return iG;
            }
            y.d(rl3.c(iG, 42), iG, "serialized size must be non-negative, was ");
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iG2 = so3.c.a(getClass()).g(this);
        if (iG2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iG2;
            return iG2;
        }
        y.d(rl3.c(iG2, 42), iG2, "serialized size must be non-negative, was ");
        return 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = a.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        a.b(this, sb, 0);
        return sb.toString();
    }
}
