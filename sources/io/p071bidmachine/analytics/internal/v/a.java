package io.p071bidmachine.analytics.internal.v;

import defpackage.s71;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private final String a;
    private final EnumC1613a b;
    private final Date c;
    private final boolean d;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.v.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum EnumC1613a {
        INAPP_CONSUMABLE,
        INAPP_NON_CONSUMABLE,
        SUBS_AUTO_RENEWABLE,
        SUBS_NON_AUTO_RENEWABLE
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s71.b(this.a, aVar.a) && this.b == aVar.b && s71.b(this.c, aVar.c) && this.d == aVar.d;
    }

    public static /* synthetic */ a a(a aVar, String str, EnumC1613a enumC1613a, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.a;
        }
        if ((i & 2) != 0) {
            enumC1613a = aVar.b;
        }
        if ((i & 4) != 0) {
            date = aVar.c;
        }
        if ((i & 8) != 0) {
            z = aVar.d;
        }
        return aVar.a(str, enumC1613a, date, z);
    }

    public final EnumC1613a b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        boolean z = this.d;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public a(String str, EnumC1613a enumC1613a, Date date, boolean z) {
        this.a = str;
        this.b = enumC1613a;
        this.c = date;
        this.d = z;
    }

    public String toString() {
        return super.toString();
    }

    public final a a(String str, EnumC1613a enumC1613a, Date date, boolean z) {
        return new a(str, enumC1613a, date, z);
    }

    public final Date a() {
        return this.c;
    }
}
