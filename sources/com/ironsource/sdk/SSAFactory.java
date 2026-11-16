package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.InterfaceC4889ne;
import com.ironsource.W9;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class SSAFactory {
    public static InterfaceC4889ne getPublisherInstance(Activity activity) throws Exception {
        return W9.b((Context) activity);
    }

    public static InterfaceC4889ne getPublisherTestInstance(Activity activity, int i) throws Exception {
        return W9.a(activity, i);
    }
}
