package com.inmobi.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.AbstractC3992ee;
import com.inmobi.media.AbstractC4221mk;
import com.inmobi.media.AbstractC4249nk;
import com.inmobi.media.Ad;
import com.inmobi.media.Ba;
import com.inmobi.media.C3938cf;
import com.inmobi.media.C3965de;
import com.inmobi.media.C4191li;
import com.inmobi.media.C4299pe;
import com.inmobi.media.C4411tf;
import com.inmobi.media.Kc;
import com.inmobi.media.Nk;
import com.inmobi.media.U9;
import com.inmobi.media.Y9;
import com.inmobi.media.Z9;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.ironsource.Ue;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gd1;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\f\u0018\u0000 K2\u00020\u0001:\u0002LKB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010!J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b&\u0010!J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b*\u0010!J\u000f\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020\n2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000204¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u000201¢\u0006\u0004\b@\u00103J#\u0010C\u001a\u00020\n2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bI\u0010GJ\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010\u0018¨\u0006M"}, d2 = {"Lcom/inmobi/ads/InMobiNative;", "", "Landroid/content/Context;", "context", "", "placementId", "Lcom/inmobi/ads/listeners/NativeAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/NativeAdEventListener;)V", "Laz2;", "setListener", "(Lcom/inmobi/ads/listeners/NativeAdEventListener;)V", "Lcom/inmobi/ads/listeners/VideoEventListener;", "setVideoEventListener", "(Lcom/inmobi/ads/listeners/VideoEventListener;)V", "Lcom/inmobi/ads/InMobiNative$LockScreenListener;", "lockScreenListener", "showOnLockScreen", "(Lcom/inmobi/ads/InMobiNative$LockScreenListener;)V", "", Ue.n, "load", "([B)V", "()V", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;", "inMobiNativeViewData", "registerViewForTracking", "(Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;)V", "unTrackViews", "takeAction", "", "getAdTitle", "()Ljava/lang/String;", "getAdDescription", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeImage;", "getAdIcon", "()Lcom/inmobi/media/ads/nativeAd/InMobiNativeImage;", "getCtaText", "", "getAdRating", "()F", "getAdvertiserName", "Lcom/inmobi/media/ads/nativeAd/MediaView;", "getMediaView", "()Lcom/inmobi/media/ads/nativeAd/MediaView;", "Landroid/view/View;", "getAdChoiceIcon", "()Landroid/view/View;", "", "isVideo", "()Z", "", "minBidToWin", "notifyWin", "(D)V", "", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "Lorg/json/JSONObject;", "getAdContent", "()Lorg/json/JSONObject;", "isReady", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "destroy", "Companion", "LockScreenListener", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiNative {

    @NotNull
    public static final String APP_INSTALLS = "AppInstalls";

    @NotNull
    public static final String LIKES = "Likes";
    public final C3965de a;
    public static final String b = "InMobiNative";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/inmobi/ads/InMobiNative$LockScreenListener;", "", "Lcom/inmobi/ads/InMobiNative;", "nativeAd", "Laz2;", "onActionRequired", "(Lcom/inmobi/ads/InMobiNative;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LockScreenListener {
        void onActionRequired(@NotNull InMobiNative nativeAd);
    }

    public final void destroy() {
        C3965de c3965de = this.a;
        c3965de.getClass();
        try {
            c3965de.e = null;
            C4191li c4191li = c3965de.b;
            c4191li.a = null;
            c4191li.b = null;
            c4191li.c = null;
            c3965de.c.c.clear();
            c3965de.d.b.j();
        } catch (Exception e) {
            String str = AbstractC3992ee.a;
            str.getClass();
            Kc.a((byte) 1, str, "Failed to destroy ad; SDK encountered an unexpected error");
            gd1 gd1Var = Ba.a;
            U9.a(e);
        }
    }

    @Nullable
    public final View getAdChoiceIcon() {
        C3938cf c3938cf = this.a.e;
        if (c3938cf != null) {
            return c3938cf.j;
        }
        return null;
    }

    @Nullable
    public final JSONObject getAdContent() {
        C3938cf c3938cf = this.a.e;
        if (c3938cf != null) {
            return c3938cf.e;
        }
        return null;
    }

    @Nullable
    public final String getAdDescription() {
        C3938cf c3938cf = this.a.e;
        if (c3938cf != null) {
            return c3938cf.b;
        }
        return null;
    }

    @Nullable
    public final InMobiNativeImage getAdIcon() {
        C3938cf c3938cf = this.a.e;
        if (c3938cf != null) {
            return c3938cf.c;
        }
        return null;
    }

    public final float getAdRating() {
        Float f;
        C3938cf c3938cf = this.a.e;
        return (c3938cf == null || (f = c3938cf.g) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f.floatValue();
    }

    @Nullable
    public final String getAdTitle() {
        C3938cf c3938cf = this.a.e;
        if (c3938cf != null) {
            return c3938cf.a;
        }
        return null;
    }

    @Nullable
    public final String getAdvertiserName() {
        C3938cf c3938cf = this.a.e;
        if (c3938cf != null) {
            return c3938cf.f;
        }
        return null;
    }

    @Nullable
    public final String getCtaText() {
        C3938cf c3938cf = this.a.e;
        if (c3938cf != null) {
            return c3938cf.d;
        }
        return null;
    }

    @Nullable
    public final MediaView getMediaView() {
        C3938cf c3938cf = this.a.e;
        if (c3938cf != null) {
            return c3938cf.i;
        }
        return null;
    }

    public final boolean isReady() {
        return this.a.e != null;
    }

    public final boolean isVideo() {
        C3938cf c3938cf = this.a.e;
        if (c3938cf != null) {
            return c3938cf.h;
        }
        return false;
    }

    public final void load(@Nullable byte[] response) {
        C3965de c3965de = this.a;
        c3965de.a.h = "AB";
        c3965de.d.b.a(response);
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String strA = this.a.d.b.a(lossReason, auctionPrice);
        if (strA.length() > 0) {
            Kc.a((byte) 1, "InMobiNative", strA);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String strA = this.a.d.b.a(minBidToWin);
        if (strA.length() > 0) {
            Kc.a((byte) 1, "InMobiNative", strA);
        }
    }

    public final void setContentUrl(@Nullable String contentUrl) {
        this.a.a.f = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        C3965de c3965de = this.a;
        if (extras != null) {
            c3965de.getClass();
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                AbstractC4249nk.b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                AbstractC4249nk.a = str2;
            }
        }
        c3965de.a.d = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.a.a.c = keywords;
    }

    public final void takeAction() {
        Ad ad = this.a.d.b;
        Nk nk = ad.c;
        C4299pe c4299pe = nk instanceof C4299pe ? (C4299pe) nk : null;
        if (c4299pe != null) {
            Y9 y9L = c4299pe.l();
            if (y9L != null) {
                ((Z9) y9L).a("AUM-NativeLoadedState", "takeAction - delegating to ad unit");
            }
            c4299pe.h.a();
        }
        Nk nk2 = ad.c;
        C4411tf c4411tf = nk2 instanceof C4411tf ? (C4411tf) nk2 : null;
        if (c4411tf != null) {
            Y9 y9L2 = c4411tf.l();
            if (y9L2 != null) {
                ((Z9) y9L2).a("AUM-NativeRenderedState", "takeAction - delegating to ad unit");
            }
            c4411tf.f.a();
        }
    }

    public final void unTrackViews() {
        this.a.d.b.d();
    }

    public InMobiNative(@NotNull Context context, long j, @NotNull NativeAdEventListener nativeAdEventListener) {
        context.getClass();
        nativeAdEventListener.getClass();
        C3965de c3965de = new C3965de(this, context, j);
        this.a = c3965de;
        if (AbstractC4221mk.c()) {
            c3965de.b.a = nativeAdEventListener;
        } else {
            String str = b;
            str.getClass();
            throw new SdkNotInitializedException(str);
        }
    }

    public final void registerViewForTracking(@NotNull InMobiNativeViewData inMobiNativeViewData) {
        inMobiNativeViewData.getClass();
        C3965de c3965de = this.a;
        c3965de.getClass();
        c3965de.d.a(inMobiNativeViewData);
    }

    public final void setListener(@NotNull NativeAdEventListener listener) {
        listener.getClass();
        C3965de c3965de = this.a;
        c3965de.getClass();
        c3965de.b.a = listener;
    }

    public final void setVideoEventListener(@NotNull VideoEventListener listener) {
        listener.getClass();
        C3965de c3965de = this.a;
        c3965de.getClass();
        c3965de.b.b = listener;
    }

    public final void showOnLockScreen(@NotNull LockScreenListener lockScreenListener) {
        lockScreenListener.getClass();
        C3965de c3965de = this.a;
        c3965de.getClass();
        c3965de.a.g = true;
        c3965de.b.c = lockScreenListener;
    }

    public final void load() {
        C3965de c3965de = this.a;
        c3965de.a.h = "NonAB";
        c3965de.d.b.c();
    }
}
