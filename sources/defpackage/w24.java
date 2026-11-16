package defpackage;

import com.google.android.gms.internal.fido.zzcc;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzcj;
import com.google.android.gms.internal.fido.zzcy;
import com.google.android.gms.internal.fido.zzdc;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w24 extends zzcf {
    public final /* synthetic */ zzcj d;

    public w24(zzcj zzcjVar) {
        this.d = zzcjVar;
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.d.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzcy.a(this.d.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.d.size();
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc t() {
        return new q24(this);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    /* JADX INFO: renamed from: i */
    public final zzdc iterator() {
        return r().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return r().listIterator(0);
    }
}
