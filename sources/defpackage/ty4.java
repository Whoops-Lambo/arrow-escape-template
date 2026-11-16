package defpackage;

import com.google.android.gms.internal.ads.zzifx;
import com.google.android.gms.internal.ads.zzigh;
import com.google.android.gms.internal.ads.zzigq;
import com.google.android.gms.internal.ads.zzihc;
import com.google.android.gms.internal.ads.zzihg;
import com.google.android.gms.internal.ads.zziii;
import com.google.android.gms.internal.ads.zziij;
import com.google.android.gms.internal.ads.zzijx;
import com.google.android.gms.internal.ads.zzijy;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ty4 {
    public static final ty4 d = new ty4(0);
    public final mz4 a = new mz4();
    public boolean b;
    public boolean c;

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty4)) {
            return false;
        }
        mz4 mz4Var = ((ty4) obj).a;
        mz4 mz4Var2 = this.a;
        mz4Var2.d();
        int i = mz4Var2.b;
        mz4Var.d();
        if (i != mz4Var.b || !mz4Var2.keySet().equals(mz4Var.keySet())) {
            return false;
        }
        for (Map.Entry entry : (yg2) mz4Var2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = mz4Var.get(key);
            if (value == obj2) {
                zEquals = true;
            } else if (value == null || obj2 == null) {
                zEquals = false;
            } else if (value instanceof yy4) {
                zEquals = value.equals(obj2);
            } else {
                zEquals = obj2 instanceof yy4 ? obj2.equals(value) : value.equals(obj2);
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    public ty4(int i) {
        a();
        a();
    }

    public static void d(zzigh zzighVar, zzijx zzijxVar, int i, Object obj) {
        if (zzijxVar == zzijx.d) {
            zzighVar.c(i, 3);
            ((zziii) obj).f(zzighVar);
            zzighVar.c(i, 4);
            return;
        }
        zzighVar.c(i, zzijxVar.b);
        zzijy zzijyVar = zzijy.a;
        switch (zzijxVar.ordinal()) {
            case 0:
                zzighVar.v(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzighVar.t(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzighVar.u(((Long) obj).longValue());
                break;
            case 3:
                zzighVar.u(((Long) obj).longValue());
                break;
            case 4:
                zzighVar.r(((Integer) obj).intValue());
                break;
            case 5:
                zzighVar.v(((Long) obj).longValue());
                break;
            case 6:
                zzighVar.t(((Integer) obj).intValue());
                break;
            case 7:
                zzighVar.q(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzifx)) {
                    zzighVar.w((String) obj);
                } else {
                    zzighVar.l((zzifx) obj);
                }
                break;
            case 9:
                ((zziii) obj).f(zzighVar);
                break;
            case 10:
                zzighVar.p((zziii) obj);
                break;
            case 11:
                if (!(obj instanceof zzifx)) {
                    byte[] bArr = (byte[]) obj;
                    zzighVar.m(bArr.length, bArr);
                } else {
                    zzighVar.l((zzifx) obj);
                }
                break;
            case 12:
                zzighVar.s(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzihg)) {
                    zzighVar.r(((Integer) obj).intValue());
                } else {
                    zzighVar.r(((zzihg) obj).zza());
                }
                break;
            case 14:
                zzighVar.t(((Integer) obj).intValue());
                break;
            case 15:
                zzighVar.v(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzighVar.s((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzighVar.u((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int e(zzijx zzijxVar, int i, Object obj) {
        int iE = nj.e(i << 3, 9, 352) >>> 6;
        if (zzijxVar == zzijx.d) {
            iE += iE;
        }
        return f(zzijxVar, obj) + iE;
    }

    public static int f(zzijx zzijxVar, Object obj) {
        int iB;
        int iE;
        zzijx zzijxVar2 = zzijx.c;
        zzijy zzijyVar = zzijy.a;
        switch (zzijxVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return (640 - (Long.numberOfLeadingZeros(((Long) obj).longValue()) * 9)) >>> 6;
            case 3:
                return (640 - (Long.numberOfLeadingZeros(((Long) obj).longValue()) * 9)) >>> 6;
            case 4:
                return nj.g(9, 640, ((Integer) obj).intValue()) >>> 6;
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                if (!(obj instanceof zzifx)) {
                    iB = tz4.b((String) obj);
                    iE = nj.e(iB, 9, 352);
                } else {
                    iB = ((zzifx) obj).n();
                    iE = nj.e(iB, 9, 352);
                }
                break;
            case 9:
                return ((zziii) obj).g();
            case 10:
                if (!(obj instanceof yy4)) {
                    iB = ((zziii) obj).g();
                    iE = nj.e(iB, 9, 352);
                } else {
                    yy4 yy4Var = (yy4) obj;
                    iB = yy4Var.c != null ? yy4Var.c.n() : yy4Var.d.g();
                    iE = nj.e(iB, 9, 352);
                }
                break;
            case 11:
                if (!(obj instanceof zzifx)) {
                    iB = ((byte[]) obj).length;
                    iE = nj.e(iB, 9, 352);
                } else {
                    iB = ((zzifx) obj).n();
                    iE = nj.e(iB, 9, 352);
                }
                break;
            case 12:
                return (352 - (Integer.numberOfLeadingZeros(((Integer) obj).intValue()) * 9)) >>> 6;
            case 13:
                return obj instanceof zzihg ? nj.g(9, 640, ((zzihg) obj).zza()) >>> 6 : nj.g(9, 640, ((Integer) obj).intValue()) >>> 6;
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return nj.e((iIntValue >> 31) ^ (iIntValue + iIntValue), 9, 352) >>> 6;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return nj.g(9, 640, (jLongValue >> 63) ^ (jLongValue + jLongValue)) >>> 6;
            default:
                y.j("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return (iE >>> 6) + iB;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        mz4 mz4Var = this.a;
        mz4Var.d();
        int i = mz4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = mz4Var.a(i2).b;
            if (obj instanceof zzihc) {
                zzihc zzihcVar = (zzihc) obj;
                fz4.b.a(zzihcVar.getClass()).a(zzihcVar);
                zzihcVar.p();
            }
        }
        if (!mz4Var.c) {
            mz4Var.d();
            if (mz4Var.a != null) {
                for (int i3 = 0; i3 < mz4Var.b; i3++) {
                    lz4 lz4Var = (lz4) mz4Var.a[i3];
                    if (lz4Var.a.zzd()) {
                        lz4Var.setValue(Collections.unmodifiableList((List) lz4Var.b));
                    }
                }
            }
            mz4Var.c = true;
        }
        this.b = true;
    }

    public final Iterator b() {
        mz4 mz4Var = this.a;
        if (mz4Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.c ? new jd1(((yg2) mz4Var.entrySet()).iterator(), 7) : ((yg2) mz4Var.entrySet()).iterator();
    }

    public final boolean c() {
        boolean zC;
        mz4 mz4Var = this.a;
        mz4Var.d();
        int i = mz4Var.b;
        int i2 = 0;
        while (true) {
            boolean zC2 = true;
            if (i2 >= i) {
                return true;
            }
            lz4 lz4VarA = mz4Var.a(i2);
            zzigq zzigqVar = lz4VarA.a;
            if (zzigqVar.zzc() == zzijy.i) {
                boolean zZzd = zzigqVar.zzd();
                Object obj = lz4VarA.b;
                if (zZzd) {
                    List list = (List) obj;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Object obj2 = list.get(i3);
                        if (obj2 instanceof zziij) {
                            zC = ((zziij) obj2).c();
                        } else {
                            if (!(obj2 instanceof yy4)) {
                                d.r("Wrong object type used with protocol message reflection.");
                                return false;
                            }
                            zC = true;
                        }
                        if (!zC) {
                            return false;
                        }
                    }
                } else {
                    if (obj instanceof zziij) {
                        zC2 = ((zziij) obj).c();
                    } else if (!(obj instanceof yy4)) {
                        d.r("Wrong object type used with protocol message reflection.");
                        return false;
                    }
                    if (!zC2) {
                        return false;
                    }
                }
            }
            i2++;
        }
    }

    public final Object clone() {
        ty4 ty4Var = new ty4();
        mz4 mz4Var = this.a;
        mz4Var.d();
        int i = mz4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            lz4 lz4VarA = mz4Var.a(i2);
            zzigq zzigqVar = lz4VarA.a;
            Object obj = lz4VarA.b;
            if (!zzigqVar.zzd()) {
                h(zzigqVar, obj);
            } else {
                if (!(obj instanceof List)) {
                    d.r("Wrong object type used with protocol message reflection.");
                    return null;
                }
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj2 = list.get(i3);
                    h(zzigqVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            }
            if (obj instanceof yy4) {
                ty4Var.c = true;
            }
            ty4Var.a.b(zzigqVar, obj);
        }
        ty4Var.c = this.c;
        return ty4Var;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public static int g(zzigq zzigqVar, Object obj) {
        zzijx zzijxVarZzb = zzigqVar.zzb();
        int iZza = zzigqVar.zza();
        if (zzigqVar.zzd()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (zzigqVar.zze()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iF = 0;
                while (i < size) {
                    iF += f(zzijxVarZzb, list.get(i));
                    i++;
                }
                return (nj.e(iZza << 3, 9, 352) >>> 6) + iF + (nj.e(iF, 9, 352) >>> 6);
            }
            int iE = 0;
            while (i < size) {
                iE += e(zzijxVarZzb, iZza, list.get(i));
                i++;
            }
            return iE;
        }
        return e(zzijxVarZzb, iZza, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void h(zzigq zzigqVar, Object obj) {
        boolean z;
        zzijx zzijxVarZzb = zzigqVar.zzb();
        obj.getClass();
        zzijx zzijxVar = zzijx.c;
        zzijy zzijyVar = zzijy.a;
        switch (zzijxVarZzb.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzigqVar.zza()), zzigqVar.zzb().a, obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzigqVar.zza()), zzigqVar.zzb().a, obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzigqVar.zza()), zzigqVar.zzb().a, obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzigqVar.zza()), zzigqVar.zzb().a, obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzigqVar.zza()), zzigqVar.zzb().a, obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzigqVar.zza()), zzigqVar.zzb().a, obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zzifx) || (obj instanceof byte[])) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzigqVar.zza()), zzigqVar.zzb().a, obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzihg)) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzigqVar.zza()), zzigqVar.zzb().a, obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zziii) || (obj instanceof yy4)) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzigqVar.zza()), zzigqVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzigqVar.zza()), zzigqVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public ty4() {
    }
}
