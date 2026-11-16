package io.p071bidmachine;

import android.content.Context;
import defpackage.n30;
import defpackage.pv1;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k0 implements b, x0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public Object mo1394get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return BuildInfo.lambda$new$0((Context) obj);
            case 1:
            default:
                return n30.y("Load network from json config completed successfully: ", ((NetworkConfig) obj).getNetworkKey());
            case 2:
                NetworkAdapter networkAdapter = (NetworkAdapter) obj;
                return pv1.o("Initialization completed: ", networkAdapter.obtainNetworkSdkVersion(), ", ", networkAdapter.getAdapterVersion());
            case 3:
                return "Dispatching event to server - " + ((TrackEventType) obj);
        }
    }
}
