package defpackage;

import com.ironsource.C4689cb;
import com.unity3d.mediation.LevelPlayAdError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jc3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ C4689cb b;
    public final /* synthetic */ LevelPlayAdError c;

    public /* synthetic */ jc3(C4689cb c4689cb, LevelPlayAdError levelPlayAdError) {
        this.b = c4689cb;
        this.c = levelPlayAdError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        LevelPlayAdError levelPlayAdError = this.c;
        C4689cb c4689cb = this.b;
        switch (i) {
            case 0:
                C4689cb.a(levelPlayAdError, c4689cb);
                break;
            default:
                C4689cb.a(c4689cb, levelPlayAdError);
                break;
        }
    }

    public /* synthetic */ jc3(LevelPlayAdError levelPlayAdError, C4689cb c4689cb) {
        this.c = levelPlayAdError;
        this.b = c4689cb;
    }
}
