package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zf extends dj2 {
    public final ag a;
    public final cg b;
    public final bg c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dj2)) {
            return false;
        }
        zf zfVar = (zf) ((dj2) obj);
        return this.a.equals(zfVar.a) && this.b.equals(zfVar.b) && this.c.equals(zfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }

    public zf(ag agVar, cg cgVar, bg bgVar) {
        this.a = agVar;
        this.b = cgVar;
        this.c = bgVar;
    }
}
