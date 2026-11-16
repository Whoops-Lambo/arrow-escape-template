package com.google.android.exoplayer2.text;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.BundleableUtil;
import defpackage.d10;
import defpackage.d31;
import defpackage.y21;
import defpackage.y32;
import defpackage.z21;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class CueGroup implements Bundleable {
    public static final Bundleable.Creator<CueGroup> CREATOR;
    public static final CueGroup EMPTY_TIME_ZERO;
    private static final int FIELD_CUES = 0;
    private static final int FIELD_PRESENTATION_TIME_US = 1;
    public final d31 cues;
    public final long presentationTimeUs;

    /* JADX INFO: Access modifiers changed from: private */
    public static final CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        return new CueGroup(parcelableArrayList == null ? y32.e : BundleableUtil.fromBundleList(Cue.CREATOR, parcelableArrayList), bundle.getLong(keyForField(1)));
    }

    static {
        z21 z21Var = d31.b;
        EMPTY_TIME_ZERO = new CueGroup(y32.e, 0L);
        CREATOR = new d10(7);
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(keyForField(0), BundleableUtil.toBundleArrayList(filterOutBitmapCues(this.cues)));
        bundle.putLong(keyForField(1), this.presentationTimeUs);
        return bundle;
    }

    public CueGroup(List<Cue> list, long j) {
        this.cues = d31.A(list);
        this.presentationTimeUs = j;
    }

    private static d31 filterOutBitmapCues(List<Cue> list) {
        y21 y21VarX = d31.x();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bitmap == null) {
                y21VarX.a(list.get(i));
            }
        }
        return y21VarX.g();
    }
}
