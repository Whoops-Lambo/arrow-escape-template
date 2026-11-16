package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.media.AbstractC3889am;
import com.inmobi.media.AbstractC4038g4;
import com.inmobi.media.AbstractC4147k2;
import com.inmobi.media.AbstractC4151k6;
import com.inmobi.media.AbstractC4221mk;
import com.inmobi.media.AbstractC4249nk;
import com.inmobi.media.AbstractC4563z4;
import com.inmobi.media.C3913bi;
import com.inmobi.media.C4036g2;
import com.inmobi.media.C4207m6;
import com.inmobi.media.C4287p2;
import com.inmobi.media.C9;
import com.inmobi.media.J4;
import com.inmobi.media.Kc;
import com.inmobi.media.Y5;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.s71;
import defpackage.ue0;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001)B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ!\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\rJ\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\rJ\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b(\u0010\rR$\u0010.\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u001cR$\u00106\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/inmobi/ads/InMobiAudio;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "Laz2;", "load", "()V", "show", "", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/inmobi/ads/listeners/AudioAdEventListener;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "", "widthInDp", "heightInDp", "setAudioSize", "(II)V", "setupViewSizeObserver", CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "destroy", "a", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", "getMPubListener$media_release", "()Lcom/inmobi/ads/listeners/AudioAdEventListener;", "setMPubListener$media_release", "mPubListener", "Lcom/inmobi/media/p2;", "b", "Lcom/inmobi/media/p2;", "getMAdManager$media_release", "()Lcom/inmobi/media/p2;", "setMAdManager$media_release", "(Lcom/inmobi/media/p2;)V", "mAdManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiAudio extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public AudioAdEventListener mPubListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public C4287p2 mAdManager;
    public final WeakReference c;
    public final C3913bi d;
    public long e;
    public int f;
    public int g;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiAudio$a;", "Lcom/inmobi/media/k2;", "Lcom/inmobi/ads/InMobiAudio;", "audio", "<init>", "(Lcom/inmobi/ads/InMobiAudio;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "Laz2;", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends AbstractC4147k2 {
        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiAudio inMobiAudio) {
            super(inMobiAudio);
            inMobiAudio.getClass();
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            AudioAdEventListener mPubListener;
            status.getClass();
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio != null && (mPubListener = inMobiAudio.getMPubListener()) != null) {
                mPubListener.onAdLoadFailed(inMobiAudio, status);
            }
        }

        @Override // com.inmobi.media.AbstractC4147k2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            info.getClass();
            super.onAdFetchSuccessful(info);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio != null) {
                try {
                    C4287p2 mAdManager = inMobiAudio.getMAdManager();
                    if (mAdManager != null) {
                        mAdManager.k();
                    }
                } catch (IllegalStateException e) {
                    Kc.a((byte) 1, "InMobiAudio", e.getMessage());
                    AudioAdEventListener mPubListener = inMobiAudio.getMPubListener();
                    if (mPubListener != null) {
                        mPubListener.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    public static long a(String str) {
        try {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = s71.h(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            StringBuilder sb = new StringBuilder(str.subSequence(i, length + 1).toString());
            if (!"plid-".equalsIgnoreCase(sb.substring(0, 5))) {
                Kc.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
                Kc.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
                return Long.MIN_VALUE;
            }
            String strSubstring = sb.substring(5, sb.length());
            strSubstring.getClass();
            int length2 = strSubstring.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length2) {
                boolean z4 = s71.h(strSubstring.charAt(!z3 ? i2 : length2), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    }
                    length2--;
                } else if (z4) {
                    i2++;
                } else {
                    z3 = true;
                }
            }
            return Long.parseLong(strSubstring.subSequence(i2, length2 + 1).toString());
        } catch (NumberFormatException unused) {
            Kc.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Audio creation failed.");
            Kc.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (StringIndexOutOfBoundsException unused2) {
            Kc.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Kc.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
    }

    public static final boolean access$hasValidSize(InMobiAudio inMobiAudio) {
        return inMobiAudio.f > 0 && inMobiAudio.g > 0;
    }

    private final String getFrameSizeString() {
        return this.f + "x" + this.g;
    }

    public final void b() {
        C4287p2 c4287p2;
        C4036g2 c4036g2;
        try {
            J4 j4 = AbstractC4563z4.a;
            if (!((AdConfig) j4.a(AdConfig.class)).getAudio().getIsAudioEnabled()) {
                C4287p2 c4287p3 = this.mAdManager;
                if (c4287p3 != null) {
                    c4287p3.a((short) 107);
                }
                C4287p2 c4287p4 = this.mAdManager;
                if (c4287p4 != null) {
                    c4287p4.a(c4287p4.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                Kc.a((byte) 1, "InMobi", "");
                return;
            }
            C3913bi c3913bi = this.d;
            c3913bi.getClass();
            c3913bi.h = "NonAB";
            Context context = getContext();
            context.getClass();
            C4287p2 c4287p5 = this.mAdManager;
            if (c4287p5 != null) {
                c4287p5.a(context, this.d, getFrameSizeString());
            }
            C4287p2 c4287p6 = this.mAdManager;
            if (c4287p6 != null && (c4036g2 = c4287p6.j) != null && c4036g2.b == 7) {
                C4287p2 c4287p7 = this.mAdManager;
                if (c4287p7 != null) {
                    c4287p7.b((short) 15);
                }
                AudioAdEventListener audioAdEventListener = this.mPubListener;
                if (audioAdEventListener != null) {
                    audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                Kc.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            if (!a()) {
                C4287p2 c4287p8 = this.mAdManager;
                if (c4287p8 != null) {
                    c4287p8.a((short) 108);
                }
                C4287p2 c4287p9 = this.mAdManager;
                if (c4287p9 != null) {
                    c4287p9.a(c4287p9.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            if (((AdConfig) j4.a(AdConfig.class)).getAudio().getMinDeviceVolume() > Y5.a.a(AbstractC4221mk.a, AbstractC4221mk.g)) {
                C4287p2 c4287p10 = this.mAdManager;
                if (c4287p10 != null) {
                    c4287p10.a((short) 106);
                }
                C4287p2 c4287p11 = this.mAdManager;
                if (c4287p11 != null) {
                    c4287p11.a(c4287p11.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (this.f <= 0 || this.g <= 0) {
                ((Handler) AbstractC3889am.a.getValue()).postDelayed(new ue0(this, 9), 200L);
                return;
            }
            long j = this.e;
            if (j == 0 || (c4287p2 = this.mAdManager) == null || c4287p2.a(j)) {
                this.e = SystemClock.elapsedRealtime();
                C4287p2 c4287p12 = this.mAdManager;
                if (c4287p12 != null) {
                    c4287p12.b(getFrameSizeString());
                }
            }
        } catch (Exception e) {
            C4287p2 c4287p13 = this.mAdManager;
            if (c4287p13 != null) {
                c4287p13.a((short) 105);
            }
            Kc.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
            e.getMessage();
        }
    }

    public final void disableHardwareAcceleration() {
        this.d.e = true;
    }

    @Nullable
    /* JADX INFO: renamed from: getMAdManager$media_release, reason: from getter */
    public final C4287p2 getMAdManager() {
        return this.mAdManager;
    }

    @Nullable
    /* JADX INFO: renamed from: getMPubListener$media_release, reason: from getter */
    public final AudioAdEventListener getMPubListener() {
        return this.mPubListener;
    }

    @UiThread
    public final void load() {
        C4287p2 c4287p2 = this.mAdManager;
        if (c4287p2 != null) {
            c4287p2.g();
        }
        b();
    }

    public final void pause() {
        C4287p2 c4287p2;
        try {
            if (this.c != null || (c4287p2 = this.mAdManager) == null) {
                return;
            }
            c4287p2.i();
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            e.getMessage();
        }
    }

    public final void resume() {
        C4287p2 c4287p2;
        try {
            if (this.c != null || (c4287p2 = this.mAdManager) == null) {
                return;
            }
            c4287p2.l();
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
            e.getMessage();
        }
    }

    public final void setAudioSize(@IntRange int widthInDp, @IntRange int heightInDp) {
        this.f = widthInDp;
        this.g = heightInDp;
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (str != null && !TextUtils.isEmpty(str)) {
                AbstractC4249nk.b = str;
            }
            String str2 = extras.get("tp-v");
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                AbstractC4249nk.a = str2;
            }
        }
        this.d.d = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.d.c = keywords;
    }

    public final void setMAdManager$media_release(@Nullable C4287p2 c4287p2) {
        this.mAdManager = c4287p2;
    }

    public final void setMPubListener$media_release(@Nullable AudioAdEventListener audioAdEventListener) {
        this.mPubListener = audioAdEventListener;
    }

    @UiThread
    public final void show() {
        C4287p2 c4287p2 = this.mAdManager;
        if (c4287p2 != null) {
            c4287p2.n();
        }
        C4287p2 c4287p3 = this.mAdManager;
        if (c4287p3 != null) {
            c4287p3.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        a aVar = new a(this);
        C3913bi c3913bi = new C3913bi();
        this.d = c3913bi;
        if (AbstractC4221mk.c()) {
            if (context instanceof Activity) {
                this.c = new WeakReference(context);
            }
            this.mAdManager = new C4287p2(aVar);
            String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
            if (attributeValue != null) {
                long jA = a(attributeValue);
                if (jA != Long.MIN_VALUE) {
                    c3913bi.a = jA;
                } else {
                    throw new InvalidPlacementIdException();
                }
            }
            Context context2 = getContext();
            context2.getClass();
            C4287p2 c4287p2 = this.mAdManager;
            if (c4287p2 != null) {
                c4287p2.a(context2, c3913bi, getFrameSizeString());
                return;
            }
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }

    @UiThread
    public final void destroy() {
        removeAllViews();
        C4287p2 c4287p2 = this.mAdManager;
        if (c4287p2 != null) {
            c4287p2.h();
        }
        this.mPubListener = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            C4287p2 c4287p2 = this.mAdManager;
            if (c4287p2 != null) {
                c4287p2.j();
            }
            if (getLayoutParams() != null) {
                this.f = AbstractC4038g4.b(getLayoutParams().width / AbstractC4151k6.b());
                this.g = AbstractC4038g4.b(getLayoutParams().height / AbstractC4151k6.b());
            }
            if (this.f <= 0 || this.g <= 0) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C4207m6 c4207m6 = AbstractC4151k6.a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                rootWindowInsets.getClass();
                AbstractC4151k6.a(rootWindowInsets, context);
            }
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
            e.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            C4287p2 c4287p2 = this.mAdManager;
            if (c4287p2 != null) {
                c4287p2.p();
            }
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
            e.getMessage();
        }
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        contentUrl.getClass();
        this.d.f = contentUrl;
    }

    public final void setListener(@NotNull AudioAdEventListener listener) {
        listener.getClass();
        this.mPubListener = listener;
    }

    @TargetApi(16)
    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new C9(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, long j) {
        super(context);
        context.getClass();
        a aVar = new a(this);
        C3913bi c3913bi = new C3913bi();
        this.d = c3913bi;
        if (AbstractC4221mk.c()) {
            if (context instanceof Activity) {
                this.c = new WeakReference(context);
            }
            C4287p2 c4287p2 = new C4287p2(aVar);
            this.mAdManager = c4287p2;
            c3913bi.a = j;
            c4287p2.a(context, c3913bi, getFrameSizeString());
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }

    public static final void a(InMobiAudio inMobiAudio) {
        C4287p2 c4287p2;
        try {
            if (inMobiAudio.f > 0 && inMobiAudio.g > 0) {
                long j = inMobiAudio.e;
                if (j == 0 || (c4287p2 = inMobiAudio.mAdManager) == null || c4287p2.a(j)) {
                    inMobiAudio.e = SystemClock.elapsedRealtime();
                    C4287p2 c4287p3 = inMobiAudio.mAdManager;
                    if (c4287p3 != null) {
                        c4287p3.b(inMobiAudio.getFrameSizeString());
                        return;
                    }
                    return;
                }
                return;
            }
            Kc.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            C4287p2 c4287p4 = inMobiAudio.mAdManager;
            if (c4287p4 != null) {
                c4287p4.a((short) 108);
            }
            C4287p2 c4287p5 = inMobiAudio.mAdManager;
            if (c4287p5 != null) {
                c4287p5.a(c4287p5.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception e) {
            C4287p2 c4287p6 = inMobiAudio.mAdManager;
            if (c4287p6 != null) {
                c4287p6.a((short) 105);
            }
            Kc.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
            e.getMessage();
        }
    }

    public final boolean a() {
        if (this.f <= 0 || this.g <= 0) {
            if (getLayoutParams() == null) {
                Kc.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
                if (getLayoutParams() != null) {
                    this.f = AbstractC4038g4.b(getLayoutParams().width / AbstractC4151k6.b());
                    this.g = AbstractC4038g4.b(getLayoutParams().height / AbstractC4151k6.b());
                }
            } else {
                Kc.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
        }
        return true;
    }
}
