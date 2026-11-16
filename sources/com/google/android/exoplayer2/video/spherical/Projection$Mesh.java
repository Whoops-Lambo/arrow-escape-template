package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Projection$Mesh {
    private final Projection$SubMesh[] subMeshes;

    public Projection$SubMesh getSubMesh(int i) {
        return this.subMeshes[i];
    }

    public int getSubMeshCount() {
        return this.subMeshes.length;
    }

    public Projection$Mesh(Projection$SubMesh... projection$SubMeshArr) {
        this.subMeshes = projection$SubMeshArr;
    }
}
