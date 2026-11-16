package com.bytedance.adsdk.ugeno.gf;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class kgy implements Parcelable {
    private final Parcelable ahm;
    public static final kgy kgy = new kgy() { // from class: com.bytedance.adsdk.ugeno.gf.kgy.1
    };
    public static final Parcelable.Creator<kgy> CREATOR = new Parcelable.ClassLoaderCreator<kgy>() { // from class: com.bytedance.adsdk.ugeno.gf.kgy.2
        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public kgy createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return kgy.kgy;
            }
            e32.i("superState must be null");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public kgy createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public kgy[] newArray(int i) {
            return new kgy[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable kgy() {
        return this.ahm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ahm, i);
    }

    public kgy(Parcelable parcelable) {
        if (parcelable != null) {
            this.ahm = parcelable == kgy ? null : parcelable;
        } else {
            d.r("superState must not be null");
            throw null;
        }
    }

    private kgy() {
        this.ahm = null;
    }

    public kgy(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.ahm = parcelable == null ? kgy : parcelable;
    }
}
