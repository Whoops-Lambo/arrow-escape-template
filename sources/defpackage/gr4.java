package defpackage;

import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzhbp;
import com.ironsource.C4664b4;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gr4 extends zzgzl {
    public final /* synthetic */ int d = 0;
    public final transient Object e;

    public gr4(Object obj) {
        obj.getClass();
        this.e = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((zzgzo) obj2).zzu().get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return obj2.equals(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    /* JADX INFO: renamed from: d */
    public final zzhbp iterator() {
        switch (this.d) {
            case 0:
                return new fr4((zzgzo) this.e);
            default:
                return new kr4(this.e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.d) {
            case 1:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.d) {
            case 0:
                return new fr4((zzgzo) this.e);
            default:
                return new kr4(this.e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, com.google.android.gms.internal.ads.zzgyx
    public zzgzb n() {
        switch (this.d) {
            case 1:
                return zzgzb.x(this.e);
            default:
                return super.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final boolean o() {
        switch (this.d) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public int r(Object[] objArr, int i) {
        switch (this.d) {
            case 1:
                objArr[i] = this.e;
                return i + 1;
            default:
                return super.r(objArr, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.d) {
            case 0:
                return ((zzgzo) this.e).e;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.d) {
            case 1:
                String string = this.e.toString();
                return jc1.o(C4664b4.j.d, string, new StringBuilder(String.valueOf(string).length() + 2), C4664b4.j.e);
            default:
                return super.toString();
        }
    }

    public gr4(zzgzo zzgzoVar) {
        this.e = zzgzoVar;
    }
}
