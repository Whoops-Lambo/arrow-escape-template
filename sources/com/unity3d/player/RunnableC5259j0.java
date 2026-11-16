package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC5259j0 implements Runnable {
    public final /* synthetic */ PermissionRequest a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int[] c;

    public RunnableC5259j0(PermissionRequest permissionRequest, String[] strArr, int[] iArr) {
        this.a = permissionRequest;
        this.b = strArr;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.permissionResponse(this.b, this.c);
    }
}
