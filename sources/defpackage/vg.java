package defpackage;

import androidx.media3.common.util.BackgroundThreadStateHandler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BackgroundThreadStateHandler b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vg(BackgroundThreadStateHandler backgroundThreadStateHandler, Object obj, int i) {
        this.a = i;
        this.b = backgroundThreadStateHandler;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        BackgroundThreadStateHandler backgroundThreadStateHandler = this.b;
        switch (i) {
            case 0:
                backgroundThreadStateHandler.lambda$setStateInBackground$2(obj);
                break;
            default:
                backgroundThreadStateHandler.lambda$updateStateAsync$0(obj);
                break;
        }
    }
}
