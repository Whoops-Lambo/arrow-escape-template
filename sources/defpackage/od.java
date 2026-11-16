package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class od {
    public final nd a;
    public final String b;
    public final File c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return this.a.equals(odVar.a) && this.b.equals(odVar.b) && this.c.equals(odVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }

    public od(nd ndVar, String str, File file) {
        this.a = ndVar;
        if (str != null) {
            this.b = str;
            this.c = file;
        } else {
            d.w("Null sessionId");
            throw null;
        }
    }
}
