package com.google.android.exoplayer2;

import android.os.Bundle;
import defpackage.ak1;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Rating implements Bundleable {
    public static final Bundleable.Creator<Rating> CREATOR = new ak1(28);
    static final int FIELD_RATING_TYPE = 0;
    static final int RATING_TYPE_HEART = 0;
    static final int RATING_TYPE_PERCENTAGE = 1;
    static final int RATING_TYPE_STAR = 2;
    static final int RATING_TYPE_THUMB = 3;
    static final int RATING_TYPE_UNSET = -1;
    static final float RATING_UNSET = -1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static Rating fromBundle(Bundle bundle) {
        int i = bundle.getInt(keyForField(0), -1);
        if (i == 0) {
            return (Rating) HeartRating.CREATOR.fromBundle(bundle);
        }
        if (i == 1) {
            return (Rating) PercentageRating.CREATOR.fromBundle(bundle);
        }
        if (i == 2) {
            return (Rating) StarRating.CREATOR.fromBundle(bundle);
        }
        if (i == 3) {
            return (Rating) ThumbRating.CREATOR.fromBundle(bundle);
        }
        defpackage.d.r(pv1.k(i, "Unknown RatingType: "));
        return null;
    }

    public abstract boolean isRated();

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }
}
