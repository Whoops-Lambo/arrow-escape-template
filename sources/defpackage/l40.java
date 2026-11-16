package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l40 extends NativeAdMapper {
    public final MediationAdLoadCallback a;
    public MediationNativeAdCallback b;
    public InneractiveAdSpot c;
    public NativeAdContent d;

    public static final void a(l40 l40Var, String str, InneractiveErrorCode inneractiveErrorCode) {
        Log.e("DTExchangeNativeAdMapper", str);
        MediationAdLoadCallback mediationAdLoadCallback = l40Var.a;
        if (inneractiveErrorCode == null) {
            inneractiveErrorCode = InneractiveErrorCode.SDK_INTERNAL_ERROR;
        }
        mediationAdLoadCallback.onFailure(g40.a(inneractiveErrorCode));
        InneractiveAdSpot inneractiveAdSpot = l40Var.c;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        l40Var.c = null;
    }

    public l40(MediationAdLoadCallback mediationAdLoadCallback) {
        mediationAdLoadCallback.getClass();
        this.a = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void destroy() {
        super.destroy();
        InneractiveAdSpot inneractiveAdSpot = this.c;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.c = null;
        NativeAdContent nativeAdContent = this.d;
        if (nativeAdContent != null) {
            nativeAdContent.destroy();
        }
        this.d = null;
        this.b = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 int, still in use, count: 1, list:
  (r3v0 int) from 0x0048: IF  (r3v0 int) != (1567014 int)  -> B:14:0x004a A[HIDDEN] (LINE:74)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        MediaView mediaView;
        MediaView mediaView2;
        String str;
        view.getClass();
        map.getClass();
        map2.getClass();
        view.setTag(NativeAdContent.ViewTag.ROOT);
        NativeAdContent nativeAdContent = this.d;
        if (nativeAdContent != null) {
            mediaView = nativeAdContent.getMediaView();
        } else {
            mediaView = null;
        }
        if (mediaView != null) {
            mediaView.setTag(NativeAdContent.ViewTag.MEDIA_VIEW);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (str2.hashCode() != 1567014) {
                switch (str2) {
                    case "3001":
                        str = NativeAdContent.ViewTag.AD_TITLE;
                        break;
                    case "3002":
                        str = NativeAdContent.ViewTag.CTA;
                        break;
                    case "3003":
                        str = NativeAdContent.ViewTag.AD_ICON;
                        break;
                    case "3004":
                        str = NativeAdContent.ViewTag.AD_DESCRIPTION;
                        break;
                    default:
                        str = NativeAdContent.ViewTag.OTHER;
                        break;
                }
            } else if (!str2.equals("3009")) {
                str = NativeAdContent.ViewTag.OTHER;
            } else {
                str = NativeAdContent.ViewTag.RATING;
            }
            view2.setTag(str);
        }
        NativeAdContent nativeAdContent2 = this.d;
        if (nativeAdContent2 != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (nativeAdContent2 != null) {
                mediaView2 = nativeAdContent2.getMediaView();
            } else {
                mediaView2 = null;
            }
            nativeAdContent2.registerViewsForInteraction(viewGroup, mediaView2, null, map.values());
        }
    }
}
