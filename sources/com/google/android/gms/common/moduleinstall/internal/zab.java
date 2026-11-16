package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final /* synthetic */ class zab implements Comparator {
    static final /* synthetic */ zab zaa = new zab();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj2;
        Feature feature2 = (Feature) obj;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        return !feature2.getName().equals(feature.getName()) ? feature2.getName().compareTo(feature.getName()) : Long.compare(feature2.getVersion(), feature.getVersion());
    }

    private /* synthetic */ zab() {
    }
}
