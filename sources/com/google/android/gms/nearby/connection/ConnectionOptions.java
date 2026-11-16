package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.h50;
import defpackage.nj;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "ConnectionOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class ConnectionOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionOptions> CREATOR = new zzj();
    public byte[] i;
    public int[] o;
    public int[] p;
    public byte[] q;
    public Strategy r;
    public boolean a = false;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public boolean f = true;
    public boolean g = true;
    public boolean h = true;
    public boolean j = false;
    public boolean k = true;
    public boolean l = true;
    public int m = 0;
    public int n = 0;
    public int s = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            if (Objects.equal(Boolean.valueOf(this.a), Boolean.valueOf(connectionOptions.a)) && Objects.equal(Boolean.valueOf(this.b), Boolean.valueOf(connectionOptions.b)) && Objects.equal(Boolean.valueOf(this.c), Boolean.valueOf(connectionOptions.c)) && Objects.equal(Boolean.valueOf(this.d), Boolean.valueOf(connectionOptions.d)) && Objects.equal(Boolean.valueOf(this.e), Boolean.valueOf(connectionOptions.e)) && Objects.equal(Boolean.valueOf(this.f), Boolean.valueOf(connectionOptions.f)) && Objects.equal(Boolean.valueOf(this.g), Boolean.valueOf(connectionOptions.g)) && Objects.equal(Boolean.valueOf(this.h), Boolean.valueOf(connectionOptions.h)) && Arrays.equals(this.i, connectionOptions.i) && Objects.equal(Boolean.valueOf(this.j), Boolean.valueOf(connectionOptions.j)) && Objects.equal(Boolean.valueOf(this.k), Boolean.valueOf(connectionOptions.k)) && Objects.equal(Boolean.valueOf(this.l), Boolean.valueOf(connectionOptions.l)) && Objects.equal(Integer.valueOf(this.m), Integer.valueOf(connectionOptions.m)) && Objects.equal(Integer.valueOf(this.n), Integer.valueOf(connectionOptions.n)) && Arrays.equals(this.o, connectionOptions.o) && Arrays.equals(this.p, connectionOptions.p) && Arrays.equals(this.q, connectionOptions.q) && Objects.equal(this.r, connectionOptions.r) && Objects.equal(Integer.valueOf(this.s), Integer.valueOf(connectionOptions.s))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        public Builder() {
            ConnectionOptions connectionOptions = new ConnectionOptions();
            connectionOptions.a = false;
            connectionOptions.b = true;
            connectionOptions.c = true;
            connectionOptions.d = true;
            connectionOptions.e = true;
            connectionOptions.f = true;
            connectionOptions.g = true;
            connectionOptions.h = true;
            connectionOptions.j = false;
            connectionOptions.k = true;
            connectionOptions.l = true;
            connectionOptions.m = 0;
            connectionOptions.n = 0;
            connectionOptions.s = 0;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(Arrays.hashCode(this.o)), Integer.valueOf(Arrays.hashCode(this.p)), Integer.valueOf(Arrays.hashCode(this.q)), this.r, Integer.valueOf(this.s));
    }

    public final String toString() {
        Locale locale = Locale.US;
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        boolean z7 = this.g;
        boolean z8 = this.h;
        byte[] bArr = this.i;
        String strA = bArr == null ? null : com.google.android.gms.nearby.messages.internal.zzc.a(bArr);
        boolean z9 = this.j;
        boolean z10 = this.k;
        boolean z11 = this.l;
        byte[] bArr2 = this.q;
        String strA2 = bArr2 != null ? com.google.android.gms.nearby.messages.internal.zzc.a(bArr2) : null;
        Strategy strategy = this.r;
        int i = this.s;
        StringBuilder sb = new StringBuilder("ConnectionOptions{lowPower: ");
        sb.append(z);
        sb.append(", enableBluetooth: ");
        sb.append(z2);
        sb.append(", enableBle: ");
        h50.z(sb, z3, ", enableWifiLan: ", z4, ", enableNfc: ");
        h50.z(sb, z5, ", enableWifiAware: ", z6, ", enableWifiHotspot: ");
        h50.z(sb, z7, ", enableWifiDirect: ", z8, ", remoteBluetoothMacAddress: ");
        sb.append(strA);
        sb.append(", enableWebRtc: ");
        sb.append(z9);
        sb.append(", enforceTopologyConstraints: ");
        h50.z(sb, z10, ", disruptiveUpgrade: ", z11, ",deviceInfo: ");
        sb.append(strA2);
        sb.append(",strategy: ");
        sb.append(strategy);
        sb.append(",connectionType: ");
        return nj.l(i, "}", sb);
    }

    private ConnectionOptions() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.e);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f);
        SafeParcelWriter.writeBoolean(parcel, 7, this.g);
        SafeParcelWriter.writeBoolean(parcel, 8, this.h);
        SafeParcelWriter.writeByteArray(parcel, 9, this.i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.j);
        SafeParcelWriter.writeBoolean(parcel, 11, this.k);
        SafeParcelWriter.writeBoolean(parcel, 12, this.l);
        SafeParcelWriter.writeInt(parcel, 13, this.m);
        SafeParcelWriter.writeInt(parcel, 14, this.n);
        SafeParcelWriter.writeIntArray(parcel, 15, this.o, false);
        SafeParcelWriter.writeIntArray(parcel, 16, this.p, false);
        SafeParcelWriter.writeByteArray(parcel, 17, this.q, false);
        SafeParcelWriter.writeParcelable(parcel, 18, this.r, i, false);
        SafeParcelWriter.writeInt(parcel, 19, this.s);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
