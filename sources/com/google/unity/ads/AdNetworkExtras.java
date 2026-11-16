package com.google.unity.ads;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface AdNetworkExtras {
    Bundle buildExtras(HashMap<String, String> map);

    Class<? extends MediationExtrasReceiver> getAdapterClass();
}
