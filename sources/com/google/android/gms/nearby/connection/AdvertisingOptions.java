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
import defpackage.rl3;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "AdvertisingOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class AdvertisingOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdvertisingOptions> CREATOR = new zzb();
    public byte[] B;
    public Strategy a;
    public byte[] f;
    public ParcelUuid h;
    public byte[] q;
    public zzw[] s;
    public int[] x;
    public int[] y;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public boolean g = false;
    public boolean i = true;
    public boolean j = true;
    public boolean k = true;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    public int p = 0;
    public long r = 0;
    public boolean t = false;
    public boolean u = true;
    public boolean v = false;
    public boolean w = true;
    public boolean z = true;
    public int A = 0;
    public boolean C = true;
    public int D = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
            if (Objects.equal(this.a, advertisingOptions.a) && Objects.equal(Boolean.valueOf(this.b), Boolean.valueOf(advertisingOptions.b)) && Objects.equal(Boolean.valueOf(this.c), Boolean.valueOf(advertisingOptions.c)) && Objects.equal(Boolean.valueOf(this.d), Boolean.valueOf(advertisingOptions.d)) && Objects.equal(Boolean.valueOf(this.e), Boolean.valueOf(advertisingOptions.e)) && Arrays.equals(this.f, advertisingOptions.f) && Objects.equal(Boolean.valueOf(this.g), Boolean.valueOf(advertisingOptions.g)) && Objects.equal(this.h, advertisingOptions.h) && Objects.equal(Boolean.valueOf(this.i), Boolean.valueOf(advertisingOptions.i)) && Objects.equal(Boolean.valueOf(this.j), Boolean.valueOf(advertisingOptions.j)) && Objects.equal(Boolean.valueOf(this.k), Boolean.valueOf(advertisingOptions.k)) && Objects.equal(Boolean.valueOf(this.l), Boolean.valueOf(advertisingOptions.l)) && Objects.equal(Boolean.valueOf(this.m), Boolean.valueOf(advertisingOptions.m)) && Objects.equal(Boolean.valueOf(this.n), Boolean.valueOf(advertisingOptions.n)) && Objects.equal(Integer.valueOf(this.o), Integer.valueOf(advertisingOptions.o)) && Objects.equal(Integer.valueOf(this.p), Integer.valueOf(advertisingOptions.p)) && Arrays.equals(this.q, advertisingOptions.q) && Objects.equal(Long.valueOf(this.r), Long.valueOf(advertisingOptions.r)) && Arrays.equals(this.s, advertisingOptions.s) && Objects.equal(Boolean.valueOf(this.t), Boolean.valueOf(advertisingOptions.t)) && Objects.equal(Boolean.valueOf(this.u), Boolean.valueOf(advertisingOptions.u)) && Objects.equal(Boolean.valueOf(this.v), Boolean.valueOf(advertisingOptions.v)) && Objects.equal(Boolean.valueOf(this.w), Boolean.valueOf(advertisingOptions.w)) && Arrays.equals(this.x, advertisingOptions.x) && Arrays.equals(this.y, advertisingOptions.y) && Objects.equal(Boolean.valueOf(this.z), Boolean.valueOf(advertisingOptions.z)) && Objects.equal(Integer.valueOf(this.A), Integer.valueOf(advertisingOptions.A)) && Objects.equal(this.B, advertisingOptions.B) && Objects.equal(Boolean.valueOf(this.C), Boolean.valueOf(advertisingOptions.C)) && Objects.equal(Integer.valueOf(this.D), Integer.valueOf(advertisingOptions.D))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        public Builder() {
            AdvertisingOptions advertisingOptions = new AdvertisingOptions();
            advertisingOptions.b = true;
            advertisingOptions.c = true;
            advertisingOptions.d = true;
            advertisingOptions.e = true;
            advertisingOptions.g = false;
            advertisingOptions.i = true;
            advertisingOptions.j = true;
            advertisingOptions.k = true;
            advertisingOptions.l = false;
            advertisingOptions.m = false;
            advertisingOptions.n = false;
            advertisingOptions.o = 0;
            advertisingOptions.p = 0;
            advertisingOptions.r = 0L;
            advertisingOptions.t = false;
            advertisingOptions.u = true;
            advertisingOptions.v = false;
            advertisingOptions.w = true;
            advertisingOptions.z = true;
            advertisingOptions.A = 0;
            advertisingOptions.C = true;
            advertisingOptions.D = 0;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), Boolean.valueOf(this.m), Boolean.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(Arrays.hashCode(this.q)), Long.valueOf(this.r), Integer.valueOf(Arrays.hashCode(this.s)), Boolean.valueOf(this.t), Boolean.valueOf(this.u), Boolean.valueOf(this.v), Boolean.valueOf(this.w), Integer.valueOf(Arrays.hashCode(this.x)), Integer.valueOf(Arrays.hashCode(this.y)), Boolean.valueOf(this.z), Integer.valueOf(this.A), this.B, Boolean.valueOf(this.C), Integer.valueOf(this.D));
    }

    public final String toString() {
        Locale locale = Locale.US;
        Strategy strategy = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        byte[] bArr = this.f;
        String strA = bArr == null ? null : com.google.android.gms.nearby.messages.internal.zzc.a(bArr);
        boolean z5 = this.g;
        ParcelUuid parcelUuid = this.h;
        boolean z6 = this.i;
        boolean z7 = this.j;
        boolean z8 = this.k;
        boolean z9 = this.l;
        boolean z10 = this.m;
        boolean z11 = this.n;
        int i = this.o;
        int i2 = this.p;
        byte[] bArr2 = this.q;
        String strA2 = bArr2 == null ? "null" : com.google.android.gms.nearby.messages.internal.zzc.a(bArr2);
        long j = this.r;
        String string = Arrays.toString(this.s);
        boolean z12 = this.t;
        boolean z13 = this.u;
        boolean z14 = this.w;
        byte[] bArr3 = this.B;
        String strA3 = bArr3 == null ? null : com.google.android.gms.nearby.messages.internal.zzc.a(bArr3);
        boolean z15 = this.C;
        int i3 = this.D;
        StringBuilder sb = new StringBuilder("AdvertisingOptions{strategy: ");
        sb.append(strategy);
        sb.append(", autoUpgradeBandwidth: ");
        sb.append(z);
        sb.append(", enforceTopologyConstraints: ");
        h50.z(sb, z2, ", enableBluetooth: ", z3, ", enableBle: ");
        sb.append(z4);
        sb.append(", nearbyNotificationsBeaconData: ");
        sb.append(strA);
        sb.append(", lowPower: ");
        sb.append(z5);
        sb.append(", fastAdvertisementServiceUuid: ");
        sb.append(parcelUuid);
        sb.append(", enableWifiLan: ");
        h50.z(sb, z6, ", enableNfc: ", z7, ", enableWifiAware: ");
        h50.z(sb, z8, ", enableBluetoothListening: ", z9, ", enableWebRtcListening: ");
        h50.z(sb, z10, ", enableUwbRanging: ", z11, ", uwbChannel: ");
        h50.s(i, i2, ", uwbPreambleIndex: ", ", remoteUwbAddress: ", sb);
        sb.append(strA2);
        sb.append(", flowId: ");
        sb.append(j);
        sb.append(", uwbSenderInfo: ");
        sb.append(string);
        sb.append(", enableOutOfBandConnection: ");
        sb.append(z12);
        sb.append(", disruptiveUpgrade: ");
        sb.append(z13);
        sb.append(",useStableIdentifiers: ");
        sb.append(z14);
        sb.append(",deviceInfo: ");
        sb.append(strA3);
        sb.append(",allowGattConnections: ");
        sb.append(z15);
        return rl3.k(sb, ",connectionType: ", i3, "}");
    }

    private AdvertisingOptions() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.e);
        SafeParcelWriter.writeByteArray(parcel, 6, this.f, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.g);
        SafeParcelWriter.writeParcelable(parcel, 8, this.h, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.i);
        SafeParcelWriter.writeBoolean(parcel, 10, this.j);
        SafeParcelWriter.writeBoolean(parcel, 11, this.k);
        SafeParcelWriter.writeBoolean(parcel, 12, this.l);
        SafeParcelWriter.writeBoolean(parcel, 13, this.m);
        SafeParcelWriter.writeBoolean(parcel, 14, this.n);
        SafeParcelWriter.writeInt(parcel, 15, this.o);
        SafeParcelWriter.writeInt(parcel, 16, this.p);
        SafeParcelWriter.writeByteArray(parcel, 17, this.q, false);
        SafeParcelWriter.writeLong(parcel, 18, this.r);
        SafeParcelWriter.writeTypedArray(parcel, 19, this.s, i, false);
        SafeParcelWriter.writeBoolean(parcel, 20, this.t);
        SafeParcelWriter.writeBoolean(parcel, 21, this.u);
        SafeParcelWriter.writeBoolean(parcel, 22, this.v);
        SafeParcelWriter.writeBoolean(parcel, 23, this.w);
        SafeParcelWriter.writeIntArray(parcel, 24, this.x, false);
        SafeParcelWriter.writeIntArray(parcel, 25, this.y, false);
        SafeParcelWriter.writeBoolean(parcel, 26, this.z);
        SafeParcelWriter.writeInt(parcel, 27, this.A);
        SafeParcelWriter.writeByteArray(parcel, 28, this.B, false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.C);
        SafeParcelWriter.writeInt(parcel, 30, this.D);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
