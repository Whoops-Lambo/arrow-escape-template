package defpackage;

import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzhbp;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ds4 extends zzgzl {
    public final transient js4 d;
    public final transient Object[] e;
    public final transient int f;

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final zzgzb z() {
        return new cs4(this);
    }

    public ds4(js4 js4Var, Object[] objArr, int i) {
        this.d = js4Var;
        this.e = objArr;
        this.f = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    /* JADX INFO: renamed from: d */
    public final zzhbp iterator() {
        return n().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final int r(Object[] objArr, int i) {
        return n().r(objArr, i);
    }
}
