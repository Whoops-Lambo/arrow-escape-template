package defpackage;

import com.ironsource.C4868mb;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4868mb b;
    public final /* synthetic */ LevelPlayAdInfo c;

    public /* synthetic */ gf3(C4868mb c4868mb, LevelPlayAdInfo levelPlayAdInfo, int i) {
        this.a = i;
        this.b = c4868mb;
        this.c = levelPlayAdInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        LevelPlayAdInfo levelPlayAdInfo = this.c;
        C4868mb c4868mb = this.b;
        switch (i) {
            case 0:
                C4868mb.a(c4868mb, levelPlayAdInfo);
                break;
            default:
                C4868mb.b(c4868mb, levelPlayAdInfo);
                break;
        }
    }
}
