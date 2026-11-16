package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ŀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC0387 extends AbstractC1224 implements View.OnClickListener {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f812 = StringFog.decrypt("8eZqpcjY9iXX+12sz97vLdvrRrvAz/Ib\n", "vogpyaG7nWk=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0389 f813;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f813.mo457(this, view);
        } catch (Throwable th) {
            AbstractC1290.m905(f812, StringFog.decrypt("J5EYyOMFgeNCjj7F3Uyb+QeND9WxSobODooJzA==\n", "YuNqp5El6I0=\n"), th, false);
        }
        Object obj = this.f3723;
        if (obj != null) {
            ((View.OnClickListener) obj).onClick(view);
        }
    }

    public ViewOnClickListenerC0387(View.OnClickListener onClickListener, InterfaceC0389 interfaceC0389) {
        super(onClickListener);
        this.f813 = interfaceC0389;
    }
}
