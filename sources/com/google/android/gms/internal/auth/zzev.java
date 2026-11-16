package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import defpackage.dr0;
import defpackage.jv4;
import defpackage.vq2;
import defpackage.zk4;
import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzev<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzha zzc = zzha.e;

    public static Object b(Method method, zzev zzevVar, Object... objArr) {
        try {
            return method.invoke(zzevVar, objArr);
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

    public abstract Object g(int i);

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* synthetic */ zzev zze() {
        return (zzev) g(6);
    }

    public static zzev a(Class cls) {
        Map map = zzb;
        zzev zzevVar = (zzev) map.get(cls);
        if (zzevVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzevVar = (zzev) map.get(cls);
            } catch (ClassNotFoundException e) {
                dr0.l("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzevVar != null) {
            return zzevVar;
        }
        zzev zzevVar2 = (zzev) ((zzev) jv4.c(cls)).g(6);
        if (zzevVar2 != null) {
            map.put(cls, zzevVar2);
            return zzevVar2;
        }
        y.b();
        return null;
    }

    public final void c() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void e() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zk4.c.a(getClass()).d(this, (zzev) obj);
    }

    public final boolean f() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public static void d(zzhs zzhsVar) {
        zzhsVar.c();
        zzb.put(zzhs.class, zzhsVar);
    }

    public final int hashCode() {
        if (!f()) {
            int i = this.zza;
            if (i == 0) {
                int iC = zk4.c.a(getClass()).c(this);
                this.zza = iC;
                return iC;
            }
            return i;
        }
        return zk4.c.a(getClass()).c(this);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = a.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        a.c(this, sb, 0);
        return sb.toString();
    }
}
