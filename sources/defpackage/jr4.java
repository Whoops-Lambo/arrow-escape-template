package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jr4 implements Iterator {
    public static final jr4 a;
    public static final /* synthetic */ jr4[] b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgvz.g("no calls to next() since the last call to remove()", false);
    }

    static {
        jr4 jr4Var = new jr4("INSTANCE", 0);
        a = jr4Var;
        b = new jr4[]{jr4Var};
    }

    public static jr4[] values() {
        return (jr4[]) b.clone();
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }
}
