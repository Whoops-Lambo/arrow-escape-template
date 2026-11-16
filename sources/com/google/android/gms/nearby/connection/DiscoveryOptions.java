package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.h50;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "DiscoveryOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class DiscoveryOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DiscoveryOptions> CREATOR = new zzq();
    public Strategy a;
    public ParcelUuid f;
    public byte[] m;
    public int[] o;
    public boolean b = false;
    public boolean c = true;
    public boolean d = true;
    public boolean e = false;
    public boolean g = true;
    public boolean h = true;
    public boolean i = true;
    public boolean j = false;
    public int k = 0;
    public int l = 0;
    public long n = 0;
    public boolean p = true;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        public Builder() {
            DiscoveryOptions discoveryOptions = new DiscoveryOptions();
            discoveryOptions.b = false;
            discoveryOptions.c = true;
            discoveryOptions.d = true;
            discoveryOptions.e = false;
            discoveryOptions.g = true;
            discoveryOptions.h = true;
            discoveryOptions.i = true;
            discoveryOptions.j = false;
            discoveryOptions.k = 0;
            discoveryOptions.l = 0;
            discoveryOptions.n = 0L;
            discoveryOptions.p = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryOptions)) {
            return false;
        }
        DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
        return Objects.equal(this.a, discoveryOptions.a) && Objects.equal(Boolean.valueOf(this.b), Boolean.valueOf(discoveryOptions.b)) && Objects.equal(Boolean.valueOf(this.c), Boolean.valueOf(discoveryOptions.c)) && Objects.equal(Boolean.valueOf(this.d), Boolean.valueOf(discoveryOptions.d)) && Objects.equal(Boolean.valueOf(this.e), Boolean.valueOf(discoveryOptions.e)) && Objects.equal(this.f, discoveryOptions.f) && Objects.equal(Boolean.valueOf(this.g), Boolean.valueOf(discoveryOptions.g)) && Objects.equal(Boolean.valueOf(this.h), Boolean.valueOf(discoveryOptions.h)) && Objects.equal(Boolean.valueOf(this.i), Boolean.valueOf(discoveryOptions.i)) && Objects.equal(Boolean.valueOf(this.j), Boolean.valueOf(discoveryOptions.j)) && Objects.equal(Integer.valueOf(this.k), Integer.valueOf(discoveryOptions.k)) && Objects.equal(Integer.valueOf(this.l), Integer.valueOf(discoveryOptions.l)) && Arrays.equals(this.m, discoveryOptions.m) && Objects.equal(Long.valueOf(this.n), Long.valueOf(discoveryOptions.n)) && Arrays.equals(this.o, discoveryOptions.o) && Objects.equal(Boolean.valueOf(this.p), Boolean.valueOf(discoveryOptions.p));
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(Arrays.hashCode(this.m)), Long.valueOf(this.n), Integer.valueOf(Arrays.hashCode(this.o)), Boolean.valueOf(this.p));
    }

    public final String toString() {
        Locale locale = Locale.US;
        Strategy strategy = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        ParcelUuid parcelUuid = this.f;
        boolean z5 = this.g;
        boolean z6 = this.h;
        boolean z7 = this.i;
        boolean z8 = this.j;
        int i = this.k;
        int i2 = this.l;
        byte[] bArr = this.m;
        String strA = bArr == null ? "null" : com.google.android.gms.nearby.messages.internal.zzc.a(bArr);
        long j = this.n;
        boolean z9 = this.p;
        StringBuilder sb = new StringBuilder("DiscoveryOptions{strategy: ");
        sb.append(strategy);
        sb.append(", forwardUnrecognizedBluetoothDevices: ");
        sb.append(z);
        sb.append(", enableBluetooth: ");
        h50.z(sb, z2, ", enableBle: ", z3, ", lowPower: ");
        sb.append(z4);
        sb.append(", fastAdvertisementServiceUuid: ");
        sb.append(parcelUuid);
        sb.append(", enableWifiLan: ");
        h50.z(sb, z5, ", enableNfc: ", z6, ", enableWifiAware: ");
        h50.z(sb, z7, ", enableUwbRanging: ", z8, ", uwbChannel: ");
        h50.s(i, i2, ", uwbPreambleIndex: ", ", uwbAddress: ", sb);
        sb.append(strA);
        sb.append(", flowId: ");
        sb.append(j);
        sb.append(", allowGattConnections: ");
        sb.append(z9);
        sb.append("}");
        return sb.toString();
    }

    private DiscoveryOptions() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.e);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.g);
        SafeParcelWriter.writeBoolean(parcel, 9, this.h);
        SafeParcelWriter.writeBoolean(parcel, 10, this.i);
        SafeParcelWriter.writeBoolean(parcel, 11, this.j);
        SafeParcelWriter.writeInt(parcel, 12, this.k);
        SafeParcelWriter.writeInt(parcel, 13, this.l);
        SafeParcelWriter.writeByteArray(parcel, 14, this.m, false);
        SafeParcelWriter.writeLong(parcel, 15, this.n);
        SafeParcelWriter.writeIntArray(parcel, 16, this.o, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.p);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
