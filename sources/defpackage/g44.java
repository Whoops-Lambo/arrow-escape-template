package defpackage;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.ads.zzcly;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g44 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcly b;

    public /* synthetic */ g44(zzcly zzclyVar, int i) {
        this.a = i;
        this.b = zzclyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzcly zzclyVar = this.b;
        switch (i) {
            case 0:
                zzclyVar.destroy();
                break;
            case 1:
                zzclyVar.destroy();
                break;
            case 2:
                zzclyVar.onPause();
                break;
            case 3:
                zzclyVar.onResume();
                break;
            case 4:
                zzclyVar.destroy();
                break;
            case 5:
                zzclyVar.m("onSdkImpression", new ArrayMap(0));
                break;
            case 6:
                zzclyVar.destroy();
                break;
            default:
                zzclyVar.e();
                break;
        }
    }
}
