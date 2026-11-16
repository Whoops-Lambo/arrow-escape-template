package defpackage;

import com.google.android.gms.internal.consent_sdk.zzpm;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.consent_sdk.zzqe;
import com.google.android.gms.internal.consent_sdk.zzqm;
import com.google.android.gms.internal.consent_sdk.zzqo;
import com.google.android.gms.internal.consent_sdk.zzqs;
import com.google.android.gms.internal.consent_sdk.zzqz;
import com.google.android.gms.internal.consent_sdk.zzrq;
import com.google.android.gms.internal.consent_sdk.zzrr;
import com.google.android.gms.internal.consent_sdk.zzsz;
import com.google.android.gms.internal.consent_sdk.zzta;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o65 {
    public static final o65 d = new o65(0);
    public final v75 a = new v75();
    public boolean b;
    public boolean c;

    public o65(int i) {
        e();
        e();
    }

    public static int a(zzsz zzszVar, int i, Object obj) {
        int iC = zzpv.c(i << 3);
        if (zzszVar == zzsz.e) {
            iC += iC;
        }
        return b(zzszVar, obj) + iC;
    }

    public static int b(zzsz zzszVar, Object obj) {
        int iH;
        int iC;
        zzsz zzszVar2 = zzsz.c;
        zzta zztaVar = zzta.a;
        switch (zzszVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = zzpv.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = zzpv.b;
                return 4;
            case 2:
                return zzpv.d(((Long) obj).longValue());
            case 3:
                return zzpv.d(((Long) obj).longValue());
            case 4:
                return zzpv.d(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = zzpv.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = zzpv.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = zzpv.b;
                return 1;
            case 8:
                if (!(obj instanceof zzpm)) {
                    return zzpv.b((String) obj);
                }
                Logger logger6 = zzpv.b;
                iH = ((zzpm) obj).h();
                iC = zzpv.c(iH);
                break;
                break;
            case 9:
                return ((zzrq) obj).zzn();
            case 10:
                if (!(obj instanceof zzqz)) {
                    Logger logger7 = zzpv.b;
                    iH = ((zzrq) obj).zzn();
                    iC = zzpv.c(iH);
                } else {
                    iH = ((zzqz) obj).a();
                    iC = zzpv.c(iH);
                }
                break;
            case 11:
                if (!(obj instanceof zzpm)) {
                    Logger logger8 = zzpv.b;
                    iH = ((byte[]) obj).length;
                    iC = zzpv.c(iH);
                } else {
                    Logger logger9 = zzpv.b;
                    iH = ((zzpm) obj).h();
                    iC = zzpv.c(iH);
                }
                break;
            case 12:
                return zzpv.c(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzqo ? zzpv.d(((zzqo) obj).zza()) : zzpv.d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = zzpv.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = zzpv.b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzpv.c((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzpv.d((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                y.j("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iC + iH;
    }

    public static void g(zzpv zzpvVar, zzsz zzszVar, int i, Object obj) {
        if (zzszVar == zzsz.e) {
            zzpvVar.v(i, 3);
            ((zzrq) obj).a(zzpvVar);
            zzpvVar.v(i, 4);
            return;
        }
        zzpvVar.v(i, zzszVar.b);
        zzta zztaVar = zzta.a;
        switch (zzszVar.ordinal()) {
            case 0:
                zzpvVar.n(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzpvVar.l(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzpvVar.z(((Long) obj).longValue());
                break;
            case 3:
                zzpvVar.z(((Long) obj).longValue());
                break;
            case 4:
                zzpvVar.p(((Integer) obj).intValue());
                break;
            case 5:
                zzpvVar.n(((Long) obj).longValue());
                break;
            case 6:
                zzpvVar.l(((Integer) obj).intValue());
                break;
            case 7:
                zzpvVar.f(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzpm)) {
                    zzpvVar.u((String) obj);
                } else {
                    zzpvVar.j((zzpm) obj);
                }
                break;
            case 9:
                ((zzrq) obj).a(zzpvVar);
                break;
            case 10:
                zzpvVar.q((zzrq) obj);
                break;
            case 11:
                if (!(obj instanceof zzpm)) {
                    byte[] bArr = (byte[]) obj;
                    zzpvVar.h(bArr.length, bArr);
                } else {
                    zzpvVar.j((zzpm) obj);
                }
                break;
            case 12:
                zzpvVar.x(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzqo)) {
                    zzpvVar.p(((Integer) obj).intValue());
                } else {
                    zzpvVar.p(((zzqo) obj).zza());
                }
                break;
            case 14:
                zzpvVar.l(((Integer) obj).intValue());
                break;
            case 15:
                zzpvVar.n(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzpvVar.x((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzpvVar.z((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final Object clone() {
        o65 o65Var = new o65();
        v75 v75Var = this.a;
        int i = v75Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            w75 w75VarC = v75Var.c(i2);
            o65Var.f((zzqe) w75VarC.a, w75VarC.b);
        }
        for (Map.Entry entry : v75Var.a()) {
            o65Var.f((zzqe) entry.getKey(), entry.getValue());
        }
        o65Var.c = this.c;
        return o65Var;
    }

    public final Iterator d() {
        v75 v75Var = this.a;
        if (v75Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.c ? new jd1(((yg2) v75Var.entrySet()).iterator(), 8) : ((yg2) v75Var.entrySet()).iterator();
    }

    public final void e() {
        if (this.b) {
            return;
        }
        v75 v75Var = this.a;
        int i = v75Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = v75Var.c(i2).b;
            if (obj instanceof zzqm) {
                ((zzqm) obj).k();
            }
        }
        Iterator it = v75Var.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzqm) {
                ((zzqm) value).k();
            }
        }
        if (!v75Var.d) {
            for (int i3 = 0; i3 < v75Var.b; i3++) {
                w75 w75VarC = v75Var.c(i3);
                if (((zzqe) w75VarC.a).zze()) {
                    w75VarC.setValue(Collections.unmodifiableList((List) w75VarC.b));
                }
            }
            for (Map.Entry entry : v75Var.a()) {
                if (((zzqe) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!v75Var.d) {
            v75Var.c = v75Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(v75Var.c);
            v75Var.f = v75Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(v75Var.f);
            v75Var.d = true;
        }
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o65) {
            return this.a.equals(((o65) obj).a);
        }
        return false;
    }

    public final boolean h() {
        v75 v75Var = this.a;
        int i = v75Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!i(v75Var.c(i2))) {
                return false;
            }
        }
        Iterator it = v75Var.a().iterator();
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

    public static int c(zzqe zzqeVar, Object obj) {
        zzsz zzszVarZzb = zzqeVar.zzb();
        int iZza = zzqeVar.zza();
        if (zzqeVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (zzqeVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iB = 0;
                while (i < size) {
                    iB += b(zzszVarZzb, list.get(i));
                    i++;
                }
                return zzpv.c(iB) + zzpv.c(iZza << 3) + iB;
            }
            int iA = 0;
            while (i < size) {
                iA += a(zzszVarZzb, iZza, list.get(i));
                i++;
            }
            return iA;
        }
        return a(zzszVarZzb, iZza, obj);
    }

    public static boolean i(Map.Entry entry) {
        boolean zZzo;
        zzqe zzqeVar = (zzqe) entry.getKey();
        if (zzqeVar.zzc() == zzta.i) {
            if (zzqeVar.zze()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj = list.get(i);
                    if (obj instanceof zzrr) {
                        zZzo = ((zzrr) obj).zzo();
                    } else if (obj instanceof zzqz) {
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
                if (value instanceof zzrr) {
                    return ((zzrr) value).zzo();
                }
                if (value instanceof zzqz) {
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
        int iC;
        int iZ;
        zzqe zzqeVar = (zzqe) entry.getKey();
        Object value = entry.getValue();
        if (zzqeVar.zzc() == zzta.i && !zzqeVar.zze() && !zzqeVar.zzd()) {
            if (value instanceof zzqz) {
                int iZza = ((zzqe) entry.getKey()).zza();
                int iC2 = zzpv.c(8);
                i = iC2 + iC2;
                iC = zzpv.c(iZza) + zzpv.c(16);
                int iC3 = zzpv.c(24);
                int iA = ((zzqz) value).a();
                iZ = rl3.z(iA, iA, iC3);
            } else {
                int iZza2 = ((zzqe) entry.getKey()).zza();
                int iC4 = zzpv.c(8);
                i = iC4 + iC4;
                iC = zzpv.c(iZza2) + zzpv.c(16);
                int iC5 = zzpv.c(24);
                int iZzn = ((zzrq) value).zzn();
                iZ = rl3.z(iZzn, iZzn, iC5);
            }
            return i + iC + iZ;
        }
        return c(zzqeVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void k(zzqe zzqeVar, Object obj) {
        boolean z;
        zzsz zzszVarZzb = zzqeVar.zzb();
        Charset charset = zzqs.a;
        obj.getClass();
        zzsz zzszVar = zzsz.c;
        zzta zztaVar = zzta.a;
        switch (zzszVarZzb.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zzpm) || (obj instanceof byte[])) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzqo)) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zzrq) || (obj instanceof zzqz)) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final void f(zzqe zzqeVar, Object obj) {
        if (zzqeVar.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    k(zzqeVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                d.r("Wrong object type used with protocol message reflection.");
                return;
            }
        } else {
            k(zzqeVar, obj);
        }
        if (obj instanceof zzqz) {
            this.c = true;
        }
        this.a.put(zzqeVar, obj);
    }

    public o65() {
    }
}
