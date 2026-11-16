package defpackage;

import android.media.MediaPlayer;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ai3 c;

    public /* synthetic */ xh3(ai3 ai3Var, boolean z, int i) {
        this.a = i;
        this.c = ai3Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.b;
        ai3 ai3Var = this.c;
        switch (i) {
            case 0:
                if (!ai3Var.fi() && ai3Var.ra != null) {
                    try {
                        ai3Var.uf = z;
                        MediaPlayer mediaPlayer = ((xa3) ai3Var.ra).i;
                        if (mediaPlayer != null) {
                            if (z) {
                                mediaPlayer.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            } else {
                                mediaPlayer.setVolume(1.0f, 1.0f);
                            }
                        }
                    } catch (Throwable th) {
                        rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIdH7T8=", "Sfsj", 1291);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (ai3Var.ra != null) {
                    ((xa3) ai3Var.ra).h = z;
                }
                break;
        }
    }
}
