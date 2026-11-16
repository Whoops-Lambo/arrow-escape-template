package defpackage;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface wv {
    Provider f(l12 l12Var);

    Deferred j(l12 l12Var);

    Provider k(l12 l12Var);

    default Object e(Class cls) {
        return g(l12.a(cls));
    }

    default Object g(l12 l12Var) {
        Provider providerK = k(l12Var);
        if (providerK == null) {
            return null;
        }
        return providerK.get();
    }

    default Provider h(Class cls) {
        return k(l12.a(cls));
    }

    default Set l(l12 l12Var) {
        return (Set) f(l12Var).get();
    }
}
