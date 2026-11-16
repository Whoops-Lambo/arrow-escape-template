package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DriveIdCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class DriveId extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DriveId> CREATOR = new zzb();
    public final String a;
    public final long b;
    public final long c;
    public final int d;

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            String str = driveId.a;
            if (driveId.c != this.c) {
                return false;
            }
            long j = driveId.b;
            String str2 = this.a;
            long j2 = this.b;
            if (j == -1) {
                if (j2 == -1) {
                    return ((String) Preconditions.checkNotNull(str)).equals(str2);
                }
                j = -1;
            }
            if (str2 != null && str != null) {
                return j == j2 && str.equals(str2);
            }
            if (j == j2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        if (j == -1) {
            String str = this.a;
            Preconditions.checkNotNull(str);
            return str.hashCode();
        }
        String strValueOf = String.valueOf(j);
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + String.valueOf(strValueOf).length());
        sb.append(j2);
        sb.append(strValueOf);
        return sb.toString().hashCode();
    }

    public DriveId(long j, long j2, String str, int i) {
        this.a = str;
        boolean z = true;
        Preconditions.checkArgument(!"".equals(str));
        if (str == null && j == -1) {
            z = false;
            j = -1;
        }
        Preconditions.checkArgument(z);
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeLong(parcel, 3, this.b);
        SafeParcelWriter.writeLong(parcel, 4, this.c);
        SafeParcelWriter.writeInt(parcel, 5, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
