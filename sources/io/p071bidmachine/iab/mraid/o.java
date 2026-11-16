package io.p071bidmachine.iab.mraid;

import defpackage.nj;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class o {
    public final String a;
    public final Date b;
    public String c;
    public String d;
    public Date e;
    public String f;
    public String g;
    public String h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a.equals(oVar.a) && this.b.equals(oVar.b) && Objects.equals(this.c, oVar.c) && Objects.equals(this.d, oVar.d) && Objects.equals(this.e, oVar.e) && Objects.equals(this.f, oVar.f) && Objects.equals(this.g, oVar.g) && Objects.equals(this.h, oVar.h);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MraidCalendarEvent{description='");
        sb.append(this.a);
        sb.append("', start=");
        sb.append(this.b);
        sb.append(", location='");
        sb.append(this.c);
        sb.append("', summary='");
        sb.append(this.d);
        sb.append("', end=");
        sb.append(this.e);
        sb.append(", status='");
        sb.append(this.f);
        sb.append("', transparency='");
        sb.append(this.g);
        sb.append("', recurrence='");
        return nj.q(sb, this.h, "'}");
    }

    public o(String str, Date date) {
        this.a = str;
        this.b = date;
    }
}
