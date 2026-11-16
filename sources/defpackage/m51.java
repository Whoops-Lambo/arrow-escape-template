package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m51 extends UnifiedNativeAdMapper {
    public final x41 a;
    public final boolean b;
    public final MediationAdLoadCallback c;
    public final b51 d;

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        setOverrideClickHandling(true);
        View view2 = (View) map.get("3001");
        View view3 = (View) map.get("3004");
        View view4 = (View) map.get("3003");
        View view5 = (View) map.get("3002");
        View view6 = (View) map.get("3005");
        View view7 = (View) map.get("3009");
        InMobiNativeViewData.Builder builder = new InMobiNativeViewData.Builder((ViewGroup) view);
        if (view2 != null) {
            builder.setTitleView(view2);
        }
        if (view3 != null) {
            builder.setDescriptionView(view3);
        }
        if (view4 instanceof ImageView) {
            builder.setIconView((ImageView) view4);
        }
        if (view5 != null) {
            builder.setCTAView(view5);
        }
        if (view6 != null) {
            builder.setAdvertiserView(view6);
        }
        if (view7 != null) {
            builder.setRatingView(view7);
        }
        ((InMobiNative) this.a.b).registerViewForTracking(builder.build());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        ((InMobiNative) this.a.b).unTrackViews();
    }

    public m51(x41 x41Var, Boolean bool, MediationAdLoadCallback mediationAdLoadCallback, b51 b51Var) {
        this.a = x41Var;
        this.b = bool.booleanValue();
        this.c = mediationAdLoadCallback;
        this.d = b51Var;
        setOverrideImpressionRecording(true);
    }
}
