package defpackage;

import android.util.Base64;
import androidx.media3.datasource.DataSourceBitmapLoader;
import com.facebook.appevents.p;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager;
import io.p071bidmachine.media3.exoplayer.analytics.h;
import io.p071bidmachine.media3.exoplayer.j;
import io.p071bidmachine.media3.exoplayer.video.l;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i50 implements ol2 {
    public final /* synthetic */ int a;

    public /* synthetic */ i50(int i) {
        this.a = i;
    }

    @Override // defpackage.ol2
    public final Object get() {
        switch (this.a) {
            case 0:
                return DataSourceBitmapLoader.lambda$static$0();
            case 1:
                return DefaultPlaybackSessionManager.generateDefaultSessionId();
            case 2:
                return androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.generateDefaultSessionId();
            case 3:
                return new DefaultLoadControl();
            case 4:
                return new androidx.media3.exoplayer.DefaultLoadControl();
            case 5:
                throw new IllegalStateException();
            case 6:
                return new j();
            case 7:
                byte[] bArr = new byte[12];
                h.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                try {
                    Class<?> cls = Class.forName("io.bidmachine.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (l) objInvoke;
                } catch (Exception e) {
                    p.g(e);
                    return null;
                }
        }
    }
}
