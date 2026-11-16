package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.internal.p002firebaseauthapi.zzu;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vv3 extends zzah {
    public final /* synthetic */ zv3 c;

    public vv3(zv3 zv3Var) {
        this.c = zv3Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zv3 zv3Var = this.c;
        zzu.a(i, zv3Var.f);
        Object[] objArr = zv3Var.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
