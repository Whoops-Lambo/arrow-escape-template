package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ct1 implements tr {
    public final Class a;

    @Override // defpackage.tr
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ct1) {
            return s71.b(this.a, ((ct1) obj).a);
        }
        return false;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    public final Collection getMembers() {
        throw new nc1();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }

    public ct1(Class cls) {
        cls.getClass();
        this.a = cls;
    }
}
