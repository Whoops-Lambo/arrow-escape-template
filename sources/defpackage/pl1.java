package defpackage;

import com.adsurge.adn.B.b;
import com.applovin.impl.communicator.MessagingServiceImpl;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class pl1 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ pl1(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return MessagingServiceImpl.a(runnable);
            case 1:
                return b.a(runnable);
            default:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
        }
    }
}
