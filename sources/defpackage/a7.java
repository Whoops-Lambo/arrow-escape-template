package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.farimarwat.grizzly.ReportActivity;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.R;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.ui.e;
import com.google.android.exoplayer2.ui.k;
import com.google.android.exoplayer2.ui.m;
import com.google.android.exoplayer2.util.Util;
import com.google.android.material.datepicker.h;
import com.inmobi.media.Ao;
import com.inmobi.media.Bo;
import com.mbridge.msdk.config.component.style.StyleCpt;
import com.mbridge.msdk.config.dynamic.baseview.ComponentButton;
import com.mbridge.msdk.config.dynamic.baseview.ComponentFrameLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentGridView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentInduceClickView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentListView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentScrollView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentTextView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.SoundImageView;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.usercentrics.sdk.ui.components.UCButton;
import com.vungle.ads.NativeAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k4 k4Var;
        int i = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                Ao.a((Bo) obj, view);
                return;
            case 1:
                cs csVar = (cs) obj;
                EditText editText = csVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                csVar.p();
                return;
            case 2:
                ((ComponentButton) obj).a(view);
                return;
            case 3:
                ((ComponentFrameLayout) obj).a(view);
                return;
            case 4:
                ((ComponentGridView) obj).a(view);
                return;
            case 5:
                ((ComponentHorizontalScrollView) obj).a(view);
                return;
            case 6:
                ((ComponentImageView) obj).a(view);
                return;
            case 7:
                ((ComponentInduceClickView) obj).a(view);
                return;
            case 8:
                ((ComponentLinearLayout) obj).a(view);
                return;
            case 9:
                ((ComponentListView) obj).a(view);
                return;
            case 10:
                ((ComponentRelativeLayout) obj).a(view);
                return;
            case 11:
                ((ComponentScrollView) obj).a(view);
                return;
            case 12:
                ((ComponentTextView) obj).a(view);
                return;
            case 13:
                ((ComponentWebView) obj).a(view);
                return;
            case 14:
                ((we0) obj).t();
                return;
            case 15:
                yc1 yc1Var = (yc1) obj;
                yc1Var.b.dismiss();
                Object tag = view.getTag();
                String str = tag instanceof String ? (String) tag : null;
                if (str == null || (k4Var = yc1Var.c) == null) {
                    return;
                }
                k4Var.invoke(str);
                return;
            case 16:
                ((h) obj).d();
                throw null;
            case 17:
                ((MaxNativeAd) obj).performClick();
                return;
            case 18:
                ((MoreOfferContainerView) obj).b(view);
                return;
            case 19:
                NativeAd.a((NativeAd) obj, view);
                return;
            case 20:
                fu1 fu1Var = (fu1) obj;
                EditText editText2 = fu1Var.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = fu1Var.f;
                if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    z = true;
                }
                EditText editText4 = fu1Var.f;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    fu1Var.f.setSelection(selectionEnd);
                }
                fu1Var.p();
                return;
            case 21:
                ReportActivity.loadViews$lambda$1((ReportActivity) obj, view);
                return;
            case 22:
                ((SoundImageView) obj).a(view);
                return;
            case 23:
                ((StyleCpt) obj).d(view);
                return;
            case 24:
                ((StyledPlayerControlView) obj).onFullScreenButtonClicked(view);
                return;
            case 25:
                StyledPlayerControlView styledPlayerControlView = ((e) obj).l;
                if (styledPlayerControlView.player == null) {
                    return;
                }
                ((Player) Util.castNonNull(styledPlayerControlView.player)).setTrackSelectionParameters(styledPlayerControlView.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
                styledPlayerControlView.settingsAdapter.k[1] = styledPlayerControlView.getResources().getString(R.string.exo_track_selection_auto);
                styledPlayerControlView.settingsWindow.dismiss();
                return;
            case 26:
                com.google.android.exoplayer2.ui.h hVar = (com.google.android.exoplayer2.ui.h) obj;
                hVar.h.onSettingViewClicked(hVar.getAdapterPosition());
                return;
            case 27:
                StyledPlayerControlView styledPlayerControlView2 = ((k) obj).l;
                if (styledPlayerControlView2.player != null) {
                    styledPlayerControlView2.player.setTrackSelectionParameters(styledPlayerControlView2.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).build());
                    styledPlayerControlView2.settingsWindow.dismiss();
                    return;
                }
                return;
            case 28:
                m mVar = (m) obj;
                mVar.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    mVar.q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        mVar.r.start();
                        return;
                    }
                    return;
                }
            default:
                int i2 = UCButton.u;
                ((sr0) obj).invoke();
                return;
        }
    }
}
