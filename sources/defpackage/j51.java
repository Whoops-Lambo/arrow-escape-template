package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.source.preload.PreCacheHelper;
import com.facebook.g0;
import com.facebook.i0;
import com.inmobi.sdk.InMobiSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j51(Object obj, long j, long j2, int i) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        long j2 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                InMobiSdk.a((Context) obj, j2, j);
                break;
            case 1:
                ((PreCacheHelper) obj).lambda$preCache$0(j2, j);
                break;
            default:
                ((i0) ((g0) obj)).onProgress(j2, j);
                break;
        }
    }
}
