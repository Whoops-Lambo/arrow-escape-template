package com.google.android.exoplayer2.source;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.d31;
import defpackage.e32;
import defpackage.n30;
import defpackage.pv1;
import defpackage.y32;
import defpackage.z21;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class TrackGroup implements Bundleable {
    public static final Bundleable.Creator<TrackGroup> CREATOR = new e32(25);
    private static final int FIELD_FORMATS = 0;
    private static final int FIELD_ID = 1;
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;
    public final String id;
    public final int length;
    public final int type;

    /* JADX INFO: Access modifiers changed from: private */
    public static TrackGroup lambda$static$0(Bundle bundle) {
        Collection collectionFromBundleList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        if (parcelableArrayList == null) {
            z21 z21Var = d31.b;
            collectionFromBundleList = y32.e;
        } else {
            collectionFromBundleList = BundleableUtil.fromBundleList(Format.CREATOR, parcelableArrayList);
        }
        return new TrackGroup(bundle.getString(keyForField(1), ""), (Format[]) collectionFromBundleList.toArray(new Format[0]));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.id.equals(trackGroup.id) && Arrays.equals(this.formats, trackGroup.formats)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    private static void logErrorMessage(String str, @Nullable String str2, @Nullable String str3, int i) {
        StringBuilder sbR = pv1.r("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbR.append(str3);
        sbR.append("' (track ");
        sbR.append(i);
        sbR.append(")");
        Log.e(TAG, "", new IllegalStateException(sbR.toString()));
    }

    private static String normalizeLanguage(@Nullable String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int normalizeRoleFlags(int i) {
        return i | 16384;
    }

    private void verifyCorrectness() {
        String strNormalizeLanguage = normalizeLanguage(this.formats[0].language);
        int iNormalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return;
            }
            boolean zEquals = strNormalizeLanguage.equals(normalizeLanguage(formatArr[i].language));
            Format[] formatArr2 = this.formats;
            if (!zEquals) {
                logErrorMessage("languages", formatArr2[0].language, formatArr2[i].language, i);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(formatArr2[i].roleFlags)) {
                    logErrorMessage("role flags", Integer.toBinaryString(this.formats[0].roleFlags), Integer.toBinaryString(this.formats[i].roleFlags), i);
                    return;
                }
                i++;
            }
        }
    }

    @CheckResult
    public TrackGroup copyWithId(String str) {
        return new TrackGroup(str, this.formats);
    }

    public Format getFormat(int i) {
        return this.formats[i];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = n30.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.id) + Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.formats.length);
        for (Format format : this.formats) {
            arrayList.add(format.toBundle(true));
        }
        bundle.putParcelableArrayList(keyForField(0), arrayList);
        bundle.putString(keyForField(1), this.id);
        return bundle;
    }

    public TrackGroup(String str, Format... formatArr) {
        boolean z;
        if (formatArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        int trackType = MimeTypes.getTrackType(formatArr[0].sampleMimeType);
        this.type = trackType == -1 ? MimeTypes.getTrackType(formatArr[0].containerMimeType) : trackType;
        verifyCorrectness();
    }

    public TrackGroup(Format... formatArr) {
        this("", formatArr);
    }
}
