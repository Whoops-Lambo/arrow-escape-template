package defpackage;

import com.google.android.gms.internal.ads.zzcif;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v24 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcif b;

    public /* synthetic */ v24(zzcif zzcifVar, int i) {
        this.a = i;
        this.b = zzcifVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzcif zzcifVar = this.b;
        switch (i) {
            case 0:
                zzcifVar.c("surfaceCreated", new String[0]);
                break;
            case 1:
                zzcifVar.c("surfaceDestroyed", new String[0]);
                break;
            default:
                zzcifVar.c("firstFrameRendered", new String[0]);
                break;
        }
    }
}
