package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Rf {

    @NotNull
    private final Lf a;

    @NotNull
    private final Sf b;

    @NotNull
    private final W8 c;

    private final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.b.a(str, adFormat, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d) {
        this.a.a(d);
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.a.a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, C4676bg.a.a(Boolean.valueOf(this.a.c())));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, C4676bg.a.a(Boolean.valueOf(this.a.d())));
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.a.e();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.a.f();
    }

    public Rf(@NotNull Lf lf, @NotNull W8 w8, @NotNull Sf sf) {
        lf.getClass();
        w8.getClass();
        sf.getClass();
        this.a = lf;
        this.b = sf;
        this.c = w8;
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.c.onClosed();
    }

    @JavascriptInterface
    public final void loadBannerAd(@Nullable String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, int i, int i2) {
        str2.getClass();
        str3.getClass();
        this.a.a(new Tf(str2, z, Boolean.valueOf(z2), str), str3, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(@Nullable String str, @NotNull String str2, boolean z, boolean z2) {
        str2.getClass();
        this.a.b(new Tf(str2, z, Boolean.valueOf(z2), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(@Nullable String str, @NotNull String str2, boolean z, boolean z2) {
        str2.getClass();
        this.a.c(new Tf(str2, z, Boolean.valueOf(z2), str));
    }

    @JavascriptInterface
    public final void loadInterstitialAd(@NotNull String str, boolean z, boolean z2) {
        str.getClass();
        loadInterstitialAd(null, str, z, z2);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(@NotNull String str, boolean z, boolean z2) {
        str.getClass();
        loadRewardedVideoAd(null, str, z, z2);
    }

    @JavascriptInterface
    public final void loadBannerAd(@NotNull String str, boolean z, boolean z2, @NotNull String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        loadBannerAd(null, str, z, z2, str2, i, i2);
    }
}
