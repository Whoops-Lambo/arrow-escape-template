package defpackage;

import com.ironsource.Lf;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class be1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TestSuiteActivity b;
    public final /* synthetic */ LevelPlayBannerAdView c;

    public /* synthetic */ be1(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView, int i) {
        this.a = i;
        this.b = testSuiteActivity;
        this.c = levelPlayBannerAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        LevelPlayBannerAdView levelPlayBannerAdView = this.c;
        TestSuiteActivity testSuiteActivity = this.b;
        switch (i) {
            case 0:
                Lf.a(testSuiteActivity, levelPlayBannerAdView);
                break;
            default:
                Lf.b(testSuiteActivity, levelPlayBannerAdView);
                break;
        }
    }
}
