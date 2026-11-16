package defpackage;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class lr0 implements MediaDrm.OnExpirationUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lr0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.media.MediaDrm.OnExpirationUpdateListener
    public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((FrameworkMediaDrm) obj2).lambda$setOnExpirationUpdateListener$3((ExoMediaDrm.OnExpirationUpdateListener) obj, mediaDrm, bArr, j);
                break;
            default:
                ((androidx.media3.exoplayer.drm.FrameworkMediaDrm) obj2).lambda$setOnExpirationUpdateListener$3((androidx.media3.exoplayer.drm.ExoMediaDrm.OnExpirationUpdateListener) obj, mediaDrm, bArr, j);
                break;
        }
    }
}
