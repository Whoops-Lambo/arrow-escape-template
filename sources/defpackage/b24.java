package defpackage;

import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.internal.play_billing.zzca;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b24 extends zzca {
    public final transient x24 c;
    public final transient Object[] d;
    public final transient int e;

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.c.get(key));
    }

    @Override // com.google.android.gms.internal.play_billing.zzca
    public final zzbw r() {
        return new x14(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    public b24(x24 x24Var, Object[] objArr, int i) {
        this.c = x24Var;
        this.d = objArr;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final int a(Object[] objArr) {
        return i().a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: k */
    public final g04 iterator() {
        return i().listIterator(0);
    }
}
