package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "Landroid/os/Parcelable;", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CallingAppInfoParcelable implements Parcelable {
    public final String a;
    public final ArrayList b;
    public final String c;
    public static final Companion d = new Companion(0);

    @NotNull
    public static final Parcelable.Creator<CallingAppInfoParcelable> CREATOR = new Parcelable.Creator<CallingAppInfoParcelable>() { // from class: com.google.android.gms.identitycredentials.CallingAppInfoParcelable$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public final CallingAppInfoParcelable[] newArray(int i) {
            return new CallingAppInfoParcelable[i];
        }

        @Override // android.os.Parcelable.Creator
        public final CallingAppInfoParcelable createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            CallingAppInfoParcelable.d.getClass();
            int i = parcel.readInt();
            if (i < 0) {
                arrayList = null;
            } else if (i == 0) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    arrayList2.add(bArr);
                }
                arrayList = arrayList2;
            }
            String string2 = parcel.readString();
            if (string == null || arrayList == null) {
                return null;
            }
            return new CallingAppInfoParcelable(arrayList, string, string2);
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable$Companion;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "CREATOR", "Landroid/os/Parcelable$Creator;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }
    }

    public CallingAppInfoParcelable(ArrayList arrayList, String str, String str2) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        ArrayList arrayList = this.b;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            byte[] bArr = (byte[]) obj;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        parcel.writeString(this.c);
    }
}
