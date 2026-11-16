package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import defpackage.d31;
import defpackage.e32;
import defpackage.uj2;
import defpackage.vq2;
import defpackage.y32;
import defpackage.z21;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Tracks implements Bundleable {
    public static final Bundleable.Creator<Tracks> CREATOR;
    public static final Tracks EMPTY;
    private static final int FIELD_TRACK_GROUPS = 0;
    private final d31 groups;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Group implements Bundleable {
        public static final Bundleable.Creator<Group> CREATOR = new vq2(0);
        private static final int FIELD_ADAPTIVE_SUPPORTED = 4;
        private static final int FIELD_TRACK_GROUP = 0;
        private static final int FIELD_TRACK_SELECTED = 3;
        private static final int FIELD_TRACK_SUPPORT = 1;
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isSupported(boolean z) {
            for (int i = 0; i < this.trackSupport.length; i++) {
                if (isTrackSupported(i, z)) {
                    return true;
                }
            }
            return false;
        }

        private static String keyForField(int i) {
            return Integer.toString(i, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Group lambda$static$0(Bundle bundle) {
            TrackGroup trackGroup = (TrackGroup) TrackGroup.CREATOR.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(keyForField(0))));
            return new Group(trackGroup, bundle.getBoolean(keyForField(4), false), (int[]) uj2.e(bundle.getIntArray(keyForField(1)), new int[trackGroup.length]), (boolean[]) uj2.e(bundle.getBooleanArray(keyForField(3)), new boolean[trackGroup.length]));
        }

        public TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public Format getTrackFormat(int i) {
            return this.mediaTrackGroup.getFormat(i);
        }

        public int getTrackSupport(int i) {
            return this.trackSupport[i];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public int hashCode() {
            return Arrays.hashCode(this.trackSelected) + ((Arrays.hashCode(this.trackSupport) + (((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31)) * 31);
        }

        public boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public boolean isSelected() {
            for (boolean z : this.trackSelected) {
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSelected(int i) {
            return this.trackSelected[i];
        }

        public boolean isTrackSupported(int i, boolean z) {
            int i2 = this.trackSupport[i];
            if (i2 != 4) {
                return z && i2 == 3;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(keyForField(0), this.mediaTrackGroup.toBundle());
            bundle.putIntArray(keyForField(1), this.trackSupport);
            bundle.putBooleanArray(keyForField(3), this.trackSelected);
            bundle.putBoolean(keyForField(4), this.adaptiveSupported);
            return bundle;
        }

        public Group(TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            boolean z2;
            int i = trackGroup.length;
            this.length = i;
            boolean z3 = false;
            if (i == iArr.length && i == zArr.length) {
                z2 = true;
            } else {
                z2 = false;
            }
            Assertions.checkArgument(z2);
            this.mediaTrackGroup = trackGroup;
            if (z && i > 1) {
                z3 = true;
            }
            this.adaptiveSupported = z3;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public boolean isTrackSupported(int i) {
            return isTrackSupported(i, false);
        }

        public boolean isSupported() {
            return isSupported(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Tracks lambda$static$0(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        return new Tracks(parcelableArrayList == null ? y32.e : BundleableUtil.fromBundleList(Group.CREATOR, parcelableArrayList));
    }

    public boolean containsType(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (((Group) this.groups.get(i2)).getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSelected(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            Group group = (Group) this.groups.get(i2);
            if (group.isSelected() && group.getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i, boolean z) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (((Group) this.groups.get(i2)).getType() == i && ((Group) this.groups.get(i2)).isSupported(z)) {
                return true;
            }
        }
        return false;
    }

    static {
        z21 z21Var = d31.b;
        EMPTY = new Tracks(y32.e);
        CREATOR = new e32(29);
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((Tracks) obj).groups);
    }

    public d31 getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    public boolean isEmpty() {
        return this.groups.isEmpty();
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(keyForField(0), BundleableUtil.toBundleArrayList(this.groups));
        return bundle;
    }

    public Tracks(List<Group> list) {
        this.groups = d31.A(list);
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i, boolean z) {
        if (containsType(i) && !isTypeSupported(i, z)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i) {
        return isTypeSupportedOrEmpty(i, false);
    }

    public boolean isTypeSupported(int i) {
        return isTypeSupported(i, false);
    }
}
