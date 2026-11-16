package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC4045gb;
import com.inmobi.media.AbstractC4151k6;
import com.inmobi.media.AbstractC4221mk;
import com.inmobi.media.AbstractC4230n1;
import com.inmobi.media.AbstractC4249nk;
import com.inmobi.media.Ba;
import com.inmobi.media.C3913bi;
import com.inmobi.media.C3917bm;
import com.inmobi.media.C4073hb;
import com.inmobi.media.C4101ib;
import com.inmobi.media.C4128jb;
import com.inmobi.media.C4156kb;
import com.inmobi.media.Kc;
import com.inmobi.media.U9;
import com.inmobi.media.V9;
import com.ironsource.Ue;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.gd1;
import defpackage.s71;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0002GHB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\n2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u0012J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020(¢\u0006\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010E\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010\u0012\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial;", "", "Landroid/content/Context;", "context", "", "placementId", "Lcom/inmobi/ads/listeners/InterstitialAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "Laz2;", "setListener", "(Lcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "", "keywords", "setKeywords", "(Ljava/lang/String;)V", "getSignals", "()V", "", Ue.n, "load", "([B)V", "loadAdUnit", "show", "(Landroid/content/Context;)V", "", "isReady", "()Z", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "disableHardwareAcceleration", "", "minBidToWin", "notifyWin", "(D)V", "", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "Lcom/inmobi/media/gb;", "mPubListener", "Lcom/inmobi/media/gb;", "getMPubListener$media_release", "()Lcom/inmobi/media/gb;", "setMPubListener$media_release", "(Lcom/inmobi/media/gb;)V", "Lcom/inmobi/media/kb;", "mAdManager", "Lcom/inmobi/media/kb;", "getMAdManager$media_release", "()Lcom/inmobi/media/kb;", "setMAdManager$media_release", "(Lcom/inmobi/media/kb;)V", "Lcom/inmobi/ads/PreloadManager;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", "Companion", "a", "com/inmobi/media/V9", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiInterstitial {

    @NotNull
    public static final V9 Companion = new V9();
    public final Context a;
    public boolean b;
    public final WeakReference c;
    public final C3913bi d;
    public final a e;
    public final e f;
    public C4156kb mAdManager;
    public AbstractC4045gb mPubListener;

    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    @UiThread
    public final void load() {
        try {
            this.b = true;
            this.d.h = "NonAB";
            C4156kb mAdManager$media_release = getMAdManager$media_release();
            C3913bi c3913bi = this.d;
            Context context = this.a;
            if (context == null) {
                s71.D("mContext");
                throw null;
            }
            mAdManager$media_release.a(c3913bi, context, true, "intHtml");
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC4151k6.c((Context) this.c.get());
            }
            loadAdUnit();
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            e.getMessage();
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            gd1 gd1Var = Ba.a;
            U9.a(e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial$a;", "Lcom/inmobi/media/jb;", "Lcom/inmobi/ads/InMobiInterstitial;", "interstitial", "<init>", "(Lcom/inmobi/ads/InMobiInterstitial;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "Laz2;", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C4128jb {
        @Override // com.inmobi.media.C4128jb, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiInterstitial inMobiInterstitial) {
            super(inMobiInterstitial);
            inMobiInterstitial.getClass();
        }

        @Override // com.inmobi.media.C4128jb, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            AbstractC4045gb mPubListener$media_release;
            status.getClass();
            InMobiInterstitial inMobiInterstitial = this.a.get();
            if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
                mPubListener$media_release.a(inMobiInterstitial, status);
            }
        }

        @Override // com.inmobi.media.C4128jb, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            info.getClass();
            super.onAdFetchSuccessful(info);
            InMobiInterstitial inMobiInterstitial = this.a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().i();
                } catch (IllegalStateException e) {
                    String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    strAccess$getTAG$cp.getClass();
                    Kc.a((byte) 1, strAccess$getTAG$cp, e.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().a(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    public final void a(Activity activity) {
        try {
            if (this.b) {
                getMAdManager$media_release().a(activity);
            } else {
                Kc.a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
            }
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            e.getMessage();
            gd1 gd1Var = Ba.a;
            U9.a(e);
        }
    }

    public final void disableHardwareAcceleration() {
        this.d.e = true;
    }

    @NotNull
    public final C4156kb getMAdManager$media_release() {
        C4156kb c4156kb = this.mAdManager;
        if (c4156kb != null) {
            return c4156kb;
        }
        s71.D("mAdManager");
        throw null;
    }

    @NotNull
    public final AbstractC4045gb getMPubListener$media_release() {
        AbstractC4045gb abstractC4045gb = this.mPubListener;
        if (abstractC4045gb != null) {
            return abstractC4045gb;
        }
        s71.D("mPubListener");
        throw null;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.f;
    }

    public final void getSignals() {
        C3913bi c3913bi = this.d;
        c3913bi.getClass();
        c3913bi.h = "AB";
        C4156kb mAdManager$media_release = getMAdManager$media_release();
        C3913bi c3913bi2 = this.d;
        Context context = this.a;
        if (context == null) {
            s71.D("mContext");
            throw null;
        }
        mAdManager$media_release.a(c3913bi2, context, false, "getToken");
        getMAdManager$media_release().a(this.e);
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String strA = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Kc.a((byte) 1, "InMobi", "loss notification failed to trigger");
            return;
        }
        C4156kb mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC4230n1 abstractC4230n1F = mAdManager$media_release.f();
            strA = abstractC4230n1F != null ? abstractC4230n1F.a(lossReason, auctionPrice) : null;
        }
        if (strA != null) {
            Kc.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String strA = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Kc.a((byte) 1, "InMobi", "win notification failed to trigger");
            return;
        }
        C4156kb mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC4230n1 abstractC4230n1F = mAdManager$media_release.f();
            strA = abstractC4230n1F != null ? abstractC4230n1F.a(minBidToWin) : null;
        }
        if (strA != null) {
            Kc.a((byte) 1, "InMobi", strA);
        }
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                AbstractC4249nk.b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                AbstractC4249nk.a = str2;
            }
        }
        this.d.d = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.d.c = keywords;
    }

    public InMobiInterstitial(@NotNull Context context, long j, @NotNull InterstitialAdEventListener interstitialAdEventListener) {
        context.getClass();
        interstitialAdEventListener.getClass();
        C3913bi c3913bi = new C3913bi();
        this.d = c3913bi;
        this.e = new a(this);
        this.f = new e(this);
        if (AbstractC4221mk.c()) {
            this.a = context.getApplicationContext();
            c3913bi.a = j;
            this.c = new WeakReference(context);
            setMPubListener$media_release(new C4073hb(interstitialAdEventListener));
            setMAdManager$media_release(new C4156kb());
            return;
        }
        throw new SdkNotInitializedException("InMobiInterstitial");
    }

    public final boolean isReady() {
        boolean z;
        C4101ib c4101ib;
        C3917bm c3917bm;
        C4156kb mAdManager$media_release = getMAdManager$media_release();
        C4101ib c4101ib2 = mAdManager$media_release.h;
        if (c4101ib2 != null && 2 == mAdManager$media_release.a && c4101ib2.b == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (((c4101ib = getMAdManager$media_release().h) == null || (c3917bm = c4101ib.I) == null || !c3917bm.b) && c4101ib != null)) {
            c4101ib.c0();
        }
        return z;
    }

    @VisibleForTesting
    public final void loadAdUnit() {
        getMAdManager$media_release().b(this.e);
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        contentUrl.getClass();
        this.d.f = contentUrl;
    }

    public final void setListener(@NotNull InterstitialAdEventListener listener) {
        listener.getClass();
        setMPubListener$media_release(new C4073hb(listener));
    }

    public final void setMAdManager$media_release(@NotNull C4156kb c4156kb) {
        c4156kb.getClass();
        this.mAdManager = c4156kb;
    }

    public final void setMPubListener$media_release(@NotNull AbstractC4045gb abstractC4045gb) {
        abstractC4045gb.getClass();
        this.mPubListener = abstractC4045gb;
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        watermarkData.getClass();
        getMAdManager$media_release().a(watermarkData);
    }

    @UiThread
    public final void show(@NotNull Context context) {
        context.getClass();
        if (context instanceof Activity) {
            a((Activity) context);
        } else {
            Kc.a((byte) 1, "InMobiInterstitial", "Activity context is required to show interstitial ad as expected");
            a(null);
        }
    }

    @UiThread
    public final void show() {
        a(null);
    }

    public final void load(@Nullable byte[] response) {
        this.b = true;
        this.d.h = "AB";
        C4156kb mAdManager$media_release = getMAdManager$media_release();
        C3913bi c3913bi = this.d;
        Context context = this.a;
        if (context != null) {
            mAdManager$media_release.a(c3913bi, context, true, "intHtml");
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC4151k6.c((Context) this.c.get());
            }
            getMAdManager$media_release().a(response, this.e);
            return;
        }
        s71.D("mContext");
        throw null;
    }
}
