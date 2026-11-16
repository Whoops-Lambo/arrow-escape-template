package com.bytedance.sdk.openadsdk.sx.kgy;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.noq.dg;
import com.bytedance.sdk.component.noq.fi;
import com.bytedance.sdk.component.noq.nu;
import com.bytedance.sdk.component.noq.ra;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.ra.uq;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.sx.kgy.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0283kgy {
        void kgy(int i, String str, Throwable th);

        void kgy(String str, ahm ahmVar);
    }

    public void kgy(com.bytedance.sdk.openadsdk.sx.kgy kgyVar, final InterfaceC0283kgy interfaceC0283kgy, int i, int i2, ImageView.ScaleType scaleType, String str, final int i3, ioy ioyVar) {
        ra raVarKgy = uq.kgy(kgyVar.kgy).kgy(kgyVar.ahm).kgy(i).ahm(i2).ct(gbb.noq(xh.kgy())).uq(gbb.uq(xh.kgy())).ahm(str).kgy(scaleType).kgy(!TextUtils.isEmpty(str));
        if (i3 <= 0 || Build.VERSION.SDK_INT < 26) {
            raVarKgy.rz(1);
        } else {
            raVarKgy.rz(2).kgy(new fi() { // from class: com.bytedance.sdk.openadsdk.sx.kgy.kgy.1
                @Override // com.bytedance.sdk.component.noq.fi
                public Bitmap kgy(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.uq.kgy.kgy(xh.kgy(), bitmap, i3);
                }
            });
        }
        raVarKgy.kgy(new com.bytedance.sdk.openadsdk.ra.ahm(ioyVar, kgyVar.kgy, new dg() { // from class: com.bytedance.sdk.openadsdk.sx.kgy.kgy.2
            @Override // com.bytedance.sdk.component.noq.dg
            public void kgy(nu nuVar) {
                kgy.this.kgy(nuVar, interfaceC0283kgy);
            }

            @Override // com.bytedance.sdk.component.noq.dg
            public void kgy(int i4, String str2, Throwable th) {
                kgy.this.kgy(i4, str2, th, interfaceC0283kgy);
            }
        }));
    }

    public void kgy(nu nuVar, InterfaceC0283kgy interfaceC0283kgy) {
        if (interfaceC0283kgy != null) {
            Object objAhm = nuVar.ahm();
            int iKgy = kgy(nuVar);
            if (objAhm instanceof Drawable) {
                interfaceC0283kgy.kgy(nuVar.kgy(), new ahm((Drawable) objAhm, iKgy));
                return;
            }
            if (objAhm instanceof byte[]) {
                interfaceC0283kgy.kgy(nuVar.kgy(), new ahm((byte[]) objAhm, iKgy));
                return;
            }
            if (objAhm instanceof Bitmap) {
                interfaceC0283kgy.kgy(nuVar.kgy(), new ahm((Bitmap) objAhm, nuVar.rz() instanceof Bitmap ? (Bitmap) nuVar.rz() : null, iKgy));
            } else {
                interfaceC0283kgy.kgy(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int kgy(nu nuVar) {
        Object obj;
        Map<String, String> mapUq = nuVar.uq();
        if (mapUq == null || (obj = mapUq.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void kgy(int i, String str, Throwable th, InterfaceC0283kgy interfaceC0283kgy) {
        if (interfaceC0283kgy != null) {
            interfaceC0283kgy.kgy(i, str, th);
        }
    }
}
