package defpackage;

import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfc;
import com.google.android.gms.internal.play_billing.zzfl;
import com.google.android.gms.internal.play_billing.zzfu;
import com.google.android.gms.internal.play_billing.zzfw;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgh;
import com.google.android.gms.internal.play_billing.zzhb;
import com.google.android.gms.internal.play_billing.zzhc;
import com.google.android.gms.internal.play_billing.zzir;
import com.google.android.gms.internal.play_billing.zzis;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gh4 {
    public static final gh4 d = new gh4(0);
    public final yv4 a = new yv4();
    public boolean b;
    public boolean c;

    public gh4(int i) {
        e();
        e();
    }

    public static int a(zzir zzirVar, int i, Object obj) {
        int iX = zzfc.x(i << 3);
        if (zzirVar == zzir.d) {
            iX += iX;
        }
        return b(zzirVar, obj) + iX;
    }

    public static int b(zzir zzirVar, Object obj) {
        int iB;
        int iX;
        zzir zzirVar2 = zzir.c;
        zzis zzisVar = zzis.a;
        switch (zzirVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z = zzfc.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                boolean z2 = zzfc.b;
                return 4;
            case 2:
                return zzfc.y(((Long) obj).longValue());
            case 3:
                return zzfc.y(((Long) obj).longValue());
            case 4:
                return zzfc.y(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                boolean z3 = zzfc.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                boolean z4 = zzfc.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                boolean z5 = zzfc.b;
                return 1;
            case 8:
                if (!(obj instanceof zzev)) {
                    boolean z6 = zzfc.b;
                    iB = xz4.b((String) obj);
                    iX = zzfc.x(iB);
                } else {
                    boolean z7 = zzfc.b;
                    iB = ((zzev) obj).i();
                    iX = zzfc.x(iB);
                }
                break;
            case 9:
                return ((zzhb) obj).zzn();
            case 10:
                if (!(obj instanceof zzgh)) {
                    boolean z8 = zzfc.b;
                    iB = ((zzhb) obj).zzn();
                    iX = zzfc.x(iB);
                } else {
                    iB = ((zzgh) obj).a();
                    iX = zzfc.x(iB);
                }
                break;
            case 11:
                if (!(obj instanceof zzev)) {
                    boolean z9 = zzfc.b;
                    iB = ((byte[]) obj).length;
                    iX = zzfc.x(iB);
                } else {
                    boolean z10 = zzfc.b;
                    iB = ((zzev) obj).i();
                    iX = zzfc.x(iB);
                }
                break;
            case 12:
                return zzfc.x(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzfw ? zzfc.y(((zzfw) obj).zza()) : zzfc.y(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z11 = zzfc.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z12 = zzfc.b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzfc.x((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzfc.y((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                y.j("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iX + iB;
    }

    public static void g(zzfc zzfcVar, zzir zzirVar, int i, Object obj) {
        if (zzirVar == zzir.d) {
            zzfcVar.s(i, 3);
            ((zzhb) obj).a(zzfcVar);
            zzfcVar.s(i, 4);
            return;
        }
        zzfcVar.s(i, zzirVar.b);
        zzis zzisVar = zzis.a;
        switch (zzirVar.ordinal()) {
            case 0:
                zzfcVar.k(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzfcVar.i(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzfcVar.w(((Long) obj).longValue());
                break;
            case 3:
                zzfcVar.w(((Long) obj).longValue());
                break;
            case 4:
                zzfcVar.m(((Integer) obj).intValue());
                break;
            case 5:
                zzfcVar.k(((Long) obj).longValue());
                break;
            case 6:
                zzfcVar.i(((Integer) obj).intValue());
                break;
            case 7:
                zzfcVar.c(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzev)) {
                    zzfcVar.r((String) obj);
                } else {
                    zzfcVar.g((zzev) obj);
                }
                break;
            case 9:
                ((zzhb) obj).a(zzfcVar);
                break;
            case 10:
                zzfcVar.n((zzhb) obj);
                break;
            case 11:
                if (!(obj instanceof zzev)) {
                    byte[] bArr = (byte[]) obj;
                    zzfcVar.e(bArr.length, bArr);
                } else {
                    zzfcVar.g((zzev) obj);
                }
                break;
            case 12:
                zzfcVar.u(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzfw)) {
                    zzfcVar.m(((Integer) obj).intValue());
                } else {
                    zzfcVar.m(((zzfw) obj).zza());
                }
                break;
            case 14:
                zzfcVar.i(((Integer) obj).intValue());
                break;
            case 15:
                zzfcVar.k(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzfcVar.u((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzfcVar.w((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final Object clone() {
        gh4 gh4Var = new gh4();
        yv4 yv4Var = this.a;
        int i = yv4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            iw4 iw4VarC = yv4Var.c(i2);
            gh4Var.f((zzfl) iw4VarC.a, iw4VarC.b);
        }
        for (Map.Entry entry : yv4Var.a()) {
            gh4Var.f((zzfl) entry.getKey(), entry.getValue());
        }
        gh4Var.c = this.c;
        return gh4Var;
    }

    public final Iterator d() {
        yv4 yv4Var = this.a;
        if (yv4Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.c ? new jd1(((yg2) yv4Var.entrySet()).iterator(), 5) : ((yg2) yv4Var.entrySet()).iterator();
    }

    public final void e() {
        if (this.b) {
            return;
        }
        yv4 yv4Var = this.a;
        int i = yv4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = yv4Var.c(i2).b;
            if (obj instanceof zzfu) {
                ((zzfu) obj).o();
            }
        }
        Iterator it = yv4Var.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzfu) {
                ((zzfu) value).o();
            }
        }
        if (!yv4Var.d) {
            for (int i3 = 0; i3 < yv4Var.b; i3++) {
                iw4 iw4VarC = yv4Var.c(i3);
                if (((zzfl) iw4VarC.a).zze()) {
                    iw4VarC.setValue(Collections.unmodifiableList((List) iw4VarC.b));
                }
            }
            for (Map.Entry entry : yv4Var.a()) {
                if (((zzfl) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!yv4Var.d) {
            yv4Var.c = yv4Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(yv4Var.c);
            yv4Var.f = yv4Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(yv4Var.f);
            yv4Var.d = true;
        }
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gh4) {
            return this.a.equals(((gh4) obj).a);
        }
        return false;
    }

    public final boolean h() {
        yv4 yv4Var = this.a;
        int i = yv4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!i(yv4Var.c(i2))) {
                return false;
            }
        }
        Iterator it = yv4Var.a().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public static int c(zzfl zzflVar, Object obj) {
        zzir zzirVarZzb = zzflVar.zzb();
        int iZza = zzflVar.zza();
        if (zzflVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (zzflVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iB = 0;
                while (i < size) {
                    iB += b(zzirVarZzb, list.get(i));
                    i++;
                }
                return zzfc.x(iB) + zzfc.x(iZza << 3) + iB;
            }
            int iA = 0;
            while (i < size) {
                iA += a(zzirVarZzb, iZza, list.get(i));
                i++;
            }
            return iA;
        }
        return a(zzirVarZzb, iZza, obj);
    }

    public static boolean i(Map.Entry entry) {
        boolean zZzo;
        zzfl zzflVar = (zzfl) entry.getKey();
        if (zzflVar.zzc() == zzis.i) {
            if (zzflVar.zze()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj = list.get(i);
                    if (obj instanceof zzhc) {
                        zZzo = ((zzhc) obj).zzo();
                    } else if (obj instanceof zzgh) {
                        zZzo = true;
                    } else {
                        d.r("Wrong object type used with protocol message reflection.");
                        return false;
                    }
                    if (!zZzo) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzhc) {
                    return ((zzhc) value).zzo();
                }
                if (value instanceof zzgh) {
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
        int iX;
        int iW;
        zzfl zzflVar = (zzfl) entry.getKey();
        Object value = entry.getValue();
        if (zzflVar.zzc() == zzis.i && !zzflVar.zze() && !zzflVar.zzd()) {
            if (value instanceof zzgh) {
                int iZza = ((zzfl) entry.getKey()).zza();
                int iX2 = zzfc.x(8);
                i = iX2 + iX2;
                iX = zzfc.x(iZza) + zzfc.x(16);
                int iX3 = zzfc.x(24);
                int iA = ((zzgh) value).a();
                iW = rl3.w(iA, iA, iX3);
            } else {
                int iZza2 = ((zzfl) entry.getKey()).zza();
                int iX4 = zzfc.x(8);
                i = iX4 + iX4;
                iX = zzfc.x(iZza2) + zzfc.x(16);
                int iX5 = zzfc.x(24);
                int iZzn = ((zzhb) value).zzn();
                iW = rl3.w(iZzn, iZzn, iX5);
            }
            return i + iX + iW;
        }
        return c(zzflVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void k(zzfl zzflVar, Object obj) {
        boolean z;
        zzir zzirVarZzb = zzflVar.zzb();
        Charset charset = zzga.a;
        obj.getClass();
        zzir zzirVar = zzir.c;
        zzis zzisVar = zzis.a;
        switch (zzirVarZzb.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzflVar.zza()), zzflVar.zzb().a, obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzflVar.zza()), zzflVar.zzb().a, obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzflVar.zza()), zzflVar.zzb().a, obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzflVar.zza()), zzflVar.zzb().a, obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzflVar.zza()), zzflVar.zzb().a, obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzflVar.zza()), zzflVar.zzb().a, obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zzev) || (obj instanceof byte[])) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzflVar.zza()), zzflVar.zzb().a, obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzfw)) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzflVar.zza()), zzflVar.zzb().a, obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zzhb) || (obj instanceof zzgh)) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzflVar.zza()), zzflVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzflVar.zza()), zzflVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final void f(zzfl zzflVar, Object obj) {
        if (zzflVar.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    k(zzflVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                d.r("Wrong object type used with protocol message reflection.");
                return;
            }
        } else {
            k(zzflVar, obj);
        }
        if (obj instanceof zzgh) {
            this.c = true;
        }
        this.a.put(zzflVar, obj);
    }

    public gh4() {
    }
}
