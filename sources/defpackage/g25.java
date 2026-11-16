package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.nearby.zzlx;
import com.google.android.gms.internal.nearby.zzly;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g25 extends zzly {
    @Override // com.google.android.gms.internal.nearby.zzly, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public final zzlx createFromParcel(Parcel parcel) {
        zzlx zzlxVarCreateFromParcel = super.createFromParcel(parcel);
        ParcelFileDescriptor parcelFileDescriptor = zzlxVarCreateFromParcel.b;
        if (parcelFileDescriptor != null) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    dataInputStream.read(bArr);
                    zzlx.d(dataInputStream);
                    zzlxVarCreateFromParcel.a = bArr;
                    return zzlxVarCreateFromParcel;
                } catch (IOException e) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e);
                }
            } catch (Throwable th) {
                zzlx.d(dataInputStream);
                throw th;
            }
        }
        return zzlxVarCreateFromParcel;
    }
}
