package defpackage;

import com.ironsource.Ha;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class tv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LevelPlayAdInfo b;
    public final /* synthetic */ Ha c;

    public /* synthetic */ tv0(LevelPlayAdInfo levelPlayAdInfo, Ha ha, int i) {
        this.a = i;
        this.b = levelPlayAdInfo;
        this.c = ha;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Ha ha = this.c;
        LevelPlayAdInfo levelPlayAdInfo = this.b;
        switch (i) {
            case 0:
                Ha.b(levelPlayAdInfo, ha);
                break;
            case 1:
                Ha.e(levelPlayAdInfo, ha);
                break;
            case 2:
                Ha.c(levelPlayAdInfo, ha);
                break;
            case 3:
                Ha.a(levelPlayAdInfo, ha);
                break;
            default:
                Ha.d(levelPlayAdInfo, ha);
                break;
        }
    }
}
