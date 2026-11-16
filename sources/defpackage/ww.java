package defpackage;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.t;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ww implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Map b;
    public final /* synthetic */ t c;

    public /* synthetic */ ww(t tVar, Map map) {
        this.c = tVar;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ConfigManager.a(this.c, this.b);
                break;
            default:
                ConfigManager.a(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ ww(Map map, t tVar) {
        this.b = map;
        this.c = tVar;
    }
}
