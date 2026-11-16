package defpackage;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mr0 implements MediaDrm.OnEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mr0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((FrameworkMediaDrm) obj2).lambda$setOnEventListener$1((ExoMediaDrm.OnEventListener) obj, mediaDrm, bArr, i, i2, bArr2);
                break;
            default:
                ((androidx.media3.exoplayer.drm.FrameworkMediaDrm) obj2).lambda$setOnEventListener$1((androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener) obj, mediaDrm, bArr, i, i2, bArr2);
                break;
        }
    }
}
