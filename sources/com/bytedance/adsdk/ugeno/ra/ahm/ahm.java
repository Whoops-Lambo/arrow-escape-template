package com.bytedance.adsdk.ugeno.ra.ahm;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm extends com.bytedance.adsdk.ugeno.ahm.kgy<com.bytedance.adsdk.ugeno.ra.ahm.kgy> {
    private com.bytedance.adsdk.ugeno.ra.ahm.kgy ax;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy extends com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy {
        protected int jpc;

        public kgy(com.bytedance.adsdk.ugeno.ahm.kgy kgyVar) {
            super(kgyVar);
            this.jpc = -1;
        }

        private int ahm(String str) {
            str.getClass();
            switch (str) {
                case "bottom":
                    return 80;
                case "center":
                    return 17;
                case "center_vertical":
                    return 16;
                case "top":
                    return 48;
                case "left":
                    return 3;
                case "right":
                    return 5;
                case "center_horizontal":
                    return 1;
                default:
                    return -1;
            }
        }

        private int kgy(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iAhm = 0;
            for (String str2 : strArrSplit) {
                iAhm |= ahm(str2);
            }
            return iAhm;
        }

        @Override // com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy
        public void kgy(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.kgy(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.jpc = kgy(str2);
            }
        }

        @Override // com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy
        /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams kgy() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.kgy, (int) this.ahm);
            layoutParams.leftMargin = (int) this.noq;
            layoutParams.rightMargin = (int) this.yo;
            layoutParams.topMargin = (int) this.fi;
            layoutParams.bottomMargin = (int) this.gf;
            layoutParams.gravity = this.jpc;
            return layoutParams;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy, com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        this.ax.setEventMap(this.wbb);
        super.ahm();
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy
    public com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy ra() {
        return new kgy(this);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.ra.ahm.kgy kgy() {
        com.bytedance.adsdk.ugeno.ra.ahm.kgy kgyVar = new com.bytedance.adsdk.ugeno.ra.ahm.kgy(this.ahm);
        this.ax = kgyVar;
        kgyVar.kgy(this);
        return this.ax;
    }

    public ahm(Context context) {
        super(context);
    }
}
