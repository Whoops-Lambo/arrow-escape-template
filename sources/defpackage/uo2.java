package defpackage;

import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class uo2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TestSuiteActivity b;

    public /* synthetic */ uo2(TestSuiteActivity testSuiteActivity, int i) {
        this.a = i;
        this.b = testSuiteActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TestSuiteActivity testSuiteActivity = this.b;
        switch (i) {
            case 0:
                TestSuiteActivity.a(testSuiteActivity);
                break;
            default:
                TestSuiteActivity.b(testSuiteActivity);
                break;
        }
    }
}
