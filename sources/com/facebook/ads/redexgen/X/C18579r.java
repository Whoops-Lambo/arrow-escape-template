package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@ElementTypesAreNonnullByDefault
public final class C18579r<T> extends AbstractC2391Vc<T> implements Serializable {
    public static String[] A01 = {"jd2PMHFgk9oEsejcFA9BYpKwKpyOBexR", "QbwI2JA6APUsTj6Dqo1mljZEoQOnJDXi", "AXwPVw2hlqSpQqyx9v5FRClAk5JCVrJ", "oQTazoGa0vbPVcLrsjRMYdrxJP6IEsEe", "DVrB9FvE4PmZ9s3CKt8nFWblxgn2Z7ld", "8pYI9EB1vAvb2sOZQU", "ZPwPbhtz1P5eIwzCtREeErAPmYe1vJS2", "MXOVmtMTVjaNmkCD8DzkKZRqLhEQhhDs"};
    public static final long serialVersionUID = 0;
    public final Comparator<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9r != com.google.common.collect.ComparatorOrdering<T> */
    public C18579r(Comparator<T> comparator) {
        this.A00 = (Comparator) AbstractC2432Wu.A04(comparator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9r != com.google.common.collect.ComparatorOrdering<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2391Vc, java.util.Comparator
    public final int compare(@ParametricNullness T a, @ParametricNullness T b) {
        return this.A00.compare(a, b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9r != com.google.common.collect.ComparatorOrdering<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9r != com.google.common.collect.ComparatorOrdering<T> */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof C18579r) {
            Comparator<T> comparator = this.A00;
            Comparator<T> comparator2 = ((C18579r) object).A00;
            if (A01[6].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A01[5] = "9yqbsg4KPpWiq9";
            return comparator.equals(comparator2);
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9r != com.google.common.collect.ComparatorOrdering<T> */
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9r != com.google.common.collect.ComparatorOrdering<T> */
    public final String toString() {
        return this.A00.toString();
    }
}
