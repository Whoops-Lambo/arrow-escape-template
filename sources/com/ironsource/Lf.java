package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import defpackage.be1;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Lf {

    @NotNull
    private final V8.a a;

    @NotNull
    private final WeakReference<TestSuiteActivity> b;

    @NotNull
    private final Handler c;

    @NotNull
    private final AtomicReference<LevelPlayBannerAdView> d;

    @NotNull
    private final AtomicReference<LevelPlayInterstitialAd> e;

    @NotNull
    private final AtomicReference<LevelPlayRewardedAd> f;

    public final boolean d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    public Lf(@NotNull TestSuiteActivity testSuiteActivity, @NotNull Handler handler) {
        testSuiteActivity.getClass();
        handler.getClass();
        this.a = Pb.w.a().d();
        this.b = new WeakReference<>(testSuiteActivity);
        this.c = handler;
        this.d = new AtomicReference<>();
        this.e = new AtomicReference<>();
        this.f = new AtomicReference<>();
    }

    public final void a(@NotNull Tf tf, @NotNull String str, int i, int i2) {
        tf.getClass();
        str.getClass();
        a();
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null) {
            return;
        }
        this.a.a(tf);
        a(tf);
        LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(Wf.a.b(str, i, i2)).build();
        AtomicReference<LevelPlayBannerAdView> atomicReference = this.d;
        String strB = tf.b();
        if (strB == null) {
            strB = "";
        }
        LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityB, strB, configBuild);
        levelPlayBannerAdView.setBannerListener(new Mf());
        levelPlayBannerAdView.pauseAutoRefresh();
        levelPlayBannerAdView.loadAd();
        atomicReference.set(levelPlayBannerAdView);
    }

    public final void b(@NotNull Tf tf) {
        tf.getClass();
        this.a.a(tf);
        a(tf);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.e;
        String strB = tf.b();
        if (strB == null) {
            strB = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strB);
        levelPlayInterstitialAd.setListener(new Qf());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final void c(@NotNull Tf tf) {
        tf.getClass();
        this.a.a(tf);
        a(tf);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f;
        String strB = tf.b();
        if (strB == null) {
            strB = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strB);
        levelPlayRewardedAd.setListener(new Zf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    public final void e() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null) {
            return;
        }
        LevelPlayInterstitialAd.showAd$default(this.e.get(), testSuiteActivityB, null, 2, null);
    }

    public final void f() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null) {
            return;
        }
        LevelPlayRewardedAd.showAd$default(this.f.get(), testSuiteActivityB, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView) {
        testSuiteActivity.getContainer().removeView(levelPlayBannerAdView);
    }

    public final boolean c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    private final TestSuiteActivity b() {
        return this.b.get();
    }

    public final void a(double d) {
        LevelPlayBannerAdView levelPlayBannerAdView;
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (levelPlayBannerAdView = this.d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.c.post(new be1(testSuiteActivityB, levelPlayBannerAdView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView) {
        testSuiteActivity.getContainer().addView(levelPlayBannerAdView, C4676bg.a.a((Context) testSuiteActivity));
    }

    public final void a() {
        LevelPlayBannerAdView andSet;
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (andSet = this.d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.c.post(new be1(testSuiteActivityB, andSet, 1));
    }

    private final void a(Tf tf) {
        String strA = tf.a();
        if (strA != null) {
            com.ironsource.mediationsdk.c.c().a(tf.c(), strA);
        } else {
            IronLog.INTERNAL.verbose("applyTestMode: adNetworkName is null");
        }
    }
}
