package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2391Vc<T> implements Comparator<T> {
    @Override // java.util.Comparator
    public abstract int compare(@ParametricNullness T left, @ParametricNullness T right);

    public static <C extends Comparable> AbstractC2391Vc<C> A03() {
        return C9Y.A01;
    }

    public static <T> AbstractC2391Vc<T> A04(Comparator<T> comparator) {
        if (comparator instanceof AbstractC2391Vc) {
            return (AbstractC2391Vc) comparator;
        }
        return new C18579r(comparator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vc != com.google.common.collect.Ordering<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wy != com.google.common.base.Function<F, ? extends T> */
    public final <F> AbstractC2391Vc<F> A05(InterfaceC2435Wy<F, ? extends T> function) {
        return new C18629w(function, this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vc != com.google.common.collect.Ordering<T> */
    public <S extends T> AbstractC2391Vc<S> A06() {
        return new C9V(this);
    }
}
