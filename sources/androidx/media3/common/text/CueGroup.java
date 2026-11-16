package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import defpackage.d31;
import defpackage.gq1;
import defpackage.kk;
import defpackage.ok;
import defpackage.ss1;
import defpackage.y21;
import defpackage.y32;
import defpackage.z21;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class CueGroup {
    private static final ss1 CUES_PRIORITY_COMPARATOR = new ok(new kk(2), gq1.a);

    @UnstableApi
    public static final CueGroup EMPTY_TIME_ZERO;
    private static final String FIELD_CUES;
    private static final String FIELD_PRESENTATION_TIME_US;
    public final d31 cues;

    @UnstableApi
    public final long presentationTimeUs;

    static {
        z21 z21Var = d31.b;
        EMPTY_TIME_ZERO = new CueGroup(y32.e, 0L);
        FIELD_CUES = Util.intToStringMaxRadix(0);
        FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    }

    @UnstableApi
    public static CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        return new CueGroup(parcelableArrayList == null ? y32.e : BundleCollectionUtil.fromBundleList(new kk(3), parcelableArrayList), bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$static$0(Cue cue) {
        return Integer.valueOf(cue.zIndex);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new kk(4)));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }

    @UnstableApi
    public CueGroup(List<Cue> list, long j) {
        this.cues = d31.J(CUES_PRIORITY_COMPARATOR, list);
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
