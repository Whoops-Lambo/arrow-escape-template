package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ay;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import defpackage.bb3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class gm {
    private TextView ahm;
    private ahm ct;
    private ViewGroup fi;
    private View kgy;
    private boolean noq = false;
    private Context rz;
    private com.bytedance.sdk.openadsdk.core.kus.ahm.kgy uq;
    private bb3 yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
        void nu();

        boolean ra();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    private void ahm() {
        this.yo = null;
    }

    private void kgy(bb3 bb3Var, boolean z) {
        View view;
        String str;
        View view2;
        if (bb3Var == null || (view = this.kgy) == null || this.rz == null || view.getVisibility() == 0) {
            return;
        }
        ahm ahmVar = this.ct;
        if (ahmVar != null) {
            ahmVar.nu();
        }
        double dCeil = Math.ceil((bb3Var.c * 1.0d) / 1048576.0d);
        Context context = this.rz;
        if (z) {
            str = String.format(ay.kgy(context, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = ay.kgy(context, "tt_video_without_wifi_tips") + ay.kgy(this.rz, "tt_video_bytesize");
        }
        gbb.kgy(this.kgy, 0);
        gbb.kgy(this.ahm, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!gbb.uq(this.kgy) || (view2 = this.kgy) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rz() {
        if (this.rz == null) {
            return;
        }
        uq();
    }

    private void uq() {
        View view = this.kgy;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void kgy(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return;
        }
        this.fi = viewGroup;
        this.rz = com.bytedance.sdk.openadsdk.core.xh.kgy().getApplicationContext();
    }

    private void kgy(Context context, View view, boolean z) {
        ViewGroup.LayoutParams layoutParamsKgy;
        if (context == null || view == null || this.kgy != null || (layoutParamsKgy = kgy(this.fi)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.vs.ct ctVar = new com.bytedance.sdk.openadsdk.vs.ct(context);
        this.kgy = ctVar;
        ctVar.setLayoutParams(layoutParamsKgy);
        this.fi.addView(this.kgy);
        this.ahm = (TextView) this.kgy.findViewById(com.bytedance.sdk.openadsdk.utils.xh.vai);
        View viewFindViewById = this.kgy.findViewById(com.bytedance.sdk.openadsdk.utils.xh.ids);
        if (z) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.gm.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/gm$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_gm$1_onClick_a9e2f17e79aa18681338a92e9197a36f(view2);
                }

                public void safedk_gm$1_onClick_a9e2f17e79aa18681338a92e9197a36f(View p0) {
                    gm.this.rz();
                    if (gm.this.uq != null) {
                        gm.this.uq.kgy(kgy.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams kgy(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void kgy(com.bytedance.sdk.openadsdk.core.kus.ahm.kgy kgyVar, ahm ahmVar) {
        this.ct = ahmVar;
        this.uq = kgyVar;
    }

    public boolean kgy(int i, bb3 bb3Var, boolean z) {
        Context context = this.rz;
        if (context == null || bb3Var == null) {
            return true;
        }
        kgy(context, this.fi, z);
        this.yo = bb3Var;
        if (i == 1 || i == 2) {
            return kgy(i);
        }
        return true;
    }

    private boolean kgy(int i) {
        ahm ahmVar;
        if (kgy() || this.noq) {
            return true;
        }
        if (this.uq != null && (ahmVar = this.ct) != null) {
            if (ahmVar.ra()) {
                this.uq.ct(null, null);
            }
            this.uq.kgy(kgy.PAUSE_VIDEO, (String) null);
        }
        kgy(this.yo, true);
        return false;
    }

    public void kgy(boolean z) {
        if (z) {
            ahm();
        }
        uq();
    }

    public boolean kgy() {
        View view = this.kgy;
        return view != null && view.getVisibility() == 0;
    }
}
