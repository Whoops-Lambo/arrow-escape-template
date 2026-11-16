package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.internal.p002firebaseauthapi.zzaq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaz;
import com.google.android.gms.internal.p002firebaseauthapi.zzba;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zv3 extends zzaq {
    public final transient av3 d;
    public final transient Object[] e;
    public final transient int f;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int h(Object[] objArr) {
        zzah vv3Var = this.b;
        if (vv3Var == null) {
            vv3Var = new vv3(this);
            this.b = vv3Var;
        }
        return vv3Var.h(objArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final zzba iterator() {
        zzah vv3Var = this.b;
        if (vv3Var == null) {
            vv3Var = new vv3(this);
            this.b = vv3Var;
        }
        return (zzaz) vv3Var.listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    public zv3(av3 av3Var, Object[] objArr, int i) {
        this.d = av3Var;
        this.e = objArr;
        this.f = i;
    }
}
