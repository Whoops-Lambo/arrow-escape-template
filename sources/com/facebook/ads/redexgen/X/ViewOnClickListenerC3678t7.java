package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3678t7 implements View.OnClickListener {
    public static String[] A01 = {"Vv5FfAmJbj1DWBwz1cnmO8YdvjH2dXTg", "Vk", "Og140H81ZKkTdd89dTXnvM5WMiUkVqOU", CmcdData.STREAM_TYPE_LIVE, "ZV8yFvN", "ZLvjXfbhtayfPu5dTUoCC8YBVzcskEH4", "1CU", "7PUp1YoqJXCOaTwE08JWfyRfSPJfIV7z"};
    public final /* synthetic */ F8 A00;

    public ViewOnClickListenerC3678t7(F8 f8) {
        this.A00 = f8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A08.A0F().AAa();
            if (this.A00.A05 != null) {
                this.A00.A05.AEP();
            }
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
            if (A01[2].charAt(4) != '0') {
                throw new RuntimeException();
            }
            A01[3] = "xjJ2L6BmMYLJnRX";
        }
    }
}
