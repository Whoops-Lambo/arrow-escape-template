package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdct {
    public IHsdpDeepLinkServiceWrapper a;

    public final synchronized IHsdpDeepLinkServiceWrapper a(Context context) {
        IHsdpDeepLinkServiceWrapper iHsdpDeepLinkServiceWrapper = this.a;
        if (iHsdpDeepLinkServiceWrapper != null) {
            return iHsdpDeepLinkServiceWrapper;
        }
        IHsdpDeepLinkServiceWrapper iHsdpDeepLinkServiceWrapperAsInterface = IHsdpDeepLinkServiceWrapper.Stub.asInterface((IBinder) context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.ads.internal.client.hsdp.HsdpDeepLinkServiceWrapper").getConstructor(null).newInstance(null));
        this.a = iHsdpDeepLinkServiceWrapperAsInterface;
        return iHsdpDeepLinkServiceWrapperAsInterface;
    }
}
