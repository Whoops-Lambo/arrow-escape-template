package defpackage;

import com.google.android.exoplayer2.video.spherical.Projection$Mesh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zz1 {
    public final Projection$Mesh a;
    public final Projection$Mesh b;
    public final int c;
    public final boolean d;

    public zz1(Projection$Mesh projection$Mesh, Projection$Mesh projection$Mesh2, int i) {
        boolean z;
        this.a = projection$Mesh;
        this.b = projection$Mesh2;
        this.c = i;
        if (projection$Mesh == projection$Mesh2) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
    }
}
