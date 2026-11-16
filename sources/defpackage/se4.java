package defpackage;

import com.google.android.gms.internal.auth.zzef;
import com.google.android.gms.internal.auth.zzep;
import com.google.android.gms.internal.auth.zzev;
import com.google.android.gms.internal.auth.zzex;
import com.google.android.gms.internal.auth.zzfa;
import com.google.android.gms.internal.auth.zzfc;
import com.google.android.gms.internal.auth.zzfx;
import com.google.android.gms.internal.auth.zzho;
import com.google.android.gms.internal.auth.zzhp;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class se4 {
    public static final /* synthetic */ int c = 0;
    public final hm4 a = new hm4(16);
    public boolean b;

    static {
        new se4(0);
    }

    public se4(int i) {
        a();
        a();
    }

    public final void a() {
        hm4 hm4Var;
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            hm4Var = this.a;
            if (i >= hm4Var.b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) hm4Var.b.get(i);
            if (entry.getValue() instanceof zzev) {
                zzev zzevVar = (zzev) entry.getValue();
                zzevVar.getClass();
                zk4.c.a(zzevVar.getClass()).a(zzevVar);
                zzevVar.c();
            }
            i++;
        }
        if (!hm4Var.d) {
            for (int i2 = 0; i2 < hm4Var.b.size(); i2++) {
                Map.Entry entry2 = (Map.Entry) hm4Var.b.get(i2);
                if (((zzep) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
            for (Map.Entry entry3 : hm4Var.c.isEmpty() ? nq2.c : hm4Var.c.entrySet()) {
                if (((zzep) entry3.getKey()).zzc()) {
                    entry3.setValue(Collections.unmodifiableList((List) entry3.getValue()));
                }
            }
        }
        if (!hm4Var.d) {
            hm4Var.c = hm4Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hm4Var.c);
            hm4Var.f = hm4Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hm4Var.f);
            hm4Var.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        hm4 hm4Var;
        se4 se4Var = new se4();
        int i = 0;
        while (true) {
            hm4Var = this.a;
            if (i >= hm4Var.b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) hm4Var.b.get(i);
            se4Var.b((zzep) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : hm4Var.c.isEmpty() ? nq2.c : hm4Var.c.entrySet()) {
            se4Var.b((zzep) entry2.getKey(), entry2.getValue());
        }
        return se4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof se4) {
            return this.a.equals(((se4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void c(zzep zzepVar, Object obj) {
        boolean z;
        zzepVar.zzb();
        Charset charset = zzfa.a;
        obj.getClass();
        zzho[] zzhoVarArr = zzho.b;
        zzhp zzhpVar = zzhp.INT;
        switch (r0.a) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzef) || (obj instanceof byte[])) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzex)) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case MESSAGE:
                if ((obj instanceof zzfx) || (obj instanceof zzfc)) {
                }
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final void b(zzep zzepVar, Object obj) {
        if (zzepVar.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    c(zzepVar, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                d.r("Wrong object type used with protocol message reflection.");
                return;
            }
        } else {
            c(zzepVar, obj);
        }
        this.a.put(zzepVar, obj);
    }

    public se4() {
    }
}
