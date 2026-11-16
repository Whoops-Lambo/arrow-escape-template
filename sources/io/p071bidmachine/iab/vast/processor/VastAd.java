package io.p071bidmachine.iab.vast.processor;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.b;
import io.p071bidmachine.iab.vast.h;
import io.p071bidmachine.iab.vast.tags.d;
import io.p071bidmachine.iab.vast.tags.e;
import io.p071bidmachine.iab.vast.tags.m;
import io.p071bidmachine.iab.vast.tags.n;
import java.util.ArrayList;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class VastAd implements Parcelable {
    public static final Parcelable.Creator<VastAd> CREATOR = new b(7);
    public final m a;
    public final n b;
    public h c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public EnumMap i;
    public e j;
    public ArrayList k = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.d);
        parcel.writeStringList(this.e);
        parcel.writeStringList(this.f);
        parcel.writeStringList(this.g);
        parcel.writeStringList(this.h);
        parcel.writeSerializable(this.i);
        parcel.writeSerializable(this.j);
        parcel.writeList(this.k);
    }

    public VastAd(Parcel parcel) {
        this.a = (m) parcel.readSerializable();
        this.b = (n) parcel.readSerializable();
        this.d = (ArrayList) parcel.readSerializable();
        this.e = parcel.createStringArrayList();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createStringArrayList();
        this.i = (EnumMap) parcel.readSerializable();
        this.j = (e) parcel.readSerializable();
        parcel.readList(this.k, d.class.getClassLoader());
    }

    public VastAd(m mVar, n nVar) {
        this.a = mVar;
        this.b = nVar;
    }
}
