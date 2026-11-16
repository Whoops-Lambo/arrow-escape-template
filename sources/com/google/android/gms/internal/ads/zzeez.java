package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ku4;
import defpackage.rc4;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeez extends com.google.android.gms.ads.internal.client.zzds {
    public final HashMap a = new HashMap();
    public final Context b;
    public final WeakReference c;
    public final zzeen d;
    public final zzher e;
    public zzeec f;

    public final synchronized void O3(Object obj, String str) {
        this.a.put(str, obj);
        P3(S3(obj));
    }

    public final synchronized void P3(String str) {
        try {
            zzcha zzchaVarD = this.f.d(str);
            int i = 0;
            rc4 rc4Var = new rc4(this, i);
            zzchaVarD.addListener(new ku4(i, zzchaVarD, rc4Var), this.e);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTester.setAdAsOutOfContext", e);
            this.d.b();
        }
    }

    public final synchronized void Q3(String str) {
        try {
            zzcha zzchaVarD = this.f.d(str);
            rc4 rc4Var = new rc4(this, 1);
            zzchaVarD.addListener(new ku4(0, zzchaVarD, rc4Var), this.e);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTester.setAdAsShown", e);
            this.d.b();
        }
    }

    public static String S3(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzdxVarZzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzdxVarZzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final Context R3() {
        Context context = (Context) this.c.get();
        return context == null ? this.b : context;
    }

    public zzeez(Context context, WeakReference weakReference, zzeen zzeenVar, zzher zzherVar) {
        this.b = context;
        this.c = weakReference;
        this.d = zzeenVar;
        this.e = zzherVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        String string;
        String string2;
        String string3;
        Context context = (Context) ObjectWrapper.z1(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.z1(iObjectWrapper2);
        if (context != null && viewGroup != null) {
            HashMap map = this.a;
            Object obj = map.get(str);
            if (obj != null) {
                map.remove(str);
            }
            if (obj instanceof AdView) {
                AdView adView = (AdView) obj;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setTag("layout");
                zzefb.b(linearLayout, -1, -1);
                linearLayout.setGravity(17);
                linearLayout.addView(adView);
                adView.setTag("ad_view");
                viewGroup.addView(linearLayout);
                return;
            }
            if (obj instanceof NativeAd) {
                NativeAd nativeAd = (NativeAd) obj;
                NativeAdView nativeAdView = new NativeAdView(context);
                nativeAdView.setTag("ad_view_tag");
                zzefb.b(nativeAdView, -1, -1);
                viewGroup.addView(nativeAdView);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setTag("layout_tag");
                linearLayout2.setOrientation(1);
                zzefb.b(linearLayout2, -1, -1);
                linearLayout2.setBackgroundColor(-1);
                nativeAdView.addView(linearLayout2);
                Resources resourcesC = com.google.android.gms.ads.internal.zzt.zzh().c();
                if (resourcesC == null) {
                    string = "Headline";
                } else {
                    string = resourcesC.getString(R.string.native_headline);
                }
                linearLayout2.addView(zzefb.a(context, string, android.R.style.TextAppearance.Small, -9210245, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "headline_header_tag"));
                String headline = nativeAd.getHeadline();
                if (headline == null) {
                    headline = "";
                }
                View viewA = zzefb.a(context, headline, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
                nativeAdView.setHeadlineView(viewA);
                linearLayout2.addView(viewA);
                if (resourcesC == null) {
                    string2 = "Body";
                } else {
                    string2 = resourcesC.getString(R.string.native_body);
                }
                linearLayout2.addView(zzefb.a(context, string2, android.R.style.TextAppearance.Small, -9210245, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "body_header_tag"));
                String body = nativeAd.getBody();
                if (body == null) {
                    body = "";
                }
                View viewA2 = zzefb.a(context, body, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
                nativeAdView.setBodyView(viewA2);
                linearLayout2.addView(viewA2);
                if (resourcesC == null) {
                    string3 = "Media View";
                } else {
                    string3 = resourcesC.getString(R.string.native_media_view);
                }
                linearLayout2.addView(zzefb.a(context, string3, android.R.style.TextAppearance.Small, -9210245, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "media_view_header_tag"));
                MediaView mediaView = new MediaView(context);
                mediaView.setTag("media_view_tag");
                nativeAdView.setMediaView(mediaView);
                linearLayout2.addView(mediaView);
                nativeAdView.setNativeAd(nativeAd);
            }
        }
    }
}
