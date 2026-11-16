package defpackage;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzadj;
import com.google.android.gms.internal.measurement.zzadu;
import com.google.android.gms.internal.measurement.zzady;
import com.google.android.gms.internal.measurement.zzael;
import com.google.android.gms.internal.measurement.zzafc;
import com.google.android.gms.internal.measurement.zzafd;
import com.google.android.gms.internal.measurement.zzagm;
import com.google.android.gms.internal.measurement.zzagn;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class in3 {
    public static final in3 d = new in3(0);
    public final cp3 a = new cp3();
    public boolean b;
    public boolean c;

    public in3(int i) {
        a();
        a();
    }

    public static void e(zzada zzadaVar, zzagm zzagmVar, int i, Object obj) {
        if (zzagmVar == zzagm.d) {
            zzadaVar.f(i, 3);
            ((zzafc) obj).j(zzadaVar);
            zzadaVar.f(i, 4);
            return;
        }
        zzadaVar.f(i, zzagmVar.b);
        zzagn zzagnVar = zzagn.a;
        switch (zzagmVar.ordinal()) {
            case 0:
                zzadaVar.y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzadaVar.w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzadaVar.x(((Long) obj).longValue());
                break;
            case 3:
                zzadaVar.x(((Long) obj).longValue());
                break;
            case 4:
                zzadaVar.u(((Integer) obj).intValue());
                break;
            case 5:
                zzadaVar.y(((Long) obj).longValue());
                break;
            case 6:
                zzadaVar.w(((Integer) obj).intValue());
                break;
            case 7:
                zzadaVar.t(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzacr)) {
                    zzadaVar.z((String) obj);
                } else {
                    zzadaVar.o((zzacr) obj);
                }
                break;
            case 9:
                ((zzafc) obj).j(zzadaVar);
                break;
            case 10:
                zzadaVar.s((zzafc) obj);
                break;
            case 11:
                if (!(obj instanceof zzacr)) {
                    byte[] bArr = (byte[]) obj;
                    zzadaVar.p(bArr.length, bArr);
                } else {
                    zzadaVar.o((zzacr) obj);
                }
                break;
            case 12:
                zzadaVar.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzady)) {
                    zzadaVar.u(((Integer) obj).intValue());
                } else {
                    zzadaVar.u(((zzady) obj).zza());
                }
                break;
            case 14:
                zzadaVar.w(((Integer) obj).intValue());
                break;
            case 15:
                zzadaVar.y(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzadaVar.v((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzadaVar.x((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int f(zzagm zzagmVar, int i, Object obj) {
        int iB = zzada.b(i << 3);
        if (zzagmVar == zzagm.d) {
            iB += iB;
        }
        return g(zzagmVar, obj) + iB;
    }

    public static int g(zzagm zzagmVar, Object obj) {
        int iB;
        int iB2;
        zzagm zzagmVar2 = zzagm.c;
        zzagn zzagnVar = zzagn.a;
        switch (zzagmVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z = zzada.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                boolean z2 = zzada.b;
                return 4;
            case 2:
                return zzada.c(((Long) obj).longValue());
            case 3:
                return zzada.c(((Long) obj).longValue());
            case 4:
                return zzada.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                boolean z3 = zzada.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                boolean z4 = zzada.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                boolean z5 = zzada.b;
                return 1;
            case 8:
                if (!(obj instanceof zzacr)) {
                    boolean z6 = zzada.b;
                    iB = qp3.b((String) obj);
                    iB2 = zzada.b(iB);
                } else {
                    boolean z7 = zzada.b;
                    iB = ((zzacr) obj).d();
                    iB2 = zzada.b(iB);
                }
                break;
            case 9:
                return ((zzafc) obj).i();
            case 10:
                if (!(obj instanceof zzael)) {
                    return zzada.d((zzafc) obj);
                }
                iB = ((zzael) obj).a();
                iB2 = zzada.b(iB);
                break;
                break;
            case 11:
                if (!(obj instanceof zzacr)) {
                    boolean z8 = zzada.b;
                    iB = ((byte[]) obj).length;
                    iB2 = zzada.b(iB);
                } else {
                    boolean z9 = zzada.b;
                    iB = ((zzacr) obj).d();
                    iB2 = zzada.b(iB);
                }
                break;
            case 12:
                return zzada.b(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzady ? zzada.c(((zzady) obj).zza()) : zzada.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z10 = zzada.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z11 = zzada.b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzada.b((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzada.c((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                y.j("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iB2 + iB;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        cp3 cp3Var = this.a;
        int i = cp3Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = cp3Var.a(i2).b;
            if (obj instanceof zzadu) {
                ((zzadu) obj).p();
            }
        }
        Iterator it = cp3Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzadu) {
                ((zzadu) value).p();
            }
        }
        if (!cp3Var.d) {
            for (int i3 = 0; i3 < cp3Var.b; i3++) {
                ep3 ep3VarA = cp3Var.a(i3);
                if (((zzadj) ep3VarA.a).zzd()) {
                    ep3VarA.setValue(Collections.unmodifiableList((List) ep3VarA.b));
                }
            }
            for (Map.Entry entry : cp3Var.b()) {
                if (((zzadj) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!cp3Var.d) {
            cp3Var.c = cp3Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(cp3Var.c);
            cp3Var.f = cp3Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(cp3Var.f);
            cp3Var.d = true;
        }
        this.b = true;
    }

    public final Iterator b() {
        cp3 cp3Var = this.a;
        if (cp3Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.c ? new jd1(((yg2) cp3Var.entrySet()).iterator(), 2) : ((yg2) cp3Var.entrySet()).iterator();
    }

    public final Object clone() {
        in3 in3Var = new in3();
        cp3 cp3Var = this.a;
        int i = cp3Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ep3 ep3VarA = cp3Var.a(i2);
            in3Var.c((zzadj) ep3VarA.a, ep3VarA.b);
        }
        for (Map.Entry entry : cp3Var.b()) {
            in3Var.c((zzadj) entry.getKey(), entry.getValue());
        }
        in3Var.c = this.c;
        return in3Var;
    }

    public final boolean d() {
        cp3 cp3Var = this.a;
        int i = cp3Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!i(cp3Var.a(i2))) {
                return false;
            }
        }
        Iterator it = cp3Var.b().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof in3) {
            return this.a.equals(((in3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public static int h(zzadj zzadjVar, Object obj) {
        zzagm zzagmVarZzb = zzadjVar.zzb();
        int iZza = zzadjVar.zza();
        if (zzadjVar.zzd()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (zzadjVar.zze()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iG = 0;
                while (i < size) {
                    iG += g(zzagmVarZzb, list.get(i));
                    i++;
                }
                return zzada.b(iG) + zzada.b(iZza << 3) + iG;
            }
            int iF = 0;
            while (i < size) {
                iF += f(zzagmVarZzb, iZza, list.get(i));
                i++;
            }
            return iF;
        }
        return f(zzagmVarZzb, iZza, obj);
    }

    public static boolean i(Map.Entry entry) {
        boolean zG;
        zzadj zzadjVar = (zzadj) entry.getKey();
        if (zzadjVar.zzc() == zzagn.i) {
            if (zzadjVar.zzd()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj = list.get(i);
                    if (obj instanceof zzafd) {
                        zG = ((zzafd) obj).g();
                    } else if (obj instanceof zzael) {
                        zG = true;
                    } else {
                        d.r("Wrong object type used with protocol message reflection.");
                        return false;
                    }
                    if (!zG) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzafd) {
                    return ((zzafd) value).g();
                }
                if (value instanceof zzael) {
                    return true;
                }
                d.r("Wrong object type used with protocol message reflection.");
                return false;
            }
        }
        return true;
    }

    public static final int j(Map.Entry entry) {
        int i;
        int iB;
        int iD;
        zzadj zzadjVar = (zzadj) entry.getKey();
        Object value = entry.getValue();
        if (zzadjVar.zzc() == zzagn.i && !zzadjVar.zzd() && !zzadjVar.zze()) {
            if (value instanceof zzael) {
                int iZza = ((zzadj) entry.getKey()).zza();
                int iB2 = zzada.b(8);
                i = iB2 + iB2;
                iB = zzada.b(iZza) + zzada.b(16);
                int iB3 = zzada.b(24);
                int iA = ((zzael) value).a();
                iD = rl3.d(iA, iA, iB3);
            } else {
                int iZza2 = ((zzadj) entry.getKey()).zza();
                int iB4 = zzada.b(8);
                i = iB4 + iB4;
                iB = zzada.b(iZza2) + zzada.b(16);
                iD = zzada.d((zzafc) value) + zzada.b(24);
            }
            return i + iB + iD;
        }
        return h(zzadjVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void k(zzadj zzadjVar, Object obj) {
        boolean z;
        zzagm zzagmVarZzb = zzadjVar.zzb();
        obj.getClass();
        zzagm zzagmVar = zzagm.c;
        zzagn zzagnVar = zzagn.a;
        switch (zzagmVarZzb.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zzacr) || (obj instanceof byte[])) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzady)) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zzafc) || (obj instanceof zzael)) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final void c(zzadj zzadjVar, Object obj) {
        if (zzadjVar.zzd()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    k(zzadjVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                d.r("Wrong object type used with protocol message reflection.");
                return;
            }
        } else {
            k(zzadjVar, obj);
        }
        if (obj instanceof zzael) {
            this.c = true;
        }
        this.a.put(zzadjVar, obj);
    }

    public in3() {
    }
}
