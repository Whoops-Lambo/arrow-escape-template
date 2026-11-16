package com.mbridge.msdk.out;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface Adapter {
    boolean init(Object... objArr);

    boolean loadAd(AdapterListener adapterListener);

    void registerView(Campaign campaign, View view);

    void registerView(Campaign campaign, View view, List<View> list);

    void unregisterView(Campaign campaign, View view);

    void unregisterView(Campaign campaign, View view, List<View> list);
}
